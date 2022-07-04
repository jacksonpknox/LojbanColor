import color
import json

from rich import box

from rich.panel import Panel
from rich.table import Table
from rich.console import Console, Group

# TODO: verbosity options


def parse(args: dict):
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)
    renderables = []
    console = Console()

    if g := args.gismu:
        with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
            gismus = json.load(f)
        renderables.append(Panel(color.gloss_gismus(g, gismus, config)))

    if c := args.cmavo:
        with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
            selmahos = json.load(f)
        renderables.append(Panel(color.tabulate_selmahos(c, selmahos, config)))

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))
