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

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener


def put(t: Text, txt: str, color: str=None):
    t.append(txt, style=color)


#TODO: factor out (too long)
class LujvoColorizer(LujvoListener):
    def __init__(self, t: Text, palatte: dict):
        self.t = t
        self.palatte = palatte

    def enterY(self, ctx):
        put(self.t, ctx.getText(), self.palatte['y'])

    def enterQ(self, ctx):
        put(self.t, ctx.getText(), self.palatte['q'])

    def enterCafourraf(self, ctx):
        put(self.t, ctx.getText(), self.palatte['cafourraf'])

    def enterCkfourraf(self, ctx):
        put(self.t, ctx.getText(), self.palatte['ckfourraf'])

    def enterBalraf(self, ctx):
        put(self.t, ctx.getText(), self.palatte['balraf'])

    def enterBauraf(self, ctx):
        put(self.t, ctx.getText(), self.palatte['bauraf'])

    def enterBroraf(self, ctx):
        put(self.t, ctx.getText(), self.palatte['broraf'])

    def enterCagismu(self, ctx):
        put(self.t, ctx.getText(), self.palatte['cagismu'])

    def enterCkagismu(self, ctx):
        put(self.t, ctx.getText(), self.palatte['ckagismu'])


def get_selmaho(cmavo: str, selmahos: dict) -> str:
    for selmaho in selmahos.keys():
        if cmavo in selmahos[selmaho]["cmavos"]:
            return selmaho
    return "UNCAT"


#TODO: test this
def get_cmavo_color(cmavo: str, selmahos: dict) -> str:
    return selmahos[get_selmaho(cmavo, selmahos)]["color"]


#TODO: test this
def put_cmavo(t: Text, cmavo: str, selmahos: dict) -> None:
    put(t, cmavo, get_cmavo_color(cmavo, selmahos))


#TODO: test this
def process_compmo(t: Text, compmo: str, selmahos: dict) -> None:
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
        put_cmavo(t, cmavo, selmahos)
        

#TODO: test this
def process_lujvo(t: Text, lujvo: str, config: dict) -> None:
    input_stream = InputStream(lujvo)
    lexer = LujvoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = LujvoParser(stream)
    tree = parser.lujvo()

    printer = LujvoColorizer(t, config['rafsi'])
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


class Colorizer(ColorListener):
    def __init__(self, t: Text):
        self.t = t
        #TODO: factor the location of selmaho file out, ideally into the config
        with open("selmahos.json", "r") as f:
            self.selmahos = json.load(f)
        #TODO: factor location of config out into default, and construct argument for customization
        with open("config.json", "r") as f:
            self.config = json.load(f)

    def exitSentence(self, ctx):
        put(self.t, "\n", None)

    def exitWord(self, ctx):
        put(self.t, " ", None)

    def enterCmavo(self, ctx):
        put_cmavo(self.t, ctx.getText(), self.selmahos)
    
    def enterFuhivla(self, ctx):
        put(self.t, ctx.getText(), self.config["fu'ivla"]["color"])

    def enterLujvo(self, ctx):
        process_lujvo(self.t, ctx.getText(), self.config)

    def enterGismu(self, ctx):
        put(self.t, ctx.getText(), self.config["rafsi"]["gismu"])

    def enterCmene(self, ctx):
        put(self.t, ctx.getText(), self.config["cmene"]["color"])

    def enterCompmo(self, ctx):
        process_compmo(self.t, ctx.getText(), self.selmahos)

        
#TODO: refactor then test this
def add_cmavo(cmavo: str, selmaho: str) -> None:
    with open("selmahos.json", "r") as f:
        selmahos = json.load(f)
    if selmaho not in selmahos.keys():
        selmahos[selmaho] = {"color": "#0000FF", "cmavos": []}
    selmahos[selmaho]["cmavos"].append(cmavo)
    with open("selmahos.json", "w") as f:
        json.dump(selmahos, f, indent=2)


#TODO: refactor then test this
def set_color(selmaho: str, color: str) -> None:
    with open("selmahos.json", "r") as f:
        selmahos = json.load(f)
    selmahos[selmaho]["color"] = "#" + color
    with open("selmahos.json", "w") as f:
        json.dump(selmahos, f, indent=2)
         
        

#TODO: test this, also refactor selmahos into this
def color_prt(content: str) -> Text:
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

def process_args(args):
    if a := args.add:
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
    if p := args.filepath:
        with open(p, "r") as f:
            print(Panel(color_prt(f.read())))

    
#TODO: put command arguments in dijsoint group
#TODO: create read file command
def build_parser():
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter)
    parser.add_argument('filepath', action='store', default=None, nargs='?')
    parser.add_argument('-a', '--add', action='store', nargs=2)
    parser.add_argument('-c', '--color', action='store', nargs=2)
    parser.add_argument('-i', '--input', action='store_true')
    return parser


def main():
    parser = build_parser()
    args = parser.parse_args()
    process_args(args)


if __name__ == "__main__":
    main()
