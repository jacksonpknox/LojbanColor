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
        4,1,9,62,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,
        2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,3,0,23,8,0,1,0,1,0,4,0,27,8,0,11,
        0,12,0,28,1,0,1,0,1,1,5,1,34,8,1,10,1,12,1,37,9,1,1,2,1,2,1,2,1,
        2,1,2,3,2,44,8,2,1,3,1,3,1,4,1,4,3,4,50,8,4,1,5,1,5,1,6,1,6,1,7,
        1,7,1,8,1,8,1,9,1,9,1,9,0,0,10,0,2,4,6,8,10,12,14,16,18,0,0,59,0,
        26,1,0,0,0,2,35,1,0,0,0,4,43,1,0,0,0,6,45,1,0,0,0,8,49,1,0,0,0,10,
        51,1,0,0,0,12,53,1,0,0,0,14,55,1,0,0,0,16,57,1,0,0,0,18,59,1,0,0,
        0,20,22,3,2,1,0,21,23,5,1,0,0,22,21,1,0,0,0,22,23,1,0,0,0,23,24,
        1,0,0,0,24,25,5,2,0,0,25,27,1,0,0,0,26,20,1,0,0,0,27,28,1,0,0,0,
        28,26,1,0,0,0,28,29,1,0,0,0,29,30,1,0,0,0,30,31,5,0,0,1,31,1,1,0,
        0,0,32,34,3,4,2,0,33,32,1,0,0,0,34,37,1,0,0,0,35,33,1,0,0,0,35,36,
        1,0,0,0,36,3,1,0,0,0,37,35,1,0,0,0,38,44,3,14,7,0,39,44,3,8,4,0,
        40,44,3,6,3,0,41,44,3,16,8,0,42,44,3,18,9,0,43,38,1,0,0,0,43,39,
        1,0,0,0,43,40,1,0,0,0,43,41,1,0,0,0,43,42,1,0,0,0,44,5,1,0,0,0,45,
        46,5,3,0,0,46,7,1,0,0,0,47,50,3,10,5,0,48,50,3,12,6,0,49,47,1,0,
        0,0,49,48,1,0,0,0,50,9,1,0,0,0,51,52,5,6,0,0,52,11,1,0,0,0,53,54,
        5,5,0,0,54,13,1,0,0,0,55,56,5,7,0,0,56,15,1,0,0,0,57,58,5,8,0,0,
        58,17,1,0,0,0,59,60,5,9,0,0,60,19,1,0,0,0,5,22,28,35,43,49
    ]

class ColorParser ( Parser ):

    grammarFileName = "Color.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'\\r'", "'\\n'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "CMENE", "WS", 
                      "GISMU", "LUJVO", "CMAVO", "COMPMO", "FUHIVLA" ]

    RULE_folio = 0
    RULE_sentence = 1
    RULE_word = 2
    RULE_cmene = 3
    RULE_brivla = 4
    RULE_lujvo = 5
    RULE_gismu = 6
    RULE_cmavo = 7
    RULE_compmo = 8
    RULE_fuhivla = 9

    ruleNames =  [ "folio", "sentence", "word", "cmene", "brivla", "lujvo", 
                   "gismu", "cmavo", "compmo", "fuhivla" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    CMENE=3
    WS=4
    GISMU=5
    LUJVO=6
    CMAVO=7
    COMPMO=8
    FUHIVLA=9

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

        def EOF(self):
            return self.getToken(ColorParser.EOF, 0)

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
            self.state = 26 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.sentence()
                self.state = 22
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.T__0:
                    self.state = 21
                    self.match(ColorParser.T__0)


                self.state = 24
                self.match(ColorParser.T__1)
                self.state = 28 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ColorParser.T__0) | (1 << ColorParser.T__1) | (1 << ColorParser.CMENE) | (1 << ColorParser.GISMU) | (1 << ColorParser.LUJVO) | (1 << ColorParser.CMAVO) | (1 << ColorParser.COMPMO) | (1 << ColorParser.FUHIVLA))) != 0)):
                    break

            self.state = 30
            self.match(ColorParser.EOF)
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
            self.state = 35
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << ColorParser.CMENE) | (1 << ColorParser.GISMU) | (1 << ColorParser.LUJVO) | (1 << ColorParser.CMAVO) | (1 << ColorParser.COMPMO) | (1 << ColorParser.FUHIVLA))) != 0):
                self.state = 32
                self.word()
                self.state = 37
                self._errHandler.sync(self)
                _la = self._input.LA(1)

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


        def brivla(self):
            return self.getTypedRuleContext(ColorParser.BrivlaContext,0)


        def cmene(self):
            return self.getTypedRuleContext(ColorParser.CmeneContext,0)


        def compmo(self):
            return self.getTypedRuleContext(ColorParser.CompmoContext,0)


        def fuhivla(self):
            return self.getTypedRuleContext(ColorParser.FuhivlaContext,0)


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
            self.state = 43
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.CMAVO]:
                self.enterOuterAlt(localctx, 1)
                self.state = 38
                self.cmavo()
                pass
            elif token in [ColorParser.GISMU, ColorParser.LUJVO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 39
                self.brivla()
                pass
            elif token in [ColorParser.CMENE]:
                self.enterOuterAlt(localctx, 3)
                self.state = 40
                self.cmene()
                pass
            elif token in [ColorParser.COMPMO]:
                self.enterOuterAlt(localctx, 4)
                self.state = 41
                self.compmo()
                pass
            elif token in [ColorParser.FUHIVLA]:
                self.enterOuterAlt(localctx, 5)
                self.state = 42
                self.fuhivla()
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


    class CmeneContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CMENE(self):
            return self.getToken(ColorParser.CMENE, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_cmene

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmene" ):
                listener.enterCmene(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmene" ):
                listener.exitCmene(self)




    def cmene(self):

        localctx = ColorParser.CmeneContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_cmene)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 45
            self.match(ColorParser.CMENE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BrivlaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lujvo(self):
            return self.getTypedRuleContext(ColorParser.LujvoContext,0)


        def gismu(self):
            return self.getTypedRuleContext(ColorParser.GismuContext,0)


        def getRuleIndex(self):
            return ColorParser.RULE_brivla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBrivla" ):
                listener.enterBrivla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBrivla" ):
                listener.exitBrivla(self)




    def brivla(self):

        localctx = ColorParser.BrivlaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_brivla)
        try:
            self.state = 49
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.LUJVO]:
                self.enterOuterAlt(localctx, 1)
                self.state = 47
                self.lujvo()
                pass
            elif token in [ColorParser.GISMU]:
                self.enterOuterAlt(localctx, 2)
                self.state = 48
                self.gismu()
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
        self.enterRule(localctx, 10, self.RULE_lujvo)
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


    class GismuContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def GISMU(self):
            return self.getToken(ColorParser.GISMU, 0)

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
        self.enterRule(localctx, 12, self.RULE_gismu)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(ColorParser.GISMU)
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

        def CMAVO(self):
            return self.getToken(ColorParser.CMAVO, 0)

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
        self.enterRule(localctx, 14, self.RULE_cmavo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(ColorParser.CMAVO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompmoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMPMO(self):
            return self.getToken(ColorParser.COMPMO, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_compmo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompmo" ):
                listener.enterCompmo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompmo" ):
                listener.exitCompmo(self)




    def compmo(self):

        localctx = ColorParser.CompmoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_compmo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(ColorParser.COMPMO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuhivlaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUHIVLA(self):
            return self.getToken(ColorParser.FUHIVLA, 0)

        def getRuleIndex(self):
            return ColorParser.RULE_fuhivla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuhivla" ):
                listener.enterFuhivla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuhivla" ):
                listener.exitFuhivla(self)




    def fuhivla(self):

        localctx = ColorParser.FuhivlaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_fuhivla)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.match(ColorParser.FUHIVLA)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





