import color
import sys
import json
from rich.panel import Panel
from rich.table import Table
from rich.columns import Columns
from rich.console import Console, Group
from rich.text import Text
from rich import print, box
from antlr4 import ParseTreeWalker
from python_color.ColorListener import ColorListener


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


def collect(content: str, Collector) -> list:
    tree = color.get_parse_tree(content)
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


#TODO: factor out config (gismus required, config optional)
def analyze_cmarafsi(content: str) -> Table:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    collection = collect(content, CmarafsiCollector)
    #TODO: factor styles into config
    table = Table(title="Collected Cmarafsi", box=box.DOUBLE)
    table.add_column("cmarafsi", style="yellow")
    table.add_column("gismu", style="red")
    table.add_column("gloss", style="cyan")
    for cmarafsi in collection:
        table.add_row(cmarafsi, g := color.get_gismu(cmarafsi, gismus), color.get_gloss(g, gismus))
    return table

    
#TODO: factor out config (gismus required, config optional)
def analyze_gismu(content: str) -> Table:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    collection = collect(content, GismuCollector)
    #TODO: factor styles into config
    table = Table(title="Collected Gismus", box=box.MINIMAL)
    table.add_column("gismu", style="red")
    table.add_column("gloss", style="green")
    for gismu in collection:
        table.add_row(gismu, color.get_gloss(gismu, gismus))
    return table


#TODO: factor styles into config
def parse(args: dict):
    r = bool(e := args.export)
    console = Console(record=r, force_interactive=(not r))
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                content = file.read()
            renderables = []
            if True:
                with console.status(Text("coloring the words...", style="bold cyan"), spinner="star"):
                    renderables.append(Panel(color.color_prt(content)))
            if args.gismu:
                with console.status(Text("catching the gismu...", style="bold cyan"), spinner="star"):
                    renderables.append(Panel(analyze_gismu(content)))
            if args.cmarafsi:
                with console.status(Text("catching the cmarafsi...", style="bold cyan"), spinner="star"):
                    renderables.append(Panel(analyze_cmarafsi(content)))
            if args.row:
                console.print(Panel(Columns(renderables), box.DOUBLE))
            else:
                console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))

    if i := args.input:
        console.print("Type the input:", style="red")
        print(Panel(color.color_prt(sys.stdin.read()), expand=False))

    if r:
        console.save_svg(e)