// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoRS.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoRSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RAHO=1, ROI=2, SA=3, SEHU=4, SEI=5, SE=6, SI=7, SOI=8, SU=9;
	public static final int
		RULE_cmavors = 0, RULE_raho = 1, RULE_roi = 2, RULE_sa = 3, RULE_sehu = 4, 
		RULE_sei = 5, RULE_se = 6, RULE_si = 7, RULE_soi = 8, RULE_su = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavors", "raho", "roi", "sa", "sehu", "sei", "se", "si", "soi", "su"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ra'o'", null, "'sa'", "'se'u'", "'sei'", null, "'si'", "'soi'", 
			"'su'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RAHO", "ROI", "SA", "SEHU", "SEI", "SE", "SI", "SOI", "SU"
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
	public String getGrammarFileName() { return "CmavoRS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoRSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavorsContext extends ParserRuleContext {
		public RahoContext raho() {
			return getRuleContext(RahoContext.class,0);
		}
		public RoiContext roi() {
			return getRuleContext(RoiContext.class,0);
		}
		public SaContext sa() {
			return getRuleContext(SaContext.class,0);
		}
		public SehuContext sehu() {
			return getRuleContext(SehuContext.class,0);
		}
		public SeiContext sei() {
			return getRuleContext(SeiContext.class,0);
		}
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SoiContext soi() {
			return getRuleContext(SoiContext.class,0);
		}
		public SuContext su() {
			return getRuleContext(SuContext.class,0);
		}
		public CmavorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavors; }
	}

	public final CmavorsContext cmavors() throws RecognitionException {
		CmavorsContext _localctx = new CmavorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavors);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				raho();
				}
				break;
			case ROI:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				roi();
				}
				break;
			case SA:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				sa();
				}
				break;
			case SEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				sehu();
				}
				break;
			case SEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				sei();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				se();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				si();
				}
				break;
			case SOI:
				enterOuterAlt(_localctx, 8);
				{
				setState(27);
				soi();
				}
				break;
			case SU:
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
				su();
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

	public static class RahoContext extends ParserRuleContext {
		public TerminalNode RAHO() { return getToken(CmavoRSParser.RAHO, 0); }
		public RahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raho; }
	}

	public final RahoContext raho() throws RecognitionException {
		RahoContext _localctx = new RahoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_raho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(RAHO);
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

	public static class RoiContext extends ParserRuleContext {
		public TerminalNode ROI() { return getToken(CmavoRSParser.ROI, 0); }
		public RoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roi; }
	}

	public final RoiContext roi() throws RecognitionException {
		RoiContext _localctx = new RoiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_roi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ROI);
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

	public static class SaContext extends ParserRuleContext {
		public TerminalNode SA() { return getToken(CmavoRSParser.SA, 0); }
		public SaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sa; }
	}

	public final SaContext sa() throws RecognitionException {
		SaContext _localctx = new SaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(SA);
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

	public static class SehuContext extends ParserRuleContext {
		public TerminalNode SEHU() { return getToken(CmavoRSParser.SEHU, 0); }
		public SehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehu; }
	}

	public final SehuContext sehu() throws RecognitionException {
		SehuContext _localctx = new SehuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SEHU);
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

	public static class SeiContext extends ParserRuleContext {
		public TerminalNode SEI() { return getToken(CmavoRSParser.SEI, 0); }
		public SeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sei; }
	}

	public final SeiContext sei() throws RecognitionException {
		SeiContext _localctx = new SeiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(SEI);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(CmavoRSParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SE);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(CmavoRSParser.SI, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SI);
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

	public static class SoiContext extends ParserRuleContext {
		public TerminalNode SOI() { return getToken(CmavoRSParser.SOI, 0); }
		public SoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soi; }
	}

	public final SoiContext soi() throws RecognitionException {
		SoiContext _localctx = new SoiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_soi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(SOI);
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

	public static class SuContext extends ParserRuleContext {
		public TerminalNode SU() { return getToken(CmavoRSParser.SU, 0); }
		public SuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_su; }
	}

	public final SuContext su() throws RecognitionException {
		SuContext _localctx = new SuContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_su);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SU);
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