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
		T__0=1, T__1=2, CMENE=3, WS=4, GISMU=5, LUJVO=6, CMAVO=7, COMPMO=8, FUHIVLA=9;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_cmene = 3, RULE_brivla = 4, 
		RULE_lujvo = 5, RULE_gismu = 6, RULE_cmavo = 7, RULE_compmo = 8, RULE_fuhivla = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmene", "brivla", "lujvo", "gismu", "cmavo", 
			"compmo", "fuhivla"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CMENE", "WS", "GISMU", "LUJVO", "CMAVO", "COMPMO", 
			"FUHIVLA"
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
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				sentence();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(21);
					match(T__0);
					}
				}

				setState(24);
				match(T__1);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CMENE) | (1L << GISMU) | (1L << LUJVO) | (1L << CMAVO) | (1L << COMPMO) | (1L << FUHIVLA))) != 0) );
			setState(30);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CMENE) | (1L << GISMU) | (1L << LUJVO) | (1L << CMAVO) | (1L << COMPMO) | (1L << FUHIVLA))) != 0)) {
				{
				{
				setState(32);
				word();
				}
				}
				setState(37);
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMAVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				cmavo();
				}
				break;
			case GISMU:
			case LUJVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				brivla();
				}
				break;
			case CMENE:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				cmene();
				}
				break;
			case COMPMO:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				compmo();
				}
				break;
			case FUHIVLA:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				fuhivla();
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

	public static class CmeneContext extends ParserRuleContext {
		public TerminalNode CMENE() { return getToken(ColorParser.CMENE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(CMENE);
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
		public LujvoContext lujvo() {
			return getRuleContext(LujvoContext.class,0);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LUJVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				lujvo();
				}
				break;
			case GISMU:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				gismu();
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

	public static class LujvoContext extends ParserRuleContext {
		public TerminalNode LUJVO() { return getToken(ColorParser.LUJVO, 0); }
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
		enterRule(_localctx, 10, RULE_lujvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LUJVO);
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
		public TerminalNode GISMU() { return getToken(ColorParser.GISMU, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(GISMU);
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
		public TerminalNode CMAVO() { return getToken(ColorParser.CMAVO, 0); }
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
		enterRule(_localctx, 14, RULE_cmavo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CMAVO);
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
		public TerminalNode COMPMO() { return getToken(ColorParser.COMPMO, 0); }
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
		enterRule(_localctx, 16, RULE_compmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(COMPMO);
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
		public TerminalNode FUHIVLA() { return getToken(ColorParser.FUHIVLA, 0); }
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
		enterRule(_localctx, 18, RULE_fuhivla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FUHIVLA);
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
		"\u0004\u0001\t>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0003\u0000\u0017\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f"+
		"\u0000\u001c\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\"\b\u0001"+
		"\n\u0001\f\u0001%\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u00042\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0000;\u0000\u001a\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b1\u0001"+
		"\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000"+
		"\u000e7\u0001\u0000\u0000\u0000\u00109\u0001\u0000\u0000\u0000\u0012;"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0017"+
		"\u0005\u0001\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0002\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0014"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001"+
		"\u0001\u0000\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000"+
		"\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&,\u0003\u000e\u0007\u0000\',\u0003\b\u0004\u0000(,\u0003\u0006\u0003"+
		"\u0000),\u0003\u0010\b\u0000*,\u0003\u0012\t\u0000+&\u0001\u0000\u0000"+
		"\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0005\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/2\u0003\n\u0005"+
		"\u000002\u0003\f\u0006\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000"+
		"\u00002\t\u0001\u0000\u0000\u000034\u0005\u0006\u0000\u00004\u000b\u0001"+
		"\u0000\u0000\u000056\u0005\u0005\u0000\u00006\r\u0001\u0000\u0000\u0000"+
		"78\u0005\u0007\u0000\u00008\u000f\u0001\u0000\u0000\u00009:\u0005\b\u0000"+
		"\u0000:\u0011\u0001\u0000\u0000\u0000;<\u0005\t\u0000\u0000<\u0013\u0001"+
		"\u0000\u0000\u0000\u0005\u0016\u001c#+1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}