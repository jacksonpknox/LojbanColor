// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\Color.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			null, "'\r'", "'\n'"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7$\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\2\3\2\6\2\23\n\2\r\2\16"+
		"\2\24\3\3\6\3\30\n\3\r\3\16\3\31\3\4\3\4\5\4\36\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\2\2\7\2\4\6\b\n\2\2\2\"\2\22\3\2\2\2\4\27\3\2\2\2\6\35\3\2\2\2\b\37"+
		"\3\2\2\2\n!\3\2\2\2\f\16\5\4\3\2\r\17\7\3\2\2\16\r\3\2\2\2\16\17\3\2\2"+
		"\2\17\20\3\2\2\2\20\21\7\4\2\2\21\23\3\2\2\2\22\f\3\2\2\2\23\24\3\2\2"+
		"\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2"+
		"\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\36\5\b\5"+
		"\2\34\36\5\n\6\2\35\33\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2\2\37 \7\6\2\2"+
		" \t\3\2\2\2!\"\7\7\2\2\"\13\3\2\2\2\6\16\24\31\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}