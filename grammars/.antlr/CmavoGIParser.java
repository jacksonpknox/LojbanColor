// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoGI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoGIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GA=1, GAHO=2, GEHU=3, GI=4, GIHA=5, GOHA=6, GOI=7, GUHA=8, I=9;
	public static final int
		RULE_cmavogi = 0, RULE_ga = 1, RULE_gaho = 2, RULE_gehu = 3, RULE_gi = 4, 
		RULE_giha = 5, RULE_goha = 6, RULE_goi = 7, RULE_guha = 8, RULE_i = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavogi", "ga", "gaho", "gehu", "gi", "giha", "goha", "goi", "guha", 
			"i"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ge'u'", "'gi'", null, null, null, null, "'.i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GA", "GAHO", "GEHU", "GI", "GIHA", "GOHA", "GOI", "GUHA", "I"
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
	public String getGrammarFileName() { return "CmavoGI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoGIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavogiContext extends ParserRuleContext {
		public GaContext ga() {
			return getRuleContext(GaContext.class,0);
		}
		public GahoContext gaho() {
			return getRuleContext(GahoContext.class,0);
		}
		public GehuContext gehu() {
			return getRuleContext(GehuContext.class,0);
		}
		public GiContext gi() {
			return getRuleContext(GiContext.class,0);
		}
		public GihaContext giha() {
			return getRuleContext(GihaContext.class,0);
		}
		public GohaContext goha() {
			return getRuleContext(GohaContext.class,0);
		}
		public GoiContext goi() {
			return getRuleContext(GoiContext.class,0);
		}
		public GuhaContext guha() {
			return getRuleContext(GuhaContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public CmavogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavogi; }
	}

	public final CmavogiContext cmavogi() throws RecognitionException {
		CmavogiContext _localctx = new CmavogiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavogi);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GA:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				ga();
				}
				break;
			case GAHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				gaho();
				}
				break;
			case GEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				gehu();
				}
				break;
			case GI:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				gi();
				}
				break;
			case GIHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				giha();
				}
				break;
			case GOHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				goha();
				}
				break;
			case GOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				goi();
				}
				break;
			case GUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(27);
				guha();
				}
				break;
			case I:
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
				i();
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

	public static class GaContext extends ParserRuleContext {
		public TerminalNode GA() { return getToken(CmavoGIParser.GA, 0); }
		public GaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ga; }
	}

	public final GaContext ga() throws RecognitionException {
		GaContext _localctx = new GaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(GA);
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

	public static class GahoContext extends ParserRuleContext {
		public TerminalNode GAHO() { return getToken(CmavoGIParser.GAHO, 0); }
		public GahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gaho; }
	}

	public final GahoContext gaho() throws RecognitionException {
		GahoContext _localctx = new GahoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(GAHO);
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

	public static class GehuContext extends ParserRuleContext {
		public TerminalNode GEHU() { return getToken(CmavoGIParser.GEHU, 0); }
		public GehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gehu; }
	}

	public final GehuContext gehu() throws RecognitionException {
		GehuContext _localctx = new GehuContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(GEHU);
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

	public static class GiContext extends ParserRuleContext {
		public TerminalNode GI() { return getToken(CmavoGIParser.GI, 0); }
		public GiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gi; }
	}

	public final GiContext gi() throws RecognitionException {
		GiContext _localctx = new GiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(GI);
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

	public static class GihaContext extends ParserRuleContext {
		public TerminalNode GIHA() { return getToken(CmavoGIParser.GIHA, 0); }
		public GihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giha; }
	}

	public final GihaContext giha() throws RecognitionException {
		GihaContext _localctx = new GihaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_giha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(GIHA);
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

	public static class GohaContext extends ParserRuleContext {
		public TerminalNode GOHA() { return getToken(CmavoGIParser.GOHA, 0); }
		public GohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goha; }
	}

	public final GohaContext goha() throws RecognitionException {
		GohaContext _localctx = new GohaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_goha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(GOHA);
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

	public static class GoiContext extends ParserRuleContext {
		public TerminalNode GOI() { return getToken(CmavoGIParser.GOI, 0); }
		public GoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goi; }
	}

	public final GoiContext goi() throws RecognitionException {
		GoiContext _localctx = new GoiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_goi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(GOI);
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

	public static class GuhaContext extends ParserRuleContext {
		public TerminalNode GUHA() { return getToken(CmavoGIParser.GUHA, 0); }
		public GuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guha; }
	}

	public final GuhaContext guha() throws RecognitionException {
		GuhaContext _localctx = new GuhaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_guha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(GUHA);
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

	public static class IContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(CmavoGIParser.I, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(I);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\2\2\61\2\37\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b%\3\2\2"+
		"\2\n\'\3\2\2\2\f)\3\2\2\2\16+\3\2\2\2\20-\3\2\2\2\22/\3\2\2\2\24\61\3"+
		"\2\2\2\26 \5\4\3\2\27 \5\6\4\2\30 \5\b\5\2\31 \5\n\6\2\32 \5\f\7\2\33"+
		" \5\16\b\2\34 \5\20\t\2\35 \5\22\n\2\36 \5\24\13\2\37\26\3\2\2\2\37\27"+
		"\3\2\2\2\37\30\3\2\2\2\37\31\3\2\2\2\37\32\3\2\2\2\37\33\3\2\2\2\37\34"+
		"\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \3\3\2\2\2!\"\7\3\2\2\"\5\3\2\2\2"+
		"#$\7\4\2\2$\7\3\2\2\2%&\7\5\2\2&\t\3\2\2\2\'(\7\6\2\2(\13\3\2\2\2)*\7"+
		"\7\2\2*\r\3\2\2\2+,\7\b\2\2,\17\3\2\2\2-.\7\t\2\2.\21\3\2\2\2/\60\7\n"+
		"\2\2\60\23\3\2\2\2\61\62\7\13\2\2\62\25\3\2\2\2\3\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}