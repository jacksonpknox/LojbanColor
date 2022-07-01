import color
import sys
import json
from rich.panel import Panel
from rich.table import Table
from rich.columns import Columns
from rich import print
from antlr4 import ParseTreeWalker
from python_color.ColorListener import ColorListener


class GismuCollector(ColorListener):
    def __init__(self):
        self.collection = []
        
    def enterGismu(self, ctx):
        self.collection.append(("gismu", ctx.getText()))

    def enterBalraf(self, ctx):
        self.collection.append(("cmarafsi", ctx.getText()))

    def enterBroraf(self, ctx):
        self.enterBalraf(ctx)

    def enterBauraf(self, ctx):
        self.enterBalraf(ctx)


def collect_gismus(content: str) -> dict:
    tree = color.get_parse_tree(content)
    collector = GismuCollector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


def analyze(content: str) -> Table:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    collection = collect_gismus(content)
    table = Table(title="Collected Gismus")
    table.add_column("gismu", style="red")
    table.add_column("gloss", style="cyan")
    table.add_column("cmarafsi", style="yellow")

    for item in collection:
        if item[0] == "gismu":
            table.add_row(g := item[1], color.get_gloss(g, gismus), "--O--")
        elif item[0] == "cmarafsi":
            table.add_row(g := color.get_gismu(c := item[1], gismus), color.get_gloss(g, gismus), c)
    return table


def parse(args: dict):
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                renderables = [Panel(color.color_prt(content := file.read()))]
                if args.analyze:
                    renderables.append(Panel(analyze(content)))
                print(Panel(Columns(renderables)))
        

    if i := args.input:
        print("Type the input:")
        print(Panel(color.color_prt(sys.stdin.read())))