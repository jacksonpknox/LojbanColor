import color
import sys
from rich.panel import Panel
from rich import print


def parse(args: dict):
    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                print(Panel(color.color_prt(file.read())))

    if i := args.input:
        print("Type the input:")
        print(Panel(color.color_prt(sys.stdin.read())))