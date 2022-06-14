// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoZ.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoZParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZAHO=1, ZEHA=2, ZEI=3, ZIHE=4, ZI=5, ZOHU=6, ZOI=7, ZO=8;
	public static final int
		RULE_cmavoz = 0, RULE_zaho = 1, RULE_zeha = 2, RULE_zei = 3, RULE_zihe = 4, 
		RULE_zi = 5, RULE_zohu = 6, RULE_zoi = 7, RULE_zo = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavoz", "zaho", "zeha", "zei", "zihe", "zi", "zohu", "zoi", "zo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'zei'", "'zi'e'", null, "'zo'u'", "'zoi'", "'zo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZAHO", "ZEHA", "ZEI", "ZIHE", "ZI", "ZOHU", "ZOI", "ZO"
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
	public String getGrammarFileName() { return "CmavoZ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoZParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavozContext extends ParserRuleContext {
		public ZahoContext zaho() {
			return getRuleContext(ZahoContext.class,0);
		}
		public ZehaContext zeha() {
			return getRuleContext(ZehaContext.class,0);
		}
		public ZeiContext zei() {
			return getRuleContext(ZeiContext.class,0);
		}
		public ZiheContext zihe() {
			return getRuleContext(ZiheContext.class,0);
		}
		public ZiContext zi() {
			return getRuleContext(ZiContext.class,0);
		}
		public ZohuContext zohu() {
			return getRuleContext(ZohuContext.class,0);
		}
		public ZoiContext zoi() {
			return getRuleContext(ZoiContext.class,0);
		}
		public ZoContext zo() {
			return getRuleContext(ZoContext.class,0);
		}
		public CmavozContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavoz; }
	}

	public final CmavozContext cmavoz() throws RecognitionException {
		CmavozContext _localctx = new CmavozContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavoz);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				zaho();
				}
				break;
			case ZEHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				zeha();
				}
				break;
			case ZEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				zei();
				}
				break;
			case ZIHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				zihe();
				}
				break;
			case ZI:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				zi();
				}
				break;
			case ZOHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(23);
				zohu();
				}
				break;
			case ZOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(24);
				zoi();
				}
				break;
			case ZO:
				enterOuterAlt(_localctx, 8);
				{
				setState(25);
				zo();
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

	public static class ZahoContext extends ParserRuleContext {
		public TerminalNode ZAHO() { return getToken(CmavoZParser.ZAHO, 0); }
		public ZahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zaho; }
	}

	public final ZahoContext zaho() throws RecognitionException {
		ZahoContext _localctx = new ZahoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_zaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ZAHO);
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

	public static class ZehaContext extends ParserRuleContext {
		public TerminalNode ZEHA() { return getToken(CmavoZParser.ZEHA, 0); }
		public ZehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeha; }
	}

	public final ZehaContext zeha() throws RecognitionException {
		ZehaContext _localctx = new ZehaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_zeha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ZEHA);
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

	public static class ZeiContext extends ParserRuleContext {
		public TerminalNode ZEI() { return getToken(CmavoZParser.ZEI, 0); }
		public ZeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zei; }
	}

	public final ZeiContext zei() throws RecognitionException {
		ZeiContext _localctx = new ZeiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_zei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ZEI);
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

	public static class ZiheContext extends ParserRuleContext {
		public TerminalNode ZIHE() { return getToken(CmavoZParser.ZIHE, 0); }
		public ZiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zihe; }
	}

	public final ZiheContext zihe() throws RecognitionException {
		ZiheContext _localctx = new ZiheContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ZIHE);
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

	public static class ZiContext extends ParserRuleContext {
		public TerminalNode ZI() { return getToken(CmavoZParser.ZI, 0); }
		public ZiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zi; }
	}

	public final ZiContext zi() throws RecognitionException {
		ZiContext _localctx = new ZiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ZI);
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

	public static class ZohuContext extends ParserRuleContext {
		public TerminalNode ZOHU() { return getToken(CmavoZParser.ZOHU, 0); }
		public ZohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zohu; }
	}

	public final ZohuContext zohu() throws RecognitionException {
		ZohuContext _localctx = new ZohuContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_zohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ZOHU);
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

	public static class ZoiContext extends ParserRuleContext {
		public TerminalNode ZOI() { return getToken(CmavoZParser.ZOI, 0); }
		public ZoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zoi; }
	}

	public final ZoiContext zoi() throws RecognitionException {
		ZoiContext _localctx = new ZoiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_zoi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ZOI);
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

	public static class ZoContext extends ParserRuleContext {
		public TerminalNode ZO() { return getToken(CmavoZParser.ZO, 0); }
		public ZoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zo; }
	}

	public final ZoContext zo() throws RecognitionException {
		ZoContext _localctx = new ZoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_zo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ZO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2,\2\34"+
		"\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16"+
		"(\3\2\2\2\20*\3\2\2\2\22,\3\2\2\2\24\35\5\4\3\2\25\35\5\6\4\2\26\35\5"+
		"\b\5\2\27\35\5\n\6\2\30\35\5\f\7\2\31\35\5\16\b\2\32\35\5\20\t\2\33\35"+
		"\5\22\n\2\34\24\3\2\2\2\34\25\3\2\2\2\34\26\3\2\2\2\34\27\3\2\2\2\34\30"+
		"\3\2\2\2\34\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\3\3\2\2\2\36\37"+
		"\7\3\2\2\37\5\3\2\2\2 !\7\4\2\2!\7\3\2\2\2\"#\7\5\2\2#\t\3\2\2\2$%\7\6"+
		"\2\2%\13\3\2\2\2&\'\7\7\2\2\'\r\3\2\2\2()\7\b\2\2)\17\3\2\2\2*+\7\t\2"+
		"\2+\21\3\2\2\2,-\7\n\2\2-\23\3\2\2\2\3\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}