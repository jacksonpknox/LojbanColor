from rich.table import Table
from rich.panel import Panel
from rich.columns import Columns
from rich.style import Style
from rich.text import Text
from rich.tree import Tree
from rich import box, print
import tubnu.plumbing as plumbing


def get_cmavo_tree(cmavo: str, cmavos: dict, selmahos: dict, skari: dict):
    if not plumbing.is_cmavo(cmavo):
        raise Exception("{} is not a cmavo".format(cmavo))

    selmaho = plumbing.get_selmaho(cmavo, cmavos)
    selmaho_skari = selmahos[selmaho]["skari"]

    system_skari = skari["mi'iskari"]["system"]
    
    tree = Tree(Text(cmavo, selmaho_skari), style=skari["valskari"]["cmavo"])
    
    if not cmavo in cmavos.keys():
        tree.add("UNCAUGHT")
        return(tree)
    
    cmavo = cmavos[cmavo]
    
    tree.add("gloss", style=system_skari).add(Text(str(cmavo.get("gloss", "UNGLOSSED")), style=Style.parse(skari["mi'iskari"]["gloss"])))
    tree.add("selmaho", style=system_skari).add(Text(str(cmavo.get("selmaho", "UNSELMAHO")), style=Style.parse(selmaho_skari)))
    
    return tree


def get_gismu_tree(gismu: str, gismus: dict, skari: dict):
    if not plumbing.is_gismu(gismu):
        raise Exception("{} is not a gismu".format(gismu))

    system_skari = skari["mi'iskari"]["system"]

    tree = Tree(gismu, style=skari["valskari"]["gismu"])

    if not gismu in gismus.keys():
        tree.add("UNCAUGHT")
        return(tree)
    
    gismu = gismus[gismu]
    
    tree.add("gloss", style=system_skari).add(Text(str(gismu.get("gloss", "UNGLOSSED")), style=Style.parse(skari["mi'iskari"]["gloss"])))
    tree.add("namcu", style=system_skari).add(str(gismu.get("namcu", "UNNAMCU")))
    sumti_node = tree.add("sumti", style=system_skari)
    for sumti in gismu.get("sumti", []):
        sumti_node.add(str(sumti))

    return tree
    
    
def tabulate_rafsi_count(gismus, selmahos):
    table = Table(box=box.MINIMAL)
    table.add_column("total")
    table.add_column("gimrafsi")
    table.add_column("cmavyrafsi")
    g = 0
    for _, dic in gismus.items():
        g += len(dic.get("cmarafsi", []))
    c = 0
    for _, dic in selmahos.items():
        c += len(dic.get("cmarafsi", []))
    table.add_row(str(g + c), str(g), str(c))
    return table


def tabulate_cmavo_count(selmahos):
    table = Table(box=box.MINIMAL)
    table.add_column("selmaho")
    table.add_column("cmavo")
    c = 0
    for _, dic in selmahos.items():
        c += len(dic["cmavos"])
    table.add_row(str(len(selmahos) - 1), str(c))
    return table


def tabulate_gismu_count(gismus, skari):
    table = Table(box=box.MINIMAL)
    table.add_column("caught")
    table.add_column("glossed")
    g = 0
    for _, dic in gismus.items():
        if "gloss" in dic and dic["gloss"]:
            g += 1
    table.add_row(str(len(gismus)), str(g))
    return table


def yank_row(table):
    h = measure_height(table) - 1
    return {
        "row": [column._cells.pop(h) for column in table.columns],
        "style": table.rows[h].style,
    }


def measure_height(table):
    return len(table.columns[0]._cells)


def squeeze_table(t: Table, height: int):
    squished_tables = []
    while (h := measure_height(t)) > 0:
        n = min(h, height)
        small_table = Table(box=box.MINIMAL)
        small_table.style = t.style
        for column in t.columns:
            small_table.add_column(column.header)
        rows = [yank_row(t) for i in range(0, n)]
        rows.reverse()
        for row in rows:
            small_table.add_row(*row["row"], style=row["style"])
        squished_tables = [small_table] + squished_tables
    return squished_tables


def tabulate_gismus(g: list, gismus: dict, skari: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("gismu", style=skari["valskari"]["gismu"])
    table.add_column("gloss", style=skari["mi'iskari"]["gloss"])
    for gismu in g:
        table.add_row(gismu, plumbing.get_gloss(gismu, gismus))
    return table


def tabulate_cmarafsi(c, gismus: dict, selmahos: dict, skari: dict) -> Table:
    s = Style.parse(skari["mi'iskari"]["system"])
    table = Table(box=box.MINIMAL)
    table.add_column("cmarafsi", style=skari["valskari"]["cmarafsi"])
    table.add_column("type")
    table.add_column("gismu/cmavo")
    table.add_column("gloss/selma'o")
    for cmarafsi in c:
        word_type, word, bonus = plumbing.classify_cmarafsi(cmarafsi, gismus, selmahos)
        if word_type == "gismu":
            word = Text(word, Style.parse(skari["valskari"]["gismu"]))
            bonus = Text(bonus, Style.parse(skari["mi'iskari"]["gloss"]))
            word_type = Text(word_type, Style.parse(skari["valskari"]["gismu"]))
        elif word_type == "cmavo":
            word = Text(word, Style.parse(selmahos[bonus]["skari"]))
            bonus = Text(bonus, Style.parse(selmahos[bonus]["skari"]))
            word_type = Text(word_type, Style.parse(skari["valskari"]["cmavo"]))
        else:
            word = Text(word, s)
            bonus = Text(bonus, s)
            word_type = Text(word_type, s)
        table.add_row(cmarafsi, word_type, word, bonus)
    return table


def tabulate_cmavos(c, selmahos, skari: dict, show_styles: bool = False):
    table = Table(box=box.MINIMAL)
    table.add_column("cmavo", style=Style.parse(skari["valskari"]["cmavo"]))
    table.add_column("selma'o", style=Style.parse(skari["valskari"]["cmavo"]))
    if show_styles:
        table.add_column("style", style=Style.parse(skari["mi'iskari"]["system"]))
    for cmavo in c:
        #TODO: change selmahos to cmavos?
        s = plumbing.get_selmaho(cmavo, selmahos)
        colr = Style.parse(selmahos[s]["skari"])
        if show_styles:
            table.add_row(cmavo, s, colr, style=colr)
        else:
            table.add_row(cmavo, s, style=colr)
    return table


def get_selmaho_table(selmaho: str, selmahos: dict, skari: dict):
    cmavos = selmahos[selmaho]["cmavos"]
    return tabulate_cmavos(cmavos, selmahos, skari)


def get_selmaho_tables_panel(s: list, selmahos: dict, skari: dict, squeeze: int = 16):
    selmaho_tables = []
    for selmaho in s:
        selmaho = plumbing.force_selmaho(selmaho, selmahos)
        table = get_selmaho_table(selmaho, selmahos, skari)
        selmaho_tables.extend(squeeze_table(table, squeeze))
    return Panel(Columns(selmaho_tables), style=Style(), title="selma'o")


def tabulate_selmaho_styles(s: list, selmahos: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("selma'o")
    table.add_column("style")
    for selmaho in s:
        sty = selmahos[selmaho]["skari"]
        table.add_row(selmaho, sty, style=sty)
    return table
