import color
import sys
from rich.panel import Panel
from rich.console import Console


def parse(args: dict):
    console = Console()

    if files := args.filepath:
        for f in files:
            with open(f, "r") as file:
                console.print(Panel(color.color_prt(content := file.read())))
                if args.lanli:
                    console.print(color.lanli(content))

            
        

    if i := args.input:
        console.print("Type the input:")
        console.print(Panel(color.color_prt(sys.stdin.read())))