// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LAHE=1, LA=2, LAU=3, LEHU=4, LE=5, LIHU=6, LI=7, LOHO=8, LOHU=9, LUHU=10, 
		LU=11;
	public static final int
		RULE_cmavol = 0, RULE_lahe = 1, RULE_la = 2, RULE_lau = 3, RULE_lehu = 4, 
		RULE_le = 5, RULE_lihu = 6, RULE_li = 7, RULE_loho = 8, RULE_lohu = 9, 
		RULE_luhu = 10, RULE_lu = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavol", "lahe", "la", "lau", "lehu", "le", "lihu", "li", "loho", "lohu", 
			"luhu", "lu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'la'", null, "'le'u'", null, "'li'u'", "'li'", "'lo'o'", 
			"'lo'u'", "'lu'u'", "'lu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LAHE", "LA", "LAU", "LEHU", "LE", "LIHU", "LI", "LOHO", "LOHU", 
			"LUHU", "LU"
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
	public String getGrammarFileName() { return "CmavoL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavolContext extends ParserRuleContext {
		public LaheContext lahe() {
			return getRuleContext(LaheContext.class,0);
		}
		public LaContext la() {
			return getRuleContext(LaContext.class,0);
		}
		public LauContext lau() {
			return getRuleContext(LauContext.class,0);
		}
		public LehuContext lehu() {
			return getRuleContext(LehuContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public LihuContext lihu() {
			return getRuleContext(LihuContext.class,0);
		}
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public LohoContext loho() {
			return getRuleContext(LohoContext.class,0);
		}
		public LohuContext lohu() {
			return getRuleContext(LohuContext.class,0);
		}
		public LuhuContext luhu() {
			return getRuleContext(LuhuContext.class,0);
		}
		public LuContext lu() {
			return getRuleContext(LuContext.class,0);
		}
		public CmavolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavol; }
	}

	public final CmavolContext cmavol() throws RecognitionException {
		CmavolContext _localctx = new CmavolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavol);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				lahe();
				}
				break;
			case LA:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				la();
				}
				break;
			case LAU:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				lau();
				}
				break;
			case LEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				lehu();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				le();
				}
				break;
			case LIHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				lihu();
				}
				break;
			case LI:
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				li();
				}
				break;
			case LOHO:
				enterOuterAlt(_localctx, 8);
				{
				setState(31);
				loho();
				}
				break;
			case LOHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(32);
				lohu();
				}
				break;
			case LUHU:
				enterOuterAlt(_localctx, 10);
				{
				setState(33);
				luhu();
				}
				break;
			case LU:
				enterOuterAlt(_localctx, 11);
				{
				setState(34);
				lu();
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

	public static class LaheContext extends ParserRuleContext {
		public TerminalNode LAHE() { return getToken(CmavoLParser.LAHE, 0); }
		public LaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lahe; }
	}

	public final LaheContext lahe() throws RecognitionException {
		LaheContext _localctx = new LaheContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LAHE);
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

	public static class LaContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(CmavoLParser.LA, 0); }
		public LaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_la; }
	}

	public final LaContext la() throws RecognitionException {
		LaContext _localctx = new LaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_la);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(LA);
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

	public static class LauContext extends ParserRuleContext {
		public TerminalNode LAU() { return getToken(CmavoLParser.LAU, 0); }
		public LauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lau; }
	}

	public final LauContext lau() throws RecognitionException {
		LauContext _localctx = new LauContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LAU);
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

	public static class LehuContext extends ParserRuleContext {
		public TerminalNode LEHU() { return getToken(CmavoLParser.LEHU, 0); }
		public LehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lehu; }
	}

	public final LehuContext lehu() throws RecognitionException {
		LehuContext _localctx = new LehuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(LEHU);
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

	public static class LeContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(CmavoLParser.LE, 0); }
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LE);
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

	public static class LihuContext extends ParserRuleContext {
		public TerminalNode LIHU() { return getToken(CmavoLParser.LIHU, 0); }
		public LihuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lihu; }
	}

	public final LihuContext lihu() throws RecognitionException {
		LihuContext _localctx = new LihuContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lihu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LIHU);
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

	public static class LiContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(CmavoLParser.LI, 0); }
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_li);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LI);
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

	public static class LohoContext extends ParserRuleContext {
		public TerminalNode LOHO() { return getToken(CmavoLParser.LOHO, 0); }
		public LohoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loho; }
	}

	public final LohoContext loho() throws RecognitionException {
		LohoContext _localctx = new LohoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LOHO);
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

	public static class LohuContext extends ParserRuleContext {
		public TerminalNode LOHU() { return getToken(CmavoLParser.LOHU, 0); }
		public LohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lohu; }
	}

	public final LohuContext lohu() throws RecognitionException {
		LohuContext _localctx = new LohuContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LOHU);
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

	public static class LuhuContext extends ParserRuleContext {
		public TerminalNode LUHU() { return getToken(CmavoLParser.LUHU, 0); }
		public LuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_luhu; }
	}

	public final LuhuContext luhu() throws RecognitionException {
		LuhuContext _localctx = new LuhuContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_luhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LUHU);
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

	public static class LuContext extends ParserRuleContext {
		public TerminalNode LU() { return getToken(CmavoLParser.LU, 0); }
		public LuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lu; }
	}

	public final LuContext lu() throws RecognitionException {
		LuContext _localctx = new LuContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LU);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2;\2"+
		"%\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2\16\61"+
		"\3\2\2\2\20\63\3\2\2\2\22\65\3\2\2\2\24\67\3\2\2\2\269\3\2\2\2\30;\3\2"+
		"\2\2\32&\5\4\3\2\33&\5\6\4\2\34&\5\b\5\2\35&\5\n\6\2\36&\5\f\7\2\37&\5"+
		"\16\b\2 &\5\20\t\2!&\5\22\n\2\"&\5\24\13\2#&\5\26\f\2$&\5\30\r\2%\32\3"+
		"\2\2\2%\33\3\2\2\2%\34\3\2\2\2%\35\3\2\2\2%\36\3\2\2\2%\37\3\2\2\2% \3"+
		"\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'(\7\3\2\2"+
		"(\5\3\2\2\2)*\7\4\2\2*\7\3\2\2\2+,\7\5\2\2,\t\3\2\2\2-.\7\6\2\2.\13\3"+
		"\2\2\2/\60\7\7\2\2\60\r\3\2\2\2\61\62\7\b\2\2\62\17\3\2\2\2\63\64\7\t"+
		"\2\2\64\21\3\2\2\2\65\66\7\n\2\2\66\23\3\2\2\2\678\7\13\2\28\25\3\2\2"+
		"\29:\7\f\2\2:\27\3\2\2\2;<\7\r\2\2<\31\3\2\2\2\3%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}