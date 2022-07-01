import color
import json
from rich.panel import Panel
from rich.text import Text
from rich import print


def print_selmaho(cmavo: str) -> None:
    with open(color.CONFIG_DEFAULTS["selmahos"], "r") as f:
        selmahos = json.load(f)
    print(Panel(color.color_prt("zo {} selma'o {}".format(color.get_selmaho(cmavo, selmahos), cmavo))))


def print_gloss(gismu: str) -> None:
    with open(color.CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)
    with open(color.CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)
    if gismu not in gismus.keys():
        t = Text("error: gismu is not caught", style="red")
    elif "gloss" not in gismus[gismu].keys():
        t = Text("error: no gloss defined", style="red")
    else:
        t = Text(gismu, style=config["rafsi"]["gismu"]) + Text(": ", style="yellow") + Text(gismus[gismu]["gloss"], style="blue")
    print(Panel(t))
    

def parse(args: dict):
    if g := args.gismu:
        print_gloss(g[0])

    if c := args.cmavo:
        print_selmaho(c[0])

    
