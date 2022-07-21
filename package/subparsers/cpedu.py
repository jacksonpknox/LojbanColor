import tubnu.plumbing as plumbing
import tubnu.karda as karda

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


def kancu_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    renderables = []

    if args.count_cmavo:
        table = karda.tabulate_cmavo_count(selmahos)
        renderables.append(
            Panel(table, style=Style.parse(skari["valskari"]["cmavo"]), title="cmavo")
        )

    if args.count_gismu:
        table = karda.tabulate_gismu_count(gismus, skari)
        renderables.append(
            Panel(table, style=Style.parse(skari["valskari"]["gismu"]), title="gismu")
        )

    if args.count_rafsi:
        table = karda.tabulate_rafsi_count(gismus, selmahos)
        renderables.append(
            Panel(table, style=Style.parse(skari["valskari"]["cmarafsi"]), title="cmarafsi")
        )

    return Panel(Columns(renderables), style=Style(), title="kancu")


def all_selmaho_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    selmahos.pop("UNCAT")
    selmahos.pop("BY")
    selmahos.pop("Y")
    panel = karda.get_selmaho_tables_panel(
        selmahos.keys(), selmahos, skari, squeeze=args.squeeze
    )
    return panel
    

def selmaho_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    panel = karda.get_selmaho_tables_panel(
        args.selmaho, selmahos, skari, squeeze=args.squeeze
    )
    return panel
    

def short_valsi_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    renderables = []
    if c := args.cmavo:
        c = [cmavo.lower().replace("h", "'") for cmavo in c]
        table = karda.tabulate_cmavos(c, selmahos, skari)
        renderables.append(Panel(table, style=Style.parse(skari["valskari"]["cmavo"]), title="cmavo"))

    if g := args.gloss:
        table = karda.tabulate_gismus(g, gismus, skari)
        renderables.append(Panel(table, style=Style.parse(skari["valskari"]["gismu"]), title="gismu"))

    if r := args.rafsi:
        table = karda.tabulate_cmarafsi(r, gismus, selmahos, skari)
        renderables.append(Panel(table, style=Style.parse(skari["valskari"]["cmarafsi"]), title="cmarafsi"))

    return Panel(Columns(renderables), style=Style(), title="valsi")


def all_selmaho_skari_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    table = karda.tabulate_selmaho_styles(selmahos.keys(), selmahos)
    renderables = karda.squeeze_table(table, args.squeeze)

    return Panel(Columns(renderables), style=Style(), title="selmahoskari")
    

def all_skari_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    renderables = []
    if args.valskari:
        tokens = skari["valskari"].keys()
        table = tabulate_valsi_styles(tokens, skari)
        renderables.append(Panel(table, style=Style(), title="valskari"))

    if args.mihiskari:
        tokens = skari["mi'iskari"].keys()
        table = tabulate_minji_styles(tokens, skari)
        renderables.append(Panel(table, style=Style(), title="mi'iskari"))

    return Panel(Columns(renderables), style=Style(), title="skari")


def short_skari_big_panel(skari: dict, selmahos: dict, gismus: dict, args):
    renderables = []
    if s := args.selmaho_style:
        s = [plumbing.force_selmaho(selmaho, selmahos) for selmaho in s]
        table = karda.tabulate_selmaho_styles(s, selmahos)
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

    return Panel(Columns(renderables), style=Style(), title="skari")


def get_big_panels(args):
    skari = plumbing.get_config("skari")
    selmahos = plumbing.get_config("selmahos")
    gismus = plumbing.get_config("gismus")

    renderables = []

    # skari subgroup
    if args.selmaho_style or args.minji_style or args.valsi_style:
        panel = short_skari_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)
        
    if args.valskari or args.mihiskari:
        panel = all_skari_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)

    if args.selmahoskari:
        panel = all_selmaho_skari_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)

    # valsi subgroup
    if args.cmavo or args.gloss or args.rafsi:
        panel = short_valsi_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)

    if args.selmaho:
        panel = selmaho_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)

    if args.all_selmaho:
        panel = all_selmaho_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)

    # kancu subgroup
    if args.count_gismu or args.count_cmavo or args.count_rafsi:
        panel = kancu_big_panel(skari, selmahos, gismus, args)
        renderables.append(panel)
    
    return renderables


def parse(args: dict):
    rec = bool(e := args.export)
    console = Console(record=rec, force_interactive=(not rec))

    big_panels = get_big_panels(args)

    if args.wave:
        for i, panel in enumerate(big_panels):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty

    console.print(Panel(Group(*big_panels), box.DOUBLE, expand=False, style=Style(), title="cpedu"))

    if rec:
        console.save_svg(e, title="skavla")
