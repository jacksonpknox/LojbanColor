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
        4,0,9,40,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,1,0,1,0,1,1,1,1,1,2,4,2,25,8,2,11,2,12,2,26,
        1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,0,0,9,1,1,3,2,5,
        3,7,4,9,5,11,6,13,7,15,8,17,9,1,0,4,2,0,9,9,32,32,9,0,44,44,98,100,
        102,103,106,110,112,112,114,116,118,118,120,120,122,122,6,0,97,97,
        101,101,105,105,111,111,117,117,121,121,3,0,9,10,13,13,32,32,40,
        0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,
        1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,1,19,1,0,0,0,3,21,
        1,0,0,0,5,24,1,0,0,0,7,28,1,0,0,0,9,30,1,0,0,0,11,32,1,0,0,0,13,
        34,1,0,0,0,15,36,1,0,0,0,17,38,1,0,0,0,19,20,5,13,0,0,20,2,1,0,0,
        0,21,22,5,10,0,0,22,4,1,0,0,0,23,25,7,0,0,0,24,23,1,0,0,0,25,26,
        1,0,0,0,26,24,1,0,0,0,26,27,1,0,0,0,27,6,1,0,0,0,28,29,5,46,0,0,
        29,8,1,0,0,0,30,31,7,1,0,0,31,10,1,0,0,0,32,33,7,2,0,0,33,12,1,0,
        0,0,34,35,5,121,0,0,35,14,1,0,0,0,36,37,5,39,0,0,37,16,1,0,0,0,38,
        39,8,3,0,0,39,18,1,0,0,0,2,0,26,0
    ]

class ColorLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    WS = 3
    DOT = 4
    C = 5
    V = 6
    Y = 7
    AP = 8
    ANYCHAR = 9

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'\\r'", "'\\n'", "'.'", "'y'", "'''" ]

    symbolicNames = [ "<INVALID>",
            "WS", "DOT", "C", "V", "Y", "AP", "ANYCHAR" ]

    ruleNames = [ "T__0", "T__1", "WS", "DOT", "C", "V", "Y", "AP", "ANYCHAR" ]

    grammarFileName = "Color.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


