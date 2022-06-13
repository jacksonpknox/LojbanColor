// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FA=1, FAHA=2, FAHO=3, FEHE=4, FEHU=5, FIHO=6, FOI=7, FUHA=8, FUHE=9, FUHO=10;
	public static final int
		RULE_cmavof = 0, RULE_fa = 1, RULE_faha = 2, RULE_faho = 3, RULE_fehe = 4, 
		RULE_fehu = 5, RULE_fiho = 6, RULE_foi = 7, RULE_fuha = 8, RULE_fuhe = 9, 
		RULE_fuho = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavof", "fa", "faha", "faho", "fehe", "fehu", "fiho", "foi", "fuha", 
			"fuhe", "fuho"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'fa'o'", "'fe'e'", "'fe'u'", "'fi'o'", "'foi'", "'fu'a'", 
			"'fu'e'", "'fu'o'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FA", "FAHA", "FAHO", "FEHE", "FEHU", "FIHO", "FOI", "FUHA", "FUHE", 
			"FUHO"
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
	public String getGrammarFileName() { return "CmavoF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavofContext extends ParserRuleContext {
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public FahaContext faha() {
			return getRuleContext(FahaContext.class,0);
		}
		public FahoContext faho() {
			return getRuleContext(FahoContext.class,0);
		}
		public FeheContext fehe() {
			return getRuleContext(FeheContext.class,0);
		}
		public FehuContext fehu() {
			return getRuleContext(FehuContext.class,0);
		}
		public FihoContext fiho() {
			return getRuleContext(FihoContext.class,0);
		}
		public FoiContext foi() {
			return getRuleContext(FoiContext.class,0);
		}
		public FuhaContext fuha() {
			return getRuleContext(FuhaContext.class,0);
		}
		public FuheContext fuhe() {
			return getRuleContext(FuheContext.class,0);
		}
		public FuhoContext fuho() {
			return getRuleContext(FuhoContext.class,0);
		}
		public CmavofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavof; }
	}

	public final CmavofContext cmavof() throws RecognitionException {
		CmavofContext _localctx = new CmavofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavof);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FA:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				fa();
				}
				break;
			case FAHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				faha();
				}
				break;
			case FAHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				faho();
				}
				break;
			case FEHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				fehe();
				}
				break;
			case FEHU:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				fehu();
				}
				break;
			case FIHO:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				fiho();
				}
				break;
			case FOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				foi();
				}
				break;
			case FUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(29);
				fuha();
				}
				break;
			case FUHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(30);
				fuhe();
				}
				break;
			case FUHO:
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				fuho();
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

	public static class FaContext extends ParserRuleContext {
		public TerminalNode FA() { return getToken(CmavoFParser.FA, 0); }
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(FA);
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

	public static class FahaContext extends ParserRuleContext {
		public TerminalNode FAHA() { return getToken(CmavoFParser.FAHA, 0); }
		public FahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faha; }
	}

	public final FahaContext faha() throws RecognitionException {
		FahaContext _localctx = new FahaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_faha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(FAHA);
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

	public static class FahoContext extends ParserRuleContext {
		public TerminalNode FAHO() { return getToken(CmavoFParser.FAHO, 0); }
		public FahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faho; }
	}

	public final FahoContext faho() throws RecognitionException {
		FahoContext _localctx = new FahoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_faho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(FAHO);
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

	public static class FeheContext extends ParserRuleContext {
		public TerminalNode FEHE() { return getToken(CmavoFParser.FEHE, 0); }
		public FeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehe; }
	}

	public final FeheContext fehe() throws RecognitionException {
		FeheContext _localctx = new FeheContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(FEHE);
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

	public static class FehuContext extends ParserRuleContext {
		public TerminalNode FEHU() { return getToken(CmavoFParser.FEHU, 0); }
		public FehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehu; }
	}

	public final FehuContext fehu() throws RecognitionException {
		FehuContext _localctx = new FehuContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FEHU);
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

	public static class FihoContext extends ParserRuleContext {
		public TerminalNode FIHO() { return getToken(CmavoFParser.FIHO, 0); }
		public FihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiho; }
	}

	public final FihoContext fiho() throws RecognitionException {
		FihoContext _localctx = new FihoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fiho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(FIHO);
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

	public static class FoiContext extends ParserRuleContext {
		public TerminalNode FOI() { return getToken(CmavoFParser.FOI, 0); }
		public FoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foi; }
	}

	public final FoiContext foi() throws RecognitionException {
		FoiContext _localctx = new FoiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_foi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(FOI);
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

	public static class FuhaContext extends ParserRuleContext {
		public TerminalNode FUHA() { return getToken(CmavoFParser.FUHA, 0); }
		public FuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuha; }
	}

	public final FuhaContext fuha() throws RecognitionException {
		FuhaContext _localctx = new FuhaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(FUHA);
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

	public static class FuheContext extends ParserRuleContext {
		public TerminalNode FUHE() { return getToken(CmavoFParser.FUHE, 0); }
		public FuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuhe; }
	}

	public final FuheContext fuhe() throws RecognitionException {
		FuheContext _localctx = new FuheContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FUHE);
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

	public static class FuhoContext extends ParserRuleContext {
		public TerminalNode FUHO() { return getToken(CmavoFParser.FUHO, 0); }
		public FuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuho; }
	}

	public final FuhoContext fuho() throws RecognitionException {
		FuhoContext _localctx = new FuhoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(FUHO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\66\2\"\3\2\2\2\4$\3\2\2\2\6"+
		"&\3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f,\3\2\2\2\16.\3\2\2\2\20\60\3\2\2\2\22"+
		"\62\3\2\2\2\24\64\3\2\2\2\26\66\3\2\2\2\30#\5\4\3\2\31#\5\6\4\2\32#\5"+
		"\b\5\2\33#\5\n\6\2\34#\5\f\7\2\35#\5\16\b\2\36#\5\20\t\2\37#\5\22\n\2"+
		" #\5\24\13\2!#\5\26\f\2\"\30\3\2\2\2\"\31\3\2\2\2\"\32\3\2\2\2\"\33\3"+
		"\2\2\2\"\34\3\2\2\2\"\35\3\2\2\2\"\36\3\2\2\2\"\37\3\2\2\2\" \3\2\2\2"+
		"\"!\3\2\2\2#\3\3\2\2\2$%\7\3\2\2%\5\3\2\2\2&\'\7\4\2\2\'\7\3\2\2\2()\7"+
		"\5\2\2)\t\3\2\2\2*+\7\6\2\2+\13\3\2\2\2,-\7\7\2\2-\r\3\2\2\2./\7\b\2\2"+
		"/\17\3\2\2\2\60\61\7\t\2\2\61\21\3\2\2\2\62\63\7\n\2\2\63\23\3\2\2\2\64"+
		"\65\7\13\2\2\65\25\3\2\2\2\66\67\7\f\2\2\67\27\3\2\2\2\3\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}