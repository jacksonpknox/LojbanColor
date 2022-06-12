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
        4,1,5,34,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,1,0,3,0,13,
        8,0,1,0,1,0,4,0,17,8,0,11,0,12,0,18,1,1,4,1,22,8,1,11,1,12,1,23,
        1,2,1,2,3,2,28,8,2,1,3,1,3,1,4,1,4,1,4,0,0,5,0,2,4,6,8,0,0,32,0,
        16,1,0,0,0,2,21,1,0,0,0,4,27,1,0,0,0,6,29,1,0,0,0,8,31,1,0,0,0,10,
        12,3,2,1,0,11,13,5,1,0,0,12,11,1,0,0,0,12,13,1,0,0,0,13,14,1,0,0,
        0,14,15,5,2,0,0,15,17,1,0,0,0,16,10,1,0,0,0,17,18,1,0,0,0,18,16,
        1,0,0,0,18,19,1,0,0,0,19,1,1,0,0,0,20,22,3,4,2,0,21,20,1,0,0,0,22,
        23,1,0,0,0,23,21,1,0,0,0,23,24,1,0,0,0,24,3,1,0,0,0,25,28,3,6,3,
        0,26,28,3,8,4,0,27,25,1,0,0,0,27,26,1,0,0,0,28,5,1,0,0,0,29,30,5,
        4,0,0,30,7,1,0,0,0,31,32,5,5,0,0,32,9,1,0,0,0,4,12,18,23,27
    ]

class ColorParser ( Parser ):

    grammarFileName = "Color.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'\\r'", "'\\n'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "WS", "PA", 
                      "LUJVO" ]

    RULE_folio = 0
    RULE_sentence = 1
    RULE_word = 2
    RULE_cmavo = 3
    RULE_lujvo = 4

    ruleNames =  [ "folio", "sentence", "word", "cmavo", "lujvo" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    WS=3
    PA=4
    LUJVO=5

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
            self.state = 16 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self.sentence()
                self.state = 12
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==ColorParser.T__0:
                    self.state = 11
                    self.match(ColorParser.T__0)


                self.state = 14
                self.match(ColorParser.T__1)
                self.state = 18 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ColorParser.PA or _la==ColorParser.LUJVO):
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
            self.state = 21 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 20
                self.word()
                self.state = 23 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==ColorParser.PA or _la==ColorParser.LUJVO):
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
            self.state = 27
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ColorParser.PA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 25
                self.cmavo()
                pass
            elif token in [ColorParser.LUJVO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 26
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
            self.state = 29
            self.match(ColorParser.PA)
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
        self.enterRule(localctx, 8, self.RULE_lujvo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(ColorParser.LUJVO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





