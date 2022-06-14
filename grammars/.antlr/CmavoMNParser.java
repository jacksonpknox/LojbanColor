// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoMN.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoMNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAHO=1, MAI=2, MEHU=3, ME=4, MOHE=5, MOHI=6, MOI=7, NAHE=8, NAHU=9, NAI=10, 
		NA=11, NIHE=12, NIHO=13, NOI=14, NUHA=15, NUHI=16, NUHU=17, NU=18;
	public static final int
		RULE_cmavomn = 0, RULE_maho = 1, RULE_mai = 2, RULE_mehu = 3, RULE_me = 4, 
		RULE_mohe = 5, RULE_mohi = 6, RULE_moi = 7, RULE_nahe = 8, RULE_nahu = 9, 
		RULE_nai = 10, RULE_na = 11, RULE_nihe = 12, RULE_niho = 13, RULE_noi = 14, 
		RULE_nuha = 15, RULE_nuhi = 16, RULE_nuhu = 17, RULE_nu = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavomn", "maho", "mai", "mehu", "me", "mohe", "mohi", "moi", "nahe", 
			"nahu", "nai", "na", "nihe", "niho", "noi", "nuha", "nuhi", "nuhu", "nu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ma'o'", null, "'me'u'", "'me'", "'mo'e'", "'mo'i'", null, null, 
			"'na'u'", "'nai'", null, "'ni'e'", "'ni'o'", null, "'nu'a'", "'nu'i'", 
			"'nu'u'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAHO", "MAI", "MEHU", "ME", "MOHE", "MOHI", "MOI", "NAHE", "NAHU", 
			"NAI", "NA", "NIHE", "NIHO", "NOI", "NUHA", "NUHI", "NUHU", "NU"
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
	public String getGrammarFileName() { return "CmavoMN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoMNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavomnContext extends ParserRuleContext {
		public MahoContext maho() {
			return getRuleContext(MahoContext.class,0);
		}
		public MaiContext mai() {
			return getRuleContext(MaiContext.class,0);
		}
		public MehuContext mehu() {
			return getRuleContext(MehuContext.class,0);
		}
		public MeContext me() {
			return getRuleContext(MeContext.class,0);
		}
		public MoheContext mohe() {
			return getRuleContext(MoheContext.class,0);
		}
		public MohiContext mohi() {
			return getRuleContext(MohiContext.class,0);
		}
		public MoiContext moi() {
			return getRuleContext(MoiContext.class,0);
		}
		public NaheContext nahe() {
			return getRuleContext(NaheContext.class,0);
		}
		public NahuContext nahu() {
			return getRuleContext(NahuContext.class,0);
		}
		public NaiContext nai() {
			return getRuleContext(NaiContext.class,0);
		}
		public NaContext na() {
			return getRuleContext(NaContext.class,0);
		}
		public NiheContext nihe() {
			return getRuleContext(NiheContext.class,0);
		}
		public NihoContext niho() {
			return getRuleContext(NihoContext.class,0);
		}
		public NoiContext noi() {
			return getRuleContext(NoiContext.class,0);
		}
		public NuhaContext nuha() {
			return getRuleContext(NuhaContext.class,0);
		}
		public NuhiContext nuhi() {
			return getRuleContext(NuhiContext.class,0);
		}
		public NuhuContext nuhu() {
			return getRuleContext(NuhuContext.class,0);
		}
		public NuContext nu() {
			return getRuleContext(NuContext.class,0);
		}
		public CmavomnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavomn; }
	}

	public final CmavomnContext cmavomn() throws RecognitionException {
		CmavomnContext _localctx = new CmavomnContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavomn);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				maho();
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				mai();
				}
				break;
			case MEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				mehu();
				}
				break;
			case ME:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				me();
				}
				break;
			case MOHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				mohe();
				}
				break;
			case MOHI:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				mohi();
				}
				break;
			case MOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				moi();
				}
				break;
			case NAHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				nahe();
				}
				break;
			case NAHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				nahu();
				}
				break;
			case NAI:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				nai();
				}
				break;
			case NA:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				na();
				}
				break;
			case NIHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(49);
				nihe();
				}
				break;
			case NIHO:
				enterOuterAlt(_localctx, 13);
				{
				setState(50);
				niho();
				}
				break;
			case NOI:
				enterOuterAlt(_localctx, 14);
				{
				setState(51);
				noi();
				}
				break;
			case NUHA:
				enterOuterAlt(_localctx, 15);
				{
				setState(52);
				nuha();
				}
				break;
			case NUHI:
				enterOuterAlt(_localctx, 16);
				{
				setState(53);
				nuhi();
				}
				break;
			case NUHU:
				enterOuterAlt(_localctx, 17);
				{
				setState(54);
				nuhu();
				}
				break;
			case NU:
				enterOuterAlt(_localctx, 18);
				{
				setState(55);
				nu();
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

	public static class MahoContext extends ParserRuleContext {
		public TerminalNode MAHO() { return getToken(CmavoMNParser.MAHO, 0); }
		public MahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maho; }
	}

	public final MahoContext maho() throws RecognitionException {
		MahoContext _localctx = new MahoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_maho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(MAHO);
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

	public static class MaiContext extends ParserRuleContext {
		public TerminalNode MAI() { return getToken(CmavoMNParser.MAI, 0); }
		public MaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mai; }
	}

	public final MaiContext mai() throws RecognitionException {
		MaiContext _localctx = new MaiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(MAI);
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

	public static class MehuContext extends ParserRuleContext {
		public TerminalNode MEHU() { return getToken(CmavoMNParser.MEHU, 0); }
		public MehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mehu; }
	}

	public final MehuContext mehu() throws RecognitionException {
		MehuContext _localctx = new MehuContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(MEHU);
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

	public static class MeContext extends ParserRuleContext {
		public TerminalNode ME() { return getToken(CmavoMNParser.ME, 0); }
		public MeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_me; }
	}

	public final MeContext me() throws RecognitionException {
		MeContext _localctx = new MeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_me);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ME);
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

	public static class MoheContext extends ParserRuleContext {
		public TerminalNode MOHE() { return getToken(CmavoMNParser.MOHE, 0); }
		public MoheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohe; }
	}

	public final MoheContext mohe() throws RecognitionException {
		MoheContext _localctx = new MoheContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mohe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MOHE);
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

	public static class MohiContext extends ParserRuleContext {
		public TerminalNode MOHI() { return getToken(CmavoMNParser.MOHI, 0); }
		public MohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohi; }
	}

	public final MohiContext mohi() throws RecognitionException {
		MohiContext _localctx = new MohiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mohi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(MOHI);
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

	public static class MoiContext extends ParserRuleContext {
		public TerminalNode MOI() { return getToken(CmavoMNParser.MOI, 0); }
		public MoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moi; }
	}

	public final MoiContext moi() throws RecognitionException {
		MoiContext _localctx = new MoiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(MOI);
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

	public static class NaheContext extends ParserRuleContext {
		public TerminalNode NAHE() { return getToken(CmavoMNParser.NAHE, 0); }
		public NaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahe; }
	}

	public final NaheContext nahe() throws RecognitionException {
		NaheContext _localctx = new NaheContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(NAHE);
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

	public static class NahuContext extends ParserRuleContext {
		public TerminalNode NAHU() { return getToken(CmavoMNParser.NAHU, 0); }
		public NahuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahu; }
	}

	public final NahuContext nahu() throws RecognitionException {
		NahuContext _localctx = new NahuContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nahu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NAHU);
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

	public static class NaiContext extends ParserRuleContext {
		public TerminalNode NAI() { return getToken(CmavoMNParser.NAI, 0); }
		public NaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nai; }
	}

	public final NaiContext nai() throws RecognitionException {
		NaiContext _localctx = new NaiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NAI);
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

	public static class NaContext extends ParserRuleContext {
		public TerminalNode NA() { return getToken(CmavoMNParser.NA, 0); }
		public NaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_na; }
	}

	public final NaContext na() throws RecognitionException {
		NaContext _localctx = new NaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_na);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(NA);
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

	public static class NiheContext extends ParserRuleContext {
		public TerminalNode NIHE() { return getToken(CmavoMNParser.NIHE, 0); }
		public NiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nihe; }
	}

	public final NiheContext nihe() throws RecognitionException {
		NiheContext _localctx = new NiheContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NIHE);
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

	public static class NihoContext extends ParserRuleContext {
		public TerminalNode NIHO() { return getToken(CmavoMNParser.NIHO, 0); }
		public NihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niho; }
	}

	public final NihoContext niho() throws RecognitionException {
		NihoContext _localctx = new NihoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_niho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NIHO);
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

	public static class NoiContext extends ParserRuleContext {
		public TerminalNode NOI() { return getToken(CmavoMNParser.NOI, 0); }
		public NoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noi; }
	}

	public final NoiContext noi() throws RecognitionException {
		NoiContext _localctx = new NoiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_noi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(NOI);
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

	public static class NuhaContext extends ParserRuleContext {
		public TerminalNode NUHA() { return getToken(CmavoMNParser.NUHA, 0); }
		public NuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuha; }
	}

	public final NuhaContext nuha() throws RecognitionException {
		NuhaContext _localctx = new NuhaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NUHA);
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

	public static class NuhiContext extends ParserRuleContext {
		public TerminalNode NUHI() { return getToken(CmavoMNParser.NUHI, 0); }
		public NuhiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhi; }
	}

	public final NuhiContext nuhi() throws RecognitionException {
		NuhiContext _localctx = new NuhiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nuhi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NUHI);
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

	public static class NuhuContext extends ParserRuleContext {
		public TerminalNode NUHU() { return getToken(CmavoMNParser.NUHU, 0); }
		public NuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhu; }
	}

	public final NuhuContext nuhu() throws RecognitionException {
		NuhuContext _localctx = new NuhuContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(NUHU);
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

	public static class NuContext extends ParserRuleContext {
		public TerminalNode NU() { return getToken(CmavoMNParser.NU, 0); }
		public NuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nu; }
	}

	public final NuContext nu() throws RecognitionException {
		NuContext _localctx = new NuContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(NU);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2^\2:\3\2\2\2\4<\3\2\2\2\6>\3\2"+
		"\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22J\3\2"+
		"\2\2\24L\3\2\2\2\26N\3\2\2\2\30P\3\2\2\2\32R\3\2\2\2\34T\3\2\2\2\36V\3"+
		"\2\2\2 X\3\2\2\2\"Z\3\2\2\2$\\\3\2\2\2&^\3\2\2\2(;\5\4\3\2);\5\6\4\2*"+
		";\5\b\5\2+;\5\n\6\2,;\5\f\7\2-;\5\16\b\2.;\5\20\t\2/;\5\22\n\2\60;\5\24"+
		"\13\2\61;\5\26\f\2\62;\5\30\r\2\63;\5\32\16\2\64;\5\34\17\2\65;\5\36\20"+
		"\2\66;\5 \21\2\67;\5\"\22\28;\5$\23\29;\5&\24\2:(\3\2\2\2:)\3\2\2\2:*"+
		"\3\2\2\2:+\3\2\2\2:,\3\2\2\2:-\3\2\2\2:.\3\2\2\2:/\3\2\2\2:\60\3\2\2\2"+
		":\61\3\2\2\2:\62\3\2\2\2:\63\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:\66\3\2\2"+
		"\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<=\7\3\2\2=\5\3\2\2\2>?\7"+
		"\4\2\2?\7\3\2\2\2@A\7\5\2\2A\t\3\2\2\2BC\7\6\2\2C\13\3\2\2\2DE\7\7\2\2"+
		"E\r\3\2\2\2FG\7\b\2\2G\17\3\2\2\2HI\7\t\2\2I\21\3\2\2\2JK\7\n\2\2K\23"+
		"\3\2\2\2LM\7\13\2\2M\25\3\2\2\2NO\7\f\2\2O\27\3\2\2\2PQ\7\r\2\2Q\31\3"+
		"\2\2\2RS\7\16\2\2S\33\3\2\2\2TU\7\17\2\2U\35\3\2\2\2VW\7\20\2\2W\37\3"+
		"\2\2\2XY\7\21\2\2Y!\3\2\2\2Z[\7\22\2\2[#\3\2\2\2\\]\7\23\2\2]%\3\2\2\2"+
		"^_\7\24\2\2_\'\3\2\2\2\3:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}