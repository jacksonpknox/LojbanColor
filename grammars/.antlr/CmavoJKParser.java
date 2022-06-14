// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoJK.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoJKParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JAI=1, JA=2, JOHI=3, JOI=4, KEHE=5, KEI=6, KE=7, KI=8, KOHA=9, KUHE=10, 
		KUHO=11, KU=12;
	public static final int
		RULE_cmavojk = 0, RULE_jai = 1, RULE_ja = 2, RULE_johi = 3, RULE_joi = 4, 
		RULE_kehe = 5, RULE_kei = 6, RULE_ke = 7, RULE_ki = 8, RULE_koha = 9, 
		RULE_kuhe = 10, RULE_kuho = 11, RULE_ku = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavojk", "jai", "ja", "johi", "joi", "kehe", "kei", "ke", "ki", "koha", 
			"kuhe", "kuho", "ku"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'jai'", null, "'jo'i'", null, "'ke'e'", "'kei'", "'ke'", "'ki'", 
			null, "'ku'e'", "'ku'o'", "'ku'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JAI", "JA", "JOHI", "JOI", "KEHE", "KEI", "KE", "KI", "KOHA", 
			"KUHE", "KUHO", "KU"
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
	public String getGrammarFileName() { return "CmavoJK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoJKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavojkContext extends ParserRuleContext {
		public JaiContext jai() {
			return getRuleContext(JaiContext.class,0);
		}
		public JaContext ja() {
			return getRuleContext(JaContext.class,0);
		}
		public JohiContext johi() {
			return getRuleContext(JohiContext.class,0);
		}
		public JoiContext joi() {
			return getRuleContext(JoiContext.class,0);
		}
		public KeheContext kehe() {
			return getRuleContext(KeheContext.class,0);
		}
		public KeiContext kei() {
			return getRuleContext(KeiContext.class,0);
		}
		public KeContext ke() {
			return getRuleContext(KeContext.class,0);
		}
		public KiContext ki() {
			return getRuleContext(KiContext.class,0);
		}
		public KohaContext koha() {
			return getRuleContext(KohaContext.class,0);
		}
		public KuheContext kuhe() {
			return getRuleContext(KuheContext.class,0);
		}
		public KuhoContext kuho() {
			return getRuleContext(KuhoContext.class,0);
		}
		public KuContext ku() {
			return getRuleContext(KuContext.class,0);
		}
		public CmavojkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavojk; }
	}

	public final CmavojkContext cmavojk() throws RecognitionException {
		CmavojkContext _localctx = new CmavojkContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavojk);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAI:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				jai();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				ja();
				}
				break;
			case JOHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				johi();
				}
				break;
			case JOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				joi();
				}
				break;
			case KEHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				kehe();
				}
				break;
			case KEI:
				enterOuterAlt(_localctx, 6);
				{
				setState(31);
				kei();
				}
				break;
			case KE:
				enterOuterAlt(_localctx, 7);
				{
				setState(32);
				ke();
				}
				break;
			case KI:
				enterOuterAlt(_localctx, 8);
				{
				setState(33);
				ki();
				}
				break;
			case KOHA:
				enterOuterAlt(_localctx, 9);
				{
				setState(34);
				koha();
				}
				break;
			case KUHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(35);
				kuhe();
				}
				break;
			case KUHO:
				enterOuterAlt(_localctx, 11);
				{
				setState(36);
				kuho();
				}
				break;
			case KU:
				enterOuterAlt(_localctx, 12);
				{
				setState(37);
				ku();
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

	public static class JaiContext extends ParserRuleContext {
		public TerminalNode JAI() { return getToken(CmavoJKParser.JAI, 0); }
		public JaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jai; }
	}

	public final JaiContext jai() throws RecognitionException {
		JaiContext _localctx = new JaiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(JAI);
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

	public static class JaContext extends ParserRuleContext {
		public TerminalNode JA() { return getToken(CmavoJKParser.JA, 0); }
		public JaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ja; }
	}

	public final JaContext ja() throws RecognitionException {
		JaContext _localctx = new JaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(JA);
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

	public static class JohiContext extends ParserRuleContext {
		public TerminalNode JOHI() { return getToken(CmavoJKParser.JOHI, 0); }
		public JohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_johi; }
	}

	public final JohiContext johi() throws RecognitionException {
		JohiContext _localctx = new JohiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_johi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(JOHI);
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

	public static class JoiContext extends ParserRuleContext {
		public TerminalNode JOI() { return getToken(CmavoJKParser.JOI, 0); }
		public JoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joi; }
	}

	public final JoiContext joi() throws RecognitionException {
		JoiContext _localctx = new JoiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_joi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(JOI);
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

	public static class KeheContext extends ParserRuleContext {
		public TerminalNode KEHE() { return getToken(CmavoJKParser.KEHE, 0); }
		public KeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kehe; }
	}

	public final KeheContext kehe() throws RecognitionException {
		KeheContext _localctx = new KeheContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(KEHE);
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

	public static class KeiContext extends ParserRuleContext {
		public TerminalNode KEI() { return getToken(CmavoJKParser.KEI, 0); }
		public KeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kei; }
	}

	public final KeiContext kei() throws RecognitionException {
		KeiContext _localctx = new KeiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(KEI);
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

	public static class KeContext extends ParserRuleContext {
		public TerminalNode KE() { return getToken(CmavoJKParser.KE, 0); }
		public KeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ke; }
	}

	public final KeContext ke() throws RecognitionException {
		KeContext _localctx = new KeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(KE);
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

	public static class KiContext extends ParserRuleContext {
		public TerminalNode KI() { return getToken(CmavoJKParser.KI, 0); }
		public KiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ki; }
	}

	public final KiContext ki() throws RecognitionException {
		KiContext _localctx = new KiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(KI);
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

	public static class KohaContext extends ParserRuleContext {
		public TerminalNode KOHA() { return getToken(CmavoJKParser.KOHA, 0); }
		public KohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koha; }
	}

	public final KohaContext koha() throws RecognitionException {
		KohaContext _localctx = new KohaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_koha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(KOHA);
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

	public static class KuheContext extends ParserRuleContext {
		public TerminalNode KUHE() { return getToken(CmavoJKParser.KUHE, 0); }
		public KuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuhe; }
	}

	public final KuheContext kuhe() throws RecognitionException {
		KuheContext _localctx = new KuheContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_kuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(KUHE);
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

	public static class KuhoContext extends ParserRuleContext {
		public TerminalNode KUHO() { return getToken(CmavoJKParser.KUHO, 0); }
		public KuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuho; }
	}

	public final KuhoContext kuho() throws RecognitionException {
		KuhoContext _localctx = new KuhoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_kuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(KUHO);
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

	public static class KuContext extends ParserRuleContext {
		public TerminalNode KU() { return getToken(CmavoJKParser.KU, 0); }
		public KuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ku; }
	}

	public final KuContext ku() throws RecognitionException {
		KuContext _localctx = new KuContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(KU);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2)\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\2\2\2@\2(\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2"+
		"\n\60\3\2\2\2\f\62\3\2\2\2\16\64\3\2\2\2\20\66\3\2\2\2\228\3\2\2\2\24"+
		":\3\2\2\2\26<\3\2\2\2\30>\3\2\2\2\32@\3\2\2\2\34)\5\4\3\2\35)\5\6\4\2"+
		"\36)\5\b\5\2\37)\5\n\6\2 )\5\f\7\2!)\5\16\b\2\")\5\20\t\2#)\5\22\n\2$"+
		")\5\24\13\2%)\5\26\f\2&)\5\30\r\2\')\5\32\16\2(\34\3\2\2\2(\35\3\2\2\2"+
		"(\36\3\2\2\2(\37\3\2\2\2( \3\2\2\2(!\3\2\2\2(\"\3\2\2\2(#\3\2\2\2($\3"+
		"\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\3\3\2\2\2*+\7\3\2\2+\5\3\2\2\2"+
		",-\7\4\2\2-\7\3\2\2\2./\7\5\2\2/\t\3\2\2\2\60\61\7\6\2\2\61\13\3\2\2\2"+
		"\62\63\7\7\2\2\63\r\3\2\2\2\64\65\7\b\2\2\65\17\3\2\2\2\66\67\7\t\2\2"+
		"\67\21\3\2\2\289\7\n\2\29\23\3\2\2\2:;\7\13\2\2;\25\3\2\2\2<=\7\f\2\2"+
		"=\27\3\2\2\2>?\7\r\2\2?\31\3\2\2\2@A\7\16\2\2A\33\3\2\2\2\3(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}