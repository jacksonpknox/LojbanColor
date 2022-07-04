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


class Colorizer(ColorListener):
    def __init__(self, selmahos: dict, config: dict):
        self.t = Text()
        self.selmahos = selmahos
        self.config = config

    def exitLine(self, ctx):
        self.t.append("\n")

    def exitWord(self, ctx):
        self.t.append(" ")

    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        self.t.append(text=(cmavo := ctx.getText()), style=self.selmahos[color.get_selmaho(cmavo, self.selmahos)]["color"])

    def enterLerfu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["lerfu"]["color"])
    def enterFuhivla(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["fu'ivla"]["color"])
    def enterCmene(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["cmene"]["color"])
    def enterY(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["y"])
    def enterBaugismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["baugismu"])
    def enterBrogismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["brogismu"])
    def enterBalraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["balraf"])
    def enterBroraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["broraf"])
    def enterBauraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["bauraf"])
    def enterGahorgimpag(self, ctx: ColorParser.GahorgimpagContext):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["ga'orgimpag"])
    def enterKargimpag(self, ctx: ColorParser.KargimpagContext):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["kargimpag"])
    def enterY(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["y"])
    def enterQ(self, ctx):
        self.t.append(text=ctx.getText(), style=self.config["rafsi"]["q"])


def analyze_cmarafsi(tree, gismus, config) -> Table:
    collection = collect(tree, CmarafsiCollector)
    color.tabulate_cmarafsi(collection, gismus, config)


def analyze_gismu(tree, gismus, config) -> Table:
    collection = collect(tree, GismuCollector)
    return color.gloss_gismus(collection, gismus, config)


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
