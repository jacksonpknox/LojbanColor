import plumbing
import karda
import subparsers.cuxna as cuxna

import sys

from rich import box
from rich.text import Text
from rich.panel import Panel
from rich.table import Table
from rich.prompt import Prompt
from rich.columns import Columns
from rich.console import Console, Group
from rich.style import Style

from antlr4 import ParseTreeWalker, ParserRuleContext, InputStream, CommonTokenStream
from python_color.ColorListener import ColorListener
from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser


class Collector(ColorListener):
    def __init__(self):
        self.collection = []

    def grab(self, s: str):
        if s not in self.collection:
            self.collection.append(s)


class CmarafsiCollector(Collector):
    def enterBalraf(self, ctx):
        self.grab(ctx.getText())

    def enterBroraf(self, ctx):
        self.grab(ctx.getText())

    def enterBauraf(self, ctx):
        self.grab(ctx.getText())


class GismuCollector(Collector):
    def enterGismu(self, ctx):
        self.grab(ctx.getText())


class CmavoCollector(Collector):
    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        self.grab(ctx.getText())


def collect(tree, Collector) -> list:
    collector = Collector()
    ParseTreeWalker().walk(collector, tree)
    return collector.collection


class Colorizer(ColorListener):
    def __init__(self, selmahos: dict, valskari: dict):
        self.t = Text()
        self.selmahos = selmahos
        self.valskari = valskari

    def exitLine(self, ctx):
        self.t.append("\n")

    def exitWord(self, ctx):
        self.t.append(" ")

    def enterCat_cmavo(self, ctx: ColorParser.Cat_cmavoContext):
        self.t.append(
            text=(cmavo := ctx.getText()),
            style=self.selmahos[plumbing.get_selmaho(cmavo, self.selmahos)]["color"],
        )

    def enterLerfu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["lerfu"])

    def enterFuhivla(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["fu'ivla"])

    def enterCmene(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmene"])

    def enterBaugismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["baugismu"])

    def enterBrogismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["brogismu"])

    def enterBalraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["balraf"])

    def enterBroraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["broraf"])

    def enterBauraf(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["bauraf"])

    def enterGahorgimpag(self, ctx: ColorParser.GahorgimpagContext):
        self.t.append(text=ctx.getText(), style=self.valskari["ga'orgimpag"])

    def enterKargimpag(self, ctx: ColorParser.KargimpagContext):
        self.t.append(text=ctx.getText(), style=self.valskari["kargimpag"])

    def enterY(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["y"])

    def enterQ(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["q"])

        
def interrogate_for_rafsi(tree, gismus, selmahos, skari) -> None:
    p = Style.parse(skari["mi'iskari"]["prompt"])
    collection = collect(tree, CmarafsiCollector)
    for cmarafsi in collection:
        cma = Text(cmarafsi, style=Style.parse(skari["valskari"]["cmarafsi"]))
        word_type, word, bonus = plumbing.classify_cmarafsi(cmarafsi, gismus, selmahos)
        if word_type == "UNCAUGHT":
            word_type = Prompt.ask(Text("type of ", p) + cma, choices=["gismu", "cmavo"], default="gismu")
        if word_type == "gismu":
            if word == "UNCAUGHT":
                word = Prompt.ask(Text("gismu for cmarafsi ", p) + cma)
                cuxna.add_cmarafsi(word, cmarafsi, skari)
                bonus = plumbing.get_gloss(word, gismus)
            if bonus in ["UNCAUGHT", "UNGLOSSED"]:
                bonus = Prompt.ask(Text("gloss for ", p) + word)
                cuxna.set_gloss(word, bonus, skari)
        elif word_type == "cmavo":
            if word == "UNCAUGHT":
                word = Prompt.ask(Text("cmavo for cmavyrafsi ", p) + cma)
                if (s := plumbing.get_selmaho(word, selmahos)) != "UNCAT":
                    bonus = s
                else:
                    bonus = Prompt.ask(Text("selma'o for cmavo ", p) + word)
                cuxna.add_cmavyrafsi(bonus, word, cmarafsi, selmahos, skari)

        
def interrogate_for_glosses(tree, gismus, skari) -> None:
    collection = collect(tree, GismuCollector)
    for gismu in collection:
        if gismu not in gismus.keys() or not gismus[gismu]["gloss"]:
            gloss = Prompt.ask(Text("type the gloss for ", Style.parse(skari["mi'iskari"]["prompt"])) + gismu, default=None)
            cuxna.set_gloss(gismu, gloss, skari)


def analyze_rafsi(tree, gismus, selmahos, skari) -> Table:
    collection = collect(tree, CmarafsiCollector)
    return karda.tabulate_cmarafsi(collection, gismus, selmahos, skari)


def analyze_gismu(tree, gismus, skari) -> Table:
    collection = collect(tree, GismuCollector)
    return karda.tabulate_gismus(collection, gismus, skari)


def analyze_cmavos(tree, selmahos, skari, selmaho_style: bool) -> Table:
    collection = collect(tree, CmavoCollector)
    return karda.tabulate_cmavos(collection, selmahos, skari, selmaho_style)

    
#NOTE returns Columns
def analyze_selmahos_differently(tree, selmahos, squeeze: int) -> Columns:
    cmavo_collection = collect(tree, CmavoCollector)
    selmaho_collection = []
    for cmavo in cmavo_collection:
        s = plumbing.get_selmaho(cmavo, selmahos)
        if s not in selmaho_collection:
            selmaho_collection.append(s)
    table = karda.tabulate_selmaho_styles(selmaho_collection, selmahos)
    return Columns(karda.squeeze_table(table, squeeze))
    

#NOTE returns Columns
def analyze_selmahos(tree, selmahos, skari, squeeze: int, show_styles: bool=False) -> Columns:
    cmavo_collection = collect(tree, CmavoCollector)
    selmaho_collection = dict()
    for cmavo in cmavo_collection:
        s = plumbing.get_selmaho(cmavo, selmahos)
        if s not in selmaho_collection.keys():
            selmaho_collection[s] = [cmavo]
        else:
            selmaho_collection[s].append(cmavo)
    selmaho_tables = []
    for s, cmavos in selmaho_collection.items():
        selmaho_tables.extend(karda.squeeze_table(karda.tabulate_cmavos(cmavos, selmahos, skari, show_styles), squeeze))
    return Columns(selmaho_tables)


def colorize(tree, selmahos, skari) -> Text:
    printer = Colorizer(selmahos, skari["valskari"])
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    printer.t.rstrip()
    return printer.t


def get_parse_tree(lojban: str) -> ParserRuleContext:
    input_stream = InputStream(lojban)
    lexer = ColorLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ColorParser(stream)
    return parser.folio()


def process_and_print_tree(tree, args: dict, console, gismus, selmahos, skari):
    renderables = []

    if args.prigau:
        renderables.append(Panel(colorize(tree, selmahos, skari), style=Style()))

    if args.cmavo or args.gismu or args.rafsi:
        col_renderables = []
        if args.cmavo:
            col_renderables.append(Panel(analyze_cmavos(tree, selmahos, skari, False), expand=False, style=Style.parse(skari["valskari"]["cmavo"])))
        if args.gismu:
            col_renderables.append(Panel(analyze_gismu(tree, gismus, skari), expand=False, style=Style.parse(skari["valskari"]["gismu"])))
        if args.rafsi:
            col_renderables.append(Panel(analyze_rafsi(tree, gismus, selmahos, skari), expand=False, style=Style.parse(skari["valskari"]["rafsi"])))
        renderables.append(Panel(Columns(col_renderables), style=Style()))

    if args.selmaho:
        renderables.append(Panel(analyze_selmahos(tree, selmahos, skari, args.squeeze, False), expand=False, style=Style()))
    if args.selmaho_style:
        renderables.append(Panel(analyze_selmahos_differently(tree, selmahos, args.squeeze), expand=False, style=Style()))

    if args.wave:
        for i, panel in enumerate(renderables):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))


def parse(args: dict):
    rec = bool(e := args.export)
    console = Console(record=rec, force_interactive=(not rec))
    config = plumbing.get_config("config")
    gismus = plumbing.get_config("gismus")
    selmahos = plumbing.get_config("selmahos")
    skari = plumbing.get_config("skari")
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                with console.status(
                    Text("parsing the file...", style=skari["mi'iskari"]["system"]),
                    spinner=config["spinner"],
                ):
                    tree = get_parse_tree(file.read())
            if args.catch_gismus:
                interrogate_for_glosses(tree, gismus, skari)
                gismus = plumbing.get_config("gismus")
            if args.catch_rafsi:
                interrogate_for_rafsi(tree, gismus, selmahos, skari)
                gismus = plumbing.get_config("gismus")
                selmahos = plumbing.get_config("selmahos")
            process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if args.input:
        console.print("Type the input:", style=skari["mi'iskari"]["prompt"])
        tree = get_parse_tree(sys.stdin.read())
        process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if rec:
        console.save_svg(e, title="skavla")
