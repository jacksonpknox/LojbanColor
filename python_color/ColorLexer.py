# Generated from Color.g4 by ANTLR 4.10.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,8,39,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,1,0,4,0,19,8,0,11,0,12,0,20,1,1,3,1,24,8,1,1,1,1,1,
        1,2,1,2,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,0,0,8,1,1,3,2,5,
        3,7,4,9,5,11,6,13,7,15,8,1,0,4,2,0,9,9,32,32,8,0,98,100,102,103,
        106,110,112,112,114,116,118,118,120,120,122,122,5,0,97,97,101,101,
        105,105,111,111,117,117,6,0,33,33,48,57,63,63,104,104,113,113,119,
        119,40,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,
        0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,1,18,1,0,0,0,3,23,1,0,0,
        0,5,27,1,0,0,0,7,29,1,0,0,0,9,31,1,0,0,0,11,33,1,0,0,0,13,35,1,0,
        0,0,15,37,1,0,0,0,17,19,7,0,0,0,18,17,1,0,0,0,19,20,1,0,0,0,20,18,
        1,0,0,0,20,21,1,0,0,0,21,2,1,0,0,0,22,24,5,13,0,0,23,22,1,0,0,0,
        23,24,1,0,0,0,24,25,1,0,0,0,25,26,5,10,0,0,26,4,1,0,0,0,27,28,5,
        46,0,0,28,6,1,0,0,0,29,30,7,1,0,0,30,8,1,0,0,0,31,32,7,2,0,0,32,
        10,1,0,0,0,33,34,5,121,0,0,34,12,1,0,0,0,35,36,5,39,0,0,36,14,1,
        0,0,0,37,38,7,3,0,0,38,16,1,0,0,0,3,0,20,23,0
    ]

class ColorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    WS = 1
    NEWLINE = 2
    DOT = 3
    C = 4
    V = 5
    Y = 6
    AP = 7
    EXTRA = 8

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'.'", "'y'", "'''" ]

    symbolicNames = [ "<INVALID>",
            "WS", "NEWLINE", "DOT", "C", "V", "Y", "AP", "EXTRA" ]

    ruleNames = [ "WS", "NEWLINE", "DOT", "C", "V", "Y", "AP", "EXTRA" ]

    grammarFileName = "Color.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


