import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from rich.columns import Columns
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


#TODO: option stack
# - option to print all mi'iskari
# - option to print all selmaho tables
def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["skari"], "r") as f:
        skari = json.load(f)
    renderables = []
    console = Console()
    
    #TODO: move to selmaho subparser
    if s := args.selmaho_style:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        s = [color.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = tabulate_selmaho_styles(s, selmahos, skari)
        renderables.append(Panel(table))

    #TODO: split in two
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

    #TODO: move to selmaho subparser
    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        c = [cmavo.lower().replace('h', '\'') for cmavo in c]
        table = color.tabulate_selmahos(c, selmahos, skari)
        renderables.append(Panel(table))

    #TODO: move to gismu subparser
    if g := args.gloss:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.gloss_gismus(g, gismus, skari)
        renderables.append(Panel(table))

    #TODO: move to gismu subparser
    if r := args.rafsi:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.tabulate_cmarafsi(r, gismus, skari)
        renderables.append(Panel(table))

    #TODO: move to selmaho subparser
    if args.selmaho:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        selmaho_tables = []
        for selm in args.selmaho:
            selm = color.force_selmaho(selm, selmahos)
            table = color.get_selmaho_table(selm, selmahos, skari)
            selmaho_tables.append(Panel(table))
        renderables.append(Panel(Columns(selmaho_tables)))

    #TODO: refactor with tabulate_token_styles
    if args.tokens:
        tokens = skari["valskari"]
        table = Table(box=box.MINIMAL)
        table.add_column("token")
        table.add_column("style")
        for token, style in tokens.items():
            table.add_row(Text(token, style=style), Text(style, style=skari["mi'iskari"]["system"]))
        renderables.append(Panel(table))
    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))
