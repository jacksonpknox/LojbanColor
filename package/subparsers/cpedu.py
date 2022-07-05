import plumbing
import karda

import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.style import Style
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


def tabulate_selmaho_styles(s: list, selmahos: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("selma'o")
    table.add_column("style")
    for selmaho in s:
        sty = selmahos[selmaho]["color"]
        table.add_row(selmaho, sty, style=sty)
    return table


def parse(args: dict):
    with open(plumbing.CONFIG_DEFAULTS["skari"], "r") as f:
        skari = json.load(f)
    renderables = []
    console = Console()

    # skari subgroup
    if s := args.selmaho_style:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        s = [plumbing.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = tabulate_selmaho_styles(s, selmahos)
        renderables.append(Panel(table, style=Style()))

    if m := args.minji_style:
        for token in m:
            if token not in skari["mi'iskari"].keys():
                raise Exception("Error!! not a minji token: " + token)
        table = tabulate_minji_styles(m, skari)
        renderables.append(Panel(table, style=Style()))

    if v := args.valsi_style:
        for token in v:
            if token not in skari["valskari"].keys():
                raise Exception("Error!! not a valsi token: " + token)
        table = tabulate_valsi_styles(v, skari)
        renderables.append(Panel(table, style=Style()))

    if args.valskari:
        tokens = skari["valskari"].keys()
        table = tabulate_valsi_styles(tokens, skari)
        renderables.append(Panel(table, style=Style()))

    if args.mihiskari:
        tokens = skari["mi'iskari"].keys()
        table = tabulate_minji_styles(tokens, skari)
        renderables.append(Panel(table, style=Style()))

    if args.selmahoskari:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        table = tabulate_selmaho_styles(selmahos.keys(), selmahos)
        renderables.append(Panel(Columns(karda.squeeze_table(table, args.squeeze)), style=Style()))


    # valsi subgroup
    if c := args.cmavo:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        c = [cmavo.lower().replace("h", "'") for cmavo in c]
        table = karda.tabulate_cmavos(c, selmahos, skari)
        renderables.append(Panel(table, style=Style()))

    if g := args.gloss:
        with open(plumbing.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = karda.tabulate_gismus(g, gismus, skari)
        renderables.append(Panel(table, style=Style()))

    if r := args.rafsi:
        with open(plumbing.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        table = karda.tabulate_cmarafsi(r, gismus, skari)
        renderables.append(Panel(table, style=Style()))

    if args.selmaho:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        panel = karda.get_selmaho_tables_panel(
            args.selmaho, selmahos, skari, squeeze=args.squeeze
        )
        renderables.append(panel)

    if args.all_selmaho:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        selmahos.pop("UNCAT", None)
        selmahos.pop("BY", None)
        selmahos.pop("Y", None)
        panel = karda.get_selmaho_tables_panel(
            selmahos.keys(), selmahos, skari, squeeze=args.squeeze
        )
        renderables.append(panel)


    if args.wave:
        for i, panel in enumerate(renderables):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty


    if args.horizontal:
        console.print(Panel(Columns(renderables), box.DOUBLE, style=Style()))
    else:
        console.print(Panel(Group(*renderables), box.DOUBLE, expand=False, style=Style()))
