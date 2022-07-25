import argparse
from tubnu.rich_argparse import RichHelpFormatter

import tubnu.plumbing as plumbing
import subparsers.cuxna as cuxna
import subparsers.tcidu as tcidu
import subparsers.cpedu as cpedu
import subparsers.litru as litru

import tricu


def inflate_cuxna_parser(parser: argparse.ArgumentParser) -> None:
    # skari subgroup
    config_skari_subgroup = parser.add_argument_group("skari")
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

    subparsers = parser.add_subparsers(title="configs")
    
    cmavos_cuxna_parser = subparsers.add_parser("cmavo", formatter_class=RichHelpFormatter)
    cmavos_cuxna_schema = [
        tricu.SingleStringAttribute("gloss"),
        tricu.SingleStringAttribute("selmaho", verifier=lambda x: plumbing.is_selmaho(x[1]))
    ]
    tricu.inflate_schematic_cuxna_parser(cmavos_cuxna_parser, cmavos_cuxna_schema, plumbing.CONFIG_DEFAULTS["cmavo"])

    cmavyrafsi_cuxna_parser = subparsers.add_parser("cmavyrafsi", formatter_class=RichHelpFormatter)
    cmavyrafsi_cuxna_schema = [
        tricu.SingleStringAttribute("cmavo", lambda x: plumbing.is_cmavo(x[1])),
        tricu.TagsListAttribute("liste"),
        tricu.TagsListAttribute("tags")
    ]
    tricu.inflate_schematic_cuxna_parser(cmavyrafsi_cuxna_parser, cmavyrafsi_cuxna_schema, plumbing.CONFIG_DEFAULTS["cmavyrafsi"])

    gismu_cuxna_parser = subparsers.add_parser("gismu", formatter_class=RichHelpFormatter)
    gismu_cuxna_schema = [
        tricu.SingleStringAttribute("gloss"),
        tricu.TagsListAttribute("liste"),
        tricu.TagsListAttribute("tags"),
        tricu.SingleIntegerAttribute("namcu", lambda x : int(x[1]) in range(1,6)), # bug. doesnt know it is an int
        tricu.SpringyTagsListAttribute("sumti", "zo'e", lambda x : int(x[1]) in range(1,6)),
    ]
    tricu.inflate_schematic_cuxna_parser(gismu_cuxna_parser, gismu_cuxna_schema, plumbing.CONFIG_DEFAULTS["gismu"])

    rafsi_cuxna_parser = subparsers.add_parser("rafsi", formatter_class=RichHelpFormatter)
    rafsi_cuxna_schema = [
        tricu.SingleStringAttribute("gismu", verifier=lambda x: plumbing.is_gismu(x[1])),
        tricu.TagsListAttribute("liste"),
        tricu.TagsListAttribute("tags")
    ]
    tricu.inflate_schematic_cuxna_parser(rafsi_cuxna_parser, rafsi_cuxna_schema, plumbing.CONFIG_DEFAULTS["rafsi"])

    selmaho_cuxna_parser = subparsers.add_parser("selmaho", formatter_class=RichHelpFormatter)
    selmaho_cuxna_schema = [
        tricu.SingleStringAttribute("skari"),
        tricu.TagsListAttribute("cmavos", verifier=lambda x: plumbing.is_cmavo(x[1])),
        tricu.TagsListAttribute("tags")
    ]
    tricu.inflate_schematic_cuxna_parser(selmaho_cuxna_parser, selmaho_cuxna_schema, plumbing.CONFIG_DEFAULTS["selmaho"])
    tadji_selmaho_cuxna_group = selmaho_cuxna_parser.add_argument_group("tadji")
    tadji_selmaho_cuxna_group.add_argument(
        "--all-selmaho-style",
        dest="all_selmaho_style",
        action="store",
        nargs=1,
        help="stylize every selma'o with STYLE",
        metavar="STYLE",
    )

    parser.set_defaults(func=cuxna.parse)

    
def inflate_cpedu_parser(parser: argparse.ArgumentParser) -> None:
    parser.add_argument(
        "-q",
        "--squeeze",
        action="store",
        type=int,
        help="squeeze all tables down to HEIGHT rows",
        metavar="HEIGHT",
        default=16,
    )
    parser.add_argument(
        "-w", "--wave", action="store_true", help="make backgrounds colors alternate"
    )
    parser.add_argument(
        "-e",
        "--export",
        action="store",
        help="export the result to an .svg file",
        metavar="LOCATION",
    )
    skari_subgroup = parser.add_argument_group("skari")
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
        "--selmahoskari", action="store_true", help="print out all selmahoskari"
    )
    skari_subgroup.add_argument(
        "--mihiskari", action="store_true", help="print out all mi'iskari"
    )
    skari_subgroup.add_argument(
        "--valskari", action="store_true", help="print out all valskari"
    )
    valsi_subgroup = parser.add_argument_group("valsi")
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
        help="print the gismu/cmavo and gloss/selma'o of each CMARAFSI",
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
    valsi_subgroup.add_argument(
        "--gismu-tree", action="store", help="print the tree of GISMU", metavar="GISMU", nargs="+"
    )
    # kancu subgroup
    kancu_subgroup = parser.add_argument_group("kancu")
    kancu_subgroup.add_argument(
        "--count-cmavo",
        dest="count_cmavo",
        action="store_true",
        help="count the cmavos in your inventory",
    )
    kancu_subgroup.add_argument(
        "--count-gismu",
        dest="count_gismu",
        action="store_true",
        help="count the gismus in your inventory",
    )
    kancu_subgroup.add_argument(
        "--count-rafsi",
        dest="count_rafsi",
        action="store_true",
        help="count the rafsi in your inventory",
    )

    parser.set_defaults(func=cpedu.parse)
    


def inflate_tcidu_parser(parser: argparse.ArgumentParser) -> None:
    # Input subgroup
    read_input_subgroup = parser.add_argument_group("selru'e")
    read_input_subgroup.add_argument(
        "filepath",
        action="extend",
        help="read a text file and color it",
        metavar="FILEPATH",
        nargs="*",
    )
    read_input_subgroup.add_argument(
        "-i",
        "--input",
        action="store_true",
        help="read from standard input and color it",
    )
    read_input_subgroup.add_argument(
        "--catch-gismus",
        dest="catch_gismus",
        action="store_true",
        help="prompt the user for the glosses of the gismus that show up",
    )
    read_input_subgroup.add_argument(
        "--catch-rafsi",
        dest="catch_rafsi",
        action="store_true",
        help="prompt the user to complete the rafsi table",
    )
    # Panels subgroup
    read_panels_subgroup = parser.add_argument_group("panels")
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
        help="record all gismu that appear in brivla and print their tree",
    )
    read_panels_subgroup.add_argument(
        "-r",
        "--rafsi",
        action="store_true",
        help="record all cmarafsi that appear in lujvo and print their gismu and gloss",
    )
    read_panels_subgroup.add_argument(
        "-n",
        "--no-prigau",
        dest="prigau",
        action="store_false",
        help="do not print read text",
    )
    parser.set_defaults(func=tcidu.parse)
    


def inflate_litru_parser(parser: argparse.ArgumentParser) -> None:
    parser.add_argument(
        "-d",
        "--directory",
        dest="directory",
        action="store",
        help="analyze every lojbanic file in DIRECTORY, recursively, and then print a summary",
        metavar="DIRECTORY",
    )
    parser.add_argument(
        "-c",
        "--crane",
        dest="crane",
        action="store_true",
        help="advance the current gismu",
    )
    parser.set_defaults(func=litru.parse)

    
def build_parser():
    parser = argparse.ArgumentParser(
        formatter_class=RichHelpFormatter,
        description="skavla: colored words\n A program that reads and colors Lojban",
    )
    parser.set_defaults(func=lambda args: parser.print_help())

    subparsers = parser.add_subparsers(title="minde")

    cuxna_parser = subparsers.add_parser("cuxna", formatter_class=RichHelpFormatter)
    inflate_cuxna_parser(cuxna_parser)

    cpedu_parser = subparsers.add_parser("cpedu", formatter_class=RichHelpFormatter)
    inflate_cpedu_parser(cpedu_parser)
    
    tcidu_parser = subparsers.add_parser("tcidu", formatter_class=RichHelpFormatter)
    inflate_tcidu_parser(tcidu_parser)
    
    litru_parser = subparsers.add_parser("litru", formatter_class=RichHelpFormatter)
    inflate_litru_parser(litru_parser)

    return parser
    


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()
