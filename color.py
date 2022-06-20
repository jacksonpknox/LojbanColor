import sys

from antlr4 import *

import black 

from rich import print
from rich.text import Text
from rich.panel import Panel

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener

from indices import selmaho_to_color
from selm import selmaho_to_dic

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
    cons = {".", "b", "c", "d", "f", "g", "j", "k", "l", "m", "n", "p", "r", "s", "t", "v", "z"}
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

        
def add_cmavo(cmavo: str, selmaho: str) -> None:
    selmaho_to_dic[selmaho].add(cmavo)
    # write the changes
    with open("selm.py", "w") as f:
        f.write('selmaho_to_dic = ' + str(selmaho_to_dic))
    black.main(["selm.py"])


def main(argv):
    input_stream = FileStream(argv[1], encoding="utf8")
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


if __name__ == "__main__":
    main(sys.argv)
