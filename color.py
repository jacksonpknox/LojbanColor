import sys

from antlr4 import *

import json

import argparse

from rich import print
from rich.text import Text
from rich.panel import Panel

from rich_argparse import RichHelpFormatter

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener


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
    
        

        
#TODO: refactor then test this
def add_cmavo(cmavo: str, selmaho: str) -> None:
    with open("selmahos.json", "r") as f:
        selmahos = json.load(f)
    if selmaho not in selmahos.keys():
        selmahos[selmaho] = {"color": "#0000FF", "cmavos": []}
    if cmavo in selmahos[selmaho]["cmavos"]:
        print("ok.. cmavo {} is already in selmaho {}, so i did nothing".format(cmavo, selmaho))
    else:
        selmahos[selmaho]["cmavos"].append(cmavo)
        print("ok... successfully added cmavo {} to selmaho {}".format(cmavo, selmaho))
    with open("selmahos.json", "w") as f:
        json.dump(selmahos, f, indent=2)


#TODO: refactor then test this
def set_color(selmaho: str, color: str) -> None:
    with open("selmahos.json", "r") as f:
        selmahos = json.load(f)
    selmahos[selmaho]["color"] = color
    with open("selmahos.json", "w") as f:
        json.dump(selmahos, f, indent=2)
        

#TODO: test this (after refactoring)
def color_prt(content: str) -> Text:
    input_stream = InputStream(content)
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    tree = parser.folio()

    #TODO: factor the location of selmaho file out, ideally into the config
    with open("selmahos.json", "r") as f:
        selmahos = json.load(f)
    #TODO: factor location of config out into default, and construct argument for customization
    with open("config.json", "r") as f:
        config = json.load(f)

    t = Text()
    printer = Colorizer(t, selmahos, config)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    printer.t.rstrip()

    return t


def process_args(args):
    if r := args.read:
        with open(r, "r") as f:
            print(Panel(color_prt(f.read())))

    if a := args.add:
        print("adding cmavo {} to selmaho {}".format(a[0], a[1]))
        add_cmavo(a[0], a[1])

    if c := args.color:
        print("setting color of selmaho {} to {}".format(c[0], c[1]))
        set_color(c[0], c[1])

    if i := args.input:
        print("Type the input:")
        print(Panel(color_prt(sys.stdin.read())))

    
def build_parser():
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter, description="This is the skavla program :)", epilog="God bless you !")
    group = parser.add_mutually_exclusive_group(required=True)
    group.add_argument('-r', '--read', action='store', help="read a text file and color it", metavar="FILEPATH")
    group.add_argument('-a', '--add', action='store', nargs=2, help="add CMAVO to SELMAHO", metavar=("CMAVO", "SELMAHO"))
    group.add_argument('-c', '--color', action='store', nargs=2, help="set the color of SELMAHO to COLOR", metavar=("SELMAHO", "COLOR"))
    group.add_argument('-i', '--input', action='store_true', help="read from standard input and color it")
    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    process_args(args)


if __name__ == "__main__":
    main()
