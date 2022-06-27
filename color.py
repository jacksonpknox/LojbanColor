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

with open("selmaho_colors.json", "r") as f:
    selmaho_to_color = json.load(f)
    
with open("selmaho_wordsets.yaml", "r") as f:
    selmaho_to_dic = yaml.safe_load(f)

#from indices import selmaho_to_color
#from selm import selmaho_to_dic

t = Text()


def put(txt, color):
    t.append(txt, style=color)


class LujvoColorizer(LujvoListener):
    def enterY(self, ctx):
        put(ctx.getText(), "yellow")

    def enterQ(self, ctx):
        put(ctx.getText(), "yellow")

    def enterCafourraf(self, ctx):
        put(ctx.getText(), "#FF8000")

    def enterCkfourraf(self, ctx):
        put(ctx.getText(), "#FF8080")

    def enterBalraf(self, ctx):
        put(ctx.getText(), f"#FFC0C0")

    def enterBauraf(self, ctx):
        put(ctx.getText(), f"#FFFFC0")

    def enterBroraf(self, ctx):
        put(ctx.getText(), f"#FFC080")

    def enterCagismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    def enterCkagismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    
def get_selmaho(cmavo: str):
    for selmaho, dic in selmaho_to_dic.items():
        if cmavo in dic:
            return selmaho
    return "UNCAT"

def process_cmavo(cmavo: str):
    color = selmaho_to_color[get_selmaho(cmavo)]
    put(cmavo, color)


def process_compmo(compmo: str):
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
        process_cmavo(cmavo)
        


def process_lujvo(lujvo: str):
    input_stream = InputStream(lujvo)
    lexer = LujvoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LujvoParser(stream)
    tree = parser.lujvo()

    printer = LujvoColorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


class Colorizer(ColorListener):
    def exitSentence(self, ctx):
        put("\n", None)

    def exitWord(self, ctx):
        put(" ", None)

    def enterCmavo(self, ctx):
        process_cmavo(ctx.getText())
    
    def enterFuhivla(self, ctx):
        put(ctx.getText(), "#008700")

    def enterLujvo(self, ctx):
        process_lujvo(ctx.getText())

    def enterGismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    def enterCmene(self, ctx):
        put(ctx.getText(), "#FFFF00")

    def enterCompmo(self, ctx):
        process_compmo(ctx.getText())

        
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
        

def color_prt(filepath: str, raw: bool=False):
    #TODO: better to preemptively read file as a string
    # and process string bydefeault probably
    input_stream = InputStream(filepath) if raw else FileStream(filepath, encoding="utf8")
    lexer = ColorLexer(input_stream)  # lexer generated from grammar
    stream = CommonTokenStream(lexer)  # token stream from library
    parser = ColorParser(stream)  # parser generated from grammar
    tree = parser.folio()

    printer = Colorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    t.rstrip()
    p = Panel(t)
    print(p)

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
        color_prt(sys.stdin.read(), raw=True)
    elif f := args.filepath:
        color_prt(f)
    else:
        print("error... no args")


if __name__ == "__main__":
    main()
