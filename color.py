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

from python_compoundmo.CompoundmoLexer import CompoundmoLexer
from python_compoundmo.CompoundmoParser import CompoundmoParser
from python_compoundmo.CompoundmoListener import CompoundmoListener

t = Text()


def put(txt, color):
    t.append(txt, style=color)


class CompoundmoColorizer(CompoundmoListener):
    def __init__(self) -> None:
        self.background = "#440000"

    def enterBai(self, ctx):
        put(ctx.getText(), "#0000FF on {0}".format(self.background))

    def enterBy(self, ctx):
        put(ctx.getText(), "#8080FF on {0}".format(self.background))

    def enterUi(self, ctx):
        put(ctx.getText(), "#8080FF on {0}".format(self.background))

    def enterCmavoab(self, ctx):
        put(ctx.getText(), "#8080FF on {0}".format(self.background))

    def enterCmavocd(self, ctx):
        put(ctx.getText(), "#80C0FF on {0}".format(self.background))

    def enterCmavof(self, ctx):
        put(ctx.getText(), "#C0C0FF on {0}".format(self.background))

    def enterCmavogi(self, ctx):
        put(ctx.getText(), "#C0FFFF on {0}".format(self.background))

    def enterCmavojk(self, ctx):
        put(ctx.getText(), "#8080FF on {0}".format(self.background))

    def enterCmavol(self, ctx):
        put(ctx.getText(), "#80C0FF on {0}".format(self.background))

    def enterCmavomn(self, ctx):
        put(ctx.getText(), "#C0C0FF on {0}".format(self.background))

    def enterCmavop(self, ctx):
        put(ctx.getText(), "#C0FFFF on {0}".format(self.background))

    def enterCmavors(self, ctx):
        put(ctx.getText(), "#8080FF on {0}".format(self.background))

    def enterCmavot(self, ctx):
        put(ctx.getText(), "#80C0FF on {0}".format(self.background))

    def enterCmavovy(self, ctx):
        put(ctx.getText(), "#C0C0FF on {0}".format(self.background))

    def enterCmavoz(self, ctx):
        put(ctx.getText(), "#C0FFFF on {0}".format(self.background))

    def enterUncat(self, ctx):
        put(ctx.getText(), "#FFFF22 on {0}".format("#0000FF"))


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


def process_compmo(compmo: str):
    input_stream = InputStream(compmo)
    lexer = CompoundmoLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CompoundmoParser(stream)
    tree = parser.compoundmo()
    
    printer = CompoundmoColorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)


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

    def enterUncat(self, ctx):
        put(ctx.getText(), "#FFFF22 on #0000FF")

    def enterLujvo(self, ctx):
        process_lujvo(ctx.getText())

    def enterGismu(self, ctx):
        put(ctx.getText(), "#FF0000")

    def enterCmene(self, ctx):
        put(ctx.getText(), "#FFFF00")

    def enterCompmo(self, ctx):
        process_compmo(ctx.getText())


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
