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
        4,1,15,89,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,1,0,1,0,3,0,35,8,0,1,0,1,0,4,0,39,8,0,11,0,12,
        0,40,1,1,4,1,44,8,1,11,1,12,1,45,1,2,1,2,3,2,50,8,2,1,3,1,3,1,4,
        1,4,3,4,56,8,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,69,
        8,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,1,12,1,13,1,
        13,1,14,1,14,1,15,1,15,1,15,0,0,16,0,2,4,6,8,10,12,14,16,18,20,22,
        24,26,28,30,0,0,85,0,38,1,0,0,0,2,43,1,0,0,0,4,49,1,0,0,0,6,51,1,
        0,0,0,8,55,1,0,0,0,10,57,1,0,0,0,12,68,1,0,0,0,14,70,1,0,0,0,16,
        72,1,0,0,0,18,74,1,0,0,0,20,76,1,0,0,0,22,78,1,0,0,0,24,80,1,0,0,
        0,26,82,1,0,0,0,28,84,1,0,0,0,30,86,1,0,0,0,32,34,3,2,1,0,33,35,
        5,1,0,0,34,33,1,0,0,0,34,35,1,0,0,0,35,36,1,0,0,0,36,37,5,2,0,0,
        37,39,1,0,0,0,38,32,1,0,0,0,39,40,1,0,0,0,40,38,1,0,0,0,40,41,1,
        0,0,0,41,1,1,0,0,0,42,44,3,4,2,0,43,42,1,0,0,0,44,45,1,0,0,0,45,
        43,1,0,0,0,45,46,1,0,0,0,46,3,1,0,0,0,47,50,3,8,4,0,48,50,3,6,3,
        0,49,47,1,0,0,0,49,48,1,0,0,0,50,5,1,0,0,0,51,52,5,4,0,0,52,7,1,
        0,0,0,53,56,3,10,5,0,54,56,3,12,6,0,55,53,1,0,0,0,55,54,1,0,0,0,
        56,9,1,0,0,0,57,58,5,5,0,0,58,11,1,0,0,0,59,69,3,14,7,0,60,69,3,
        16,8,0,61,69,3,18,9,0,62,69,3,20,10,0,63,69,3,22,11,0,64,69,3,24,
        12,0,65,69,3,26,13,0,66,69,3,28,14,0,67,69,3,30,15,0,68,59,1,0,0,
        0,68,60,1,0,0,0,68,61,1,0,0,0,68,62,1,0,0,0,68,63,1,0,0,0,68,64,
        1,0,0,0,68,65,1,0,0,0,68,66,1,0,0,0,68,67,1,0,0,0,69,13,1,0,0,0,
        70,71,5,6,0,0,71,15,1,0,0,0,72,73,5,7,0,0,73,17,1,0,0,0,74,75,5,
        8,0,0,75,19,1,0,0,0,76,77,5,9,0,0,77,21,1,0,0,0,78,79,5,10,0,0,79,
        23,1,0,0,0,80,81,5,11,0,0,81,25,1,0,0,0,82,83,5,13,0,0,83,27,1,0,
        0,0,84,85,5,14,0,0,85,29,1,0,0,0,86,87,5,15,0,0,87,31,1,0,0,0,6,
        34,40,45,49,55,68
    ]

class ColorParser ( Parser ):

    grammarFileName = "Color.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'\\r'", "'\\n'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'be'o'", "'bei'", 
                     "'be'", "'bi'e'", "<INVALID>", "'boi'", "'bo'", "'bu'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "WS", "LUJVO", 
                      "PA", "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", 
                      "BOI", "BO", "BU" ]

    RULE_folio = 0
    RULE_sentence = 1
    RULE_word = 2
    RULE_lujvo = 3
    RULE_cmavo = 4
    RULE_pa = 5
    RULE_cmavoab = 6
    RULE_a = 7
    RULE_bahe = 8
    RULE_beho = 9
    RULE_bei = 10
    RULE_be = 11
    RULE_bihe = 12
    RULE_boi = 13
    RULE_bo = 14
    RULE_bu = 15

    ruleNames =  [ "folio", "sentence", "word", "lujvo", "cmavo", "pa", 
                   "cmavoab", "a", "bahe", "beho", "bei", "be", "bihe", 
                   "boi", "bo", "bu" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    WS=3
    LUJVO=4
    PA=5
    A=6
    BAHE=7
    BEHO=8
    BEI=9
    BE=10
    BIHE=11
    BIHI=12
    BOI=13
    BO=14
    BU=15

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
            self.state = 38 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 32
                self.sentence()
                self.state = 34
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.T__0:
                    self.state = 33
                    self.match(ColorParser.T__0)


                self.state = 36
                self.match(ColorParser.T__1)
                self.state = 40 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ColorParser.LUJVO) | (1 << ColorParser.PA) | (1 << ColorParser.A) | (1 << ColorParser.BAHE) | (1 << ColorParser.BEHO) | (1 << ColorParser.BEI) | (1 << ColorParser.BE) | (1 << ColorParser.BIHE) | (1 << ColorParser.BOI) | (1 << ColorParser.BO) | (1 << ColorParser.BU))) != 0)):
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
            self.state = 43 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 42
                self.word()
                self.state = 45 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ColorParser.LUJVO) | (1 << ColorParser.PA) | (1 << ColorParser.A) | (1 << ColorParser.BAHE) | (1 << ColorParser.BEHO) | (1 << ColorParser.BEI) | (1 << ColorParser.BE) | (1 << ColorParser.BIHE) | (1 << ColorParser.BOI) | (1 << ColorParser.BO) | (1 << ColorParser.BU))) != 0)):
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
            self.state = 49
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.PA, ColorParser.A, ColorParser.BAHE, ColorParser.BEHO, ColorParser.BEI, ColorParser.BE, ColorParser.BIHE, ColorParser.BOI, ColorParser.BO, ColorParser.BU]:
                self.enterOuterAlt(localctx, 1)
                self.state = 47
                self.cmavo()
                pass
            elif token in [ColorParser.LUJVO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 48
                self.lujvo()
                pass
            else:
                raise NoViableAltException(self)

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

        def LUJVO(self):
            return self.getToken(ColorParser.LUJVO, 0)

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
        self.enterRule(localctx, 6, self.RULE_lujvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(ColorParser.LUJVO)
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

        def pa(self):
            return self.getTypedRuleContext(ColorParser.PaContext,0)


        def cmavoab(self):
            return self.getTypedRuleContext(ColorParser.CmavoabContext,0)


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
        self.enterRule(localctx, 8, self.RULE_cmavo)
        try:
            self.state = 55
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.PA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 53
                self.pa()
                pass
            elif token in [ColorParser.A, ColorParser.BAHE, ColorParser.BEHO, ColorParser.BEI, ColorParser.BE, ColorParser.BIHE, ColorParser.BOI, ColorParser.BO, ColorParser.BU]:
                self.enterOuterAlt(localctx, 2)
                self.state = 54
                self.cmavoab()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PA(self):
            return self.getToken(ColorParser.PA, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_pa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPa" ):
                listener.enterPa(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPa" ):
                listener.exitPa(self)




    def pa(self):

        localctx = ColorParser.PaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_pa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(ColorParser.PA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmavoabContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def a(self):
            return self.getTypedRuleContext(ColorParser.AContext,0)


        def bahe(self):
            return self.getTypedRuleContext(ColorParser.BaheContext,0)


        def beho(self):
            return self.getTypedRuleContext(ColorParser.BehoContext,0)


        def bei(self):
            return self.getTypedRuleContext(ColorParser.BeiContext,0)


        def be(self):
            return self.getTypedRuleContext(ColorParser.BeContext,0)


        def bihe(self):
            return self.getTypedRuleContext(ColorParser.BiheContext,0)


        def boi(self):
            return self.getTypedRuleContext(ColorParser.BoiContext,0)


        def bo(self):
            return self.getTypedRuleContext(ColorParser.BoContext,0)


        def bu(self):
            return self.getTypedRuleContext(ColorParser.BuContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_cmavoab

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmavoab" ):
                listener.enterCmavoab(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmavoab" ):
                listener.exitCmavoab(self)




    def cmavoab(self):

        localctx = ColorParser.CmavoabContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_cmavoab)
        try:
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.A]:
                self.enterOuterAlt(localctx, 1)
                self.state = 59
                self.a()
                pass
            elif token in [ColorParser.BAHE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 60
                self.bahe()
                pass
            elif token in [ColorParser.BEHO]:
                self.enterOuterAlt(localctx, 3)
                self.state = 61
                self.beho()
                pass
            elif token in [ColorParser.BEI]:
                self.enterOuterAlt(localctx, 4)
                self.state = 62
                self.bei()
                pass
            elif token in [ColorParser.BE]:
                self.enterOuterAlt(localctx, 5)
                self.state = 63
                self.be()
                pass
            elif token in [ColorParser.BIHE]:
                self.enterOuterAlt(localctx, 6)
                self.state = 64
                self.bihe()
                pass
            elif token in [ColorParser.BOI]:
                self.enterOuterAlt(localctx, 7)
                self.state = 65
                self.boi()
                pass
            elif token in [ColorParser.BO]:
                self.enterOuterAlt(localctx, 8)
                self.state = 66
                self.bo()
                pass
            elif token in [ColorParser.BU]:
                self.enterOuterAlt(localctx, 9)
                self.state = 67
                self.bu()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def A(self):
            return self.getToken(ColorParser.A, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_a

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterA" ):
                listener.enterA(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitA" ):
                listener.exitA(self)




    def a(self):

        localctx = ColorParser.AContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_a)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(ColorParser.A)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BaheContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BAHE(self):
            return self.getToken(ColorParser.BAHE, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_bahe

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBahe" ):
                listener.enterBahe(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBahe" ):
                listener.exitBahe(self)




    def bahe(self):

        localctx = ColorParser.BaheContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_bahe)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(ColorParser.BAHE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BehoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BEHO(self):
            return self.getToken(ColorParser.BEHO, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_beho

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBeho" ):
                listener.enterBeho(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBeho" ):
                listener.exitBeho(self)




    def beho(self):

        localctx = ColorParser.BehoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_beho)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(ColorParser.BEHO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BeiContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BEI(self):
            return self.getToken(ColorParser.BEI, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_bei

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBei" ):
                listener.enterBei(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBei" ):
                listener.exitBei(self)




    def bei(self):

        localctx = ColorParser.BeiContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_bei)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.match(ColorParser.BEI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BE(self):
            return self.getToken(ColorParser.BE, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_be

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBe" ):
                listener.enterBe(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBe" ):
                listener.exitBe(self)




    def be(self):

        localctx = ColorParser.BeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_be)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(ColorParser.BE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BiheContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BIHE(self):
            return self.getToken(ColorParser.BIHE, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_bihe

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBihe" ):
                listener.enterBihe(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBihe" ):
                listener.exitBihe(self)




    def bihe(self):

        localctx = ColorParser.BiheContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_bihe)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 80
            self.match(ColorParser.BIHE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoiContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOI(self):
            return self.getToken(ColorParser.BOI, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_boi

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoi" ):
                listener.enterBoi(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoi" ):
                listener.exitBoi(self)




    def boi(self):

        localctx = ColorParser.BoiContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_boi)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(ColorParser.BOI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BO(self):
            return self.getToken(ColorParser.BO, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_bo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBo" ):
                listener.enterBo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBo" ):
                listener.exitBo(self)




    def bo(self):

        localctx = ColorParser.BoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_bo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(ColorParser.BO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BU(self):
            return self.getToken(ColorParser.BU, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_bu

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBu" ):
                listener.enterBu(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBu" ):
                listener.exitBu(self)




    def bu(self):

        localctx = ColorParser.BuContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_bu)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(ColorParser.BU)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





