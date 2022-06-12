# Generated from Lujvo.g4 by ANTLR 4.10.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,5,21,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,1,
        1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,0,0,5,1,1,3,2,5,3,7,4,9,5,1,0,2,8,
        0,98,100,102,103,106,110,112,112,114,116,118,118,120,120,122,122,
        5,0,97,97,101,101,105,105,111,111,117,117,20,0,1,1,0,0,0,0,3,1,0,
        0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,1,11,1,0,0,0,3,13,1,0,0,
        0,5,15,1,0,0,0,7,17,1,0,0,0,9,19,1,0,0,0,11,12,5,39,0,0,12,2,1,0,
        0,0,13,14,5,121,0,0,14,4,1,0,0,0,15,16,5,113,0,0,16,6,1,0,0,0,17,
        18,7,0,0,0,18,8,1,0,0,0,19,20,7,1,0,0,20,10,1,0,0,0,1,0,0
    ]

class LujvoLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    Y = 2
    Q = 3
    C = 4
    V = 5

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'''", "'y'", "'q'" ]

    symbolicNames = [ "<INVALID>",
            "Y", "Q", "C", "V" ]

    ruleNames = [ "T__0", "Y", "Q", "C", "V" ]

    grammarFileName = "Lujvo.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


