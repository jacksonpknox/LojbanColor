import color
import json

from rich import print, box

from rich.panel import Panel
from rich.table import Table
from rich.console import Console, Group

#TODO: verbosity options

    
def tabulate_selmahos(c, selmahos, config):
    table = Table(box=box.MINIMAL)
    table.add_column("cmavo", style=config["cmavo"])
    table.add_column("cmavo", style=config["cmavo"])
    for cmavo in c:
        s = color.get_selmaho(cmavo, selmahos)
        colr = selmahos[s]["color"]
        table.add_row(cmavo, s, style=colr)
    return table
   
    
def gloss_gismus(g: list, gismus: dict, config: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("gismu", style=config["rafsi"]["gismu"])
    table.add_column("gloss", style=config["gloss"])
    for gismu in g:
        table.add_row(gismu, color.get_gloss(gismu, gismus))
    return table
    

def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)
    renderables = []
    console = Console()
    if g := args.gismu:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        renderables.append(Panel(gloss_gismus(g, gismus, config)))
    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        renderables.append(Panel(tabulate_selmahos(c, selmahos, config)))
    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))

    
