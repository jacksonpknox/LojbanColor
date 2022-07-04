import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from rich.console import Console, Group

def tabulate_token_styles(t: list, skari: dict):
    s = skari["mi'iskari"]["system"]
    table = Table(box=box.MINIMAL)
    table.add_column("token", style=s)
    table.add_column("style", style=s)
    for token in t:
        style = ""
        for _, item in skari.items():
            if token in item.keys():
                style = item[token]
        table.add_row(Text(token, style=style), Text(style, style=s))
    return table
        


def tabulate_selmaho_styles(s: list, selmahos: dict, skari: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("selma'o", style=skari["valskari"]["cmavo"])
    table.add_column("style", style=skari["mi'iskari"]["system"])
    for selmaho in s:
        style = selmahos[selmaho]["color"]
        table.add_row(Text(selmaho, style=style), Text(style, style=skari["mi'iskari"]["system"]))
    return table


#TODO: option to print all token styles
#TODO: split t in two (m / v) and refactor to share with prigau
#TODO: option to print an entire selmaho
def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["skari"], "r") as f:
        skari = json.load(f)
    renderables = []
    console = Console()
    
    if s := args.selmaho_style:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        s = [color.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = tabulate_selmaho_styles(s, selmahos, skari)
        renderables.append(Panel(table))

    if t := args.token_style:
        for token in t:
            real_token = False
            for _, item in skari.items():
                if token in item.keys():
                    real_token = True
            if not real_token:
                raise Exception("!! not a token: " + token)
        table = tabulate_token_styles(t, skari)
        renderables.append(Panel(table))

    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        c = [cmavo.lower().replace('h', '\'') for cmavo in c]
        table = color.tabulate_selmahos(c, selmahos, skari)
        renderables.append(Panel(table))

    if g := args.gloss:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.gloss_gismus(g, gismus, skari)
        renderables.append(Panel(table))

    if r := args.rafsi:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.tabulate_cmarafsi(r, gismus, skari)
        renderables.append(Panel(table))

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))
