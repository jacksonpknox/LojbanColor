// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoCD.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoCDParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CAHA=1, CAI=2, CEHE=3, CEI=4, CO=5, COI=6, CU=7, CUHE=8, DAHO=9, DOHU=10, 
		DOI=11;
	public static final int
		RULE_cmavocd = 0, RULE_caha = 1, RULE_cai = 2, RULE_cehe = 3, RULE_cei = 4, 
		RULE_co = 5, RULE_coi = 6, RULE_cu = 7, RULE_cuhe = 8, RULE_daho = 9, 
		RULE_doi = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavocd", "caha", "cai", "cehe", "cei", "co", "coi", "cu", "cuhe", "daho", 
			"doi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ce'e'", "'cei'", "'co'", null, "'cu'", null, "'da'o'", 
			"'do'u'", "'doi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CAHA", "CAI", "CEHE", "CEI", "CO", "COI", "CU", "CUHE", "DAHO", 
			"DOHU", "DOI"
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
	public String getGrammarFileName() { return "CmavoCD.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoCDParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavocdContext extends ParserRuleContext {
		public CahaContext caha() {
			return getRuleContext(CahaContext.class,0);
		}
		public CaiContext cai() {
			return getRuleContext(CaiContext.class,0);
		}
		public CeheContext cehe() {
			return getRuleContext(CeheContext.class,0);
		}
		public CeiContext cei() {
			return getRuleContext(CeiContext.class,0);
		}
		public CoContext co() {
			return getRuleContext(CoContext.class,0);
		}
		public CoiContext coi() {
			return getRuleContext(CoiContext.class,0);
		}
		public CuContext cu() {
			return getRuleContext(CuContext.class,0);
		}
		public CuheContext cuhe() {
			return getRuleContext(CuheContext.class,0);
		}
		public DahoContext daho() {
			return getRuleContext(DahoContext.class,0);
		}
		public DoiContext doi() {
			return getRuleContext(DoiContext.class,0);
		}
		public CmavocdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavocd; }
	}

	public final CmavocdContext cmavocd() throws RecognitionException {
		CmavocdContext _localctx = new CmavocdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavocd);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				caha();
				}
				break;
			case CAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				cai();
				}
				break;
			case CEHE:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				cehe();
				}
				break;
			case CEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				cei();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 5);
				{
				setState(26);
				co();
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 6);
				{
				setState(27);
				coi();
				}
				break;
			case CU:
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				cu();
				}
				break;
			case CUHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(29);
				cuhe();
				}
				break;
			case DAHO:
				enterOuterAlt(_localctx, 9);
				{
				setState(30);
				daho();
				}
				break;
			case DOI:
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				doi();
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

	public static class CahaContext extends ParserRuleContext {
		public TerminalNode CAHA() { return getToken(CmavoCDParser.CAHA, 0); }
		public CahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caha; }
	}

	public final CahaContext caha() throws RecognitionException {
		CahaContext _localctx = new CahaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_caha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CAHA);
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

	public static class CaiContext extends ParserRuleContext {
		public TerminalNode CAI() { return getToken(CmavoCDParser.CAI, 0); }
		public CaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cai; }
	}

	public final CaiContext cai() throws RecognitionException {
		CaiContext _localctx = new CaiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CAI);
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

	public static class CeheContext extends ParserRuleContext {
		public TerminalNode CEHE() { return getToken(CmavoCDParser.CEHE, 0); }
		public CeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cehe; }
	}

	public final CeheContext cehe() throws RecognitionException {
		CeheContext _localctx = new CeheContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(CEHE);
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

	public static class CeiContext extends ParserRuleContext {
		public TerminalNode CEI() { return getToken(CmavoCDParser.CEI, 0); }
		public CeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cei; }
	}

	public final CeiContext cei() throws RecognitionException {
		CeiContext _localctx = new CeiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CEI);
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

	public static class CoContext extends ParserRuleContext {
		public TerminalNode CO() { return getToken(CmavoCDParser.CO, 0); }
		public CoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_co; }
	}

	public final CoContext co() throws RecognitionException {
		CoContext _localctx = new CoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_co);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(CO);
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

	public static class CoiContext extends ParserRuleContext {
		public TerminalNode COI() { return getToken(CmavoCDParser.COI, 0); }
		public CoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coi; }
	}

	public final CoiContext coi() throws RecognitionException {
		CoiContext _localctx = new CoiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(COI);
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

	public static class CuContext extends ParserRuleContext {
		public TerminalNode CU() { return getToken(CmavoCDParser.CU, 0); }
		public CuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cu; }
	}

	public final CuContext cu() throws RecognitionException {
		CuContext _localctx = new CuContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(CU);
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

	public static class CuheContext extends ParserRuleContext {
		public TerminalNode CUHE() { return getToken(CmavoCDParser.CUHE, 0); }
		public CuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuhe; }
	}

	public final CuheContext cuhe() throws RecognitionException {
		CuheContext _localctx = new CuheContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CUHE);
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

	public static class DahoContext extends ParserRuleContext {
		public TerminalNode DAHO() { return getToken(CmavoCDParser.DAHO, 0); }
		public DahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daho; }
	}

	public final DahoContext daho() throws RecognitionException {
		DahoContext _localctx = new DahoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_daho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(DAHO);
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

	public static class DoiContext extends ParserRuleContext {
		public TerminalNode DOI() { return getToken(CmavoCDParser.DOI, 0); }
		public DoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doi; }
	}

	public final DoiContext doi() throws RecognitionException {
		DoiContext _localctx = new DoiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(DOI);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r9\4\2\t\2\4\3\t"+
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
		"\65\7\13\2\2\65\25\3\2\2\2\66\67\7\r\2\2\67\27\3\2\2\2\3\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}