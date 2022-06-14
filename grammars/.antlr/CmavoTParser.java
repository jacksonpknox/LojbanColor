// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAHE=1, TEHU=2, TEI=3, TOI=4, TO=5, TUHE=6, TUHU=7;
	public static final int
		RULE_cmavot = 0, RULE_tahe = 1, RULE_tehu = 2, RULE_tei = 3, RULE_toi = 4, 
		RULE_to = 5, RULE_tuhe = 6, RULE_tuhu = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavot", "tahe", "tehu", "tei", "toi", "to", "tuhe", "tuhu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'te'u'", "'tei'", "'toi'", "'to'", "'tu'e'", "'tu'u'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAHE", "TEHU", "TEI", "TOI", "TO", "TUHE", "TUHU"
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
	public String getGrammarFileName() { return "CmavoT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavotContext extends ParserRuleContext {
		public TaheContext tahe() {
			return getRuleContext(TaheContext.class,0);
		}
		public TehuContext tehu() {
			return getRuleContext(TehuContext.class,0);
		}
		public TeiContext tei() {
			return getRuleContext(TeiContext.class,0);
		}
		public ToiContext toi() {
			return getRuleContext(ToiContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TuheContext tuhe() {
			return getRuleContext(TuheContext.class,0);
		}
		public TuhuContext tuhu() {
			return getRuleContext(TuhuContext.class,0);
		}
		public CmavotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavot; }
	}

	public final CmavotContext cmavot() throws RecognitionException {
		CmavotContext _localctx = new CmavotContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavot);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				tahe();
				}
				break;
			case TEHU:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				tehu();
				}
				break;
			case TEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				tei();
				}
				break;
			case TOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				toi();
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 5);
				{
				setState(20);
				to();
				}
				break;
			case TUHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				tuhe();
				}
				break;
			case TUHU:
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				tuhu();
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

	public static class TaheContext extends ParserRuleContext {
		public TerminalNode TAHE() { return getToken(CmavoTParser.TAHE, 0); }
		public TaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tahe; }
	}

	public final TaheContext tahe() throws RecognitionException {
		TaheContext _localctx = new TaheContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(TAHE);
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

	public static class TehuContext extends ParserRuleContext {
		public TerminalNode TEHU() { return getToken(CmavoTParser.TEHU, 0); }
		public TehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehu; }
	}

	public final TehuContext tehu() throws RecognitionException {
		TehuContext _localctx = new TehuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(TEHU);
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

	public static class TeiContext extends ParserRuleContext {
		public TerminalNode TEI() { return getToken(CmavoTParser.TEI, 0); }
		public TeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tei; }
	}

	public final TeiContext tei() throws RecognitionException {
		TeiContext _localctx = new TeiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TEI);
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

	public static class ToiContext extends ParserRuleContext {
		public TerminalNode TOI() { return getToken(CmavoTParser.TOI, 0); }
		public ToiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toi; }
	}

	public final ToiContext toi() throws RecognitionException {
		ToiContext _localctx = new ToiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_toi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(TOI);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(CmavoTParser.TO, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(TO);
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

	public static class TuheContext extends ParserRuleContext {
		public TerminalNode TUHE() { return getToken(CmavoTParser.TUHE, 0); }
		public TuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhe; }
	}

	public final TuheContext tuhe() throws RecognitionException {
		TuheContext _localctx = new TuheContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TUHE);
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

	public static class TuhuContext extends ParserRuleContext {
		public TerminalNode TUHU() { return getToken(CmavoTParser.TUHU, 0); }
		public TuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhu; }
	}

	public final TuhuContext tuhu() throws RecognitionException {
		TuhuContext _localctx = new TuhuContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TUHU);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\'\2\31\3\2\2\2\4\33\3\2\2\2\6"+
		"\35\3\2\2\2\b\37\3\2\2\2\n!\3\2\2\2\f#\3\2\2\2\16%\3\2\2\2\20\'\3\2\2"+
		"\2\22\32\5\4\3\2\23\32\5\6\4\2\24\32\5\b\5\2\25\32\5\n\6\2\26\32\5\f\7"+
		"\2\27\32\5\16\b\2\30\32\5\20\t\2\31\22\3\2\2\2\31\23\3\2\2\2\31\24\3\2"+
		"\2\2\31\25\3\2\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\3\3\2"+
		"\2\2\33\34\7\3\2\2\34\5\3\2\2\2\35\36\7\4\2\2\36\7\3\2\2\2\37 \7\5\2\2"+
		" \t\3\2\2\2!\"\7\6\2\2\"\13\3\2\2\2#$\7\7\2\2$\r\3\2\2\2%&\7\b\2\2&\17"+
		"\3\2\2\2\'(\7\t\2\2(\21\3\2\2\2\3\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}