import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from rich.columns import Columns
from rich.console import Console, Group


def tabulate_skari(l: list, skari: dict, type: str):
    table = Table(box=box.MINIMAL)
    table.add_column("token")
    table.add_column("style")
    for token in l:
        sty = skari[type][token]
        table.add_row(token, sty, style=sty)
    return table


def tabulate_valsi_styles(v: list, skari: dict):
    return tabulate_skari(v, skari, "valskari")


def tabulate_minji_styles(m: list, skari: dict):
    return tabulate_skari(m, skari, "mi'iskari")


def tabulate_selmaho_styles(s: list, selmahos: dict, skari: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("selma'o")
    table.add_column("style")
    for selmaho in s:
        sty = selmahos[selmaho]["color"]
        table.add_row(selmaho, sty, style=sty)
    return table


def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["skari"], "r") as f:
        skari = json.load(f)
    renderables = []
    console = Console()
    
    #TODO: move to style subgroup
    if s := args.selmaho_style:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        s = [color.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = tabulate_selmaho_styles(s, selmahos, skari)
        renderables.append(Panel(table))

    
    #TODO: move to style subgroup
    if m := args.minji_style:
        for token in m:
            if token not in skari["mi'iskari"].keys():
                raise Exception("Error!! not a minji token: " + token)
        table = tabulate_minji_styles(m, skari)
        renderables.append(Panel(table))

    #TODO: move to style subgroup
    if v := args.valsi_style:
        for token in v:
            if token not in skari["valskari"].keys():
                raise Exception("Error!! not a valsi token: " + token)
        table = tabulate_valsi_styles(v, skari)
        renderables.append(Panel(table))

    #TODO: move to valsi subgroup
    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        #TODO: factor in error-throwing force_cmavo function
        c = [cmavo.lower().replace('h', '\'') for cmavo in c]
        table = color.tabulate_cmavos(c, selmahos, skari)
        renderables.append(Panel(table))

    #TODO: move to valsi subgroup
    if g := args.gloss:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.gloss_gismus(g, gismus, skari)
        renderables.append(Panel(table))

    #TODO: move to valsi subgroup
    if r := args.rafsi:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = color.tabulate_cmarafsi(r, gismus, skari)
        renderables.append(Panel(table))

    #TODO: move to valsi subgroup 
    if args.selmaho:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        panel = color.get_selmaho_tables_panel(args.selmaho, selmahos, skari)
        renderables.append(panel)

    #TODO: move to skari subgroup
    if args.valskari:
        tokens = skari["valskari"].keys()
        table = tabulate_valsi_styles(tokens, skari)
        renderables.append(Panel(table))

    #TODO: move to skari subgroup
    if args.mihiskari:
        tokens = skari["mi'iskari"].keys()
        table = tabulate_minji_styles(tokens, skari)
        renderables.append(Panel(table))

    #TODO: move to valsi subgroup
    if args.all_selmaho:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        selmahos.pop("UNCAT", None)
        selmahos.pop("BY", None)
        selmahos.pop("Y", None)
        panel = color.get_selmaho_tables_panel(selmahos.keys(), selmahos, skari)
        renderables.append(panel)



    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))
