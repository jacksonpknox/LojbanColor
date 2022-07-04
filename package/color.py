from antlr4 import *

import argparse

import json

from rich_argparse import RichHelpFormatter

import subparsers.cuxna as cuxna
import subparsers.tcidu as tcidu
import subparsers.cpedu as cpedu

from rich import box
from rich.text import Text
from rich.table import Table

CONFIG_DEFAULTS = {
    "config": "config/config.json",
    "gismus": "config/gismus.json",
    "selmahos": "config/selmahos.json",
    "skari": "config/skari.json",
}

def get_config(conf: str) -> dict:
    with open(CONFIG_DEFAULTS[conf]) as f:
        return json.load(f)


C = "bcdfgjklmnprstvxz"
V = "aeiou"


def is_cmavo(valsi: str) -> bool:
    if (z := valsi[0]) not in C and z != ".":
        return False
    for c in valsi[1:]:
        if c not in V and c != "'":
            return False
    return True


def get_gloss(gismu: str, gismus: dict) -> str:
    if gismu not in gismus.keys():
        return "UNCAUGHT"
    if "gloss" not in gismus[gismu].keys() or not gismus[gismu]["gloss"]:
        return "UNGLOSSED"
    return gismus[gismu]["gloss"]


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    if not is_cmavo(cmavo):
        raise Exception("Error! not cmav by morphology exception")
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


def force_selmaho(selmaho: str, selmahos: dict) -> str:
    if selmaho not in selmahos.keys():
        cmavo_form = selmaho.lower().replace('h', '\'')
        if not is_cmavo(cmavo_form):
            raise Exception("Error! not cmav by morphology exception")
        selmaho = get_selmaho(cmavo_form, selmahos)
    return selmaho


def get_gismu(cmarafsi: str, gismus: dict) -> str:
    for gismu in gismus.keys():
        if cmarafsi in gismus[gismu]["cmarafsi"]:
            return gismu
    return "UNCAT"

 
def tabulate_cmarafsi(c, gismus, skari: dict) -> Table:
    table = Table(box=box.MINIMAL)
    table.add_column("cmarafsi", style=skari["valskari"]["cmarafsi"])
    table.add_column("gismu", style=skari["valskari"]["gismu"])
    table.add_column("gloss", style=skari["mi'iskari"]["gloss"])
    for cmarafsi in c:
        gismu = get_gismu(cmarafsi, gismus)
        table.add_row(
            cmarafsi, gismu, get_gloss(gismu, gismus)
        )
    return table


def tabulate_selmahos(c, selmahos, skari: dict, show_styles: bool=False):
    table = Table(box=box.MINIMAL)
    table.add_column("cmavo", style=skari["valskari"]["cmavo"])
    table.add_column("selma'o", style=skari["valskari"]["cmavo"])
    if show_styles:
        table.add_column("style", style=skari["mi'iskari"]["system"])
    for cmavo in c:
        s = get_selmaho(cmavo, selmahos)
        colr = selmahos[s]["color"]
        if show_styles:
            table.add_row(cmavo, s, colr, style=colr)
        else:
            table.add_row(cmavo, s, style=colr)
    return table


def gloss_gismus(g: list, gismus: dict, skari: dict):
    table = Table(box=box.MINIMAL)
    table.add_column("gismu", style=skari["valskari"]["gismu"])
    table.add_column("gloss", style=skari["mi'iskari"]["gloss"])
    for gismu in g:
        table.add_row(gismu, get_gloss(gismu, gismus))
    return table


def build_parser():
    parser = argparse.ArgumentParser(
        formatter_class=RichHelpFormatter,
        description="This is the skavla program :)",
        epilog="God bless you !",
    )
    subparsers = parser.add_subparsers(title="commands")

    parser_config = subparsers.add_parser("cuxna", formatter_class=RichHelpFormatter)
    parser_config.add_argument(
        "-s",
        "--selmaho-style",
        dest="selmaho_style",
        action="store",
        nargs=2,
        help="stylize SELMAHO with STYLE",
        metavar=("SELMAHO", "STYLE")
    )
    parser_config.add_argument(
        "-t",
        "--token-style",
        dest="token_style",
        action="store",
        nargs=2,
        help="stylize TOKEN with style",
        metavar=("TOKEN", "STYLE")
    )
    parser_config.add_argument(
        "-c",
        "--cmavo",
        action="store",
        nargs=2,
        help="extend SELMAHO to include CMAVO",
        metavar=("SELMAHO", "CMAVO"),
    )
    parser_config.add_argument(
        "-g",
        "--gloss",
        action="store",
        nargs=2,
        help="gloss GISMU with PHRASE",
        metavar=("GISMU", "PHRASE"),
    )
    parser_config.add_argument(
        "-r",
        "--rafsi",
        dest="cmarafsi",
        action="store",
        nargs=2,
        help="attribute GISMU with CMARAFSI",
        metavar=("GISMU", "CMARAFSI"),
    )
    parser_config.set_defaults(func=cuxna.parse)


    parser_read = subparsers.add_parser("tcidu", formatter_class=RichHelpFormatter)
    parser_read.add_argument(
        "filepath",
        action="extend",
        help="read a text file and color it",
        metavar="FILEPATH",
        nargs="*",
    )
    parser_read.add_argument(
        "-i",
        "--input",
        action="store_true",
        help="read from standard input and color it",
    )
    parser_read.add_argument(
        "-c",
        "--cmavo",
        action="store_true",
        help="record all cmavo and print their selmaho"
    )
    parser_read.add_argument(
        "-g",
        "--gloss",
        action="store_true",
        help="record all gismu that appear in brivla and gloss them",
    )
    parser_read.add_argument(
        "-r",
        "--rafsi",
        action="store_true",
        help="record all cmarafsi that appear in lujvo and print their gismu and gloss",
    )
    parser_read.add_argument(
        "-e",
        "--export",
        action="store",
        help="export the result to an .svg file",
        metavar="LOCATION",
    )
    parser_read.add_argument(
        "-z", "--horizontal", action="store_true", help="print panels in a horizontal row"
    )
    parser_read.add_argument(
        "-n", "--no-prigau", dest="prigau", action="store_false", help="do not print read text"
    )
    parser_read.add_argument(
        "--selmaho-style",
        action="store_true",
        dest="selmaho_style",
        help="show selmaho styles (when using --cmavo)",
    )
    parser_read.set_defaults(func=tcidu.parse)


    parser_request = subparsers.add_parser("cpedu", formatter_class=RichHelpFormatter)
    parser_request.add_argument(
        "-s",
        "--selmaho-style",
        dest="selmaho_style",
        nargs="+",
        action="extend",
        help="print the style of each SELMAHO",
        metavar="SELMAHO",
    )
    parser_request.add_argument(
        "-t",
        "--token-style",    
        dest="token_style",
        nargs="+",
        action="extend",
        help="print the style of each TOKEN",
        metavar="TOKEN",
    )
    parser_request.add_argument(
        "-c",
        "--cmavo",
        nargs="+",
        action="extend",
        help="print the selmaho of each CMAVO",
        metavar="CMAVO",
    )
    parser_request.add_argument(
        "-g",
        "--gloss",
        nargs="+",
        action="extend",
        help="print the gloss of each GISMU",
        metavar="GISMU",
    )
    parser_request.add_argument(
        "-r", "--rafsi", nargs="+", action="extend", help="print the gismu and gloss of each CMARAFSI",
        metavar="CMARAFSI"
    )
    parser_request.add_argument(
        "--selmaho",
        nargs="+",
        action="extend",
        help="print every cmavo of each SELMAHO",
        metavar="SELMAHO"
    )
    parser_request.add_argument(
        "--tokens",
        action="store_true",
        help="print out all valskari"
    )
    parser_request.set_defaults(func=cpedu.parse)

    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()
