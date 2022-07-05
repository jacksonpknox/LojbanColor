from rich.table import Table
from rich.panel import Panel
from rich.columns import Columns
from rich import box
import plumbing

#TODO: output is a list of tables
def squeeze_table(table: Table, height: int):
    pass

def tabulate_cmarafsi(c, gismus, skari: dict) -> Table:
    table = Table(box=box.MINIMAL)
    table.add_column("cmarafsi", style=skari["valskari"]["cmarafsi"])
    table.add_column("gismu", style=skari["valskari"]["gismu"])
    table.add_column("gloss", style=skari["mi'iskari"]["gloss"])
    for cmarafsi in c:
        gismu = plumbing.get_gismu(cmarafsi, gismus)
        table.add_row(
            cmarafsi, gismu, plumbing.get_gloss(gismu, gismus)
        )
    return table


def tabulate_cmavos(c, selmahos, skari: dict, show_styles: bool=False):
    table = Table(box=box.MINIMAL)
    table.add_column("cmavo", style=skari["valskari"]["cmavo"])
    table.add_column("selma'o", style=skari["valskari"]["cmavo"])
    if show_styles:
        table.add_column("style", style=skari["mi'iskari"]["system"])
    for cmavo in c:
        s = plumbing.get_selmaho(cmavo, selmahos)
        colr = selmahos[s]["color"]
        if show_styles:
            table.add_row(cmavo, s, colr, style=colr)
        else:
            table.add_row(cmavo, s, style=colr)
    return table

def get_selmaho_table(selmaho: str, selmahos: dict, skari: dict):
    cmavos = selmahos[selmaho]["cmavos"]
    return tabulate_cmavos(cmavos, selmahos, skari)


#TODO: option to limit table height: split tall tables into grouped sub-tables
def get_selmaho_tables_panel(s: list, selmahos: dict, skari: dict, squeeze: int=0):
    selmaho_tables = []
    for selmaho in s:
        selmaho = plumbing.force_selmaho(selmaho, selmahos)
        table = get_selmaho_table(selmaho, selmahos, skari)
        if squeeze:
            #TODO: option not written
            selmaho_tables += squeeze_table(table, squeeze)
        else:
            selmaho_tables.append(table) #no panel around each table!
    return Panel(Columns(selmaho_tables))


def gloss_gismus(g: list, gismus: dict, skari: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("gismu", style=skari["valskari"]["gismu"])
    table.add_column("gloss", style=skari["mi'iskari"]["gloss"])
    for gismu in g:
        table.add_row(gismu, plumbing.get_gloss(gismu, gismus))
    return table
