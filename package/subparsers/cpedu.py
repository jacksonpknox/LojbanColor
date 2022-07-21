import tubnu.plumbing as plumbing
import tubnu.karda as karda

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


def parse(args: dict):
    rec = bool(e := args.export)
    console = Console(record=rec, force_interactive=(not rec))

    skari = plumbing.get_config("skari")
    selmahos = plumbing.get_config("selmahos")
    gismus = plumbing.get_config("gismus")

    renderables = []

    # skari subgroup
    if args.selmaho_style or args.minji_style or args.valsi_style:
        short_skari_renderables = []
        if s := args.selmaho_style:
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
        table = karda.tabulate_selmaho_styles(selmahos.keys(), selmahos)
        renderables.append(
            Panel(Columns(karda.squeeze_table(table, args.squeeze)), style=Style())
        )

    # valsi subgroup
    if args.cmavo or args.gloss or args.rafsi:
        valsi_renderables = []

        if c := args.cmavo:
            c = [cmavo.lower().replace("h", "'") for cmavo in c]

            table = karda.tabulate_cmavos(c, selmahos, skari)
            valsi_renderables.append(Panel(table, style=Style()))

        if g := args.gloss:
            table = karda.tabulate_gismus(g, gismus, skari)
            valsi_renderables.append(Panel(table, style=Style()))

        if r := args.rafsi:
            table = karda.tabulate_cmarafsi(r, gismus, selmahos, skari)
            valsi_renderables.append(Panel(table, style=Style()))

        renderables.append(Panel(Columns(valsi_renderables), style=Style()))

    if args.selmaho:
        panel = karda.get_selmaho_tables_panel(
            args.selmaho, selmahos, skari, squeeze=args.squeeze
        )
        renderables.append(panel)

    if args.all_selmaho:
        selmahos.pop("UNCAT")
        selmahos.pop("BY")
        selmahos.pop("Y")
        panel = karda.get_selmaho_tables_panel(
            selmahos.keys(), selmahos, skari, squeeze=args.squeeze
        )
        renderables.append(panel)

    # kancu subgroup
    if args.count_gismu or args.count_cmavo or args.count_rafsi:
        count_renderables = []
        if args.count_gismu:
            table = karda.tabulate_gismu_count(gismus, skari)
            count_renderables.append(
                Panel(table, style=Style.parse(skari["valskari"]["gismu"]))
            )

        if args.count_cmavo:
            table = karda.tabulate_cmavo_count(selmahos)
            count_renderables.append(
                Panel(table, style=Style.parse(skari["valskari"]["cmavo"]))
            )

        if args.count_rafsi:
            table = karda.tabulate_rafsi_count(gismus, selmahos)
            count_renderables.append(
                Panel(table, style=Style.parse(skari["valskari"]["cmarafsi"]))
            )
        renderables.append(Panel(Columns(count_renderables), style=Style()))

    if args.wave:
        for i, panel in enumerate(renderables):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False, style=Style()))

    if rec:
        console.save_svg(e, title="skavla")
