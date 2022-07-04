from antlr4 import *

import argparse

from rich_argparse import RichHelpFormatter

import subparsers.cuxna as cuxna
import subparsers.prigau as prigau
import subparsers.cpedu as cpedu

CONFIG_DEFAULTS = {
    "selmahos": "config/selmahos.json",
    "config": "config/config.json",
    "gismus": "config/gismus.json",
}


def get_gloss(gismu: str, gismus: dict) -> str:
    if gismu not in gismus.keys():
        return "UNCAUGHT"
    if "gloss" not in gismus[gismu].keys() or not gismus[gismu]["gloss"]:
        return "UNGLOSSED"
    return gismus[gismu]["gloss"]


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


def build_parser():
    parser = argparse.ArgumentParser(
        formatter_class=RichHelpFormatter,
        description="This is the skavla program :)",
        epilog="God bless you !",
    )
    subparsers = parser.add_subparsers(title="commands")

    parser_config = subparsers.add_parser("cuxna", formatter_class=RichHelpFormatter)
    parser_config.add_argument(
        "-a",
        "--add",
        action="store",
        nargs=2,
        help="add CMAVO to SELMAHO",
        metavar=("CMAVO", "SELMAHO"),
    )
    parser_config.add_argument(
        "-c",
        "--color",
        action="store",
        nargs=2,
        help="set the color of SELMAHO to COLOR",
        metavar=("SELMAHO", "COLOR"),
    )
    parser_config.add_argument(
        "-g",
        "--gloss",
        action="store",
        nargs=2,
        help="assign gloss PHRASE to GISMU",
        metavar=("GISMU", "PHRASE"),
    )
    parser_config.add_argument(
        "-s",
        "--sort",
        action="store",
        nargs=1,
        help="recursively sort a json",
        choices=["selmahos", "gismus"],
    )
    parser_config.add_argument(
        "-r",
        "--rafsi",
        dest="cmarafsi",
        action="store",
        nargs=2,
        help="assign cmarafsi CMARAFSI to GISMU",
        metavar=("GISMU", "CMARAFSI"),
    )
    parser_config.set_defaults(func=cuxna.parse)

    parser_read = subparsers.add_parser("prigau", formatter_class=RichHelpFormatter)
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
        "-g",
        "--gismu",
        action="store_true",
        help="record all gismu that appear in brivla and print them",
    )
    parser_read.add_argument(
        "-c",
        "--cmarafsi",
        action="store_true",
        help="record all cmarafsi that appear in lujvo and print them",
    )
    parser_read.add_argument(
        "-e",
        "--export",
        action="store",
        help="export the result to an .svg file",
        metavar="LOCATION",
    )
    parser_read.add_argument(
        "-r", "--row", action="store_true", help="print panels in a horizontal row"
    )
    parser_read.add_argument(
        "-n", "--no-prigau", dest="prigau", action="store_false", help="do not print read text"
    )
    parser_read.set_defaults(func=prigau.parse)

    parser_request = subparsers.add_parser("cpedu", formatter_class=RichHelpFormatter)
    parser_request.add_argument(
        "-g",
        "--gismu",
        nargs="+",
        action="extend",
        help="print out the gloss of GISMU",
        metavar="GISMU",
    )
    parser_request.add_argument(
        "-c",
        "--cmavo",
        nargs="+",
        action="extend",
        help="print out the selmaho of CMAVO",
        metavar="CMAVO",
    )
    parser_request.set_defaults(func=cpedu.parse)

    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()
