import sys

from antlr4 import *

import json
import yaml

import argparse

from rich import print
from rich.text import Text
from rich.panel import Panel

from rich_argparse import RichHelpFormatter

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener


def put(t: Text, txt: str, color: str=None):
    t.append(txt, style=color)


class LujvoColorizer(LujvoListener):
    def __init__(self, t: Text):
        self.t = t

    def enterY(self, ctx):
        put(self.t, ctx.getText(), "yellow")

    def enterQ(self, ctx):
        put(self.t, ctx.getText(), "yellow")

    def enterCafourraf(self, ctx):
        put(self.t, ctx.getText(), "#FF8000")

    def enterCkfourraf(self, ctx):
        put(self.t, ctx.getText(), "#FF8080")

    def enterBalraf(self, ctx):
        put(self.t, ctx.getText(), f"#FFC0C0")

    def enterBauraf(self, ctx):
        put(self.t, ctx.getText(), f"#FFFFC0")

    def enterBroraf(self, ctx):
        put(self.t, ctx.getText(), f"#FFC080")

    def enterCagismu(self, ctx):
        put(self.t, ctx.getText(), "#FF0000")

    def enterCkagismu(self, ctx):
        put(self.t, ctx.getText(), "#FF0000")

    
def get_selmaho(cmavo: str, selmaho_to_cmavos: dict):
    for selmaho, cmavos in selmaho_to_cmavos.items():
        if cmavo in cmavos:
            return selmaho
    return "UNCAT"


def get_cmavo_color(cmavo: str, selmaho_to_color: dict, selmaho_to_cmavos: dict) -> str:
    return selmaho_to_color[get_selmaho(cmavo, selmaho_to_cmavos)]


def put_cmavo(t: Text, cmavo: str, selmaho_to_color: dict, selmaho_to_cmavos: dict) -> None:
    put(t, cmavo, get_cmavo_color(cmavo, selmaho_to_color, selmaho_to_cmavos))


def process_compmo(t: Text, compmo: str, selmaho_to_color: dict, selmaho_to_cmavos: dict) -> None:
    # split the compmo into cmavos
    i = 0
    j = 2
    e = len(compmo)
    compy = [c for c in compmo]
    cons = {"b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "z"}
    cmavos = []
    while j < e:
        if compy[j] in cons:
            cmavos.append("".join(compy[i:j]))
            i = j
        j += 1
    cmavos.append("".join(compy[i:j]))
    for cmavo in cmavos:
        put_cmavo(t, cmavo, selmaho_to_color, selmaho_to_cmavos)
        


def process_lujvo(t: Text, lujvo: str) -> None:
    input_stream = InputStream(lujvo)
    lexer = LujvoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LujvoParser(stream)
    tree = parser.lujvo()

    printer = LujvoColorizer(t)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


class Colorizer(ColorListener):
    def __init__(self, t: Text):
        self.t = t
        with open("selmaho_colors.json", "r") as f:
            self.selmaho_to_color = json.load(f)
        with open("selmaho_wordsets.yaml", "r") as f:
            self.selmaho_to_cmavos = yaml.safe_load(f)

    def exitSentence(self, ctx):
        put(self.t, "\n", None)

    def exitWord(self, ctx):
        put(self.t, " ", None)

    def enterCmavo(self, ctx):
        put_cmavo(self.t, ctx.getText(), self.selmaho_to_color, self.selmaho_to_cmavos)
    
    def enterFuhivla(self, ctx):
        put(self.t, ctx.getText(), "#008700")

    def enterLujvo(self, ctx):
        process_lujvo(self.t, ctx.getText())

    def enterGismu(self, ctx):
        put(self.t, ctx.getText(), "#FF0000")

    def enterCmene(self, ctx):
        put(self.t, ctx.getText(), "#FFFF00")

    def enterCompmo(self, ctx):
        process_compmo(self.t, ctx.getText(), self.selmaho_to_color, self.selmaho_to_cmavos)

        
def add_selmaho(selmaho: str, color: str = "#0000FF"):
    # make sure this selmaho has a color
    with open("selmaho_colors.json", "r") as f:
        colors = json.load(f)
    if selmaho not in colors:
        colors[selmaho] = color
    with open("selmaho_colors.json", "w") as f:
        json.dump(colors, f, indent=4)

    # make sure this selmaho has a word-set
    with open("selmaho_wordsets.yaml", "r") as f:
        wordsets = yaml.safe_load(f)
    if selmaho not in wordsets:
        wordsets[selmaho] = set()
    with open("selmaho_wordsets.yaml", "w") as f:
        yaml.dump(wordsets, f)
        

def add_cmavo(cmavo: str, selmaho: str) -> None:
    # open the wordsets
    with open("selmaho_wordsets.yaml", "r") as f:
        wordsets = yaml.safe_load(f)
    if selmaho not in wordsets:
        # observe the laziness.. we only have to add the color
        add_selmaho(selmaho)
        # we use the following line instead of universally .add(cmavo)
        #  because add_selmaho does not affect our local copy of wordsets
        wordsets[selmaho] = {cmavo}
    else:
        wordsets[selmaho].add(cmavo)
    with open("selmaho_wordsets.yaml", "w") as f:
        yaml.dump(wordsets, f)
    

def set_color(selmaho: str, color: str) -> None:
    with open("selmaho_colors.json", "r") as f:
        colors = json.load(f)
    colors[selmaho] = "#" + color
    with open("selmaho_colors.json", "w") as f:
        json.dump(colors, f, indent=4)
        

def color_prt(content: str) -> Text:
    # very sus to return the global variable t
    input_stream = InputStream(content)
    lexer = ColorLexer(input_stream)  # lexer generated from grammar
    stream = CommonTokenStream(lexer)  # token stream from library
    parser = ColorParser(stream)  # parser generated from grammar
    tree = parser.folio()

    t = Text()
    printer = Colorizer(t)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    printer.t.rstrip()

    return t


def main():
    # very buggy parser
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter)
    parser.add_argument('filepath', action='store', default=None, nargs='?')
    parser.add_argument('-a', '--add', action='store', nargs=2)
    parser.add_argument('-c', '--color', action='store', nargs=2)
    parser.add_argument('-i', '--input', action='store_true')
    args = parser.parse_args()
    if a := args.add:
        # just make a command mandatory
        if args.filepath:
            print("warning! ignoring filepath argument")
        print("adding... cmavo {} to selmaho {}".format(a[0],a[1]))
        add_cmavo(a[0], a[1])
    if c := args.color:
        print("setting color of selmaho {} to {}".format(c[0], c[1]))
        set_color(c[0], c[1])
    if args.input:
        print("Type the input:")
        print(Panel(color_prt(sys.stdin.read())))
    elif p := args.filepath:
        with open(p, "r") as f:
            print(Panel(color_prt(f.read())))
    else:
        print("error... no args")


if __name__ == "__main__":
    main()
