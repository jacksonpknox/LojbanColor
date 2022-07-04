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

        
class CmavoCollector(Collector):
    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        self.grab(ctx.getText())


def collect(tree, Collector) -> list:
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


class Colorizer(ColorListener):
    def __init__(self, selmahos: dict, valskari: dict):
        self.t = Text()
        self.selmahos = selmahos
        self.valskari = valskari

    def exitLine(self, ctx):
        self.t.append("\n")

    def exitWord(self, ctx):
        self.t.append(" ")

    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        self.t.append(text=(cmavo := ctx.getText()), style=self.selmahos[color.get_selmaho(cmavo, self.selmahos)]["color"])

    def enterLerfu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["lerfu"])
    def enterFuhivla(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["fu'ivla"])
    def enterCmene(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmene"])
    def enterBaugismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["baugismu"])
    def enterBrogismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["brogismu"])
    def enterBalraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["balraf"])
    def enterBroraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["broraf"])
    def enterBauraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["bauraf"])
    def enterGahorgimpag(self, ctx: ColorParser.GahorgimpagContext):
        self.t.append(text=ctx.getText(), style=self.valskari["ga'orgimpag"])
    def enterKargimpag(self, ctx: ColorParser.KargimpagContext):
        self.t.append(text=ctx.getText(), style=self.valskari["kargimpag"])
    def enterY(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["y"])
    def enterQ(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["q"])



def analyze_rafsi(tree, gismus, skari) -> Table:
    collection = collect(tree, CmarafsiCollector)
    return color.tabulate_cmarafsi(collection, gismus, skari)


def analyze_gismu(tree, gismus, skari) -> Table:
    collection = collect(tree, GismuCollector)
    return color.gloss_gismus(collection, gismus, skari)

    
def analyze_cmavos(tree, selmahos, skari, selmaho_style: bool) -> Table:
    collection = collect(tree, CmavoCollector)
    return color.tabulate_selmahos(collection, selmahos, skari, selmaho_style)


def colorize(tree, selmahos, skari) -> Text:
    printer = Colorizer(selmahos, skari["valskari"])
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


def process_and_print_tree(tree, args: dict, console, gismus, selmahos, skari):
    renderables = []

    if args.prigau:
        renderables.append(Panel(colorize(tree, selmahos, skari)))
    if args.cmavo:
        renderables.append(Panel(analyze_cmavos(tree, selmahos, skari, args.selmaho_style), expand=False))
    if args.gloss:
        renderables.append(Panel(analyze_gismu(tree, gismus, skari), expand=False))
    if args.rafsi:
        renderables.append(Panel(analyze_rafsi(tree, gismus, skari), expand=False))

    if args.horizontal:
        console.print(Panel(Columns(renderables), box.DOUBLE))
    else:
        console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))


#TODO: interactively fill in caughts option
#TODO: group cmavo by selmaho opion
#TODO: analyze every lujvo option?
#TODO: word (type) count option

#TODO: rebrand as tcidu
def parse(args: dict):
    rec = bool(e := args.export)
    console = Console(record=rec, force_interactive=(not rec))
    config = color.get_config("config")
    gismus = color.get_config("gismus")
    selmahos = color.get_config("selmahos")
    skari = color.get_config("skari")
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                with console.status(Text("parsing the file...", style=skari["mi'iskari"]["system"]), spinner=config["spinner"]):
                    tree = get_parse_tree(file.read())
            process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if args.input:
        console.print("Type the input:", style=skari["mi'iskari"]["prompt"])
        tree = get_parse_tree(sys.stdin.read())
        process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if rec:
        console.save_svg(e)
