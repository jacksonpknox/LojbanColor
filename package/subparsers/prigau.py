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
                renderables.append(Panel(color.colorize(tree, selmahos, config)))
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
