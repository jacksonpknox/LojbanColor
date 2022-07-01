import sys

from antlr4 import *

import json

import argparse

from rich import print
from rich.text import Text
from rich.panel import Panel
from rich.table import Table

from rich_argparse import RichHelpFormatter

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

import subparsers.cuxna as cuxna
import subparsers.prigau as prigau
import subparsers.cpedu as cpedu

CONFIG_DEFAULTS = {
    "selmahos": "config/selmahos.json",
    "config": "config/config.json",
    "gismus": "config/gismus.json"
}


def put(t: Text, txt: str, color: str=None):
    t.append(txt, style=color)


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


def get_cmavo_color(cmavo: str, selmahos: dict) -> str:
    return selmahos[get_selmaho(cmavo, selmahos)]["color"]


def put_cmavo(t: Text, cmavo: str, selmahos: dict) -> None:
    put(t, cmavo, get_cmavo_color(cmavo, selmahos))


class GismuCounter(ColorListener):
    def __init__(self, gismus: dict):
        self.count = {"gismus": {"caught": [], "uncaught": []}, "cmarafsi": {"caught": [], "uncaught": []}}
        self.gismus = gismus

    def enterGismu(self, ctx):
        gismu = ctx.getText()
        if gismu in self.gismus.keys() and "gloss" in self.gismus[gismu].keys():
            self.count["gismus"]["caught"].append((gismu, self.gismus[gismu]["gloss"]))
        else:
            self.count["gismus"]["uncaught"].append(gismu)
        

class Colorizer(ColorListener):
    def __init__(self, t: Text, selmahos: dict, config: dict):
        self.t = t
        self.selmahos = selmahos
        self.config = config

    def exitLine(self, ctx):
        put(self.t, "\n", None)

    def exitWord(self, ctx):
        put(self.t, " ", None)

    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        put_cmavo(self.t, ctx.getText(), self.selmahos)

    def enterLerfu(self, ctx):
        put(self.t, ctx.getText(), self.config["lerfu"]["color"])
    
    def enterFuhivla(self, ctx):
        put(self.t, ctx.getText(), self.config["fu'ivla"]["color"])

    def enterCmene(self, ctx):
        put(self.t, ctx.getText(), self.config["cmene"]["color"])

    def enterY(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["y"])

    def enterBaugismu(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["baugismu"])

    def enterBrogismu(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["brogismu"])

    def enterBalraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["balraf"])

    def enterBroraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["broraf"])

    def enterBauraf(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["bauraf"])

    def enterGahorgimpag(self, ctx: ColorParser.GahorgimpagContext):
        put(self.t, ctx.getText(), self.config["rafsi"]["ga'orgimpag"])

    def enterKargimpag(self, ctx: ColorParser.KargimpagContext):
        put(self.t, ctx.getText(), self.config["rafsi"]["kargimpag"])

    def enterY(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["y"])
    
    def enterQ(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["q"])


#TODO: learn some relevant kungfu
# by which i mean argument packing and unpacking and probably decorators
def apply_function_to_json() -> None:
    pass


def lanli(content: str) -> Table:
    # can share parse tree with colorizer
    input_stream = InputStream(content)
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    tree = parser.folio()

    with open(CONFIG_DEFAULTS["gismus"], "r") as f:
        gismus = json.load(f)

    counter = GismuCounter(gismus)
    walker = ParseTreeWalker()
    walker.walk(counter, tree)

    table = Table(title="Gismus")

    table.add_column("gismu", style="red")
    table.add_column("gloss", style="cyan")
    table.add_column("cmarafsi", style="yellow")

    for gismu, gloss in counter.count["gismus"]["caught"]:
        table.add_row(gismu, gloss)
    for gismu in counter.count["gismus"]["uncaught"]:
        table.add_row(gismu, "-")

    return table


#TODO: test this (after refactoring)
def color_prt(content: str) -> Text:
    input_stream = InputStream(content)
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    tree = parser.folio()

    #TODO: factor the location of selmaho file out, ideally into the config
    with open(CONFIG_DEFAULTS["selmahos"], "r") as f:
        selmahos = json.load(f)
    #TODO: factor location of config out into default, and construct argument for customization
    with open(CONFIG_DEFAULTS["config"], "r") as f:
        config = json.load(f)

    t = Text()
    printer = Colorizer(t, selmahos, config)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    printer.t.rstrip()

    return t

    
def build_parser():
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter, description="This is the skavla program :)", epilog="God bless you !")
    subparsers = parser.add_subparsers(title='commands')

    parser_config = subparsers.add_parser('cuxna', formatter_class=RichHelpFormatter)
    parser_config.add_argument('-a', '--add', action='store', nargs=2, help="add CMAVO to SELMAHO", metavar=("CMAVO", "SELMAHO"))
    parser_config.add_argument('-c', '--color', action='store', nargs=2, help="set the color of SELMAHO to COLOR", metavar=("SELMAHO", "COLOR"))
    parser_config.add_argument('-g', '--gismu', action='store', nargs=2, help="assign gloss PHRASE to GISMU", metavar=("GISMU", "PHRASE"))
    parser_config.add_argument('-s', '--sort', action='store', nargs=1, help="recursively sort a json", choices=['selmahos', 'gismus'])
    parser_config.set_defaults(func=cuxna.parse)

    parser_read = subparsers.add_parser('prigau', formatter_class=RichHelpFormatter)
    parser_read.add_argument('filepath', action='extend', help="read a text file and color it", metavar="FILEPATH", nargs='*')
    parser_read.add_argument('-i', '--input', action='store_true', help="read from standard input and color it")
    parser_read.add_argument('-l', '--lanli', action='store_true', help="record all gismu that appear in lujvo and print them")
    parser_read.set_defaults(func=prigau.parse)

    parser_request = subparsers.add_parser('cpedu', formatter_class=RichHelpFormatter)
    parser_request.add_argument('-g', '--gismu', action='store', nargs=1, help="print out the gloss of GISMU", metavar="GISMU")
    parser_request.add_argument('-c', '--cmavo', action='store', nargs=1, help='print out the selmaho of CMAVO', metavar="CMAVO")
    parser_request.set_defaults(func=cpedu.parse)
    
    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    args.func(args)


if __name__ == "__main__":
    main()