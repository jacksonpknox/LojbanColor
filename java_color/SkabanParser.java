// Generated from Skaban.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkabanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NEWLINE=2, DOT=3, C=4, V=5, Y=6, AP=7, EXTRA=8;
	public static final int
		RULE_folio = 0, RULE_line = 1, RULE_end = 2, RULE_flufftence = 3, RULE_sentence = 4, 
		RULE_word = 5, RULE_cmavo = 6, RULE_jonvla = 7, RULE_cmene = 8, RULE_karmaho = 9, 
		RULE_lerfu = 10, RULE_brivla = 11, RULE_gismu = 12, RULE_lujvo = 13, RULE_kargismu = 14, 
		RULE_gahorgismu = 15, RULE_bobvo = 16, RULE_cobvo = 17, RULE_dobvo = 18, 
		RULE_fobvo = 19, RULE_gobvo = 20, RULE_balrelraf = 21, RULE_jvorebla = 22, 
		RULE_relraf = 23, RULE_gimsygenja = 24, RULE_rafgimpag = 25, RULE_balraf = 26, 
		RULE_broraf = 27, RULE_bauraf = 28, RULE_karlraf = 29, RULE_karlrelraf = 30, 
		RULE_gahorgimsygenja = 31, RULE_kargimsygenja = 32, RULE_q = 33, RULE_y = 34, 
		RULE_fuhivla = 35, RULE_anychar = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "line", "end", "flufftence", "sentence", "word", "cmavo", "jonvla", 
			"cmene", "karmaho", "lerfu", "brivla", "gismu", "lujvo", "kargismu", 
			"gahorgismu", "bobvo", "cobvo", "dobvo", "fobvo", "gobvo", "balrelraf", 
			"jvorebla", "relraf", "gimsygenja", "rafgimpag", "balraf", "broraf", 
			"bauraf", "karlraf", "karlrelraf", "gahorgimsygenja", "kargimsygenja", 
			"q", "y", "fuhivla", "anychar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'.'", null, null, "'y'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NEWLINE", "DOT", "C", "V", "Y", "AP", "EXTRA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Skaban.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkabanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FolioContext extends ParserRuleContext {
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterFolio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitFolio(this);
		}
	}

	public final FolioContext folio() throws RecognitionException {
		FolioContext _localctx = new FolioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_folio);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					line();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(80);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public FlufftenceContext flufftence() {
			return getRuleContext(FlufftenceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SkabanParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			flufftence();
			setState(83);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public FlufftenceContext flufftence() {
			return getRuleContext(FlufftenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SkabanParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			flufftence();
			setState(86);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlufftenceContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(SkabanParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SkabanParser.WS, i);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public FlufftenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flufftence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterFlufftence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitFlufftence(this);
		}
	}

	public final FlufftenceContext flufftence() throws RecognitionException {
		FlufftenceContext _localctx = new FlufftenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_flufftence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(88);
				match(WS);
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << C) | (1L << V) | (1L << Y) | (1L << AP) | (1L << EXTRA))) != 0)) {
				{
				setState(91);
				sentence();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(94);
				match(WS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(SkabanParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SkabanParser.WS, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			word();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(WS);
					setState(99);
					word();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public CmavoContext cmavo() {
			return getRuleContext(CmavoContext.class,0);
		}
		public JonvlaContext jonvla() {
			return getRuleContext(JonvlaContext.class,0);
		}
		public BrivlaContext brivla() {
			return getRuleContext(BrivlaContext.class,0);
		}
		public CmeneContext cmene() {
			return getRuleContext(CmeneContext.class,0);
		}
		public FuhivlaContext fuhivla() {
			return getRuleContext(FuhivlaContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				jonvla();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				brivla();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				cmene();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				fuhivla();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmavoContext extends ParserRuleContext {
		public KarmahoContext karmaho() {
			return getRuleContext(KarmahoContext.class,0);
		}
		public LerfuContext lerfu() {
			return getRuleContext(LerfuContext.class,0);
		}
		public CmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterCmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitCmavo(this);
		}
	}

	public final CmavoContext cmavo() throws RecognitionException {
		CmavoContext _localctx = new CmavoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmavo);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				karmaho();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				lerfu();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JonvlaContext extends ParserRuleContext {
		public List<CmavoContext> cmavo() {
			return getRuleContexts(CmavoContext.class);
		}
		public CmavoContext cmavo(int i) {
			return getRuleContext(CmavoContext.class,i);
		}
		public JonvlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jonvla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterJonvla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitJonvla(this);
		}
	}

	public final JonvlaContext jonvla() throws RecognitionException {
		JonvlaContext _localctx = new JonvlaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jonvla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			cmavo();
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				cmavo();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT || _la==C );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmeneContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SkabanParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SkabanParser.DOT, i);
		}
		public List<TerminalNode> V() { return getTokens(SkabanParser.V); }
		public TerminalNode V(int i) {
			return getToken(SkabanParser.V, i);
		}
		public CmeneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterCmene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitCmene(this);
		}
	}

	public final CmeneContext cmene() throws RecognitionException {
		CmeneContext _localctx = new CmeneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(122);
				match(DOT);
				}
			}

			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					_la = _input.LA(1);
					if ( !(_la==C || _la==V) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(131);
			match(C);
			setState(132);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmahoContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(SkabanParser.V); }
		public TerminalNode V(int i) {
			return getToken(SkabanParser.V, i);
		}
		public TerminalNode DOT() { return getToken(SkabanParser.DOT, 0); }
		public TerminalNode C() { return getToken(SkabanParser.C, 0); }
		public List<TerminalNode> AP() { return getTokens(SkabanParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(SkabanParser.AP, i);
		}
		public KarmahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterKarmaho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitKarmaho(this);
		}
	}

	public final KarmahoContext karmaho() throws RecognitionException {
		KarmahoContext _localctx = new KarmahoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_karmaho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==C) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(V);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V || _la==AP) {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==V || _la==AP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LerfuContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(SkabanParser.C, 0); }
		public TerminalNode Y() { return getToken(SkabanParser.Y, 0); }
		public TerminalNode DOT() { return getToken(SkabanParser.DOT, 0); }
		public LerfuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerfu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterLerfu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitLerfu(this);
		}
	}

	public final LerfuContext lerfu() throws RecognitionException {
		LerfuContext _localctx = new LerfuContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lerfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(C);
			setState(143);
			match(Y);
			setState(144);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrivlaContext extends ParserRuleContext {
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public LujvoContext lujvo() {
			return getRuleContext(LujvoContext.class,0);
		}
		public BrivlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brivla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBrivla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBrivla(this);
		}
	}

	public final BrivlaContext brivla() throws RecognitionException {
		BrivlaContext _localctx = new BrivlaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_brivla);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				lujvo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GismuContext extends ParserRuleContext {
		public KargismuContext kargismu() {
			return getRuleContext(KargismuContext.class,0);
		}
		public GahorgismuContext gahorgismu() {
			return getRuleContext(GahorgismuContext.class,0);
		}
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterGismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitGismu(this);
		}
	}

	public final GismuContext gismu() throws RecognitionException {
		GismuContext _localctx = new GismuContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_gismu);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				kargismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				gahorgismu();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LujvoContext extends ParserRuleContext {
		public BobvoContext bobvo() {
			return getRuleContext(BobvoContext.class,0);
		}
		public CobvoContext cobvo() {
			return getRuleContext(CobvoContext.class,0);
		}
		public DobvoContext dobvo() {
			return getRuleContext(DobvoContext.class,0);
		}
		public FobvoContext fobvo() {
			return getRuleContext(FobvoContext.class,0);
		}
		public GobvoContext gobvo() {
			return getRuleContext(GobvoContext.class,0);
		}
		public LujvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lujvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterLujvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitLujvo(this);
		}
	}

	public final LujvoContext lujvo() throws RecognitionException {
		LujvoContext _localctx = new LujvoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lujvo);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				fobvo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				gobvo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KargismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(SkabanParser.V); }
		public TerminalNode V(int i) {
			return getToken(SkabanParser.V, i);
		}
		public KargismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kargismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterKargismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitKargismu(this);
		}
	}

	public final KargismuContext kargismu() throws RecognitionException {
		KargismuContext _localctx = new KargismuContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_kargismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(C);
			setState(162);
			match(V);
			setState(163);
			match(C);
			setState(164);
			match(C);
			setState(165);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GahorgismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(SkabanParser.V); }
		public TerminalNode V(int i) {
			return getToken(SkabanParser.V, i);
		}
		public GahorgismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gahorgismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterGahorgismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitGahorgismu(this);
		}
	}

	public final GahorgismuContext gahorgismu() throws RecognitionException {
		GahorgismuContext _localctx = new GahorgismuContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gahorgismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(C);
			setState(168);
			match(C);
			setState(169);
			match(V);
			setState(170);
			match(C);
			setState(171);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BobvoContext extends ParserRuleContext {
		public BalrelrafContext balrelraf() {
			return getRuleContext(BalrelrafContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public JvoreblaContext jvorebla() {
			return getRuleContext(JvoreblaContext.class,0);
		}
		public BobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBobvo(this);
		}
	}

	public final BobvoContext bobvo() throws RecognitionException {
		BobvoContext _localctx = new BobvoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			balrelraf();
			setState(174);
			y();
			setState(175);
			jvorebla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CobvoContext extends ParserRuleContext {
		public RelrafContext relraf() {
			return getRuleContext(RelrafContext.class,0);
		}
		public JvoreblaContext jvorebla() {
			return getRuleContext(JvoreblaContext.class,0);
		}
		public CobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterCobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitCobvo(this);
		}
	}

	public final CobvoContext cobvo() throws RecognitionException {
		CobvoContext _localctx = new CobvoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			relraf();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(178);
				jvorebla();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DobvoContext extends ParserRuleContext {
		public GimsygenjaContext gimsygenja() {
			return getRuleContext(GimsygenjaContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public JvoreblaContext jvorebla() {
			return getRuleContext(JvoreblaContext.class,0);
		}
		public DobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterDobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitDobvo(this);
		}
	}

	public final DobvoContext dobvo() throws RecognitionException {
		DobvoContext _localctx = new DobvoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			gimsygenja();
			setState(182);
			y();
			setState(183);
			jvorebla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FobvoContext extends ParserRuleContext {
		public RafgimpagContext rafgimpag() {
			return getRuleContext(RafgimpagContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public JvoreblaContext jvorebla() {
			return getRuleContext(JvoreblaContext.class,0);
		}
		public FobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterFobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitFobvo(this);
		}
	}

	public final FobvoContext fobvo() throws RecognitionException {
		FobvoContext _localctx = new FobvoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			rafgimpag();
			setState(186);
			y();
			setState(187);
			jvorebla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GobvoContext extends ParserRuleContext {
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public BrorafContext broraf() {
			return getRuleContext(BrorafContext.class,0);
		}
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public KargismuContext kargismu() {
			return getRuleContext(KargismuContext.class,0);
		}
		public GahorgismuContext gahorgismu() {
			return getRuleContext(GahorgismuContext.class,0);
		}
		public GobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterGobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitGobvo(this);
		}
	}

	public final GobvoContext gobvo() throws RecognitionException {
		GobvoContext _localctx = new GobvoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gobvo);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				balraf();
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(190);
					q();
					}
					break;
				case 2:
					{
					setState(191);
					y();
					}
					break;
				}
				setState(194);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				broraf();
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(197);
					q();
					}
					break;
				}
				setState(200);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				bauraf();
				setState(203);
				q();
				setState(204);
				kargismu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				bauraf();
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(207);
					q();
					}
					break;
				}
				setState(210);
				gahorgismu();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalrelrafContext extends ParserRuleContext {
		public List<BalrafContext> balraf() {
			return getRuleContexts(BalrafContext.class);
		}
		public BalrafContext balraf(int i) {
			return getRuleContext(BalrafContext.class,i);
		}
		public BrorafContext broraf() {
			return getRuleContext(BrorafContext.class,0);
		}
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public BalrelrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balrelraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBalrelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBalrelraf(this);
		}
	}

	public final BalrelrafContext balrelraf() throws RecognitionException {
		BalrelrafContext _localctx = new BalrelrafContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_balrelraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(214);
				balraf();
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(215);
					q();
					}
					break;
				case 2:
					{
					setState(216);
					y();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(219);
				broraf();
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(220);
					q();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(223);
				bauraf();
				setState(224);
				q();
				}
				break;
			}
			setState(228);
			balraf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JvoreblaContext extends ParserRuleContext {
		public List<KarlrafContext> karlraf() {
			return getRuleContexts(KarlrafContext.class);
		}
		public KarlrafContext karlraf(int i) {
			return getRuleContext(KarlrafContext.class,i);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public List<BalrafContext> balraf() {
			return getRuleContexts(BalrafContext.class);
		}
		public BalrafContext balraf(int i) {
			return getRuleContext(BalrafContext.class,i);
		}
		public List<GimsygenjaContext> gimsygenja() {
			return getRuleContexts(GimsygenjaContext.class);
		}
		public GimsygenjaContext gimsygenja(int i) {
			return getRuleContext(GimsygenjaContext.class,i);
		}
		public List<YContext> y() {
			return getRuleContexts(YContext.class);
		}
		public YContext y(int i) {
			return getRuleContext(YContext.class,i);
		}
		public JvoreblaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jvorebla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterJvorebla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitJvorebla(this);
		}
	}

	public final JvoreblaContext jvorebla() throws RecognitionException {
		JvoreblaContext _localctx = new JvoreblaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jvorebla);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(230);
						balraf();
						setState(232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(231);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(234);
						gimsygenja();
						setState(235);
						y();
						}
						break;
					case 3:
						{
						setState(237);
						karlraf();
						}
						break;
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(243);
				karlraf();
				}
				break;
			case 2:
				{
				setState(244);
				gismu();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelrafContext extends ParserRuleContext {
		public BalrelrafContext balrelraf() {
			return getRuleContext(BalrelrafContext.class,0);
		}
		public KarlrelrafContext karlrelraf() {
			return getRuleContext(KarlrelrafContext.class,0);
		}
		public RelrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterRelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitRelraf(this);
		}
	}

	public final RelrafContext relraf() throws RecognitionException {
		RelrafContext _localctx = new RelrafContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relraf);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				balrelraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				karlrelraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GimsygenjaContext extends ParserRuleContext {
		public GahorgimsygenjaContext gahorgimsygenja() {
			return getRuleContext(GahorgimsygenjaContext.class,0);
		}
		public KargimsygenjaContext kargimsygenja() {
			return getRuleContext(KargimsygenjaContext.class,0);
		}
		public GimsygenjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gimsygenja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterGimsygenja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitGimsygenja(this);
		}
	}

	public final GimsygenjaContext gimsygenja() throws RecognitionException {
		GimsygenjaContext _localctx = new GimsygenjaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gimsygenja);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				gahorgimsygenja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				kargimsygenja();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RafgimpagContext extends ParserRuleContext {
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
		}
		public GimsygenjaContext gimsygenja() {
			return getRuleContext(GimsygenjaContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public KarlrafContext karlraf() {
			return getRuleContext(KarlrafContext.class,0);
		}
		public KargimsygenjaContext kargimsygenja() {
			return getRuleContext(KargimsygenjaContext.class,0);
		}
		public GahorgimsygenjaContext gahorgimsygenja() {
			return getRuleContext(GahorgimsygenjaContext.class,0);
		}
		public RafgimpagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rafgimpag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterRafgimpag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitRafgimpag(this);
		}
	}

	public final RafgimpagContext rafgimpag() throws RecognitionException {
		RafgimpagContext _localctx = new RafgimpagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rafgimpag);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				balraf();
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(256);
					q();
					}
					break;
				}
				setState(259);
				gimsygenja();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				karlraf();
				setState(262);
				q();
				setState(263);
				kargimsygenja();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				karlraf();
				setState(266);
				gahorgimsygenja();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public TerminalNode V() { return getToken(SkabanParser.V, 0); }
		public BalrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBalraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBalraf(this);
		}
	}

	public final BalrafContext balraf() throws RecognitionException {
		BalrafContext _localctx = new BalrafContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(C);
			setState(271);
			match(V);
			setState(272);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrorafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public TerminalNode V() { return getToken(SkabanParser.V, 0); }
		public BrorafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBroraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBroraf(this);
		}
	}

	public final BrorafContext broraf() throws RecognitionException {
		BrorafContext _localctx = new BrorafContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(C);
			setState(275);
			match(C);
			setState(276);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaurafContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(SkabanParser.C, 0); }
		public List<TerminalNode> V() { return getTokens(SkabanParser.V); }
		public TerminalNode V(int i) {
			return getToken(SkabanParser.V, i);
		}
		public TerminalNode AP() { return getToken(SkabanParser.AP, 0); }
		public BaurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bauraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterBauraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitBauraf(this);
		}
	}

	public final BaurafContext bauraf() throws RecognitionException {
		BaurafContext _localctx = new BaurafContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(C);
			setState(279);
			match(V);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(280);
				match(AP);
				}
			}

			setState(283);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarlrafContext extends ParserRuleContext {
		public BrorafContext broraf() {
			return getRuleContext(BrorafContext.class,0);
		}
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public KarlrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karlraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterKarlraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitKarlraf(this);
		}
	}

	public final KarlrafContext karlraf() throws RecognitionException {
		KarlrafContext _localctx = new KarlrafContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_karlraf);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				bauraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarlrelrafContext extends ParserRuleContext {
		public List<BrorafContext> broraf() {
			return getRuleContexts(BrorafContext.class);
		}
		public BrorafContext broraf(int i) {
			return getRuleContext(BrorafContext.class,i);
		}
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
		}
		public List<BaurafContext> bauraf() {
			return getRuleContexts(BaurafContext.class);
		}
		public BaurafContext bauraf(int i) {
			return getRuleContext(BaurafContext.class,i);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public KarlrelrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karlrelraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterKarlrelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitKarlrelraf(this);
		}
	}

	public final KarlrelrafContext karlrelraf() throws RecognitionException {
		KarlrelrafContext _localctx = new KarlrelrafContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_karlrelraf);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(289);
					balraf();
					setState(292);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(290);
						q();
						}
						break;
					case 2:
						{
						setState(291);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(294);
					broraf();
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(295);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(298);
					bauraf();
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(299);
						q();
						}
						break;
					}
					}
					break;
				}
				setState(304);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(306);
					balraf();
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(307);
						q();
						}
						break;
					case 2:
						{
						setState(308);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(311);
					broraf();
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(312);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(315);
					bauraf();
					setState(316);
					q();
					}
					break;
				}
				setState(320);
				bauraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GahorgimsygenjaContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public TerminalNode V() { return getToken(SkabanParser.V, 0); }
		public GahorgimsygenjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gahorgimsygenja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterGahorgimsygenja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitGahorgimsygenja(this);
		}
	}

	public final GahorgimsygenjaContext gahorgimsygenja() throws RecognitionException {
		GahorgimsygenjaContext _localctx = new GahorgimsygenjaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gahorgimsygenja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(C);
			setState(325);
			match(C);
			setState(326);
			match(V);
			setState(327);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KargimsygenjaContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(SkabanParser.C); }
		public TerminalNode C(int i) {
			return getToken(SkabanParser.C, i);
		}
		public TerminalNode V() { return getToken(SkabanParser.V, 0); }
		public KargimsygenjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kargimsygenja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterKargimsygenja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitKargimsygenja(this);
		}
	}

	public final KargimsygenjaContext kargimsygenja() throws RecognitionException {
		KargimsygenjaContext _localctx = new KargimsygenjaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_kargimsygenja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(C);
			setState(330);
			match(V);
			setState(331);
			match(C);
			setState(332);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(SkabanParser.C, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(SkabanParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(Y);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuhivlaContext extends ParserRuleContext {
		public List<AnycharContext> anychar() {
			return getRuleContexts(AnycharContext.class);
		}
		public AnycharContext anychar(int i) {
			return getRuleContext(AnycharContext.class,i);
		}
		public FuhivlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuhivla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterFuhivla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitFuhivla(this);
		}
	}

	public final FuhivlaContext fuhivla() throws RecognitionException {
		FuhivlaContext _localctx = new FuhivlaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fuhivla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				anychar();
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << C) | (1L << V) | (1L << Y) | (1L << AP) | (1L << EXTRA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnycharContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(SkabanParser.C, 0); }
		public TerminalNode V() { return getToken(SkabanParser.V, 0); }
		public TerminalNode DOT() { return getToken(SkabanParser.DOT, 0); }
		public TerminalNode Y() { return getToken(SkabanParser.Y, 0); }
		public TerminalNode AP() { return getToken(SkabanParser.AP, 0); }
		public TerminalNode EXTRA() { return getToken(SkabanParser.EXTRA, 0); }
		public AnycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).enterAnychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkabanListener ) ((SkabanListener)listener).exitAnychar(this);
		}
	}

	public final AnycharContext anychar() throws RecognitionException {
		AnycharContext _localctx = new AnycharContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_anychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << C) | (1L << V) | (1L << Y) | (1L << AP) | (1L << EXTRA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b\u015a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003Z\b\u0003"+
		"\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005o\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0004\u0007w\b\u0007\u000b\u0007\f\u0007x\u0001\b\u0003\b"+
		"|\b\b\u0001\b\u0005\b\u007f\b\b\n\b\f\b\u0082\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u0099\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00b4\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c1\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00c7\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00d1\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d5"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00da\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00de\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00e3\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00e9\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00ef\b\u0016\n\u0016\f\u0016\u00f2\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00f6\b\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00fa\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00fe\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0102\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u010d\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u011a\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0120\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0125\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0129\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u012d\b\u001e\u0003"+
		"\u001e\u012f\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0136\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u013a"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u013f\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0143\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0004#\u0154\b#\u000b#\f#\u0155"+
		"\u0001$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"H\u0000\u0004\u0001\u0000\u0004\u0005\u0001\u0000\u0003\u0004\u0002\u0000"+
		"\u0005\u0005\u0007\u0007\u0001\u0000\u0003\b\u016e\u0000M\u0001\u0000"+
		"\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000"+
		"\u0006Y\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\nn\u0001\u0000"+
		"\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000"+
		"\u0010{\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014"+
		"\u008e\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000\u0000\u0018"+
		"\u0098\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000\u0000\u0000\u001c"+
		"\u00a1\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 \u00ad"+
		"\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000\u0000\u0000$\u00b5\u0001"+
		"\u0000\u0000\u0000&\u00b9\u0001\u0000\u0000\u0000(\u00d4\u0001\u0000\u0000"+
		"\u0000*\u00e2\u0001\u0000\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000."+
		"\u00f9\u0001\u0000\u0000\u00000\u00fd\u0001\u0000\u0000\u00002\u010c\u0001"+
		"\u0000\u0000\u00004\u010e\u0001\u0000\u0000\u00006\u0112\u0001\u0000\u0000"+
		"\u00008\u0116\u0001\u0000\u0000\u0000:\u011f\u0001\u0000\u0000\u0000<"+
		"\u0142\u0001\u0000\u0000\u0000>\u0144\u0001\u0000\u0000\u0000@\u0149\u0001"+
		"\u0000\u0000\u0000B\u014e\u0001\u0000\u0000\u0000D\u0150\u0001\u0000\u0000"+
		"\u0000F\u0153\u0001\u0000\u0000\u0000H\u0157\u0001\u0000\u0000\u0000J"+
		"L\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0003\u0004\u0002\u0000Q\u0001"+
		"\u0001\u0000\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005\u0002\u0000"+
		"\u0000T\u0003\u0001\u0000\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0005"+
		"\u0000\u0000\u0001W\u0005\u0001\u0000\u0000\u0000XZ\u0005\u0001\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[]\u0003\b\u0004\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0005\u0001\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000af\u0003\n\u0005\u0000bc\u0005\u0001\u0000\u0000ce\u0003\n"+
		"\u0005\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000io\u0003\f\u0006\u0000jo\u0003\u000e\u0007\u0000"+
		"ko\u0003\u0016\u000b\u0000lo\u0003\u0010\b\u0000mo\u0003F#\u0000ni\u0001"+
		"\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u000b\u0001\u0000"+
		"\u0000\u0000ps\u0003\u0012\t\u0000qs\u0003\u0014\n\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000tv\u0003"+
		"\f\u0006\u0000uw\u0003\f\u0006\u0000vu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\u000f\u0001\u0000\u0000\u0000z|\u0005\u0003\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0080\u0001\u0000\u0000\u0000"+
		"}\u007f\u0007\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0005"+
		"\u0003\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0087\u0007"+
		"\u0001\u0000\u0000\u0087\u008b\u0005\u0005\u0000\u0000\u0088\u008a\u0007"+
		"\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0005"+
		"\u0006\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0015\u0001"+
		"\u0000\u0000\u0000\u0092\u0095\u0003\u0018\f\u0000\u0093\u0095\u0003\u001a"+
		"\r\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0017\u0001\u0000\u0000\u0000\u0096\u0099\u0003\u001c\u000e"+
		"\u0000\u0097\u0099\u0003\u001e\u000f\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0019\u0001\u0000\u0000"+
		"\u0000\u009a\u00a0\u0003 \u0010\u0000\u009b\u00a0\u0003\"\u0011\u0000"+
		"\u009c\u00a0\u0003$\u0012\u0000\u009d\u00a0\u0003&\u0013\u0000\u009e\u00a0"+
		"\u0003(\u0014\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001"+
		"\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u001b\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0004\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0005\u0000\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0004\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000\u0000\u00a6\u001d\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0004\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0004\u0000\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u001f\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0003*\u0015\u0000\u00ae\u00af\u0003D\""+
		"\u0000\u00af\u00b0\u0003,\u0016\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0003.\u0017\u0000\u00b2\u00b4\u0003,\u0016\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4#\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u00030\u0018\u0000\u00b6\u00b7\u0003D\"\u0000"+
		"\u00b7\u00b8\u0003,\u0016\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u00032\u0019\u0000\u00ba\u00bb\u0003D\"\u0000\u00bb\u00bc\u0003,\u0016"+
		"\u0000\u00bc\'\u0001\u0000\u0000\u0000\u00bd\u00c0\u00034\u001a\u0000"+
		"\u00be\u00c1\u0003B!\u0000\u00bf\u00c1\u0003D\"\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0018\f\u0000\u00c3\u00d5\u0001\u0000\u0000\u0000\u00c4\u00c6\u00036"+
		"\u001b\u0000\u00c5\u00c7\u0003B!\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0003\u0018\f\u0000\u00c9\u00d5\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u00038\u001c\u0000\u00cb\u00cc\u0003B!\u0000\u00cc\u00cd\u0003"+
		"\u001c\u000e\u0000\u00cd\u00d5\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003"+
		"8\u001c\u0000\u00cf\u00d1\u0003B!\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0003\u001e\u000f\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00bd\u0001\u0000\u0000\u0000\u00d4\u00c4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d5)\u0001\u0000\u0000\u0000\u00d6\u00d9\u00034\u001a\u0000\u00d7"+
		"\u00da\u0003B!\u0000\u00d8\u00da\u0003D\"\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u00e3\u0001\u0000\u0000\u0000\u00db\u00dd\u00036\u001b"+
		"\u0000\u00dc\u00de\u0003B!\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e3\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u00038\u001c\u0000\u00e0\u00e1\u0003B!\u0000\u00e1\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2\u00db\u0001"+
		"\u0000\u0000\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u00034\u001a\u0000\u00e5+\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u00034\u001a\u0000\u00e7\u00e9\u0003D\"\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ea\u00eb\u00030\u0018\u0000\u00eb\u00ec"+
		"\u0003D\"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003"+
		":\u001d\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f6\u0003:\u001d\u0000\u00f4\u00f6\u0003\u0018\f"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6-\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003*\u0015\u0000\u00f8"+
		"\u00fa\u0003<\u001e\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003"+
		">\u001f\u0000\u00fc\u00fe\u0003@ \u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe1\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u00034\u001a\u0000\u0100\u0102\u0003B!\u0000\u0101\u0100"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u00030\u0018\u0000\u0104\u010d\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0003:\u001d\u0000\u0106\u0107\u0003B!"+
		"\u0000\u0107\u0108\u0003@ \u0000\u0108\u010d\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0003:\u001d\u0000\u010a\u010b\u0003>\u001f\u0000\u010b\u010d\u0001"+
		"\u0000\u0000\u0000\u010c\u00ff\u0001\u0000\u0000\u0000\u010c\u0105\u0001"+
		"\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d3\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0004\u0000\u0000\u010f\u0110\u0005\u0005"+
		"\u0000\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u01115\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005\u0004\u0000\u0000\u0113\u0114\u0005\u0004\u0000"+
		"\u0000\u0114\u0115\u0005\u0005\u0000\u0000\u01157\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u0004\u0000\u0000\u0117\u0119\u0005\u0005\u0000\u0000"+
		"\u0118\u011a\u0005\u0007\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005\u0005\u0000\u0000\u011c9\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u00036\u001b\u0000\u011e\u0120\u00038\u001c\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120;\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u00034\u001a\u0000\u0122\u0125\u0003B!\u0000"+
		"\u0123\u0125\u0003D\"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u012f\u0001\u0000\u0000\u0000\u0126\u0128\u00036\u001b\u0000\u0127\u0129"+
		"\u0003B!\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012f\u0001\u0000\u0000\u0000\u012a\u012c\u00038\u001c"+
		"\u0000\u012b\u012d\u0003B!\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e"+
		"\u0121\u0001\u0000\u0000\u0000\u012e\u0126\u0001\u0000\u0000\u0000\u012e"+
		"\u012a\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u00036\u001b\u0000\u0131\u0143\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u00034\u001a\u0000\u0133\u0136\u0003B!\u0000\u0134\u0136\u0003D\"\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u013f\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u00036\u001b\u0000\u0138\u013a\u0003B!\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013f"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u00038\u001c\u0000\u013c\u013d\u0003"+
		"B!\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u0132\u0001\u0000\u0000"+
		"\u0000\u013e\u0137\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u00038\u001c\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u012e\u0001\u0000\u0000\u0000"+
		"\u0142\u013e\u0001\u0000\u0000\u0000\u0143=\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\u0004\u0000\u0000\u0145\u0146\u0005\u0004\u0000\u0000\u0146"+
		"\u0147\u0005\u0005\u0000\u0000\u0147\u0148\u0005\u0004\u0000\u0000\u0148"+
		"?\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0004\u0000\u0000\u014a\u014b"+
		"\u0005\u0005\u0000\u0000\u014b\u014c\u0005\u0004\u0000\u0000\u014c\u014d"+
		"\u0005\u0004\u0000\u0000\u014dA\u0001\u0000\u0000\u0000\u014e\u014f\u0005"+
		"\u0004\u0000\u0000\u014fC\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0006"+
		"\u0000\u0000\u0151E\u0001\u0000\u0000\u0000\u0152\u0154\u0003H$\u0000"+
		"\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156G\u0001\u0000\u0000\u0000\u0157\u0158\u0007\u0003\u0000\u0000\u0158"+
		"I\u0001\u0000\u0000\u0000)MY\\_fnrx{\u0080\u008b\u0094\u0098\u009f\u00b3"+
		"\u00c0\u00c6\u00d0\u00d4\u00d9\u00dd\u00e2\u00e8\u00ee\u00f0\u00f5\u00f9"+
		"\u00fd\u0101\u010c\u0119\u011f\u0124\u0128\u012c\u012e\u0135\u0139\u013e"+
		"\u0142\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}