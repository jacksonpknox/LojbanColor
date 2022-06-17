import sys

from antlr4 import *

# attempt to import rich
from rich import print
from rich.text import Text
from rich.panel import Panel

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener

#t = Text()

class space_ctx:
    def getText():
        return " "

class newline_ctx:
    def getText():
        return "\n"

def put_one(ctx, color):
    print(Text(ctx.getText(), style=color), end="")

put = put_one

def put_two(ctx, color):
    t.append(ctx.getText(), style=color)

"""
def put(ctx, color):
    print(Text(ctx.getText(), style=color), end="")
    t.append(ctx.getText(), style=color)
"""


class LujvoColorizer(LujvoListener):
    def __init__(self):
        self.background = "#222255"

    def enterY(self, ctx):
        put(ctx, "yellow")

    def enterQ(self, ctx):
        put(ctx, "yellow")

    def enterCafourraf(self, ctx):
        put(ctx, "#FF8000 on #222222")

    def enterCkfourraf(self, ctx):
        put(ctx, "#FF8080 on #222222")

    def enterBalraf(self, ctx):
        put(ctx, f"#FFC0C0 on {self.background}")

    def enterBauraf(self, ctx):
        put(ctx, f"#FFFFC0 on {self.background}")

    def enterBroraf(self, ctx):
        put(ctx, f"#FFC080 on {self.background}")

    def enterCagismu(self, ctx):
        put(ctx, "#FF0000 on #222222")

    def enterCkagismu(self, ctx):
        put(ctx, "#FF0000 on #222222")



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
        #print()
        put(newline_ctx, None)

    def exitWord(self, ctx):
        #print(" ", end="")
        put(space_ctx, None)
    
    def enterFuhivla(self, ctx):
        put(ctx, "#008700 on #222222")

    def enterBai(self, ctx):
        put(ctx, "#0000FF")

    def enterBy(self, ctx):
        put(ctx, "#8080FF")

    def enterUi(self, ctx):
        put(ctx, "#8080FF")

    def enterCmavoab(self, ctx):
        put(ctx, "#8080FF")

    def enterCmavocd(self, ctx):
        put(ctx, "#80C0FF")

    def enterCmavof(self, ctx):
        put(ctx, "#C0C0FF")

    def enterCmavogi(self, ctx):
        put(ctx, "#C0FFFF")

    def enterCmavojk(self, ctx):
        put(ctx, "#8080FF")

    def enterCmavol(self, ctx):
        put(ctx, "#80C0FF")

    def enterCmavomn(self, ctx):
        put(ctx, "#C0C0FF")

    def enterCmavop(self, ctx):
        put(ctx, "#C0FFFF")

    def enterCmavors(self, ctx):
        put(ctx, "#8080FF")

    def enterCmavot(self, ctx):
        put(ctx, "#80C0FF")

    def enterCmavovy(self, ctx):
        put(ctx, "#C0C0FF")

    def enterCmavoz(self, ctx):
        put(ctx, "#C0FFFF")

    def enterLujvo(self, ctx):
        process_lujvo(ctx.getText())

    def enterGismu(self, ctx):
        put(ctx, "#FF0000 on #222222")

    def enterCmene(self, ctx):
        put(ctx, "#FFFF00 on #222222")


def main(argv):
    # if using rich, make text object
    global t 
    t = Text()
    # if using rich, change put function
    global put
    put = put_two

    input_stream = FileStream(argv[1])
    lexer = ColorLexer(input_stream)  # lexer generated from grammar
    stream = CommonTokenStream(lexer)  # token stream from library
    parser = ColorParser(stream)  # parser generated from grammar
    tree = parser.folio()

    printer = Colorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

    # if using rich, print panel now
    t.rstrip()
    p = Panel(t)
    print(p)


if __name__ == "__main__":
    main(sys.argv)
