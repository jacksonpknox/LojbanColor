import color
import sys
import json
from rich.panel import Panel
from rich.table import Table
from rich.columns import Columns
from rich.console import Console
from rich import print
from antlr4 import ParseTreeWalker
from python_color.ColorListener import ColorListener


class CmarafsiCollector(ColorListener):
    def __init__(self):
        self.collection = []

    def enterBalraf(self, ctx):
        self.collection.append(ctx.getText())

    def enterBroraf(self, ctx):
        self.enterBalraf(ctx)

    def enterBauraf(self, ctx):
        self.enterBalraf(ctx)


class GismuCollector(ColorListener):
    def __init__(self):
        self.collection = []
        
    def enterGismu(self, ctx):
        self.collection.append(ctx.getText())


def collect(content: str, Collector) -> dict:
    tree = color.get_parse_tree(content)
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


def analyze_cmarafsi(content: str) -> Table:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    collection = list(set(collect(content, CmarafsiCollector)))
    table = Table(title="Collected Cmarafsi")
    table.add_column("cmarafsi", style="yellow")
    table.add_column("gismu", style="red")
    table.add_column("gloss", style="cyan")
    for cmarafsi in collection:
        table.add_row(cmarafsi, g := color.get_gismu(cmarafsi, gismus), color.get_gloss(g, gismus))
    return table

    
def analyze_gismu(content: str) -> Table:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    collection = list(set(collect(content, GismuCollector)))
    table = Table(title="Collected Gismus")
    table.add_column("gismu", style="red")
    table.add_column("gloss", style="cyan")
    for gismu in collection:
        table.add_row(gismu, color.get_gloss(gismu, gismus))
    return table


def parse(args: dict):
    console = Console()
    if files := args.filepath:
        for f in files:
            with console.status("coloring the words...", spinner="hearts"):
                with open(f, "r") as file:
                    renderables = [Panel(color.color_prt(content := file.read()))]
                    if args.gismu:
                        renderables.append(Panel(analyze_gismu(content)))
                    if args.cmarafsi:
                        renderables.append(Panel(analyze_cmarafsi(content)))
                    console.print(Panel(Columns(renderables)))
        

    if i := args.input:
        console.print("[red]Type the input[/]:")
        print(Panel(color.color_prt(sys.stdin.read()), expand=False))