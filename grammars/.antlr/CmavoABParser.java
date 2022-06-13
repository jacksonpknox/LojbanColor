// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoAB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoABParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, BAHE=2, BEHO=3, BEI=4, BE=5, BIHE=6, BIHI=7, BOI=8, BO=9, BU=10;
	public static final int
		RULE_cmavoab = 0, RULE_a = 1, RULE_bahe = 2, RULE_beho = 3, RULE_bei = 4, 
		RULE_be = 5, RULE_bihe = 6, RULE_boi = 7, RULE_bo = 8, RULE_bu = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavoab", "a", "bahe", "beho", "bei", "be", "bihe", "boi", "bo", "bu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'be'o'", "'bei'", "'be'", "'bi'e'", null, "'boi'", 
			"'bo'", "'bu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", 
			"BU"
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
	public String getGrammarFileName() { return "CmavoAB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoABParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		enterRule(_localctx, 0, RULE_cmavoab);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				a();
				}
				break;
			case BAHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				bahe();
				}
				break;
			case BEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				beho();
				}
				break;
			case BEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				bei();
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				be();
				}
				break;
			case BIHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				bihe();
				}
				break;
			case BOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				boi();
				}
				break;
			case BO:
				enterOuterAlt(_localctx, 8);
				{
				setState(27);
				bo();
				}
				break;
			case BU:
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
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
		public TerminalNode A() { return getToken(CmavoABParser.A, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
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
		public TerminalNode BAHE() { return getToken(CmavoABParser.BAHE, 0); }
		public BaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bahe; }
	}

	public final BaheContext bahe() throws RecognitionException {
		BaheContext _localctx = new BaheContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
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
		public TerminalNode BEHO() { return getToken(CmavoABParser.BEHO, 0); }
		public BehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beho; }
	}

	public final BehoContext beho() throws RecognitionException {
		BehoContext _localctx = new BehoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
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
		public TerminalNode BEI() { return getToken(CmavoABParser.BEI, 0); }
		public BeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bei; }
	}

	public final BeiContext bei() throws RecognitionException {
		BeiContext _localctx = new BeiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
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
		public TerminalNode BE() { return getToken(CmavoABParser.BE, 0); }
		public BeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_be; }
	}

	public final BeContext be() throws RecognitionException {
		BeContext _localctx = new BeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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
		public TerminalNode BIHE() { return getToken(CmavoABParser.BIHE, 0); }
		public BiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bihe; }
	}

	public final BiheContext bihe() throws RecognitionException {
		BiheContext _localctx = new BiheContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
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
		public TerminalNode BOI() { return getToken(CmavoABParser.BOI, 0); }
		public BoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boi; }
	}

	public final BoiContext boi() throws RecognitionException {
		BoiContext _localctx = new BoiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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
		public TerminalNode BO() { return getToken(CmavoABParser.BO, 0); }
		public BoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bo; }
	}

	public final BoContext bo() throws RecognitionException {
		BoContext _localctx = new BoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
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
		public TerminalNode BU() { return getToken(CmavoABParser.BU, 0); }
		public BuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bu; }
	}

	public final BuContext bu() throws RecognitionException {
		BuContext _localctx = new BuContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\64\4\2\t\2\4\3"+
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
		"\7\2\2*\r\3\2\2\2+,\7\b\2\2,\17\3\2\2\2-.\7\n\2\2.\21\3\2\2\2/\60\7\13"+
		"\2\2\60\23\3\2\2\2\61\62\7\f\2\2\62\25\3\2\2\2\3\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}