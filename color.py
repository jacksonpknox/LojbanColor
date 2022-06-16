import sys

from antlr4 import *

from rich import print

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener


def put(ctx, color):
    print(f"[{color}]{ctx.getText()}[/{color}]", end="")


class LujvoColorizer(LujvoListener):
    def __init__(self):
        self.background = "#222255"
        self.booler = False

    def flop(self):
        self.booler = not self.booler
        self.background = "#222222"
        #self.background = "#442222" if self.booler else "#222244"
        
    def enterY(self, ctx):
        put(ctx, "yellow")

    def enterQ(self, ctx):
        put(ctx, "yellow")

    def enterCafourraf(self, ctx):
        put(ctx, "#FF8000 on #222222")

    def enterCkfourraf(self, ctx):
        put(ctx, "#FF8080 on #222222")

    def enterBalraf(self, ctx):
        self.flop()
        put(ctx, f"#FFC0C0 on {self.background}")

    def enterBauraf(self, ctx):
        self.flop()
        put(ctx, f"#FFFFC0 on {self.background}")

    def enterBroraf(self, ctx):
        self.flop()
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
        print()

    def exitWord(self, ctx):
        print(" ", end="")
    
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
    input_stream = FileStream(argv[1])
    lexer = ColorLexer(input_stream)  # lexer generated from grammar
    stream = CommonTokenStream(lexer)  # token stream from library
    parser = ColorParser(stream)  # parser generated from grammar
    tree = parser.folio()

    printer = Colorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


if __name__ == "__main__":
    main(sys.argv)
