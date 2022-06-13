// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\Cmavo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, A=2, BAHE=3, BEHO=4, BEI=5, BE=6, BIHE=7, BIHI=8, BOI=9, BO=10, 
		BU=11;
	public static final int
		RULE_cmavo = 0, RULE_pa = 1, RULE_cmavoab = 2, RULE_a = 3, RULE_bahe = 4, 
		RULE_beho = 5, RULE_bei = 6, RULE_be = 7, RULE_bihe = 8, RULE_boi = 9, 
		RULE_bo = 10, RULE_bu = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavo", "pa", "cmavoab", "a", "bahe", "beho", "bei", "be", "bihe", "boi", 
			"bo", "bu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'be'o'", "'bei'", "'be'", "'bi'e'", null, "'boi'", 
			"'bo'", "'bu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", 
			"BO", "BU"
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
	public String getGrammarFileName() { return "Cmavo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavoContext extends ParserRuleContext {
		public PaContext pa() {
			return getRuleContext(PaContext.class,0);
		}
		public CmavoabContext cmavoab() {
			return getRuleContext(CmavoabContext.class,0);
		}
		public CmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavo; }
	}

	public final CmavoContext cmavo() throws RecognitionException {
		CmavoContext _localctx = new CmavoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavo);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				pa();
				}
				break;
			case A:
			case BAHE:
			case BEHO:
			case BEI:
			case BE:
			case BIHE:
			case BOI:
			case BO:
			case BU:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				cmavoab();
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

	public static class PaContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(CmavoParser.PA, 0); }
		public PaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pa; }
	}

	public final PaContext pa() throws RecognitionException {
		PaContext _localctx = new PaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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

	public static class CmavoabContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public BaheContext bahe() {
			return getRuleContext(BaheContext.class,0);
		}
		public BehoContext beho() {
			return getRuleContext(BehoContext.class,0);
		}
		public BeiContext bei() {
			return getRuleContext(BeiContext.class,0);
		}
		public BeContext be() {
			return getRuleContext(BeContext.class,0);
		}
		public BiheContext bihe() {
			return getRuleContext(BiheContext.class,0);
		}
		public BoiContext boi() {
			return getRuleContext(BoiContext.class,0);
		}
		public BoContext bo() {
			return getRuleContext(BoContext.class,0);
		}
		public BuContext bu() {
			return getRuleContext(BuContext.class,0);
		}
		public CmavoabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavoab; }
	}

	public final CmavoabContext cmavoab() throws RecognitionException {
		CmavoabContext _localctx = new CmavoabContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmavoab);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				a();
				}
				break;
			case BAHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				bahe();
				}
				break;
			case BEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				beho();
				}
				break;
			case BEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				bei();
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				be();
				}
				break;
			case BIHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				bihe();
				}
				break;
			case BOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				boi();
				}
				break;
			case BO:
				enterOuterAlt(_localctx, 8);
				{
				setState(37);
				bo();
				}
				break;
			case BU:
				enterOuterAlt(_localctx, 9);
				{
				setState(38);
				bu();
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(CmavoParser.A, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(A);
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

	public static class BaheContext extends ParserRuleContext {
		public TerminalNode BAHE() { return getToken(CmavoParser.BAHE, 0); }
		public BaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bahe; }
	}

	public final BaheContext bahe() throws RecognitionException {
		BaheContext _localctx = new BaheContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(BAHE);
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

	public static class BehoContext extends ParserRuleContext {
		public TerminalNode BEHO() { return getToken(CmavoParser.BEHO, 0); }
		public BehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beho; }
	}

	public final BehoContext beho() throws RecognitionException {
		BehoContext _localctx = new BehoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_beho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BEHO);
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

	public static class BeiContext extends ParserRuleContext {
		public TerminalNode BEI() { return getToken(CmavoParser.BEI, 0); }
		public BeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bei; }
	}

	public final BeiContext bei() throws RecognitionException {
		BeiContext _localctx = new BeiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(BEI);
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

	public static class BeContext extends ParserRuleContext {
		public TerminalNode BE() { return getToken(CmavoParser.BE, 0); }
		public BeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_be; }
	}

	public final BeContext be() throws RecognitionException {
		BeContext _localctx = new BeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BE);
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

	public static class BiheContext extends ParserRuleContext {
		public TerminalNode BIHE() { return getToken(CmavoParser.BIHE, 0); }
		public BiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bihe; }
	}

	public final BiheContext bihe() throws RecognitionException {
		BiheContext _localctx = new BiheContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(BIHE);
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

	public static class BoiContext extends ParserRuleContext {
		public TerminalNode BOI() { return getToken(CmavoParser.BOI, 0); }
		public BoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boi; }
	}

	public final BoiContext boi() throws RecognitionException {
		BoiContext _localctx = new BoiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(BOI);
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

	public static class BoContext extends ParserRuleContext {
		public TerminalNode BO() { return getToken(CmavoParser.BO, 0); }
		public BoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bo; }
	}

	public final BoContext bo() throws RecognitionException {
		BoContext _localctx = new BoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BO);
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

	public static class BuContext extends ParserRuleContext {
		public TerminalNode BU() { return getToken(CmavoParser.BU, 0); }
		public BuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bu; }
	}

	public final BuContext bu() throws RecognitionException {
		BuContext _localctx = new BuContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(BU);
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
		"\f\t\f\4\r\t\r\3\2\3\2\5\2\35\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4*\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2:"+
		"\2\34\3\2\2\2\4\36\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2"+
		"\16\61\3\2\2\2\20\63\3\2\2\2\22\65\3\2\2\2\24\67\3\2\2\2\269\3\2\2\2\30"+
		";\3\2\2\2\32\35\5\4\3\2\33\35\5\6\4\2\34\32\3\2\2\2\34\33\3\2\2\2\35\3"+
		"\3\2\2\2\36\37\7\3\2\2\37\5\3\2\2\2 *\5\b\5\2!*\5\n\6\2\"*\5\f\7\2#*\5"+
		"\16\b\2$*\5\20\t\2%*\5\22\n\2&*\5\24\13\2\'*\5\26\f\2(*\5\30\r\2) \3\2"+
		"\2\2)!\3\2\2\2)\"\3\2\2\2)#\3\2\2\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3"+
		"\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\7\4\2\2,\t\3\2\2\2-.\7\5\2\2.\13\3\2\2\2"+
		"/\60\7\6\2\2\60\r\3\2\2\2\61\62\7\7\2\2\62\17\3\2\2\2\63\64\7\b\2\2\64"+
		"\21\3\2\2\2\65\66\7\t\2\2\66\23\3\2\2\2\678\7\13\2\28\25\3\2\2\29:\7\f"+
		"\2\2:\27\3\2\2\2;<\7\r\2\2<\31\3\2\2\2\4\34)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}