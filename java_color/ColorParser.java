// Generated from Color.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, DOT=4, C=5, V=6, Y=7, AP=8, ANYCHAR=9;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_cmene = 3, RULE_brivla = 4, 
		RULE_gismu = 5, RULE_lujvo = 6, RULE_baugismu = 7, RULE_brogismu = 8, 
		RULE_bobvo = 9, RULE_cobvo = 10, RULE_dobvo = 11, RULE_fobvo = 12, RULE_gobvo = 13, 
		RULE_balrelraf = 14, RULE_jvoreb = 15, RULE_relraf = 16, RULE_gimpag = 17, 
		RULE_rafgimpag = 18, RULE_balraf = 19, RULE_broraf = 20, RULE_bauraf = 21, 
		RULE_karlraf = 22, RULE_karlrelraf = 23, RULE_gahorgimpag = 24, RULE_kargimpag = 25, 
		RULE_q = 26, RULE_y = 27, RULE_cmavo = 28, RULE_cat_cmavo = 29, RULE_lerfu = 30, 
		RULE_compmo = 31, RULE_fuhivla = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmene", "brivla", "gismu", "lujvo", "baugismu", 
			"brogismu", "bobvo", "cobvo", "dobvo", "fobvo", "gobvo", "balrelraf", 
			"jvoreb", "relraf", "gimpag", "rafgimpag", "balraf", "broraf", "bauraf", 
			"karlraf", "karlrelraf", "gahorgimpag", "kargimpag", "q", "y", "cmavo", 
			"cat_cmavo", "lerfu", "compmo", "fuhivla"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'", null, "'.'", null, null, "'y'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "DOT", "C", "V", "Y", "AP", "ANYCHAR"
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
	public String getGrammarFileName() { return "Color.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ColorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FolioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ColorParser.EOF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFolio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFolio(this);
		}
	}

	public final FolioContext folio() throws RecognitionException {
		FolioContext _localctx = new FolioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_folio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				sentence();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(67);
					match(T__0);
					}
				}

				setState(70);
				match(T__1);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DOT) | (1L << C) | (1L << V) | (1L << ANYCHAR))) != 0) );
			setState(76);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ColorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ColorParser.WS, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case C:
			case V:
			case ANYCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				word();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(79);
					match(WS);
					setState(80);
					word();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public BrivlaContext brivla() {
			return getRuleContext(BrivlaContext.class,0);
		}
		public CmeneContext cmene() {
			return getRuleContext(CmeneContext.class,0);
		}
		public CompmoContext compmo() {
			return getRuleContext(CompmoContext.class,0);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				brivla();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				cmene();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				compmo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
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

	public static class CmeneContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ColorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ColorParser.DOT, i);
		}
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public CmeneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCmene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCmene(this);
		}
	}

	public final CmeneContext cmene() throws RecognitionException {
		CmeneContext _localctx = new CmeneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(96);
				match(DOT);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
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
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(105);
			match(C);
			setState(106);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBrivla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBrivla(this);
		}
	}

	public final BrivlaContext brivla() throws RecognitionException {
		BrivlaContext _localctx = new BrivlaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brivla);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
		public BaugismuContext baugismu() {
			return getRuleContext(BaugismuContext.class,0);
		}
		public BrogismuContext brogismu() {
			return getRuleContext(BrogismuContext.class,0);
		}
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterGismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitGismu(this);
		}
	}

	public final GismuContext gismu() throws RecognitionException {
		GismuContext _localctx = new GismuContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gismu);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				baugismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				brogismu();
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterLujvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitLujvo(this);
		}
	}

	public final LujvoContext lujvo() throws RecognitionException {
		LujvoContext _localctx = new LujvoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lujvo);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				fobvo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
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

	public static class BaugismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public BaugismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baugismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBaugismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBaugismu(this);
		}
	}

	public final BaugismuContext baugismu() throws RecognitionException {
		BaugismuContext _localctx = new BaugismuContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_baugismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(C);
			setState(124);
			match(V);
			setState(125);
			match(C);
			setState(126);
			match(C);
			setState(127);
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

	public static class BrogismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public BrogismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brogismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBrogismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBrogismu(this);
		}
	}

	public final BrogismuContext brogismu() throws RecognitionException {
		BrogismuContext _localctx = new BrogismuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_brogismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(C);
			setState(130);
			match(C);
			setState(131);
			match(V);
			setState(132);
			match(C);
			setState(133);
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
		public JvorebContext jvoreb() {
			return getRuleContext(JvorebContext.class,0);
		}
		public BobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBobvo(this);
		}
	}

	public final BobvoContext bobvo() throws RecognitionException {
		BobvoContext _localctx = new BobvoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			balrelraf();
			setState(136);
			y();
			setState(137);
			jvoreb();
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
		public JvorebContext jvoreb() {
			return getRuleContext(JvorebContext.class,0);
		}
		public CobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCobvo(this);
		}
	}

	public final CobvoContext cobvo() throws RecognitionException {
		CobvoContext _localctx = new CobvoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			relraf();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(140);
				jvoreb();
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
		public GimpagContext gimpag() {
			return getRuleContext(GimpagContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public JvorebContext jvoreb() {
			return getRuleContext(JvorebContext.class,0);
		}
		public DobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterDobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitDobvo(this);
		}
	}

	public final DobvoContext dobvo() throws RecognitionException {
		DobvoContext _localctx = new DobvoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			gimpag();
			setState(144);
			y();
			setState(145);
			jvoreb();
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
		public JvorebContext jvoreb() {
			return getRuleContext(JvorebContext.class,0);
		}
		public FobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFobvo(this);
		}
	}

	public final FobvoContext fobvo() throws RecognitionException {
		FobvoContext _localctx = new FobvoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			rafgimpag();
			setState(148);
			y();
			setState(149);
			jvoreb();
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
		public BaugismuContext baugismu() {
			return getRuleContext(BaugismuContext.class,0);
		}
		public BrogismuContext brogismu() {
			return getRuleContext(BrogismuContext.class,0);
		}
		public GobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterGobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitGobvo(this);
		}
	}

	public final GobvoContext gobvo() throws RecognitionException {
		GobvoContext _localctx = new GobvoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_gobvo);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				balraf();
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(152);
					q();
					}
					break;
				case 2:
					{
					setState(153);
					y();
					}
					break;
				}
				setState(156);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				broraf();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(159);
					q();
					}
					break;
				}
				setState(162);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				bauraf();
				setState(165);
				q();
				setState(166);
				baugismu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				bauraf();
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(169);
					q();
					}
					break;
				}
				setState(172);
				brogismu();
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBalrelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBalrelraf(this);
		}
	}

	public final BalrelrafContext balrelraf() throws RecognitionException {
		BalrelrafContext _localctx = new BalrelrafContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_balrelraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(176);
				balraf();
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(177);
					q();
					}
					break;
				case 2:
					{
					setState(178);
					y();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(181);
				broraf();
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(182);
					q();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(185);
				bauraf();
				setState(186);
				q();
				}
				break;
			}
			setState(190);
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

	public static class JvorebContext extends ParserRuleContext {
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
		public List<GimpagContext> gimpag() {
			return getRuleContexts(GimpagContext.class);
		}
		public GimpagContext gimpag(int i) {
			return getRuleContext(GimpagContext.class,i);
		}
		public List<YContext> y() {
			return getRuleContexts(YContext.class);
		}
		public YContext y(int i) {
			return getRuleContext(YContext.class,i);
		}
		public JvorebContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jvoreb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterJvoreb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitJvoreb(this);
		}
	}

	public final JvorebContext jvoreb() throws RecognitionException {
		JvorebContext _localctx = new JvorebContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jvoreb);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(192);
						balraf();
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(193);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(196);
						gimpag();
						setState(197);
						y();
						}
						break;
					case 3:
						{
						setState(199);
						karlraf();
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(205);
				karlraf();
				}
				break;
			case 2:
				{
				setState(206);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterRelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitRelraf(this);
		}
	}

	public final RelrafContext relraf() throws RecognitionException {
		RelrafContext _localctx = new RelrafContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relraf);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				balrelraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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

	public static class GimpagContext extends ParserRuleContext {
		public GahorgimpagContext gahorgimpag() {
			return getRuleContext(GahorgimpagContext.class,0);
		}
		public KargimpagContext kargimpag() {
			return getRuleContext(KargimpagContext.class,0);
		}
		public GimpagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gimpag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterGimpag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitGimpag(this);
		}
	}

	public final GimpagContext gimpag() throws RecognitionException {
		GimpagContext _localctx = new GimpagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gimpag);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				gahorgimpag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				kargimpag();
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
		public GimpagContext gimpag() {
			return getRuleContext(GimpagContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public KarlrafContext karlraf() {
			return getRuleContext(KarlrafContext.class,0);
		}
		public KargimpagContext kargimpag() {
			return getRuleContext(KargimpagContext.class,0);
		}
		public GahorgimpagContext gahorgimpag() {
			return getRuleContext(GahorgimpagContext.class,0);
		}
		public RafgimpagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rafgimpag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterRafgimpag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitRafgimpag(this);
		}
	}

	public final RafgimpagContext rafgimpag() throws RecognitionException {
		RafgimpagContext _localctx = new RafgimpagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rafgimpag);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				balraf();
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(218);
					q();
					}
					break;
				}
				setState(221);
				gimpag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				karlraf();
				setState(224);
				q();
				setState(225);
				kargimpag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				karlraf();
				setState(228);
				gahorgimpag();
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
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public BalrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBalraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBalraf(this);
		}
	}

	public final BalrafContext balraf() throws RecognitionException {
		BalrafContext _localctx = new BalrafContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(C);
			setState(233);
			match(V);
			setState(234);
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
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public BrorafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBroraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBroraf(this);
		}
	}

	public final BrorafContext broraf() throws RecognitionException {
		BrorafContext _localctx = new BrorafContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(C);
			setState(237);
			match(C);
			setState(238);
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
		public TerminalNode C() { return getToken(ColorParser.C, 0); }
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public TerminalNode AP() { return getToken(ColorParser.AP, 0); }
		public BaurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bauraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBauraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBauraf(this);
		}
	}

	public final BaurafContext bauraf() throws RecognitionException {
		BaurafContext _localctx = new BaurafContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(C);
			setState(241);
			match(V);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(242);
				match(AP);
				}
			}

			setState(245);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterKarlraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitKarlraf(this);
		}
	}

	public final KarlrafContext karlraf() throws RecognitionException {
		KarlrafContext _localctx = new KarlrafContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_karlraf);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterKarlrelraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitKarlrelraf(this);
		}
	}

	public final KarlrelrafContext karlrelraf() throws RecognitionException {
		KarlrelrafContext _localctx = new KarlrelrafContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_karlrelraf);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(251);
					balraf();
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(252);
						q();
						}
						break;
					case 2:
						{
						setState(253);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(256);
					broraf();
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(257);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(260);
					bauraf();
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(261);
						q();
						}
						break;
					}
					}
					break;
				}
				setState(266);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(268);
					balraf();
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(269);
						q();
						}
						break;
					case 2:
						{
						setState(270);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(273);
					broraf();
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(274);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(277);
					bauraf();
					setState(278);
					q();
					}
					break;
				}
				setState(282);
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

	public static class GahorgimpagContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public GahorgimpagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gahorgimpag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterGahorgimpag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitGahorgimpag(this);
		}
	}

	public final GahorgimpagContext gahorgimpag() throws RecognitionException {
		GahorgimpagContext _localctx = new GahorgimpagContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gahorgimpag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(C);
			setState(287);
			match(C);
			setState(288);
			match(V);
			setState(289);
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

	public static class KargimpagContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public KargimpagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kargimpag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterKargimpag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitKargimpag(this);
		}
	}

	public final KargimpagContext kargimpag() throws RecognitionException {
		KargimpagContext _localctx = new KargimpagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_kargimpag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(C);
			setState(292);
			match(V);
			setState(293);
			match(C);
			setState(294);
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
		public TerminalNode C() { return getToken(ColorParser.C, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		public TerminalNode Y() { return getToken(ColorParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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

	public static class CmavoContext extends ParserRuleContext {
		public Cat_cmavoContext cat_cmavo() {
			return getRuleContext(Cat_cmavoContext.class,0);
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
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCmavo(this);
		}
	}

	public final CmavoContext cmavo() throws RecognitionException {
		CmavoContext _localctx = new CmavoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmavo);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				cat_cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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

	public static class Cat_cmavoContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public TerminalNode DOT() { return getToken(ColorParser.DOT, 0); }
		public TerminalNode C() { return getToken(ColorParser.C, 0); }
		public List<TerminalNode> AP() { return getTokens(ColorParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(ColorParser.AP, i);
		}
		public Cat_cmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cat_cmavo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCat_cmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCat_cmavo(this);
		}
	}

	public final Cat_cmavoContext cat_cmavo() throws RecognitionException {
		Cat_cmavoContext _localctx = new Cat_cmavoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cat_cmavo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==C) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			match(V);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V || _la==AP) {
				{
				{
				setState(306);
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
				setState(311);
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
		public TerminalNode C() { return getToken(ColorParser.C, 0); }
		public TerminalNode Y() { return getToken(ColorParser.Y, 0); }
		public TerminalNode DOT() { return getToken(ColorParser.DOT, 0); }
		public LerfuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerfu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterLerfu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitLerfu(this);
		}
	}

	public final LerfuContext lerfu() throws RecognitionException {
		LerfuContext _localctx = new LerfuContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lerfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(C);
			setState(313);
			match(Y);
			setState(314);
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

	public static class CompmoContext extends ParserRuleContext {
		public List<CmavoContext> cmavo() {
			return getRuleContexts(CmavoContext.class);
		}
		public CmavoContext cmavo(int i) {
			return getRuleContext(CmavoContext.class,i);
		}
		public CompmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCompmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCompmo(this);
		}
	}

	public final CompmoContext compmo() throws RecognitionException {
		CompmoContext _localctx = new CompmoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			cmavo();
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				cmavo();
				}
				}
				setState(320); 
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

	public static class FuhivlaContext extends ParserRuleContext {
		public List<TerminalNode> ANYCHAR() { return getTokens(ColorParser.ANYCHAR); }
		public TerminalNode ANYCHAR(int i) {
			return getToken(ColorParser.ANYCHAR, i);
		}
		public FuhivlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuhivla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFuhivla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFuhivla(this);
		}
	}

	public final FuhivlaContext fuhivla() throws RecognitionException {
		FuhivlaContext _localctx = new FuhivlaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fuhivla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(ANYCHAR);
				}
				}
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANYCHAR );
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
		"\u0004\u0001\t\u0148\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0003\u0000"+
		"E\b\u0000\u0001\u0000\u0001\u0000\u0004\u0000I\b\u0000\u000b\u0000\f\u0000"+
		"J\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"R\b\u0001\n\u0001\f\u0001U\t\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b"+
		"\u0002\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0003\u0005\u0003e\b\u0003"+
		"\n\u0003\f\u0003h\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"s\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006z\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0003\r\u009b\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ab\b\r\u0001\r\u0001\r\u0003\r\u00af\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00b4\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00bd\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c3\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00c9\b\u000f\n\u000f\f\u000f\u00cc\t\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00d0\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00d4\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00d8\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00dc\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00f4\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00fa\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00ff\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0103\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0107\b\u0017\u0003\u0017\u0109\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0110\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0114\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0119\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u011d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u012f\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0134\b\u001d\n\u001d\f\u001d\u0137\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0004\u001f\u013f\b\u001f"+
		"\u000b\u001f\f\u001f\u0140\u0001 \u0004 \u0144\b \u000b \f \u0145\u0001"+
		" \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0003\u0001\u0000\u0005"+
		"\u0006\u0001\u0000\u0004\u0005\u0002\u0000\u0006\u0006\b\b\u015f\u0000"+
		"H\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004^\u0001"+
		"\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bn\u0001\u0000\u0000"+
		"\u0000\nr\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e{\u0001"+
		"\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0087\u0001"+
		"\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u008f\u0001"+
		"\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u00ae\u0001"+
		"\u0000\u0000\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00ca\u0001"+
		"\u0000\u0000\u0000 \u00d3\u0001\u0000\u0000\u0000\"\u00d7\u0001\u0000"+
		"\u0000\u0000$\u00e6\u0001\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000"+
		"(\u00ec\u0001\u0000\u0000\u0000*\u00f0\u0001\u0000\u0000\u0000,\u00f9"+
		"\u0001\u0000\u0000\u0000.\u011c\u0001\u0000\u0000\u00000\u011e\u0001\u0000"+
		"\u0000\u00002\u0123\u0001\u0000\u0000\u00004\u0128\u0001\u0000\u0000\u0000"+
		"6\u012a\u0001\u0000\u0000\u00008\u012e\u0001\u0000\u0000\u0000:\u0130"+
		"\u0001\u0000\u0000\u0000<\u0138\u0001\u0000\u0000\u0000>\u013c\u0001\u0000"+
		"\u0000\u0000@\u0143\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000"+
		"CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0002\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HB\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0000\u0000\u0001M\u0001\u0001\u0000\u0000\u0000NS\u0003\u0004"+
		"\u0002\u0000OP\u0005\u0003\u0000\u0000PR\u0003\u0004\u0002\u0000QO\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TX\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WN\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X\u0003\u0001\u0000\u0000\u0000Y_\u00038\u001c\u0000Z_\u0003"+
		"\b\u0004\u0000[_\u0003\u0006\u0003\u0000\\_\u0003>\u001f\u0000]_\u0003"+
		"@ \u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0005"+
		"\u0001\u0000\u0000\u0000`b\u0005\u0004\u0000\u0000a`\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bf\u0001\u0000\u0000\u0000ce\u0007\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0005\u0004\u0000"+
		"\u0000k\u0007\u0001\u0000\u0000\u0000lo\u0003\n\u0005\u0000mo\u0003\f"+
		"\u0006\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\t\u0001"+
		"\u0000\u0000\u0000ps\u0003\u000e\u0007\u0000qs\u0003\u0010\b\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000"+
		"\u0000tz\u0003\u0012\t\u0000uz\u0003\u0014\n\u0000vz\u0003\u0016\u000b"+
		"\u0000wz\u0003\u0018\f\u0000xz\u0003\u001a\r\u0000yt\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\r\u0001\u0000\u0000\u0000{|\u0005"+
		"\u0005\u0000\u0000|}\u0005\u0006\u0000\u0000}~\u0005\u0005\u0000\u0000"+
		"~\u007f\u0005\u0005\u0000\u0000\u007f\u0080\u0005\u0006\u0000\u0000\u0080"+
		"\u000f\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082"+
		"\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084"+
		"\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086"+
		"\u0011\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088"+
		"\u0089\u00036\u001b\u0000\u0089\u008a\u0003\u001e\u000f\u0000\u008a\u0013"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0003 \u0010\u0000\u008c\u008e\u0003"+
		"\u001e\u000f\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0015\u0001\u0000\u0000\u0000\u008f\u0090\u0003"+
		"\"\u0011\u0000\u0090\u0091\u00036\u001b\u0000\u0091\u0092\u0003\u001e"+
		"\u000f\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094\u0003$\u0012"+
		"\u0000\u0094\u0095\u00036\u001b\u0000\u0095\u0096\u0003\u001e\u000f\u0000"+
		"\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u009a\u0003&\u0013\u0000\u0098"+
		"\u009b\u00034\u001a\u0000\u0099\u009b\u00036\u001b\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0003"+
		"\n\u0005\u0000\u009d\u00af\u0001\u0000\u0000\u0000\u009e\u00a0\u0003("+
		"\u0014\u0000\u009f\u00a1\u00034\u001a\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\n\u0005\u0000\u00a3\u00af\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0003*\u0015\u0000\u00a5\u00a6\u00034\u001a\u0000\u00a6\u00a7"+
		"\u0003\u000e\u0007\u0000\u00a7\u00af\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003*\u0015\u0000\u00a9\u00ab\u00034\u001a\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00af\u0001\u0000\u0000"+
		"\u0000\u00ae\u0097\u0001\u0000\u0000\u0000\u00ae\u009e\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a4\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000"+
		"\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b3\u0003&\u0013\u0000"+
		"\u00b1\u00b4\u00034\u001a\u0000\u00b2\u00b4\u00036\u001b\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00bd\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0003(\u0014\u0000\u00b6\u00b8\u00034\u001a\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0003*\u0015\u0000\u00ba\u00bb\u00034\u001a\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b5\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0003&\u0013\u0000\u00bf"+
		"\u001d\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003&\u0013\u0000\u00c1\u00c3"+
		"\u00036\u001b\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c9\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"\"\u0011\u0000\u00c5\u00c6\u00036\u001b\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0003,\u0016\u0000\u00c8\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0003,\u0016\u0000"+
		"\u00ce\u00d0\u0003\n\u0005\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0003\u001c\u000e\u0000\u00d2\u00d4\u0003.\u0017\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4!\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u00030\u0018\u0000\u00d6\u00d8\u00032\u0019"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9\u00db\u0003&\u0013\u0000\u00da"+
		"\u00dc\u00034\u001a\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0003\"\u0011\u0000\u00de\u00e7\u0001\u0000\u0000\u0000\u00df\u00e0\u0003"+
		",\u0016\u0000\u00e0\u00e1\u00034\u001a\u0000\u00e1\u00e2\u00032\u0019"+
		"\u0000\u00e2\u00e7\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003,\u0016\u0000"+
		"\u00e4\u00e5\u00030\u0018\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e7%\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u0005\u0000\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0005\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0005\u0000\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0006\u0000\u0000\u00ef)\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0005"+
		"\u0000\u0000\u00f1\u00f3\u0005\u0006\u0000\u0000\u00f2\u00f4\u0005\b\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0006\u0000"+
		"\u0000\u00f6+\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003(\u0014\u0000\u00f8"+
		"\u00fa\u0003*\u0015\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa-\u0001\u0000\u0000\u0000\u00fb\u00fe\u0003"+
		"&\u0013\u0000\u00fc\u00ff\u00034\u001a\u0000\u00fd\u00ff\u00036\u001b"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0109\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0003(\u0014\u0000\u0101\u0103\u00034\u001a\u0000\u0102"+
		"\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0109\u0001\u0000\u0000\u0000\u0104\u0106\u0003*\u0015\u0000\u0105\u0107"+
		"\u00034\u001a\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00fb\u0001"+
		"\u0000\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0104\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0003"+
		"(\u0014\u0000\u010b\u011d\u0001\u0000\u0000\u0000\u010c\u010f\u0003&\u0013"+
		"\u0000\u010d\u0110\u00034\u001a\u0000\u010e\u0110\u00036\u001b\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0119\u0001\u0000\u0000\u0000\u0111"+
		"\u0113\u0003(\u0014\u0000\u0112\u0114\u00034\u001a\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0119\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0003*\u0015\u0000\u0116\u0117\u00034\u001a"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u010c\u0001\u0000\u0000"+
		"\u0000\u0118\u0111\u0001\u0000\u0000\u0000\u0118\u0115\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0003*\u0015\u0000"+
		"\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0108\u0001\u0000\u0000\u0000"+
		"\u011c\u0118\u0001\u0000\u0000\u0000\u011d/\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\u0005\u0000\u0000\u011f\u0120\u0005\u0005\u0000\u0000\u0120"+
		"\u0121\u0005\u0006\u0000\u0000\u0121\u0122\u0005\u0005\u0000\u0000\u0122"+
		"1\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0005\u0000\u0000\u0124\u0125"+
		"\u0005\u0006\u0000\u0000\u0125\u0126\u0005\u0005\u0000\u0000\u0126\u0127"+
		"\u0005\u0005\u0000\u0000\u01273\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\u0005\u0000\u0000\u01295\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0007"+
		"\u0000\u0000\u012b7\u0001\u0000\u0000\u0000\u012c\u012f\u0003:\u001d\u0000"+
		"\u012d\u012f\u0003<\u001e\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012f9\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0007\u0001\u0000\u0000\u0131\u0135\u0005\u0006\u0000\u0000\u0132\u0134"+
		"\u0007\u0002\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136;\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\u0005\u0000\u0000\u0139\u013a\u0005"+
		"\u0007\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b=\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u00038\u001c\u0000\u013d\u013f\u00038\u001c\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000"+
		"\u0141?\u0001\u0000\u0000\u0000\u0142\u0144\u0005\t\u0000\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"A\u0001\u0000\u0000\u0000(DJSW^afnry\u008d\u009a\u00a0\u00aa\u00ae\u00b3"+
		"\u00b7\u00bc\u00c2\u00c8\u00ca\u00cf\u00d3\u00d7\u00db\u00e6\u00f3\u00f9"+
		"\u00fe\u0102\u0106\u0108\u010f\u0113\u0118\u011c\u012e\u0135\u0140\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}