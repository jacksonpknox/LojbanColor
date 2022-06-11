import sys

# figure out venv...
# the antlr4 runtime (i.e. the python package)
# is installed with pip
from antlr4 import *

from python.ColorLexer import ColorLexer
from python.ColorParser import ColorParser

# must write the colorizer subclass of ColorListener
from Colorizer import Colorizer

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    tree = parser.folio()
    printer = Colorizer()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    main(sys.argv)