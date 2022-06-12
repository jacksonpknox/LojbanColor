# Generated from Color.g4 by ANTLR 4.10.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,9,208,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,1,0,1,0,3,0,49,8,0,1,0,1,0,4,0,53,8,0,11,
        0,12,0,54,1,1,4,1,58,8,1,11,1,12,1,59,1,2,1,2,1,2,3,2,65,8,2,1,3,
        1,3,1,4,1,4,1,4,1,4,1,4,3,4,74,8,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,3,
        5,83,8,5,1,6,1,6,1,6,1,6,1,7,1,7,3,7,91,8,7,1,7,3,7,94,8,7,1,8,1,
        8,1,8,1,8,1,9,1,9,1,9,1,9,1,10,1,10,3,10,106,8,10,1,10,1,10,1,10,
        1,10,3,10,112,8,10,1,10,1,10,1,11,1,11,1,12,1,12,3,12,120,8,12,1,
        12,1,12,1,12,1,12,5,12,126,8,12,10,12,12,12,129,9,12,1,12,1,12,3,
        12,133,8,12,1,13,1,13,1,13,3,13,138,8,13,1,13,3,13,141,8,13,1,13,
        1,13,1,13,1,13,3,13,147,8,13,1,13,1,13,1,13,3,13,152,8,13,1,13,1,
        13,3,13,156,8,13,1,14,1,14,3,14,160,8,14,1,15,1,15,3,15,164,8,15,
        1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,3,15,175,8,15,1,16,
        1,16,1,16,1,16,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,19,1,19,3,19,
        190,8,19,1,19,1,19,1,20,1,20,3,20,196,8,20,1,21,1,21,1,21,1,21,1,
        21,1,22,1,22,1,22,1,22,1,22,1,22,0,0,23,0,2,4,6,8,10,12,14,16,18,
        20,22,24,26,28,30,32,34,36,38,40,42,44,0,0,215,0,52,1,0,0,0,2,57,
        1,0,0,0,4,64,1,0,0,0,6,66,1,0,0,0,8,68,1,0,0,0,10,82,1,0,0,0,12,
        84,1,0,0,0,14,90,1,0,0,0,16,95,1,0,0,0,18,99,1,0,0,0,20,111,1,0,
        0,0,22,115,1,0,0,0,24,127,1,0,0,0,26,155,1,0,0,0,28,159,1,0,0,0,
        30,174,1,0,0,0,32,176,1,0,0,0,34,180,1,0,0,0,36,182,1,0,0,0,38,186,
        1,0,0,0,40,195,1,0,0,0,42,197,1,0,0,0,44,202,1,0,0,0,46,48,3,2,1,
        0,47,49,5,1,0,0,48,47,1,0,0,0,48,49,1,0,0,0,49,50,1,0,0,0,50,51,
        5,2,0,0,51,53,1,0,0,0,52,46,1,0,0,0,53,54,1,0,0,0,54,52,1,0,0,0,
        54,55,1,0,0,0,55,1,1,0,0,0,56,58,3,4,2,0,57,56,1,0,0,0,58,59,1,0,
        0,0,59,57,1,0,0,0,59,60,1,0,0,0,60,3,1,0,0,0,61,65,3,6,3,0,62,65,
        3,8,4,0,63,65,3,10,5,0,64,61,1,0,0,0,64,62,1,0,0,0,64,63,1,0,0,0,
        65,5,1,0,0,0,66,67,5,5,0,0,67,7,1,0,0,0,68,73,5,8,0,0,69,70,5,8,
        0,0,70,74,5,9,0,0,71,72,5,9,0,0,72,74,5,8,0,0,73,69,1,0,0,0,73,71,
        1,0,0,0,74,75,1,0,0,0,75,76,5,8,0,0,76,77,5,9,0,0,77,9,1,0,0,0,78,
        83,3,12,6,0,79,83,3,14,7,0,80,83,3,16,8,0,81,83,3,18,9,0,82,78,1,
        0,0,0,82,79,1,0,0,0,82,80,1,0,0,0,82,81,1,0,0,0,83,11,1,0,0,0,84,
        85,3,20,10,0,85,86,3,22,11,0,86,87,3,24,12,0,87,13,1,0,0,0,88,91,
        3,20,10,0,89,91,3,26,13,0,90,88,1,0,0,0,90,89,1,0,0,0,91,93,1,0,
        0,0,92,94,3,24,12,0,93,92,1,0,0,0,93,94,1,0,0,0,94,15,1,0,0,0,95,
        96,3,28,14,0,96,97,3,22,11,0,97,98,3,24,12,0,98,17,1,0,0,0,99,100,
        3,30,15,0,100,101,3,22,11,0,101,102,3,24,12,0,102,19,1,0,0,0,103,
        105,3,32,16,0,104,106,3,34,17,0,105,104,1,0,0,0,105,106,1,0,0,0,
        106,112,1,0,0,0,107,112,3,36,18,0,108,109,3,38,19,0,109,110,3,34,
        17,0,110,112,1,0,0,0,111,103,1,0,0,0,111,107,1,0,0,0,111,108,1,0,
        0,0,112,113,1,0,0,0,113,114,3,32,16,0,114,21,1,0,0,0,115,116,5,6,
        0,0,116,23,1,0,0,0,117,119,3,32,16,0,118,120,3,22,11,0,119,118,1,
        0,0,0,119,120,1,0,0,0,120,126,1,0,0,0,121,122,3,28,14,0,122,123,
        3,22,11,0,123,126,1,0,0,0,124,126,3,40,20,0,125,117,1,0,0,0,125,
        121,1,0,0,0,125,124,1,0,0,0,126,129,1,0,0,0,127,125,1,0,0,0,127,
        128,1,0,0,0,128,132,1,0,0,0,129,127,1,0,0,0,130,133,3,40,20,0,131,
        133,3,8,4,0,132,130,1,0,0,0,132,131,1,0,0,0,133,25,1,0,0,0,134,138,
        3,32,16,0,135,138,3,36,18,0,136,138,3,38,19,0,137,134,1,0,0,0,137,
        135,1,0,0,0,137,136,1,0,0,0,138,140,1,0,0,0,139,141,3,34,17,0,140,
        139,1,0,0,0,140,141,1,0,0,0,141,142,1,0,0,0,142,143,3,36,18,0,143,
        156,1,0,0,0,144,146,3,32,16,0,145,147,3,34,17,0,146,145,1,0,0,0,
        146,147,1,0,0,0,147,152,1,0,0,0,148,149,3,40,20,0,149,150,3,34,17,
        0,150,152,1,0,0,0,151,144,1,0,0,0,151,148,1,0,0,0,152,153,1,0,0,
        0,153,154,3,38,19,0,154,156,1,0,0,0,155,137,1,0,0,0,155,151,1,0,
        0,0,156,27,1,0,0,0,157,160,3,42,21,0,158,160,3,44,22,0,159,157,1,
        0,0,0,159,158,1,0,0,0,160,29,1,0,0,0,161,163,3,32,16,0,162,164,3,
        34,17,0,163,162,1,0,0,0,163,164,1,0,0,0,164,165,1,0,0,0,165,166,
        3,28,14,0,166,175,1,0,0,0,167,168,3,40,20,0,168,169,3,34,17,0,169,
        170,3,42,21,0,170,175,1,0,0,0,171,172,3,40,20,0,172,173,3,44,22,
        0,173,175,1,0,0,0,174,161,1,0,0,0,174,167,1,0,0,0,174,171,1,0,0,
        0,175,31,1,0,0,0,176,177,5,8,0,0,177,178,5,9,0,0,178,179,5,8,0,0,
        179,33,1,0,0,0,180,181,5,7,0,0,181,35,1,0,0,0,182,183,5,8,0,0,183,
        184,5,8,0,0,184,185,5,9,0,0,185,37,1,0,0,0,186,187,5,8,0,0,187,189,
        5,9,0,0,188,190,5,3,0,0,189,188,1,0,0,0,189,190,1,0,0,0,190,191,
        1,0,0,0,191,192,5,9,0,0,192,39,1,0,0,0,193,196,3,38,19,0,194,196,
        3,36,18,0,195,193,1,0,0,0,195,194,1,0,0,0,196,41,1,0,0,0,197,198,
        5,8,0,0,198,199,5,9,0,0,199,200,5,8,0,0,200,201,5,8,0,0,201,43,1,
        0,0,0,202,203,5,8,0,0,203,204,5,8,0,0,204,205,5,9,0,0,205,206,5,
        8,0,0,206,45,1,0,0,0,24,48,54,59,64,73,82,90,93,105,111,119,125,
        127,132,137,140,146,151,155,159,163,174,189,195
    ]

class ColorParser ( Parser ):

    grammarFileName = "Color.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'\\r'", "'\\n'", "'''", "' '", "<INVALID>", 
                     "'y'", "'q'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "WS", "PA", "Y", "Q", "C", "V" ]

    RULE_folio = 0
    RULE_sentence = 1
    RULE_word = 2
    RULE_cmavo = 3
    RULE_gismu = 4
    RULE_lujvo = 5
    RULE_bobvo = 6
    RULE_cobvo = 7
    RULE_dobvo = 8
    RULE_fobvo = 9
    RULE_tworafcon = 10
    RULE_y = 11
    RULE_tailvo = 12
    RULE_tworafvow = 13
    RULE_stump = 14
    RULE_rafstump = 15
    RULE_balraf = 16
    RULE_q = 17
    RULE_broraf = 18
    RULE_bauraf = 19
    RULE_vuraf = 20
    RULE_cafourraf = 21
    RULE_ckfourraf = 22

    ruleNames =  [ "folio", "sentence", "word", "cmavo", "gismu", "lujvo", 
                   "bobvo", "cobvo", "dobvo", "fobvo", "tworafcon", "y", 
                   "tailvo", "tworafvow", "stump", "rafstump", "balraf", 
                   "q", "broraf", "bauraf", "vuraf", "cafourraf", "ckfourraf" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    WS=4
    PA=5
    Y=6
    Q=7
    C=8
    V=9

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.10.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class FolioContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sentence(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.SentenceContext)
            else:
                return self.getTypedRuleContext(ColorParser.SentenceContext,i)


        def getRuleIndex(self):
            return ColorParser.RULE_folio

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFolio" ):
                listener.enterFolio(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFolio" ):
                listener.exitFolio(self)




    def folio(self):

        localctx = ColorParser.FolioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_folio)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 46
                self.sentence()
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.T__0:
                    self.state = 47
                    self.match(ColorParser.T__0)


                self.state = 50
                self.match(ColorParser.T__1)
                self.state = 54 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ColorParser.PA or _la==ColorParser.C):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenceContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def word(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.WordContext)
            else:
                return self.getTypedRuleContext(ColorParser.WordContext,i)


        def getRuleIndex(self):
            return ColorParser.RULE_sentence

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentence" ):
                listener.enterSentence(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentence" ):
                listener.exitSentence(self)




    def sentence(self):

        localctx = ColorParser.SentenceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_sentence)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 56
                self.word()
                self.state = 59 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ColorParser.PA or _la==ColorParser.C):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WordContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cmavo(self):
            return self.getTypedRuleContext(ColorParser.CmavoContext,0)


        def gismu(self):
            return self.getTypedRuleContext(ColorParser.GismuContext,0)


        def lujvo(self):
            return self.getTypedRuleContext(ColorParser.LujvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_word

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWord" ):
                listener.enterWord(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWord" ):
                listener.exitWord(self)




    def word(self):

        localctx = ColorParser.WordContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_word)
        try:
            self.state = 64
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 61
                self.cmavo()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.gismu()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 63
                self.lujvo()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmavoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PA(self):
            return self.getToken(ColorParser.PA, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_cmavo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmavo" ):
                listener.enterCmavo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmavo" ):
                listener.exitCmavo(self)




    def cmavo(self):

        localctx = ColorParser.CmavoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_cmavo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(ColorParser.PA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GismuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.C)
            else:
                return self.getToken(ColorParser.C, i)

        def V(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.V)
            else:
                return self.getToken(ColorParser.V, i)

        def getRuleIndex(self):
            return ColorParser.RULE_gismu

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGismu" ):
                listener.enterGismu(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGismu" ):
                listener.exitGismu(self)




    def gismu(self):

        localctx = ColorParser.GismuContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_gismu)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(ColorParser.C)
            self.state = 73
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.C]:
                self.state = 69
                self.match(ColorParser.C)
                self.state = 70
                self.match(ColorParser.V)
                pass
            elif token in [ColorParser.V]:
                self.state = 71
                self.match(ColorParser.V)
                self.state = 72
                self.match(ColorParser.C)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 75
            self.match(ColorParser.C)
            self.state = 76
            self.match(ColorParser.V)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LujvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def bobvo(self):
            return self.getTypedRuleContext(ColorParser.BobvoContext,0)


        def cobvo(self):
            return self.getTypedRuleContext(ColorParser.CobvoContext,0)


        def dobvo(self):
            return self.getTypedRuleContext(ColorParser.DobvoContext,0)


        def fobvo(self):
            return self.getTypedRuleContext(ColorParser.FobvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_lujvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLujvo" ):
                listener.enterLujvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLujvo" ):
                listener.exitLujvo(self)




    def lujvo(self):

        localctx = ColorParser.LujvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_lujvo)
        try:
            self.state = 82
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 78
                self.bobvo()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 79
                self.cobvo()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 80
                self.dobvo()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 81
                self.fobvo()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BobvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tworafcon(self):
            return self.getTypedRuleContext(ColorParser.TworafconContext,0)


        def y(self):
            return self.getTypedRuleContext(ColorParser.YContext,0)


        def tailvo(self):
            return self.getTypedRuleContext(ColorParser.TailvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_bobvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBobvo" ):
                listener.enterBobvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBobvo" ):
                listener.exitBobvo(self)




    def bobvo(self):

        localctx = ColorParser.BobvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_bobvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.tworafcon()
            self.state = 85
            self.y()
            self.state = 86
            self.tailvo()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CobvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tworafcon(self):
            return self.getTypedRuleContext(ColorParser.TworafconContext,0)


        def tworafvow(self):
            return self.getTypedRuleContext(ColorParser.TworafvowContext,0)


        def tailvo(self):
            return self.getTypedRuleContext(ColorParser.TailvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_cobvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCobvo" ):
                listener.enterCobvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCobvo" ):
                listener.exitCobvo(self)




    def cobvo(self):

        localctx = ColorParser.CobvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_cobvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.state = 88
                self.tworafcon()
                pass

            elif la_ == 2:
                self.state = 89
                self.tworafvow()
                pass


            self.state = 93
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.state = 92
                self.tailvo()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DobvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def stump(self):
            return self.getTypedRuleContext(ColorParser.StumpContext,0)


        def y(self):
            return self.getTypedRuleContext(ColorParser.YContext,0)


        def tailvo(self):
            return self.getTypedRuleContext(ColorParser.TailvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_dobvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDobvo" ):
                listener.enterDobvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDobvo" ):
                listener.exitDobvo(self)




    def dobvo(self):

        localctx = ColorParser.DobvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_dobvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.stump()
            self.state = 96
            self.y()
            self.state = 97
            self.tailvo()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FobvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def rafstump(self):
            return self.getTypedRuleContext(ColorParser.RafstumpContext,0)


        def y(self):
            return self.getTypedRuleContext(ColorParser.YContext,0)


        def tailvo(self):
            return self.getTypedRuleContext(ColorParser.TailvoContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_fobvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFobvo" ):
                listener.enterFobvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFobvo" ):
                listener.exitFobvo(self)




    def fobvo(self):

        localctx = ColorParser.FobvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_fobvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.rafstump()
            self.state = 100
            self.y()
            self.state = 101
            self.tailvo()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TworafconContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def balraf(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.BalrafContext)
            else:
                return self.getTypedRuleContext(ColorParser.BalrafContext,i)


        def broraf(self):
            return self.getTypedRuleContext(ColorParser.BrorafContext,0)


        def bauraf(self):
            return self.getTypedRuleContext(ColorParser.BaurafContext,0)


        def q(self):
            return self.getTypedRuleContext(ColorParser.QContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_tworafcon

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTworafcon" ):
                listener.enterTworafcon(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTworafcon" ):
                listener.exitTworafcon(self)




    def tworafcon(self):

        localctx = ColorParser.TworafconContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_tworafcon)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 111
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.state = 103
                self.balraf()
                self.state = 105
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.Q:
                    self.state = 104
                    self.q()


                pass

            elif la_ == 2:
                self.state = 107
                self.broraf()
                pass

            elif la_ == 3:
                self.state = 108
                self.bauraf()
                self.state = 109
                self.q()
                pass


            self.state = 113
            self.balraf()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class YContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Y(self):
            return self.getToken(ColorParser.Y, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_y

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterY" ):
                listener.enterY(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitY" ):
                listener.exitY(self)




    def y(self):

        localctx = ColorParser.YContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_y)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 115
            self.match(ColorParser.Y)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TailvoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vuraf(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.VurafContext)
            else:
                return self.getTypedRuleContext(ColorParser.VurafContext,i)


        def gismu(self):
            return self.getTypedRuleContext(ColorParser.GismuContext,0)


        def balraf(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.BalrafContext)
            else:
                return self.getTypedRuleContext(ColorParser.BalrafContext,i)


        def stump(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.StumpContext)
            else:
                return self.getTypedRuleContext(ColorParser.StumpContext,i)


        def y(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.YContext)
            else:
                return self.getTypedRuleContext(ColorParser.YContext,i)


        def getRuleIndex(self):
            return ColorParser.RULE_tailvo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTailvo" ):
                listener.enterTailvo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTailvo" ):
                listener.exitTailvo(self)




    def tailvo(self):

        localctx = ColorParser.TailvoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_tailvo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 127
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 125
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
                    if la_ == 1:
                        self.state = 117
                        self.balraf()
                        self.state = 119
                        self._errHandler.sync(self)
                        _la = self._input.LA(1)
                        if _la==ColorParser.Y:
                            self.state = 118
                            self.y()


                        pass

                    elif la_ == 2:
                        self.state = 121
                        self.stump()
                        self.state = 122
                        self.y()
                        pass

                    elif la_ == 3:
                        self.state = 124
                        self.vuraf()
                        pass

             
                self.state = 129
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

            self.state = 132
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 130
                self.vuraf()
                pass

            elif la_ == 2:
                self.state = 131
                self.gismu()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TworafvowContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def broraf(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ColorParser.BrorafContext)
            else:
                return self.getTypedRuleContext(ColorParser.BrorafContext,i)


        def balraf(self):
            return self.getTypedRuleContext(ColorParser.BalrafContext,0)


        def bauraf(self):
            return self.getTypedRuleContext(ColorParser.BaurafContext,0)


        def q(self):
            return self.getTypedRuleContext(ColorParser.QContext,0)


        def vuraf(self):
            return self.getTypedRuleContext(ColorParser.VurafContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_tworafvow

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTworafvow" ):
                listener.enterTworafvow(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTworafvow" ):
                listener.exitTworafvow(self)




    def tworafvow(self):

        localctx = ColorParser.TworafvowContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_tworafvow)
        self._la = 0 # Token type
        try:
            self.state = 155
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 137
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
                if la_ == 1:
                    self.state = 134
                    self.balraf()
                    pass

                elif la_ == 2:
                    self.state = 135
                    self.broraf()
                    pass

                elif la_ == 3:
                    self.state = 136
                    self.bauraf()
                    pass


                self.state = 140
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.Q:
                    self.state = 139
                    self.q()


                self.state = 142
                self.broraf()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 151
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
                if la_ == 1:
                    self.state = 144
                    self.balraf()
                    self.state = 146
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==ColorParser.Q:
                        self.state = 145
                        self.q()


                    pass

                elif la_ == 2:
                    self.state = 148
                    self.vuraf()
                    self.state = 149
                    self.q()
                    pass


                self.state = 153
                self.bauraf()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StumpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cafourraf(self):
            return self.getTypedRuleContext(ColorParser.CafourrafContext,0)


        def ckfourraf(self):
            return self.getTypedRuleContext(ColorParser.CkfourrafContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_stump

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStump" ):
                listener.enterStump(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStump" ):
                listener.exitStump(self)




    def stump(self):

        localctx = ColorParser.StumpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_stump)
        try:
            self.state = 159
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 157
                self.cafourraf()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 158
                self.ckfourraf()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RafstumpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def balraf(self):
            return self.getTypedRuleContext(ColorParser.BalrafContext,0)


        def stump(self):
            return self.getTypedRuleContext(ColorParser.StumpContext,0)


        def q(self):
            return self.getTypedRuleContext(ColorParser.QContext,0)


        def vuraf(self):
            return self.getTypedRuleContext(ColorParser.VurafContext,0)


        def cafourraf(self):
            return self.getTypedRuleContext(ColorParser.CafourrafContext,0)


        def ckfourraf(self):
            return self.getTypedRuleContext(ColorParser.CkfourrafContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_rafstump

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRafstump" ):
                listener.enterRafstump(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRafstump" ):
                listener.exitRafstump(self)




    def rafstump(self):

        localctx = ColorParser.RafstumpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_rafstump)
        self._la = 0 # Token type
        try:
            self.state = 174
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 161
                self.balraf()
                self.state = 163
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.Q:
                    self.state = 162
                    self.q()


                self.state = 165
                self.stump()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 167
                self.vuraf()
                self.state = 168
                self.q()
                self.state = 169
                self.cafourraf()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 171
                self.vuraf()
                self.state = 172
                self.ckfourraf()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BalrafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.C)
            else:
                return self.getToken(ColorParser.C, i)

        def V(self):
            return self.getToken(ColorParser.V, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_balraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBalraf" ):
                listener.enterBalraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBalraf" ):
                listener.exitBalraf(self)




    def balraf(self):

        localctx = ColorParser.BalrafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_balraf)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 176
            self.match(ColorParser.C)
            self.state = 177
            self.match(ColorParser.V)
            self.state = 178
            self.match(ColorParser.C)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class QContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Q(self):
            return self.getToken(ColorParser.Q, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_q

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQ" ):
                listener.enterQ(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQ" ):
                listener.exitQ(self)




    def q(self):

        localctx = ColorParser.QContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_q)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 180
            self.match(ColorParser.Q)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BrorafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.C)
            else:
                return self.getToken(ColorParser.C, i)

        def V(self):
            return self.getToken(ColorParser.V, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_broraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBroraf" ):
                listener.enterBroraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBroraf" ):
                listener.exitBroraf(self)




    def broraf(self):

        localctx = ColorParser.BrorafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_broraf)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 182
            self.match(ColorParser.C)
            self.state = 183
            self.match(ColorParser.C)
            self.state = 184
            self.match(ColorParser.V)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BaurafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self):
            return self.getToken(ColorParser.C, 0)

        def V(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.V)
            else:
                return self.getToken(ColorParser.V, i)

        def getRuleIndex(self):
            return ColorParser.RULE_bauraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBauraf" ):
                listener.enterBauraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBauraf" ):
                listener.exitBauraf(self)




    def bauraf(self):

        localctx = ColorParser.BaurafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_bauraf)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 186
            self.match(ColorParser.C)
            self.state = 187
            self.match(ColorParser.V)
            self.state = 189
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==ColorParser.T__2:
                self.state = 188
                self.match(ColorParser.T__2)


            self.state = 191
            self.match(ColorParser.V)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VurafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def bauraf(self):
            return self.getTypedRuleContext(ColorParser.BaurafContext,0)


        def broraf(self):
            return self.getTypedRuleContext(ColorParser.BrorafContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_vuraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVuraf" ):
                listener.enterVuraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVuraf" ):
                listener.exitVuraf(self)




    def vuraf(self):

        localctx = ColorParser.VurafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_vuraf)
        try:
            self.state = 195
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,23,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 193
                self.bauraf()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 194
                self.broraf()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CafourrafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.C)
            else:
                return self.getToken(ColorParser.C, i)

        def V(self):
            return self.getToken(ColorParser.V, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_cafourraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCafourraf" ):
                listener.enterCafourraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCafourraf" ):
                listener.exitCafourraf(self)




    def cafourraf(self):

        localctx = ColorParser.CafourrafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_cafourraf)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 197
            self.match(ColorParser.C)
            self.state = 198
            self.match(ColorParser.V)
            self.state = 199
            self.match(ColorParser.C)
            self.state = 200
            self.match(ColorParser.C)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CkfourrafContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def C(self, i:int=None):
            if i is None:
                return self.getTokens(ColorParser.C)
            else:
                return self.getToken(ColorParser.C, i)

        def V(self):
            return self.getToken(ColorParser.V, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_ckfourraf

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCkfourraf" ):
                listener.enterCkfourraf(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCkfourraf" ):
                listener.exitCkfourraf(self)




    def ckfourraf(self):

        localctx = ColorParser.CkfourrafContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_ckfourraf)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self.match(ColorParser.C)
            self.state = 203
            self.match(ColorParser.C)
            self.state = 204
            self.match(ColorParser.V)
            self.state = 205
            self.match(ColorParser.C)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





