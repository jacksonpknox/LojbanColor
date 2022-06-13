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
    print(f'[{color}]{ctx.getText()}[/{color}]', end='')

class LujvoColorizer(LujvoListener):
    def enterY(self, ctx):
        put(ctx, "yellow")
        
    def enterQ(self, ctx):
        put(ctx, "yellow")

    def enterStump(self, ctx):
        put(ctx, "red")
        
    def enterBalraf(self, ctx):
        put(ctx, "blue")
        
    def enterBauraf(self, ctx):
        put(ctx, "green")
        
    def enterBroraf(self, ctx):
        put(ctx, "bright_cyan")

    def enterGismu(self, ctx):
        put(ctx, "bright_red")

def process_lujvo(lujvo : str):
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
        print(" ", end='')
        
    def enterPa(self, ctx):
        put(ctx, "magenta")

    def enterCmavoab(self, ctx):
        put(ctx, "bright_yellow")
        
    def enterLujvo(self, ctx):
        process_lujvo(ctx.getText())

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ColorLexer(input_stream) # lexer generated from grammar
    stream = CommonTokenStream(lexer) # token stream from library
    parser = ColorParser(stream) # parser generated from grammar
    tree = parser.folio()
    
    printer = Colorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main(sys.argv)
