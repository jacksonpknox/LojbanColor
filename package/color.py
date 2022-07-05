import argparse
from rich_argparse import RichHelpFormatter

import subparsers.cuxna as cuxna
import subparsers.tcidu as tcidu
import subparsers.cpedu as cpedu


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
        metavar=("SELMAHO", "STYLE"),
    )
    parser_config.add_argument(
        "-t",
        "--token-style",
        dest="token_style",
        action="store",
        nargs=2,
        help="stylize TOKEN with style",
        metavar=("TOKEN", "STYLE"),
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
        help="record all cmavo and print their selmaho",
    )
    parser_read.add_argument(
        "-g",
        "--gismu",
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
        "-z",
        "--horizontal",
        action="store_true",
        help="print panels in a horizontal row",
    )
    parser_read.add_argument(
        "-n",
        "--no-prigau",
        dest="prigau",
        action="store_false",
        help="do not print read text",
    )
    parser_read.add_argument(
        "--selmaho-style",
        action="store_true",
        dest="selmaho_style",
        help="show selmaho styles (when using --cmavo)",
    )
    parser_read.add_argument(
        "-s",
        "--selmaho",
        action="store_true",
        help="print the table of every selmaho that shows up",
    )
    parser_read.set_defaults(func=tcidu.parse)

    parser_request = subparsers.add_parser("cpedu", formatter_class=RichHelpFormatter)
    parser_request.add_argument(
        "-z",
        "--horizontal",
        action="store_true",
        help="print panels in a horizontal row"
    )
    parser_request.add_argument(
        "-q",
        "--squeeze",
        action="store",
        type=int,
        help="squeeze all tables down to HEIGHT rows",
        metavar="HEIGHT",
        default=16,
    )
    skari_subgroup = parser_request.add_argument_group("skari")
    skari_subgroup.add_argument(
        "-s",
        "--selmaho-style",
        dest="selmaho_style",
        nargs="+",
        action="extend",
        help="print the style of each SELMAHO",
        metavar="SELMAHO",
    )
    skari_subgroup.add_argument(
        "-m",
        "--minji-style",
        dest="minji_style",
        nargs="+",
        action="extend",
        help="print the style of each minji TOKEN",
        metavar="TOKEN",
    )
    skari_subgroup.add_argument(
        "-v",
        "--valsi-style",
        dest="valsi_style",
        nargs="+",
        action="extend",
        help="print the style of each valsi TOKEN",
        metavar="TOKEN",
    )
    skari_subgroup.add_argument(
        "--valskari", action="store_true", help="print out all valskari"
    )
    skari_subgroup.add_argument(
        "--mihiskari", action="store_true", help="print out all mi'iskari"
    )
    skari_subgroup.add_argument(
        "--selmahoskari", action="store_true", help="print out all selmahoskari"
    )
    valsi_subgroup = parser_request.add_argument_group("valsi")
    valsi_subgroup.add_argument(
        "-c",
        "--cmavo",
        nargs="+",
        action="extend",
        help="print the selmaho of each CMAVO",
        metavar="CMAVO",
    )
    valsi_subgroup.add_argument(
        "-g",
        "--gloss",
        nargs="+",
        action="extend",
        help="print the gloss of each GISMU",
        metavar="GISMU",
    )
    valsi_subgroup.add_argument(
        "-r",
        "--rafsi",
        nargs="+",
        action="extend",
        help="print the gismu and gloss of each CMARAFSI",
        metavar="CMARAFSI",
    )
    valsi_subgroup.add_argument(
        "--selmaho",
        nargs="+",
        action="extend",
        help="print every cmavo of each SELMAHO",
        metavar="SELMAHO",
    )
    valsi_subgroup.add_argument(
        "--all-selmaho", action="store_true", help="print out all cmavo of each selma'o"
    )
    parser_request.set_defaults(func=cpedu.parse)

    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()
