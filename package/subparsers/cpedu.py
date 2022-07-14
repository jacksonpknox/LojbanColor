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


#TODO: add export option
def parse(args: dict):
    skari = plumbing.get_config("skari")
    renderables = []
    console = Console()

    # skari subgroup
    if args.selmaho_style or args.minji_style or args.valsi_style:
        short_skari_renderables = []
        if s := args.selmaho_style:
            with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
                selmahos = json.load(f)
            s = [plumbing.force_selmaho(selmaho, selmahos) for selmaho in s]
            table = karda.tabulate_selmaho_styles(s, selmahos)
            short_skari_renderables.append(Panel(table, style=Style()))

        if m := args.minji_style:
            for token in m:
                if token not in skari["mi'iskari"].keys():
                    raise Exception("Error!! not a minji token: " + token)
            table = tabulate_minji_styles(m, skari)
            short_skari_renderables.append(Panel(table, style=Style()))

        if v := args.valsi_style:
            for token in v:
                if token not in skari["valskari"].keys():
                    raise Exception("Error!! not a valsi token: " + token)
            table = tabulate_valsi_styles(v, skari)
            short_skari_renderables.append(Panel(table, style=Style()))
        renderables.append(Panel(Columns(short_skari_renderables), style=Style()))

    if args.valskari or args.mihiskari:
        long_skari_renderables = []
        if args.valskari:
            tokens = skari["valskari"].keys()
            table = tabulate_valsi_styles(tokens, skari)
            table.title = "valskari"
            long_skari_renderables.append(Panel(table, style=Style()))

        if args.mihiskari:
            tokens = skari["mi'iskari"].keys()
            table = tabulate_minji_styles(tokens, skari)
            table.title = "mi'iskari"
            long_skari_renderables.append(Panel(table, style=Style()))
        renderables.append(Panel(Columns(long_skari_renderables), style=Style()))

    if args.selmahoskari:
        with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        table = karda.tabulate_selmaho_styles(selmahos.keys(), selmahos)
        renderables.append(Panel(Columns(karda.squeeze_table(table, args.squeeze)), style=Style()))


    # valsi subgroup
    if args.cmavo or args.gloss or args.rafsi:
        valsi_renderables = []
        if c := args.cmavo:
            with open(plumbing.CONFIG_DEFAULTS["selmahos"], "r") as f:
                selmahos = json.load(f)
            c = [cmavo.lower().replace("h", "'") for cmavo in c]
            table = karda.tabulate_cmavos(c, selmahos, skari)
            valsi_renderables.append(Panel(table, style=Style()))

        if g := args.gloss:
            with open(plumbing.CONFIG_DEFAULTS["gismus"], "r") as f:
                gismus = json.load(f)
            table = karda.tabulate_gismus(g, gismus, skari)
            valsi_renderables.append(Panel(table, style=Style()))

        if r := args.rafsi:
            gismus = plumbing.get_config("gismus")
            selmahos = plumbing.get_config("selmahos")
            table = karda.tabulate_cmarafsi(r, gismus, selmahos, skari)
            valsi_renderables.append(Panel(table, style=Style()))
        renderables.append(Panel(Columns(valsi_renderables), style=Style()))


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


    # kancu subgroup
    if args.count_gismu or args.count_cmavo or args.count_rafsi:
        count_renderables = []
        if args.count_gismu:
            gismus = plumbing.get_config("gismus")
            table = karda.tabulate_gismu_count(gismus, skari)
            count_renderables.append(Panel(table, style=Style.parse(skari["valskari"]["gismu"])))

        if args.count_cmavo:
            selmahos = plumbing.get_config("selmahos")
            table = karda.tabulate_cmavo_count(selmahos)
            count_renderables.append(Panel(table, style=Style.parse(skari["valskari"]["cmavo"])))

        if args.count_rafsi:
            gismus = plumbing.get_config("gismus")
            selmahos = plumbing.get_config("selmahos")
            table = karda.tabulate_rafsi_count(gismus, selmahos)
            count_renderables.append(Panel(table, style=Style.parse(skari["valskari"]["cmarafsi"])))
        renderables.append(Panel(Columns(count_renderables), style=Style()))


    if args.wave:
        for i, panel in enumerate(renderables):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False, style=Style()))
