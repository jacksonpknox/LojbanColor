from python.ColorListener import ColorListener
# figure out env...
# rich is installed using pip
from rich import print

def put(ctx, color):
    print(f'[{color}]{ctx.getText()}[/{color}]', end='')

class Colorizer(ColorListener):
    def exitSentence(self, ctx):
        print()

    def exitWord(self, ctx):
        print(" ", end='')

    def enterCmavo(self, ctx):
        put(ctx, "red")

    def enterGismu(self, ctx):
        put(ctx, "green_yellow")

    def enterY(self, ctx):
        put(ctx, "purple")

    def enterQ(self, ctx):
        put(ctx, "white")

    def enterVafourraf(self, ctx):
        put(ctx, "black")

    def enterCafourraf(self, ctx):
        put(ctx, "bright blue")

    def enterCuraf(self, ctx):
        put(ctx, "dark_orange3")

    def enterVuraf(self, ctx):
        put(ctx, "hot_pink2")