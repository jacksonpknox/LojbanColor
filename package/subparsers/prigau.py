import color
import sys
import json

from rich import print, box
from rich.text import Text
from rich.panel import Panel
from rich.table import Table
from rich.columns import Columns
from rich.console import Console, Group

from antlr4 import ParseTreeWalker, ParserRuleContext, InputStream, CommonTokenStream
from python_color.ColorListener import ColorListener
from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser


class Collector(ColorListener):
    def __init__(self):
        self.collection = []

    def grab(self, s: str):
        if s not in self.collection:
            self.collection.append(s)


class CmarafsiCollector(Collector):
    def enterBalraf(self, ctx):
        self.grab(ctx.getText())

    def enterBroraf(self, ctx):
        self.grab(ctx.getText())

    def enterBauraf(self, ctx):
        self.grab(ctx.getText())


class GismuCollector(Collector):
    def enterGismu(self, ctx):
        self.grab(ctx.getText())


def collect(tree, Collector) -> list:
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


def analyze_cmarafsi(tree, gismus, config) -> Table:
    collection = collect(tree, CmarafsiCollector)
    table = Table(box=box.DOUBLE)
    table.add_column("cmarafsi", style=config["cmarafsi"])
    table.add_column("gismu", style=config["gismu"])
    table.add_column("gloss", style=config["gloss"])
    for cmarafsi in collection:
        table.add_row(
            cmarafsi, (g := color.get_gismu(cmarafsi, gismus)), color.get_gloss(g, gismus)
        )
    return table


def analyze_gismu(tree, gismus, config) -> Table:
    collection = collect(tree, GismuCollector)
    table = Table(box=box.MINIMAL)
    table.add_column("gismu", style=config["gismu"])
    table.add_column("gloss", style=config["gloss"])
    for gismu in collection:
        table.add_row(gismu, color.get_gloss(gismu, gismus))
    return table


#TODO: 
# probably an object method of Colorizer
# or better yet just eliminate ?
def put(t: Text, txt: str, color: str = None):
    t.append(txt, style=color)


# moves to prigau
def get_cmavo_color(cmavo: str, selmahos: dict) -> str:
    return selmahos[color.get_selmaho(cmavo, selmahos)]["color"]


# moves to prigau
def put_cmavo(t: Text, cmavo: str, selmahos: dict) -> None:
    put(t, cmavo, get_cmavo_color(cmavo, selmahos))


# moves to prigau
def get_gismu(cmarafsi: str, gismus: dict) -> str:
    for gismu in gismus.keys():
        if cmarafsi in gismus[gismu]["cmarafsi"]:
            return gismu
    return "UNCAT"


# moves to prigau
class Colorizer(ColorListener):
    def __init__(self, selmahos: dict, config: dict):
        self.t = Text()
        self.selmahos = selmahos
        self.config = config

    def exitLine(self, ctx):
        put(self.t, "\n", None)

    def exitWord(self, ctx):
        put(self.t, " ", None)

    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        put_cmavo(self.t, ctx.getText(), self.selmahos)

    def enterLerfu(self, ctx):
        put(self.t, ctx.getText(), self.config["lerfu"]["color"])

    def enterFuhivla(self, ctx):
        put(self.t, ctx.getText(), self.config["fu'ivla"]["color"])

    def enterCmene(self, ctx):
        put(self.t, ctx.getText(), self.config["cmene"]["color"])

    def enterY(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["y"])

    def enterBaugismu(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["baugismu"])

    def enterBrogismu(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["brogismu"])

    def enterBalraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["balraf"])

    def enterBroraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["broraf"])

    def enterBauraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["bauraf"])

    def enterGahorgimpag(self, ctx: ColorParser.GahorgimpagContext):
        put(self.t, ctx.getText(), self.config["rafsi"]["ga'orgimpag"])

    def enterKargimpag(self, ctx: ColorParser.KargimpagContext):
        put(self.t, ctx.getText(), self.config["rafsi"]["kargimpag"])

    def enterY(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["y"])

    def enterQ(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["q"])


def colorize(tree, selmahos, config) -> Text:
    printer = Colorizer(selmahos, config)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    printer.t.rstrip()
    return printer.t


def get_parse_tree(lojban: str) -> ParserRuleContext:
    input_stream = InputStream(lojban)
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    return parser.folio()


def parse(args: dict):
    r = bool(e := args.export)
    console = Console(record=r, force_interactive=(not r))
    with open(color.CONFIG_DEFAULTS["gismus"]) as f:
        gismus = json.load(f)
    with open(color.CONFIG_DEFAULTS["config"]) as f:
        config = json.load(f)
    with open(color.CONFIG_DEFAULTS["selmahos"]) as f:
        selmahos = json.load(f)
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                with console.status(Text("parsing the file...", style=config["system"]), spinner=config["spinner"]):
                    tree = get_parse_tree(file.read())
            renderables = []

            if args.prigau:
                renderables.append(Panel(colorize(tree, selmahos, config)))
            if args.gismu:
                renderables.append(Panel(analyze_gismu(tree, gismus, config)))
            if args.cmarafsi:
                renderables.append(Panel(analyze_cmarafsi(tree, gismus, config)))

            if args.row:
                console.print(Panel(Columns(renderables), box.DOUBLE))
            else:
                console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))

    if i := args.input:
        # TODO: use rich prompt ?
        console.print("Type the input:", style="red")
        print(Panel(color.colorize(get_parse_tree(sys.stdin.read())), expand=False))

    if r:
        console.save_svg(e)
