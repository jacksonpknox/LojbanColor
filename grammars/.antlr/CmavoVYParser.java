// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoVY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoVYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VA=1, VAU=2, VEHA=3, VEHO=4, VEI=5, VIHA=6, VUHO=7, VUHU=8, XI=9, Y=10;
	public static final int
		RULE_cmavovy = 0, RULE_va = 1, RULE_vau = 2, RULE_veha = 3, RULE_veho = 4, 
		RULE_vei = 5, RULE_viha = 6, RULE_vuho = 7, RULE_vuhu = 8, RULE_xi = 9, 
		RULE_y = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavovy", "va", "vau", "veha", "veho", "vei", "viha", "vuho", "vuhu", 
			"xi", "y"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'vau'", null, "'ve'o'", "'vei'", null, "'vu'o'", null, "'xi'", 
			"'.y.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VA", "VAU", "VEHA", "VEHO", "VEI", "VIHA", "VUHO", "VUHU", "XI", 
			"Y"
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
	public String getGrammarFileName() { return "CmavoVY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoVYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavovyContext extends ParserRuleContext {
		public VaContext va() {
			return getRuleContext(VaContext.class,0);
		}
		public VauContext vau() {
			return getRuleContext(VauContext.class,0);
		}
		public VehaContext veha() {
			return getRuleContext(VehaContext.class,0);
		}
		public VehoContext veho() {
			return getRuleContext(VehoContext.class,0);
		}
		public VeiContext vei() {
			return getRuleContext(VeiContext.class,0);
		}
		public VihaContext viha() {
			return getRuleContext(VihaContext.class,0);
		}
		public VuhoContext vuho() {
			return getRuleContext(VuhoContext.class,0);
		}
		public VuhuContext vuhu() {
			return getRuleContext(VuhuContext.class,0);
		}
		public XiContext xi() {
			return getRuleContext(XiContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public CmavovyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavovy; }
	}

	public final CmavovyContext cmavovy() throws RecognitionException {
		CmavovyContext _localctx = new CmavovyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavovy);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VA:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				va();
				}
				break;
			case VAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				vau();
				}
				break;
			case VEHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				veha();
				}
				break;
			case VEHO:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				veho();
				}
				break;
			case VEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				vei();
				}
				break;
			case VIHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				viha();
				}
				break;
			case VUHO:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				vuho();
				}
				break;
			case VUHU:
				enterOuterAlt(_localctx, 8);
				{
				setState(29);
				vuhu();
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 9);
				{
				setState(30);
				xi();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				y();
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

	public static class VaContext extends ParserRuleContext {
		public TerminalNode VA() { return getToken(CmavoVYParser.VA, 0); }
		public VaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va; }
	}

	public final VaContext va() throws RecognitionException {
		VaContext _localctx = new VaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_va);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(VA);
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

	public static class VauContext extends ParserRuleContext {
		public TerminalNode VAU() { return getToken(CmavoVYParser.VAU, 0); }
		public VauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vau; }
	}

	public final VauContext vau() throws RecognitionException {
		VauContext _localctx = new VauContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(VAU);
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

	public static class VehaContext extends ParserRuleContext {
		public TerminalNode VEHA() { return getToken(CmavoVYParser.VEHA, 0); }
		public VehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veha; }
	}

	public final VehaContext veha() throws RecognitionException {
		VehaContext _localctx = new VehaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_veha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VEHA);
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

	public static class VehoContext extends ParserRuleContext {
		public TerminalNode VEHO() { return getToken(CmavoVYParser.VEHO, 0); }
		public VehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veho; }
	}

	public final VehoContext veho() throws RecognitionException {
		VehoContext _localctx = new VehoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_veho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(VEHO);
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

	public static class VeiContext extends ParserRuleContext {
		public TerminalNode VEI() { return getToken(CmavoVYParser.VEI, 0); }
		public VeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vei; }
	}

	public final VeiContext vei() throws RecognitionException {
		VeiContext _localctx = new VeiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(VEI);
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

	public static class VihaContext extends ParserRuleContext {
		public TerminalNode VIHA() { return getToken(CmavoVYParser.VIHA, 0); }
		public VihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viha; }
	}

	public final VihaContext viha() throws RecognitionException {
		VihaContext _localctx = new VihaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_viha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(VIHA);
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

	public static class VuhoContext extends ParserRuleContext {
		public TerminalNode VUHO() { return getToken(CmavoVYParser.VUHO, 0); }
		public VuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuho; }
	}

	public final VuhoContext vuho() throws RecognitionException {
		VuhoContext _localctx = new VuhoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VUHO);
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

	public static class VuhuContext extends ParserRuleContext {
		public TerminalNode VUHU() { return getToken(CmavoVYParser.VUHU, 0); }
		public VuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuhu; }
	}

	public final VuhuContext vuhu() throws RecognitionException {
		VuhuContext _localctx = new VuhuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(VUHU);
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

	public static class XiContext extends ParserRuleContext {
		public TerminalNode XI() { return getToken(CmavoVYParser.XI, 0); }
		public XiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xi; }
	}

	public final XiContext xi() throws RecognitionException {
		XiContext _localctx = new XiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_xi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(XI);
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
		public TerminalNode Y() { return getToken(CmavoVYParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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