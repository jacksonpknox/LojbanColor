import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.console import Console, Group

def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)
    renderables = []
    console = Console()
    
    #TODO: show selmaho style option, which silently accepts cmavos

    #TODO: show lexeme style option

    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        table = color.tabulate_selmahos(c, selmahos, config)
        renderables.append(Panel(table))

    if g := args.gloss:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.gloss_gismus(g, gismus, config)
        renderables.append(Panel(table))

    if r := args.rafsi:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.tabulate_cmarafsi(r, gismus, config)
        renderables.append(Panel(table))

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))
