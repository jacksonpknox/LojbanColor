import sys

from antlr4 import *

from rich import print
from rich.text import Text
from rich.panel import Panel

from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener

from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
from python_lujvo.LujvoListener import LujvoListener

t = Text()


def put(txt, color):
    t.append(txt, style=color)


class LujvoColorizer(LujvoListener):
    def __init__(self):
        self.background = "#000000"

    def enterY(self, ctx):
        put(ctx.getText(), "yellow")

    def enterQ(self, ctx):
        put(ctx.getText(), "yellow")

    def enterCafourraf(self, ctx):
        put(ctx.getText(), "#FF8000")

    def enterCkfourraf(self, ctx):
        put(ctx.getText(), "#FF8080")

    def enterBalraf(self, ctx):
        put(ctx.getText(), f"#FFC0C0 on {self.background}")

    def enterBauraf(self, ctx):
        put(ctx.getText(), f"#FFFFC0 on {self.background}")

    def enterBroraf(self, ctx):
        put(ctx.getText(), f"#FFC080 on {self.background}")

    def enterCagismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    def enterCkagismu(self, ctx):
        put(ctx.getText(), "#FF0000")


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
    
    def enterFuhivla(self, ctx):
        put(ctx.getText(), "#008700")

    def enterBai(self, ctx):
        put(ctx.getText(), "#0000FF")

    def enterBy(self, ctx):
        put(ctx.getText(), "#8080FF")

    def enterUi(self, ctx):
        put(ctx.getText(), "#8080FF")

    def enterCmavoab(self, ctx):
        put(ctx.getText(), "#8080FF")

    def enterCmavocd(self, ctx):
        put(ctx.getText(), "#80C0FF")

    def enterCmavof(self, ctx):
        put(ctx.getText(), "#C0C0FF")

    def enterCmavogi(self, ctx):
        put(ctx.getText(), "#C0FFFF")

    def enterCmavojk(self, ctx):
        put(ctx.getText(), "#8080FF")

    def enterCmavol(self, ctx):
        put(ctx.getText(), "#80C0FF")

    def enterCmavomn(self, ctx):
        put(ctx.getText(), "#C0C0FF")

    def enterCmavop(self, ctx):
        put(ctx.getText(), "#C0FFFF")

    def enterCmavors(self, ctx):
        put(ctx.getText(), "#8080FF")

    def enterCmavot(self, ctx):
        put(ctx.getText(), "#80C0FF")

    def enterCmavovy(self, ctx):
        put(ctx.getText(), "#C0C0FF")

    def enterCmavoz(self, ctx):
        put(ctx.getText(), "#C0FFFF")

    def enterLujvo(self, ctx):
        process_lujvo(ctx.getText())

    def enterGismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    def enterCmene(self, ctx):
        put(ctx.getText(), "#FFFF00")

    def enterUncat(self, ctx):
        put(ctx.getText(), "#FFFF22")


def main(argv):
    input_stream = FileStream(argv[1])
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
