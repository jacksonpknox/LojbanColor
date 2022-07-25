from matplotlib import collections
import tubnu.plumbing as plumbing
import tubnu.karda as karda
import tubnu.jmaji as jmaji
import subparsers.cuxna as cuxna

from rich import box
from rich.text import Text
from rich.panel import Panel
from rich.table import Table
from rich.prompt import Prompt
from rich.columns import Columns
from rich.console import Console, Group
from rich.style import Style

from antlr4 import ParseTreeWalker

from python_color.SkabanListener import SkabanListener
from python_color.SkabanParser import SkabanParser


class Skabanizer(SkabanListener):
    def __init__(self, selmahos: dict, valskari: dict):
        self.t = Text()
        self.selmahos = selmahos
        self.valskari = valskari

    def exitLine(self, ctx):
        self.t.append("\n")

    def exitWord(self, ctx):
        self.t.append(" ")

    def enterKarmaho(self, ctx: SkabanParser.KarmahoContext):
        self.t.append(
            text=(cmavo := ctx.getText()),
            style=self.selmahos[plumbing.get_selmaho(cmavo, self.selmahos)]["skari"],
        )

    def enterLerfu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["lerfu"])

    def enterFuhivla(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["fu'ivla"])

    def enterCmene(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmene"])

    def enterKargismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["gismu"])

    def enterGahorgismu(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["gismu"])

    def enterGanlycmarafsi(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmarafsi"])

    def enterGahorkarcmarafsi(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmarafsi"])

    def enterKarkarcmarafsi(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["cmarafsi"])

    def enterGahorgimsygenja(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["gismygenja"])

    def enterKargimsygenja(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["gismygenja"])

    def enterY(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["y"])

    def enterQ(self, ctx):
        self.t.append(text=ctx.getText(), style=self.valskari["q"])


def interrogate_for_rafsi(tree, gismus, selmahos, skari) -> None:
    p = Style.parse(skari["mi'iskari"]["prompt"])
    collection = jmaji.collect(tree, jmaji.CmarafsiCollector)
    for cmarafsi in collection:
        cma = Text(cmarafsi, style=Style.parse(skari["valskari"]["cmarafsi"]))
        word_type, word, bonus = plumbing.classify_cmarafsi(cmarafsi, gismus, selmahos)
        if word_type == "UNCAUGHT":
            word_type = Prompt.ask(
                Text("type of ", p) + cma, choices=["gismu", "cmavo"], default="gismu"
            )
        if word_type == "gismu":
            if word == "UNCAUGHT":
                word = Prompt.ask(Text("gismu for cmarafsi ", p) + cma)
                cuxna.add_cmarafsi(word, cmarafsi, skari)
                bonus = plumbing.get_gloss(word, gismus)
            if bonus in ["UNCAUGHT", "UNGLOSSED"]:
                bonus = Prompt.ask(Text("gloss for ", p) + word)
                cuxna.add_gloss(word, bonus, skari)
        elif word_type == "cmavo":
            if word == "UNCAUGHT":
                word = Prompt.ask(Text("cmavo for cmavyrafsi ", p) + cma)
                if (s := plumbing.get_selmaho(word, selmahos)) != "UNCAT":
                    bonus = s
                else:
                    bonus = Prompt.ask(Text("selma'o for cmavo ", p) + word)
                cuxna.add_cmavyrafsi(bonus, word, cmarafsi, selmahos, skari)


def interrogate_for_glosses(tree, gismus, skari) -> None:
    collection = jmaji.collect(tree, jmaji.GismuCollector)
    p = Style.parse(skari["mi'iskari"]["prompt"])
    for gismu in collection:
        if gismu not in gismus.keys() or not gismus[gismu]["gloss"]:
            gloss = Prompt.ask(
                Text("type the gloss for ", p) + gismu + Text(" (enter to skip)", p),
                default=None,
            )
            if gloss:
                cuxna.add_gloss(gismu, gloss, skari)


def analyze_rafsi(tree, gismus, selmahos, skari) -> Table:
    collection = jmaji.collect(tree, jmaji.CmarafsiCollector)
    return karda.tabulate_cmarafsi(collection, gismus, selmahos, skari)


def analyze_gismu(tree, gismus, skari) -> Table:
    collection = jmaji.collect(tree, jmaji.GismuCollector)
    return karda.tabulate_gismus(collection, gismus, skari)


def analyze_cmavos(tree, selmahos, skari, selmaho_style: bool) -> Table:
    collection = jmaji.collect(tree, jmaji.CmavoCollector)
    return karda.tabulate_cmavos(collection, selmahos, skari, selmaho_style)


# NOTE returns Columns
def analyze_selmahos(
    tree, selmahos, skari, squeeze: int, show_styles: bool = False
) -> Columns:
    cmavo_collection = jmaji.collect(tree, jmaji.CmavoCollector)
    selmaho_collection = dict()
    for cmavo in cmavo_collection:
        s = plumbing.get_selmaho(cmavo, selmahos)
        if s not in selmaho_collection.keys():
            selmaho_collection[s] = [cmavo]
        else:
            selmaho_collection[s].append(cmavo)
    selmaho_tables = []
    for s, cmavos in selmaho_collection.items():
        selmaho_tables.extend(
            karda.squeeze_table(
                karda.tabulate_cmavos(cmavos, selmahos, skari, show_styles), squeeze
            )
        )
    return Columns(selmaho_tables)


def colorize(tree, selmahos, skari) -> Text:
    printer = Skabanizer(selmahos, skari["valskari"])
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    printer.t.rstrip()
    return printer.t


def process_and_print_tree(tree, args: dict, console, gismus, selmahos, skari):
    renderables = []

    if args.prigau:
        renderables.append(Panel(colorize(tree, selmahos, skari), style=Style()))

    if args.cmavo or args.gismu or args.rafsi:
        col_renderables = []
        if args.cmavo:
            col_renderables.append(
                Panel(
                    analyze_cmavos(tree, selmahos, skari, False),
                    expand=False,
                    style=Style.parse(skari["valskari"]["cmavo"]),
                )
            )
        if args.gismu:
            col_renderables.append(
                Panel(
                    analyze_gismu(tree, gismus, skari),
                    expand=False,
                    style=Style.parse(skari["valskari"]["gismu"]),
                )
            )
        if args.rafsi:
            col_renderables.append(
                Panel(
                    analyze_rafsi(tree, gismus, selmahos, skari),
                    expand=False,
                    style=Style.parse(skari["valskari"]["cmarafsi"]),
                )
            )
        renderables.append(Panel(Columns(col_renderables), style=Style()))

    if args.tree_gismu:
        collection = jmaji.collect(tree, jmaji.GismuCollector)
        gismu_trees = [Panel(karda.get_gismu_tree(gismu, gismus, skari), style=Style.parse(skari["valskari"]["gismu"]), title=gismu) for gismu in collection]
        renderables.append(Panel(Columns(gismu_trees), style=Style.parse(skari["valskari"]["gismu"])))

    if args.selmaho:
        renderables.append(
            Panel(
                analyze_selmahos(tree, selmahos, skari, args.squeeze, False),
                expand=False,
                style=Style(),
            )
        )


    if args.wave:
        for i, panel in enumerate(renderables):
            sty = Style(bgcolor="#333333") if (i % 2) else Style(bgcolor="black")
            panel.style += sty

    console.print(Panel(Group(*renderables), box.DOUBLE, expand=False))


def parse(args: dict):
    rec = bool(e := args.export)
    console = Console(record=rec, force_interactive=(not rec))
    minji = plumbing.get_config("minji")
    gismus = plumbing.get_config("gismu")
    selmahos = plumbing.get_config("selmaho")
    skari = plumbing.get_config("skari")
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                with console.status(
                    Text("parsing the file...", style=skari["mi'iskari"]["system"]),
                    spinner=minji["spinner"],
                ):
                    tree = jmaji.get_parse_tree(file.read())
            if args.catch_gismus:
                interrogate_for_glosses(tree, gismus, skari)
                gismus = plumbing.get_config("gismus")
            if args.catch_rafsi:
                interrogate_for_rafsi(tree, gismus, selmahos, skari)
                gismus = plumbing.get_config("gismus")
                selmahos = plumbing.get_config("selmahos")
            process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if args.input:
        p = Style.parse(skari["mi'iskari"]["prompt"])
        user_input = Prompt.ask(Text("type the input", style=p))
        tree = jmaji.get_parse_tree(user_input)
        process_and_print_tree(tree, args, console, gismus, selmahos, skari)

    if rec:
        console.save_svg(e, title="skavla")
