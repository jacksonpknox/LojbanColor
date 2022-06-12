from python.ColorListener import ColorListener
from rich import print

def put(ctx, color):
    print(f'[{color}]{ctx.getText()}[/{color}]', end='')

class Colorizer(ColorListener):
    def exitSentence(self, ctx):
        print()

    def exitWord(self, ctx):
        print(" ", end='')

    def enterCmavo(self, ctx):
        put(ctx, "magenta")

    def enterGismu(self, ctx):
        put(ctx, "bright_red")

    def enterY(self, ctx):
        put(ctx, "yellow")

    def enterQ(self, ctx):
        put(ctx, "yellow")

    def enterStump(self, ctx):
        put(ctx, "red")

    def enterCuraf(self, ctx):
        put(ctx, "dark_orange3")

    def enterBalraf(self, ctx):
        put(ctx, "blue")

    def enterBauraf(self, ctx):
        put(ctx, "green")
        
    def enterBroraf(self, ctx):
        put(ctx, "bright_cyan")