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
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_compmo = 3, RULE_cmene = 4, 
		RULE_brivla = 5, RULE_gismu = 6, RULE_lujvo = 7, RULE_baugismu = 8, RULE_brogismu = 9, 
		RULE_bobvo = 10, RULE_cobvo = 11, RULE_dobvo = 12, RULE_fobvo = 13, RULE_gobvo = 14, 
		RULE_balrelraf = 15, RULE_jvoreb = 16, RULE_relraf = 17, RULE_gimpag = 18, 
		RULE_rafgimpag = 19, RULE_balraf = 20, RULE_broraf = 21, RULE_bauraf = 22, 
		RULE_karlraf = 23, RULE_karlrelraf = 24, RULE_gahorgimpag = 25, RULE_kargimpag = 26, 
		RULE_q = 27, RULE_y = 28, RULE_cmavo = 29, RULE_cat_cmavo = 30, RULE_lerfu = 31, 
		RULE_fuhivla = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "compmo", "cmene", "brivla", "gismu", "lujvo", 
			"baugismu", "brogismu", "bobvo", "cobvo", "dobvo", "fobvo", "gobvo", 
			"balrelraf", "jvoreb", "relraf", "gimpag", "rafgimpag", "balraf", "broraf", 
			"bauraf", "karlraf", "karlrelraf", "gahorgimpag", "kargimpag", "q", "y", 
			"cmavo", "cat_cmavo", "lerfu", "fuhivla"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'", null, null, null, null, "'y'", "'''"
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
		enterRule(_localctx, 6, RULE_compmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			cmavo();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				cmavo();
				}
				}
				setState(100); 
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
		enterRule(_localctx, 8, RULE_cmene);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(102);
				match(DOT);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
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
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(111);
			match(C);
			setState(112);
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
		enterRule(_localctx, 10, RULE_brivla);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		enterRule(_localctx, 12, RULE_gismu);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				baugismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		enterRule(_localctx, 14, RULE_lujvo);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				fobvo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
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
		enterRule(_localctx, 16, RULE_baugismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(C);
			setState(130);
			match(V);
			setState(131);
			match(C);
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
		enterRule(_localctx, 18, RULE_brogismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(C);
			setState(136);
			match(C);
			setState(137);
			match(V);
			setState(138);
			match(C);
			setState(139);
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
		enterRule(_localctx, 20, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			balrelraf();
			setState(142);
			y();
			setState(143);
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
		enterRule(_localctx, 22, RULE_cobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			relraf();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(146);
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
		enterRule(_localctx, 24, RULE_dobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			gimpag();
			setState(150);
			y();
			setState(151);
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
		enterRule(_localctx, 26, RULE_fobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			rafgimpag();
			setState(154);
			y();
			setState(155);
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
		enterRule(_localctx, 28, RULE_gobvo);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				balraf();
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(158);
					q();
					}
					break;
				case 2:
					{
					setState(159);
					y();
					}
					break;
				}
				setState(162);
				gismu();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				broraf();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(165);
					q();
					}
					break;
				}
				setState(168);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				bauraf();
				setState(171);
				q();
				setState(172);
				baugismu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				bauraf();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(175);
					q();
					}
					break;
				}
				setState(178);
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
		enterRule(_localctx, 30, RULE_balrelraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(182);
				balraf();
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(183);
					q();
					}
					break;
				case 2:
					{
					setState(184);
					y();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(187);
				broraf();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(188);
					q();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(191);
				bauraf();
				setState(192);
				q();
				}
				break;
			}
			setState(196);
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
		enterRule(_localctx, 32, RULE_jvoreb);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(198);
						balraf();
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(199);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(202);
						gimpag();
						setState(203);
						y();
						}
						break;
					case 3:
						{
						setState(205);
						karlraf();
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(211);
				karlraf();
				}
				break;
			case 2:
				{
				setState(212);
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
		enterRule(_localctx, 34, RULE_relraf);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				balrelraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		enterRule(_localctx, 36, RULE_gimpag);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				gahorgimpag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
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
		enterRule(_localctx, 38, RULE_rafgimpag);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				balraf();
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(224);
					q();
					}
					break;
				}
				setState(227);
				gimpag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				karlraf();
				setState(230);
				q();
				setState(231);
				kargimpag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				karlraf();
				setState(234);
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
		enterRule(_localctx, 40, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(C);
			setState(239);
			match(V);
			setState(240);
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
		enterRule(_localctx, 42, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(C);
			setState(243);
			match(C);
			setState(244);
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
		enterRule(_localctx, 44, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(C);
			setState(247);
			match(V);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AP) {
				{
				setState(248);
				match(AP);
				}
			}

			setState(251);
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
		enterRule(_localctx, 46, RULE_karlraf);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
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
		enterRule(_localctx, 48, RULE_karlrelraf);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(257);
					balraf();
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(258);
						q();
						}
						break;
					case 2:
						{
						setState(259);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(262);
					broraf();
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(263);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(266);
					bauraf();
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(267);
						q();
						}
						break;
					}
					}
					break;
				}
				setState(272);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(274);
					balraf();
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(275);
						q();
						}
						break;
					case 2:
						{
						setState(276);
						y();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(279);
					broraf();
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(280);
						q();
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(283);
					bauraf();
					setState(284);
					q();
					}
					break;
				}
				setState(288);
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
		enterRule(_localctx, 50, RULE_gahorgimpag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(C);
			setState(293);
			match(C);
			setState(294);
			match(V);
			setState(295);
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
		enterRule(_localctx, 52, RULE_kargimpag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(C);
			setState(298);
			match(V);
			setState(299);
			match(C);
			setState(300);
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
		enterRule(_localctx, 54, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 56, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 58, RULE_cmavo);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				cat_cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		enterRule(_localctx, 60, RULE_cat_cmavo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==C) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(311);
			match(V);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V || _la==AP) {
				{
				{
				setState(312);
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
				setState(317);
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
		enterRule(_localctx, 62, RULE_lerfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(C);
			setState(319);
			match(Y);
			setState(320);
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
		"\u0002\u0001\u0003\u0001\u0003\u0004\u0003c\b\u0003\u000b\u0003\f\u0003"+
		"d\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0004\u0005\u0004k\b\u0004\n"+
		"\u0004\f\u0004n\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005u\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"y\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0080\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00b1\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ba\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00be\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c3\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00c9\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00cf\b\u0010\n\u0010\f\u0010\u00d2\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d6\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00da\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00de\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e2\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00ed\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00fa\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0100\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0105\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0109\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u010d\b\u0018\u0003\u0018\u010f\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0116\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011a\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u011f\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0123\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0135\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u013a\b\u001e\n\u001e\f\u001e\u013d\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0004 \u0144\b \u000b \f \u0145"+
		"\u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0003\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\u0004\u0005\u0002\u0000\u0006\u0006\b\b\u015f"+
		"\u0000H\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004^"+
		"\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bg\u0001\u0000"+
		"\u0000\u0000\nt\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e"+
		"\u007f\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012"+
		"\u0087\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000\u0000\u0000\u0016"+
		"\u0091\u0001\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a"+
		"\u0099\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e"+
		"\u00c2\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000\"\u00d9"+
		"\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000&\u00ec\u0001\u0000"+
		"\u0000\u0000(\u00ee\u0001\u0000\u0000\u0000*\u00f2\u0001\u0000\u0000\u0000"+
		",\u00f6\u0001\u0000\u0000\u0000.\u00ff\u0001\u0000\u0000\u00000\u0122"+
		"\u0001\u0000\u0000\u00002\u0124\u0001\u0000\u0000\u00004\u0129\u0001\u0000"+
		"\u0000\u00006\u012e\u0001\u0000\u0000\u00008\u0130\u0001\u0000\u0000\u0000"+
		":\u0134\u0001\u0000\u0000\u0000<\u0136\u0001\u0000\u0000\u0000>\u013e"+
		"\u0001\u0000\u0000\u0000@\u0143\u0001\u0000\u0000\u0000BD\u0003\u0002"+
		"\u0001\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0002\u0000\u0000"+
		"GI\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0001\u0001\u0000\u0000\u0000"+
		"NS\u0003\u0004\u0002\u0000OP\u0005\u0003\u0000\u0000PR\u0003\u0004\u0002"+
		"\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TX\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WN\u0001\u0000\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X\u0003\u0001\u0000\u0000\u0000Y_\u0003:\u001d"+
		"\u0000Z_\u0003\n\u0005\u0000[_\u0003\b\u0004\u0000\\_\u0003\u0006\u0003"+
		"\u0000]_\u0003@ \u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000"+
		"^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\u0005\u0001\u0000\u0000\u0000`b\u0003:\u001d\u0000ac\u0003:\u001d"+
		"\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u0007\u0001\u0000\u0000\u0000"+
		"fh\u0005\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hl\u0001\u0000\u0000\u0000ik\u0007\u0000\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005\u0005\u0000\u0000pq\u0005\u0004\u0000\u0000q\t\u0001\u0000\u0000"+
		"\u0000ru\u0003\f\u0006\u0000su\u0003\u000e\u0007\u0000tr\u0001\u0000\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000u\u000b\u0001\u0000\u0000\u0000vy\u0003"+
		"\u0010\b\u0000wy\u0003\u0012\t\u0000xv\u0001\u0000\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000z\u0080\u0003\u0014\n\u0000"+
		"{\u0080\u0003\u0016\u000b\u0000|\u0080\u0003\u0018\f\u0000}\u0080\u0003"+
		"\u001a\r\u0000~\u0080\u0003\u001c\u000e\u0000\u007fz\u0001\u0000\u0000"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0083\u0005"+
		"\u0006\u0000\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u0085\u0005"+
		"\u0005\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086\u0011\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0005"+
		"\u0005\u0000\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008b\u0005"+
		"\u0005\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u0013\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f\u0003"+
		"8\u001c\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0015\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0003\"\u0011\u0000\u0092\u0094\u0003 \u0010\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0003$\u0012\u0000\u0096"+
		"\u0097\u00038\u001c\u0000\u0097\u0098\u0003 \u0010\u0000\u0098\u0019\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0003&\u0013\u0000\u009a\u009b\u00038\u001c"+
		"\u0000\u009b\u009c\u0003 \u0010\u0000\u009c\u001b\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0003(\u0014\u0000\u009e\u00a1\u00036\u001b\u0000\u009f\u00a1"+
		"\u00038\u001c\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0003\f\u0006\u0000\u00a3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0003*\u0015\u0000\u00a5\u00a7\u00036\u001b\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\f\u0006\u0000\u00a9"+
		"\u00b5\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003,\u0016\u0000\u00ab\u00ac"+
		"\u00036\u001b\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00b5\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0003,\u0016\u0000\u00af\u00b1\u00036\u001b"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0012\t\u0000"+
		"\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u009d\u0001\u0000\u0000\u0000"+
		"\u00b4\u00a4\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0003(\u0014\u0000\u00b7\u00ba\u00036\u001b\u0000\u00b8\u00ba"+
		"\u00038\u001c\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c3\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0003*\u0015\u0000\u00bc\u00be\u00036\u001b"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003,\u0016\u0000"+
		"\u00c0\u00c1\u00036\u001b\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00b6\u0001\u0000\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003(\u0014\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6\u00c8"+
		"\u0003(\u0014\u0000\u00c7\u00c9\u00038\u001c\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0003$\u0012\u0000\u00cb\u00cc\u00038\u001c\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cf\u0003.\u0017\u0000\u00ce"+
		"\u00c6\u0001\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0003.\u0017\u0000\u00d4\u00d6\u0003\f\u0006\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6!\u0001"+
		"\u0000\u0000\u0000\u00d7\u00da\u0003\u001e\u000f\u0000\u00d8\u00da\u0003"+
		"0\u0018\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da#\u0001\u0000\u0000\u0000\u00db\u00de\u00032\u0019\u0000"+
		"\u00dc\u00de\u00034\u001a\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de%\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0003(\u0014\u0000\u00e0\u00e2\u00036\u001b\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0003$\u0012\u0000\u00e4\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0003.\u0017\u0000\u00e6\u00e7\u00036\u001b\u0000\u00e7"+
		"\u00e8\u00034\u001a\u0000\u00e8\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0003.\u0017\u0000\u00ea\u00eb\u00032\u0019\u0000\u00eb\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\'\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f0\u0005\u0006\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1)\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0005\u0000\u0000\u00f3\u00f4\u0005\u0005\u0000\u0000"+
		"\u00f4\u00f5\u0005\u0006\u0000\u0000\u00f5+\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0005\u0000\u0000\u00f7\u00f9\u0005\u0006\u0000\u0000\u00f8"+
		"\u00fa\u0005\b\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005\u0006\u0000\u0000\u00fc-\u0001\u0000\u0000\u0000\u00fd\u0100\u0003"+
		"*\u0015\u0000\u00fe\u0100\u0003,\u0016\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100/\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0003(\u0014\u0000\u0102\u0105\u00036\u001b\u0000\u0103\u0105"+
		"\u00038\u001c\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u010f\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0003*\u0015\u0000\u0107\u0109\u00036\u001b"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010f\u0001\u0000\u0000\u0000\u010a\u010c\u0003,\u0016\u0000"+
		"\u010b\u010d\u00036\u001b\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u0101\u0001\u0000\u0000\u0000\u010e\u0106\u0001\u0000\u0000\u0000\u010e"+
		"\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0003*\u0015\u0000\u0111\u0123\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0003(\u0014\u0000\u0113\u0116\u00036\u001b\u0000\u0114\u0116\u00038"+
		"\u001c\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u011f\u0001\u0000"+
		"\u0000\u0000\u0117\u0119\u0003*\u0015\u0000\u0118\u011a\u00036\u001b\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011f\u0001\u0000\u0000\u0000\u011b\u011c\u0003,\u0016\u0000\u011c"+
		"\u011d\u00036\u001b\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0112"+
		"\u0001\u0000\u0000\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011e\u011b"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0003,\u0016\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u010e\u0001"+
		"\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u01231\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005\u0005\u0000\u0000\u0125\u0126\u0005\u0005"+
		"\u0000\u0000\u0126\u0127\u0005\u0006\u0000\u0000\u0127\u0128\u0005\u0005"+
		"\u0000\u0000\u01283\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0005\u0000"+
		"\u0000\u012a\u012b\u0005\u0006\u0000\u0000\u012b\u012c\u0005\u0005\u0000"+
		"\u0000\u012c\u012d\u0005\u0005\u0000\u0000\u012d5\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u0005\u0000\u0000\u012f7\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\u0007\u0000\u0000\u01319\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u0003<\u001e\u0000\u0133\u0135\u0003>\u001f\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135;\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0007\u0001\u0000\u0000\u0137\u013b\u0005\u0006\u0000"+
		"\u0000\u0138\u013a\u0007\u0002\u0000\u0000\u0139\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c=\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0005\u0000\u0000"+
		"\u013f\u0140\u0005\u0007\u0000\u0000\u0140\u0141\u0005\u0004\u0000\u0000"+
		"\u0141?\u0001\u0000\u0000\u0000\u0142\u0144\u0005\t\u0000\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"A\u0001\u0000\u0000\u0000(DJSW^dgltx\u007f\u0093\u00a0\u00a6\u00b0\u00b4"+
		"\u00b9\u00bd\u00c2\u00c8\u00ce\u00d0\u00d5\u00d9\u00dd\u00e1\u00ec\u00f9"+
		"\u00ff\u0104\u0108\u010c\u010e\u0115\u0119\u011e\u0122\u0134\u013b\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}