import glob
import tubnu.jmaji as jmaji
import tubnu.plumbing as plumbing
import os

from rich.table import Table
from rich.console import Console, Group
from rich.style import Style
from rich.panel import Panel
from rich import box


def advance_gismu():
    gismus = plumbing.get_config("gismus")
    gismus = list(gismus.keys())

    with plumbing.Config("progress") as progress:
        progress["current_gismu"] = gismus[
            (gismus.index(progress["current_gismu"]) + 1) % len(gismus)
        ]


def summarize_directory(directory: str):
    gismus = plumbing.get_config("gismus")
    files = glob.glob(directory + "/**/*.jbo", recursive=True)
    total_glossed_gismus = []
    total_unglossed_gismus = []
    total_uncaught_gismus = []

    table = Table(box=box.MINIMAL, title="Gismu Litru")
    table.add_column("filename")
    table.add_column("glossed")
    table.add_column("unglossed")
    table.add_column("uncaught")
    for file in files:
        with open(file, "r") as f:
            collection = jmaji.collect(
                jmaji.get_parse_tree(f.read()), jmaji.GismuCollector
            )
            glossed, unglossed, uncaught = 0, 0, 0
            for gismu in collection:
                if gismu not in gismus.keys():
                    uncaught += 1
                    if gismu not in total_uncaught_gismus:
                        total_uncaught_gismus.append(gismu)
                elif not gismus[gismu]["gloss"]:
                    unglossed += 1
                    if gismu not in total_unglossed_gismus:
                        total_unglossed_gismus.append(gismu)
                else:
                    glossed += 1
                    if gismu not in total_glossed_gismus:
                        total_glossed_gismus.append(gismu)
        filename = os.path.split(file)[1].split(".")[0]
        print(filename)
        table.add_row(filename, str(glossed), str(unglossed), str(uncaught))
    table.add_row(
        "total",
        str(len(total_glossed_gismus)),
        str(len(total_unglossed_gismus)),
        str(len(total_uncaught_gismus)),
    )
    return table


def parse(args: dict):
    console = Console()

    renderables = []

    if d := args.directory:
        table = summarize_directory(d)
        renderables.append(Panel(table, style=Style()))

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False, style=Style()))

    if c := args.crane:
        advance_gismu()
