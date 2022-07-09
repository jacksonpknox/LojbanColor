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

    #CUXNA CUXNA CUXNA CUXNA CUXNA
    parser_config = subparsers.add_parser("cuxna", formatter_class=RichHelpFormatter)
    config_skari_subgroup = parser_config.add_argument_group("skari")
    config_skari_subgroup.add_argument(
        "-s",
        "--selmaho-style",
        dest="selmaho_style",
        action="store",
        nargs=2,
        help="stylize SELMAHO with STYLE",
        metavar=("SELMAHO", "STYLE"),
    )
    config_skari_subgroup.add_argument(
        "-m",
        "--minji-style",
        dest="minji_style",
        action="store",
        nargs=2,
        help="stylize minji TOKEN with STYLE",
        metavar=("TOKEN", "STYLE"),
    )
    config_skari_subgroup.add_argument(
        "-v",
        "--valsi-style",
        dest="valsi_style",
        action="store",
        nargs=2,
        help="stylize valsi TOKEN with STYLE",
        metavar=("TOKEN", "STYLE"),
    )
    config_skari_subgroup.add_argument(
        "--all-selmaho-style",
        dest="all_selmaho_style",
        action="store",
        nargs=1,
        help="stylize every selma'o with STYLE",
        metavar="STYLE"
    )
    config_valsi_subgroup = parser_config.add_argument_group("valsi")
    config_valsi_subgroup.add_argument(
        "-c",
        "--cmavo",
        action="store",
        nargs=2,
        help="extend SELMAHO to include CMAVO",
        metavar=("SELMAHO", "CMAVO"),
    )
    config_valsi_subgroup.add_argument(
        "-g",
        "--gloss",
        action="store",
        nargs=2,
        help="gloss GISMU with PHRASE",
        metavar=("GISMU", "PHRASE"),
    )
    config_valsi_subgroup.add_argument(
        "-r",
        "--rafsi",
        dest="cmarafsi",
        action="store",
        nargs=2,
        help="attribute GISMU with CMARAFSI",
        metavar=("GISMU", "CMARAFSI"),
    )
    parser_config.set_defaults(func=cuxna.parse)


    # TCIDU TCIDU TCIDU TCIDU TCIDU
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
        "-w",
        "--wave",
        action="store_true",
        help="make background colors alternate"
    )
    read_panels_subgroup = parser_read.add_argument_group("panels")
    read_panels_subgroup.add_argument(
        "-c",
        "--cmavo",
        action="store_true",
        help="record all cmavo and print their selmaho",
    )
    read_panels_subgroup.add_argument(
        "-g",
        "--gismu",
        action="store_true",
        help="record all gismu that appear in brivla and gloss them",
    )
    read_panels_subgroup.add_argument(
        "-r",
        "--rafsi",
        action="store_true",
        help="record all cmarafsi that appear in lujvo and print their gismu and gloss",
    )
    read_panels_subgroup.add_argument(
        "-s",
        "--selmaho",
        action="store_true",
        help="record all cmavo and group them by selma'o",
    )
    read_panels_subgroup.add_argument(
        "--selmaho-style",
        action="store_true",
        dest="selmaho_style",
        help="print the style of every selma'o that shows us",
    )
    read_panels_subgroup.add_argument(
        "-n",
        "--no-prigau",
        dest="prigau",
        action="store_false",
        help="do not print read text",
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
        "-q",
        "--squeeze",
        action="store",
        type=int,
        help="squeeze all tables down to HEIGHT rows",
        metavar="HEIGHT",
        default=16,
    )
    parser_read.add_argument(
        "--catch-gismus",
        dest="catch_gismus",
        action="store_true",
        help="prompt the user for the glosses of the gismus that show up"
    )
    parser_read.add_argument(
        "--catch-rafsi",
        dest="catch_rafsi",
        action="store_true",
        help="prompt the user to complete the rafsi table"
    )
    parser_read.set_defaults(func=tcidu.parse)


    # CPEDU CPEDU CPEDU CPEDU CPEDU
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
    parser_request.add_argument(
        "-w",
        "--wave",
        action="store_true",
        help="make backgrounds colors alternate"
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
    # kancu subgroup
    kancu_subgroup = parser_request.add_argument_group("kancu")
    kancu_subgroup.add_argument(
        "--count-cmavo",
        dest="count_cmavo",
        action="store_true",
        help="count the cmavos in your inventory"
    )
    kancu_subgroup.add_argument(
        "--count-gismu",
        dest="count_gismu",
        action="store_true",
        help="count the gismus in your inventory"
    )
    kancu_subgroup.add_argument(
        "--count-rafsi",
        dest="count_rafsi",
        action="store_true",
        help="count the rafsi in your inventory"
    )

    parser_request.set_defaults(func=cpedu.parse)

    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()
