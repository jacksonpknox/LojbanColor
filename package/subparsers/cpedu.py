import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from rich.console import Console, Group

def tabulate_token_styles(t: list, config: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("token", style=config["system"])
    table.add_column("style", style=config["system"])
    for token in t:
        style = config[token]
        table.add_row(Text(token, style=style), Text(style, style=config["system"]))
    return table
        


def tabulate_selmaho_styles(s: list, selmahos: dict, config: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("selma'o", style=config["cmavo"])
    table.add_column("style", style=config["system"])
    for selmaho in s:
        style = selmahos[selmaho]["color"]
        table.add_row(Text(selmaho, style=style), Text(style, style=config["system"]))
    return table


def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)
    renderables = []
    console = Console()
    
    if s := args.selmaho_style:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        s = [color.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = tabulate_selmaho_styles(s, selmahos, config)
        renderables.append(Panel(table))

    #TODO: rework config into palette
    if t := args.token_style:
        for token in t:
            if token not in config.keys():
                raise Exception("!! not a token: " + token)
        table = tabulate_token_styles(t, config)
        renderables.append(Panel(table))

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
