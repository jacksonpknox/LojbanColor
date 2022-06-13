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
		T__0=1, T__1=2, WS=3, PA=4, LUJVO=5;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_cmavo = 3, RULE_lujvo = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmavo", "lujvo"
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
			null, null, null, "WS", "PA", "LUJVO"
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
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				sentence();
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(11);
					match(T__0);
					}
				}

				setState(14);
				match(T__1);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PA || _la==LUJVO );
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				word();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PA || _la==LUJVO );
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
		public LujvoContext lujvo() {
			return getRuleContext(LujvoContext.class,0);
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
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				cmavo();
				}
				break;
			case LUJVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				lujvo();
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

	public static class CmavoContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(ColorParser.PA, 0); }
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
		enterRule(_localctx, 6, RULE_cmavo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(PA);
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
		enterRule(_localctx, 8, RULE_lujvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\"\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0011\b\u0000\u000b\u0000\f\u0000\u0012\u0001\u0001\u0004\u0001"+
		"\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u001c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000 \u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004"+
		"\u001b\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000\b\u001f"+
		"\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\r\u0005\u0001"+
		"\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f"+
		"\u0011\u0001\u0000\u0000\u0000\u0010\n\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0003\u0004\u0002\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0003\u0006\u0003\u0000\u001a\u001c\u0003\b\u0004\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0005\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0004\u0000\u0000\u001e\u0007\u0001"+
		"\u0000\u0000\u0000\u001f \u0005\u0005\u0000\u0000 \t\u0001\u0000\u0000"+
		"\u0000\u0004\f\u0012\u0017\u001b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}