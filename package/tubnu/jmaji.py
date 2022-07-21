from antlr4 import ParserRuleContext, InputStream, CommonTokenStream, ParseTreeWalker
from python_color.SkabanLexer import SkabanLexer
from python_color.SkabanParser import SkabanParser
from python_color.SkabanListener import SkabanListener


class Collector(SkabanListener):
    def __init__(self):
        self.collection = []

    def grab(self, s: str):
        if s not in self.collection:
            self.collection.append(s)


class CmarafsiCollector(Collector):
    def enterGanlycmarafsi(self, ctx):
        self.grab(ctx.getText())

    def enterGahorkarcmarafsi(self, ctx):
        self.grab(ctx.getText())

    def enterKarkarcmarafsi(self, ctx):
        self.grab(ctx.getText())


class GismuCollector(Collector):
    def enterGismu(self, ctx):
        self.grab(ctx.getText())


class CmavoCollector(Collector):
    def enterKarmaho(self, ctx: SkabanParser.KarmahoContext):
        self.grab(ctx.getText())


def get_parse_tree(lojban: str) -> ParserRuleContext:
    input_stream = InputStream(lojban)
    lexer = SkabanLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SkabanParser(stream)
    return parser.folio()


def collect(tree, Collector) -> list:
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection
