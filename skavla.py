import argparse
from rich_argparse import RichHelpFormatter
import antlr4
from python_color.ColorLexer import ColorLexer
from python_color.ColorParser import ColorParser
from python_color.ColorListener import ColorListener
import rich
import rich.text
import rich.panel
from python_lujvo.LujvoLexer import LujvoLexer
from python_lujvo.LujvoParser import LujvoParser
import json
from python_lujvo.LujvoListener import LujvoListener
import yaml


with open("wordsets.yaml", "r") as f:
    selmaho_to_wordset = yaml.safe_load(f)


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
    for selmaho, wordset in selmaho_to_wordset.items():
        if cmavo in wordset:
            return selmaho
    return "UNCAT"


with open("idk.json", "r") as f:
    selmaho_to_color = json.load(f)


def process_compmo(compmo: str):
    i, j, e = 0, 2, len(compmo)
    compy = [c for c in compmo]
    cons = {
        "b",
        "c",
        "d",
        "f",
        "g",
        "j",
        "k",
        "l",
        "m",
        "n",
        "p",
        "r",
        "s",
        "t",
        "v",
        "z",
    }
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
    input_stream = antlr4.InputStream(lujvo)
    lexer = LujvoLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = LujvoParser(stream)
    tree = parser.lujvo()

    printer = LujvoColorizer()
    walker = antlr4.ParseTreeWalker()
    walker.walk(printer, tree)
    

t = rich.text.Text()


def put(txt, color):
    t.append(txt, style=color)


def process_cmavo(cmavo: str):
    color = selmaho_to_color[get_selmaho(cmavo)]
    put(cmavo, color)


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


def add_selmaho(selmaho: str, color: str = "#0000FF"):
    # make sure this selmaho has a color
    with open("idk.json", "r") as f:
        colors = json.load(f)
    if selmaho not in colors:
        colors[selmaho] = color
    with open("idk.json", "w") as f:
        json.dump(colors, f, indent=4)

    # make sure this selmaho has a word-set
    with open("wordsets.yaml", "r") as f:
        wordsets = yaml.safe_load(f)
    if selmaho not in wordsets:
        wordsets[selmaho] = set()
    with open("wordsets.yaml", "w") as f:
        yaml.dump(wordsets, f)

    
def add_cmavo(cmavo: str, selmaho: str) -> None:
    with open("wordsets.yaml", "r") as f:
        wordsets = yaml.safe_load(f)
    if selmaho not in wordsets:
        add_selmaho(selmaho)
        wordsets[selmaho] = {cmavo}
    else:
        wordsets[selmaho].add(cmavo)
    with open("wordsets.yaml", "w") as f:
        yaml.dump(wordsets, f)


def color_print(filepath: str):
    input_stream = antlr4.FileStream(filepath, encoding="utf8")
    lexer = ColorLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = ColorParser(stream)
    tree = parser.folio()

    printer = Colorizer()
    walker = antlr4.ParseTreeWalker()
    walker.walk(printer, tree)
    
    t.rstrip()
    p = rich.panel.Panel(t)
    rich.print(p)


def main():
    parser = argparse.ArgumentParser(formatter_class=RichHelpFormatter)
    parser.add_argument("filepath", action="store", default=None, nargs="?")
    #TODO: improve documentation of below argument
    parser.add_argument("-a", "--add", action="store", nargs=2)
    args = parser.parse_args()
    fp = args.filepath
    if a := args.add:
        if fp:
            print("Warning! Ignoring filepath \"{}\"".format(fp))
        print("Adding cmavo {} to selmaho {}".format(a[0], a[1]))
        add_cmavo(a[0], a[1])
    elif fp:
        color_print(fp)
    else:
        print("error... give a filepath")
        #TODO: what we actually want to do here is invoke the default usage text


if __name__ == "__main__":
    main()
