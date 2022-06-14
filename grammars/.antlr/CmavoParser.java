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
		A=1, BAHE=2, BEHO=3, BEI=4, BE=5, BIHE=6, BIHI=7, BOI=8, BO=9, BU=10, 
		BAI=11, BY=12, UI=13, CAHA=14, CAI=15, CEHE=16, CEI=17, CO=18, COI=19, 
		CU=20, CUHE=21, DAHO=22, DOHU=23, DOI=24, FA=25, FAHA=26, FAHO=27, FEHE=28, 
		FEHU=29, FIHO=30, FOI=31, FUHA=32, FUHE=33, FUHO=34, GA=35, GAHO=36, GEHU=37, 
		GI=38, GIHA=39, GOHA=40, GOI=41, GUHA=42, I=43, JAI=44, JA=45, JOHI=46, 
		JOI=47, KEHE=48, KEI=49, KE=50, KI=51, KOHA=52, KUHE=53, KUHO=54, KU=55, 
		LAHE=56, LA=57, LAU=58, LEHU=59, LE=60, LIHU=61, LI=62, LOHO=63, LOHU=64, 
		LUHU=65, LU=66, MAHO=67, MAI=68, MEHU=69, ME=70, MOHE=71, MOHI=72, MOI=73, 
		NAHE=74, NAHU=75, NAI=76, NA=77, NIHE=78, NIHO=79, NOI=80, NUHA=81, NUHI=82, 
		NUHU=83, NU=84, PA=85, PEHE=86, PEHO=87, PU=88, RAHO=89, ROI=90, SA=91, 
		SEHU=92, SEI=93, SE=94, SI=95, SOI=96, SU=97, TAHE=98, TEHU=99, TEI=100, 
		TOI=101, TO=102, TUHE=103, TUHU=104, VA=105, VAU=106, VEHA=107, VEHO=108, 
		VEI=109, VIHA=110, VUHO=111, VUHU=112, XI=113, Y=114, ZAHO=115, ZEHA=116, 
		ZEI=117, ZIHE=118, ZI=119, ZOHU=120, ZOI=121, ZO=122;
	public static final int
		RULE_cmavo = 0, RULE_cmavoab = 1, RULE_a = 2, RULE_bahe = 3, RULE_beho = 4, 
		RULE_bei = 5, RULE_be = 6, RULE_bihe = 7, RULE_boi = 8, RULE_bo = 9, RULE_bu = 10, 
		RULE_bai = 11, RULE_by = 12, RULE_ui = 13, RULE_cmavocd = 14, RULE_caha = 15, 
		RULE_cai = 16, RULE_cehe = 17, RULE_cei = 18, RULE_co = 19, RULE_coi = 20, 
		RULE_cu = 21, RULE_cuhe = 22, RULE_daho = 23, RULE_doi = 24, RULE_cmavof = 25, 
		RULE_fa = 26, RULE_faha = 27, RULE_faho = 28, RULE_fehe = 29, RULE_fehu = 30, 
		RULE_fiho = 31, RULE_foi = 32, RULE_fuha = 33, RULE_fuhe = 34, RULE_fuho = 35, 
		RULE_cmavogi = 36, RULE_ga = 37, RULE_gaho = 38, RULE_gehu = 39, RULE_gi = 40, 
		RULE_giha = 41, RULE_goha = 42, RULE_goi = 43, RULE_guha = 44, RULE_i = 45, 
		RULE_cmavojk = 46, RULE_jai = 47, RULE_ja = 48, RULE_johi = 49, RULE_joi = 50, 
		RULE_kehe = 51, RULE_kei = 52, RULE_ke = 53, RULE_ki = 54, RULE_koha = 55, 
		RULE_kuhe = 56, RULE_kuho = 57, RULE_ku = 58, RULE_cmavol = 59, RULE_lahe = 60, 
		RULE_la = 61, RULE_lau = 62, RULE_lehu = 63, RULE_le = 64, RULE_lihu = 65, 
		RULE_li = 66, RULE_loho = 67, RULE_lohu = 68, RULE_luhu = 69, RULE_lu = 70, 
		RULE_cmavomn = 71, RULE_maho = 72, RULE_mai = 73, RULE_mehu = 74, RULE_me = 75, 
		RULE_mohe = 76, RULE_mohi = 77, RULE_moi = 78, RULE_nahe = 79, RULE_nahu = 80, 
		RULE_nai = 81, RULE_na = 82, RULE_nihe = 83, RULE_niho = 84, RULE_noi = 85, 
		RULE_nuha = 86, RULE_nuhi = 87, RULE_nuhu = 88, RULE_nu = 89, RULE_cmavop = 90, 
		RULE_pa = 91, RULE_pehe = 92, RULE_peho = 93, RULE_pu = 94, RULE_cmavors = 95, 
		RULE_raho = 96, RULE_roi = 97, RULE_sa = 98, RULE_sehu = 99, RULE_sei = 100, 
		RULE_se = 101, RULE_si = 102, RULE_soi = 103, RULE_su = 104, RULE_cmavot = 105, 
		RULE_tahe = 106, RULE_tehu = 107, RULE_tei = 108, RULE_toi = 109, RULE_to = 110, 
		RULE_tuhe = 111, RULE_tuhu = 112, RULE_cmavovy = 113, RULE_va = 114, RULE_vau = 115, 
		RULE_veha = 116, RULE_veho = 117, RULE_vei = 118, RULE_viha = 119, RULE_vuho = 120, 
		RULE_vuhu = 121, RULE_xi = 122, RULE_y = 123, RULE_cmavoz = 124, RULE_zaho = 125, 
		RULE_zeha = 126, RULE_zei = 127, RULE_zihe = 128, RULE_zi = 129, RULE_zohu = 130, 
		RULE_zoi = 131, RULE_zo = 132;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavo", "cmavoab", "a", "bahe", "beho", "bei", "be", "bihe", "boi", 
			"bo", "bu", "bai", "by", "ui", "cmavocd", "caha", "cai", "cehe", "cei", 
			"co", "coi", "cu", "cuhe", "daho", "doi", "cmavof", "fa", "faha", "faho", 
			"fehe", "fehu", "fiho", "foi", "fuha", "fuhe", "fuho", "cmavogi", "ga", 
			"gaho", "gehu", "gi", "giha", "goha", "goi", "guha", "i", "cmavojk", 
			"jai", "ja", "johi", "joi", "kehe", "kei", "ke", "ki", "koha", "kuhe", 
			"kuho", "ku", "cmavol", "lahe", "la", "lau", "lehu", "le", "lihu", "li", 
			"loho", "lohu", "luhu", "lu", "cmavomn", "maho", "mai", "mehu", "me", 
			"mohe", "mohi", "moi", "nahe", "nahu", "nai", "na", "nihe", "niho", "noi", 
			"nuha", "nuhi", "nuhu", "nu", "cmavop", "pa", "pehe", "peho", "pu", "cmavors", 
			"raho", "roi", "sa", "sehu", "sei", "se", "si", "soi", "su", "cmavot", 
			"tahe", "tehu", "tei", "toi", "to", "tuhe", "tuhu", "cmavovy", "va", 
			"vau", "veha", "veho", "vei", "viha", "vuho", "vuhu", "xi", "y", "cmavoz", 
			"zaho", "zeha", "zei", "zihe", "zi", "zohu", "zoi", "zo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'be'o'", "'bei'", "'be'", "'bi'e'", null, "'boi'", 
			"'bo'", "'bu'", null, null, null, null, null, "'ce'e'", "'cei'", "'co'", 
			null, "'cu'", null, "'da'o'", "'do'u'", "'doi'", null, null, "'fa'o'", 
			"'fe'e'", "'fe'u'", "'fi'o'", "'foi'", "'fu'a'", "'fu'e'", "'fu'o'", 
			null, null, "'ge'u'", "'gi'", null, null, null, null, "'.i'", "'jai'", 
			null, "'jo'i'", null, "'ke'e'", "'kei'", "'ke'", "'ki'", null, "'ku'e'", 
			"'ku'o'", "'ku'", null, "'la'", null, "'le'u'", null, "'li'u'", "'li'", 
			"'lo'o'", "'lo'u'", "'lu'u'", "'lu'", "'ma'o'", null, "'me'u'", "'me'", 
			"'mo'e'", "'mo'i'", null, null, "'na'u'", "'nai'", null, "'ni'e'", "'ni'o'", 
			null, "'nu'a'", "'nu'i'", "'nu'u'", null, null, "'pe'e'", "'pe'o'", null, 
			"'ra'o'", null, "'sa'", "'se'u'", "'sei'", null, "'si'", "'soi'", "'su'", 
			null, "'te'u'", "'tei'", "'toi'", "'to'", "'tu'e'", "'tu'u'", null, "'vau'", 
			null, "'ve'o'", "'vei'", null, "'vu'o'", null, "'xi'", "'.y.'", null, 
			null, "'zei'", "'zi'e'", null, "'zo'u'", "'zoi'", "'zo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", 
			"BU", "BAI", "BY", "UI", "CAHA", "CAI", "CEHE", "CEI", "CO", "COI", "CU", 
			"CUHE", "DAHO", "DOHU", "DOI", "FA", "FAHA", "FAHO", "FEHE", "FEHU", 
			"FIHO", "FOI", "FUHA", "FUHE", "FUHO", "GA", "GAHO", "GEHU", "GI", "GIHA", 
			"GOHA", "GOI", "GUHA", "I", "JAI", "JA", "JOHI", "JOI", "KEHE", "KEI", 
			"KE", "KI", "KOHA", "KUHE", "KUHO", "KU", "LAHE", "LA", "LAU", "LEHU", 
			"LE", "LIHU", "LI", "LOHO", "LOHU", "LUHU", "LU", "MAHO", "MAI", "MEHU", 
			"ME", "MOHE", "MOHI", "MOI", "NAHE", "NAHU", "NAI", "NA", "NIHE", "NIHO", 
			"NOI", "NUHA", "NUHI", "NUHU", "NU", "PA", "PEHE", "PEHO", "PU", "RAHO", 
			"ROI", "SA", "SEHU", "SEI", "SE", "SI", "SOI", "SU", "TAHE", "TEHU", 
			"TEI", "TOI", "TO", "TUHE", "TUHU", "VA", "VAU", "VEHA", "VEHO", "VEI", 
			"VIHA", "VUHO", "VUHU", "XI", "Y", "ZAHO", "ZEHA", "ZEI", "ZIHE", "ZI", 
			"ZOHU", "ZOI", "ZO"
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
		public CmavoabContext cmavoab() {
			return getRuleContext(CmavoabContext.class,0);
		}
		public BaiContext bai() {
			return getRuleContext(BaiContext.class,0);
		}
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public CmavocdContext cmavocd() {
			return getRuleContext(CmavocdContext.class,0);
		}
		public CmavofContext cmavof() {
			return getRuleContext(CmavofContext.class,0);
		}
		public CmavogiContext cmavogi() {
			return getRuleContext(CmavogiContext.class,0);
		}
		public CmavojkContext cmavojk() {
			return getRuleContext(CmavojkContext.class,0);
		}
		public CmavolContext cmavol() {
			return getRuleContext(CmavolContext.class,0);
		}
		public CmavomnContext cmavomn() {
			return getRuleContext(CmavomnContext.class,0);
		}
		public CmavopContext cmavop() {
			return getRuleContext(CmavopContext.class,0);
		}
		public CmavorsContext cmavors() {
			return getRuleContext(CmavorsContext.class,0);
		}
		public CmavotContext cmavot() {
			return getRuleContext(CmavotContext.class,0);
		}
		public UiContext ui() {
			return getRuleContext(UiContext.class,0);
		}
		public CmavovyContext cmavovy() {
			return getRuleContext(CmavovyContext.class,0);
		}
		public CmavozContext cmavoz() {
			return getRuleContext(CmavozContext.class,0);
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
			case BAHE:
			case BEHO:
			case BEI:
			case BE:
			case BIHE:
			case BOI:
			case BO:
			case BU:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				cmavoab();
				}
				break;
			case BAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				bai();
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				by();
				}
				break;
			case CAHA:
			case CAI:
			case CEHE:
			case CEI:
			case CO:
			case COI:
			case CU:
			case CUHE:
			case DAHO:
			case DOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				cmavocd();
				}
				break;
			case FA:
			case FAHA:
			case FAHO:
			case FEHE:
			case FEHU:
			case FIHO:
			case FOI:
			case FUHA:
			case FUHE:
			case FUHO:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				cmavof();
				}
				break;
			case GA:
			case GAHO:
			case GEHU:
			case GI:
			case GIHA:
			case GOHA:
			case GOI:
			case GUHA:
			case I:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				cmavogi();
				}
				break;
			case JAI:
			case JA:
			case JOHI:
			case JOI:
			case KEHE:
			case KEI:
			case KE:
			case KI:
			case KOHA:
			case KUHE:
			case KUHO:
			case KU:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				cmavojk();
				}
				break;
			case LAHE:
			case LA:
			case LAU:
			case LEHU:
			case LE:
			case LIHU:
			case LI:
			case LOHO:
			case LOHU:
			case LUHU:
			case LU:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				cmavol();
				}
				break;
			case MAHO:
			case MAI:
			case MEHU:
			case ME:
			case MOHE:
			case MOHI:
			case MOI:
			case NAHE:
			case NAHU:
			case NAI:
			case NA:
			case NIHE:
			case NIHO:
			case NOI:
			case NUHA:
			case NUHI:
			case NUHU:
			case NU:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				cmavomn();
				}
				break;
			case PA:
			case PEHE:
			case PEHO:
			case PU:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				cmavop();
				}
				break;
			case RAHO:
			case ROI:
			case SA:
			case SEHU:
			case SEI:
			case SE:
			case SI:
			case SOI:
			case SU:
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
				cmavors();
				}
				break;
			case TAHE:
			case TEHU:
			case TEI:
			case TOI:
			case TO:
			case TUHE:
			case TUHU:
				enterOuterAlt(_localctx, 12);
				{
				setState(277);
				cmavot();
				}
				break;
			case UI:
				enterOuterAlt(_localctx, 13);
				{
				setState(278);
				ui();
				}
				break;
			case VA:
			case VAU:
			case VEHA:
			case VEHO:
			case VEI:
			case VIHA:
			case VUHO:
			case VUHU:
			case XI:
			case Y:
				enterOuterAlt(_localctx, 14);
				{
				setState(279);
				cmavovy();
				}
				break;
			case ZAHO:
			case ZEHA:
			case ZEI:
			case ZIHE:
			case ZI:
			case ZOHU:
			case ZOI:
			case ZO:
				enterOuterAlt(_localctx, 15);
				{
				setState(280);
				cmavoz();
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
		enterRule(_localctx, 2, RULE_cmavoab);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				a();
				}
				break;
			case BAHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				bahe();
				}
				break;
			case BEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				beho();
				}
				break;
			case BEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				bei();
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				be();
				}
				break;
			case BIHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(288);
				bihe();
				}
				break;
			case BOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				boi();
				}
				break;
			case BO:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				bo();
				}
				break;
			case BU:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
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
		enterRule(_localctx, 4, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
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
		enterRule(_localctx, 6, RULE_bahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 8, RULE_beho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		enterRule(_localctx, 10, RULE_bei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 12, RULE_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 14, RULE_bihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 16, RULE_boi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 18, RULE_bo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 20, RULE_bu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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

	public static class BaiContext extends ParserRuleContext {
		public TerminalNode BAI() { return getToken(CmavoParser.BAI, 0); }
		public BaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bai; }
	}

	public final BaiContext bai() throws RecognitionException {
		BaiContext _localctx = new BaiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(BAI);
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

	public static class ByContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(CmavoParser.BY, 0); }
		public ByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by; }
	}

	public final ByContext by() throws RecognitionException {
		ByContext _localctx = new ByContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(BY);
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

	public static class UiContext extends ParserRuleContext {
		public TerminalNode UI() { return getToken(CmavoParser.UI, 0); }
		public UiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ui; }
	}

	public final UiContext ui() throws RecognitionException {
		UiContext _localctx = new UiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(UI);
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
		enterRule(_localctx, 28, RULE_cmavocd);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				caha();
				}
				break;
			case CAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				cai();
				}
				break;
			case CEHE:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				cehe();
				}
				break;
			case CEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				cei();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				co();
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				coi();
				}
				break;
			case CU:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				cu();
				}
				break;
			case CUHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				cuhe();
				}
				break;
			case DAHO:
				enterOuterAlt(_localctx, 9);
				{
				setState(326);
				daho();
				}
				break;
			case DOI:
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
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
		public TerminalNode CAHA() { return getToken(CmavoParser.CAHA, 0); }
		public CahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caha; }
	}

	public final CahaContext caha() throws RecognitionException {
		CahaContext _localctx = new CahaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		public TerminalNode CAI() { return getToken(CmavoParser.CAI, 0); }
		public CaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cai; }
	}

	public final CaiContext cai() throws RecognitionException {
		CaiContext _localctx = new CaiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		public TerminalNode CEHE() { return getToken(CmavoParser.CEHE, 0); }
		public CeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cehe; }
	}

	public final CeheContext cehe() throws RecognitionException {
		CeheContext _localctx = new CeheContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		public TerminalNode CEI() { return getToken(CmavoParser.CEI, 0); }
		public CeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cei; }
	}

	public final CeiContext cei() throws RecognitionException {
		CeiContext _localctx = new CeiContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
		public TerminalNode CO() { return getToken(CmavoParser.CO, 0); }
		public CoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_co; }
	}

	public final CoContext co() throws RecognitionException {
		CoContext _localctx = new CoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_co);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
		public TerminalNode COI() { return getToken(CmavoParser.COI, 0); }
		public CoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coi; }
	}

	public final CoiContext coi() throws RecognitionException {
		CoiContext _localctx = new CoiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_coi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		public TerminalNode CU() { return getToken(CmavoParser.CU, 0); }
		public CuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cu; }
	}

	public final CuContext cu() throws RecognitionException {
		CuContext _localctx = new CuContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		public TerminalNode CUHE() { return getToken(CmavoParser.CUHE, 0); }
		public CuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuhe; }
	}

	public final CuheContext cuhe() throws RecognitionException {
		CuheContext _localctx = new CuheContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		public TerminalNode DAHO() { return getToken(CmavoParser.DAHO, 0); }
		public DahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daho; }
	}

	public final DahoContext daho() throws RecognitionException {
		DahoContext _localctx = new DahoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_daho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		public TerminalNode DOI() { return getToken(CmavoParser.DOI, 0); }
		public DoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doi; }
	}

	public final DoiContext doi() throws RecognitionException {
		DoiContext _localctx = new DoiContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_doi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 50, RULE_cmavof);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FA:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				fa();
				}
				break;
			case FAHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				faha();
				}
				break;
			case FAHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				faho();
				}
				break;
			case FEHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				fehe();
				}
				break;
			case FEHU:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				fehu();
				}
				break;
			case FIHO:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				fiho();
				}
				break;
			case FOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(356);
				foi();
				}
				break;
			case FUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(357);
				fuha();
				}
				break;
			case FUHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(358);
				fuhe();
				}
				break;
			case FUHO:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
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
		public TerminalNode FA() { return getToken(CmavoParser.FA, 0); }
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		public TerminalNode FAHA() { return getToken(CmavoParser.FAHA, 0); }
		public FahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faha; }
	}

	public final FahaContext faha() throws RecognitionException {
		FahaContext _localctx = new FahaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_faha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public TerminalNode FAHO() { return getToken(CmavoParser.FAHO, 0); }
		public FahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faho; }
	}

	public final FahoContext faho() throws RecognitionException {
		FahoContext _localctx = new FahoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_faho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode FEHE() { return getToken(CmavoParser.FEHE, 0); }
		public FeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehe; }
	}

	public final FeheContext fehe() throws RecognitionException {
		FeheContext _localctx = new FeheContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		public TerminalNode FEHU() { return getToken(CmavoParser.FEHU, 0); }
		public FehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehu; }
	}

	public final FehuContext fehu() throws RecognitionException {
		FehuContext _localctx = new FehuContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		public TerminalNode FIHO() { return getToken(CmavoParser.FIHO, 0); }
		public FihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiho; }
	}

	public final FihoContext fiho() throws RecognitionException {
		FihoContext _localctx = new FihoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fiho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		public TerminalNode FOI() { return getToken(CmavoParser.FOI, 0); }
		public FoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foi; }
	}

	public final FoiContext foi() throws RecognitionException {
		FoiContext _localctx = new FoiContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_foi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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
		public TerminalNode FUHA() { return getToken(CmavoParser.FUHA, 0); }
		public FuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuha; }
	}

	public final FuhaContext fuha() throws RecognitionException {
		FuhaContext _localctx = new FuhaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		public TerminalNode FUHE() { return getToken(CmavoParser.FUHE, 0); }
		public FuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuhe; }
	}

	public final FuheContext fuhe() throws RecognitionException {
		FuheContext _localctx = new FuheContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		public TerminalNode FUHO() { return getToken(CmavoParser.FUHO, 0); }
		public FuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuho; }
	}

	public final FuhoContext fuho() throws RecognitionException {
		FuhoContext _localctx = new FuhoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		enterRule(_localctx, 72, RULE_cmavogi);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GA:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				ga();
				}
				break;
			case GAHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				gaho();
				}
				break;
			case GEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				gehu();
				}
				break;
			case GI:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				gi();
				}
				break;
			case GIHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				giha();
				}
				break;
			case GOHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				goha();
				}
				break;
			case GOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				goi();
				}
				break;
			case GUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				guha();
				}
				break;
			case I:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
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
		public TerminalNode GA() { return getToken(CmavoParser.GA, 0); }
		public GaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ga; }
	}

	public final GaContext ga() throws RecognitionException {
		GaContext _localctx = new GaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		public TerminalNode GAHO() { return getToken(CmavoParser.GAHO, 0); }
		public GahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gaho; }
	}

	public final GahoContext gaho() throws RecognitionException {
		GahoContext _localctx = new GahoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_gaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		public TerminalNode GEHU() { return getToken(CmavoParser.GEHU, 0); }
		public GehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gehu; }
	}

	public final GehuContext gehu() throws RecognitionException {
		GehuContext _localctx = new GehuContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_gehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		public TerminalNode GI() { return getToken(CmavoParser.GI, 0); }
		public GiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gi; }
	}

	public final GiContext gi() throws RecognitionException {
		GiContext _localctx = new GiContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_gi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		public TerminalNode GIHA() { return getToken(CmavoParser.GIHA, 0); }
		public GihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giha; }
	}

	public final GihaContext giha() throws RecognitionException {
		GihaContext _localctx = new GihaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_giha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		public TerminalNode GOHA() { return getToken(CmavoParser.GOHA, 0); }
		public GohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goha; }
	}

	public final GohaContext goha() throws RecognitionException {
		GohaContext _localctx = new GohaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_goha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		public TerminalNode GOI() { return getToken(CmavoParser.GOI, 0); }
		public GoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goi; }
	}

	public final GoiContext goi() throws RecognitionException {
		GoiContext _localctx = new GoiContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_goi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		public TerminalNode GUHA() { return getToken(CmavoParser.GUHA, 0); }
		public GuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guha; }
	}

	public final GuhaContext guha() throws RecognitionException {
		GuhaContext _localctx = new GuhaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_guha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		public TerminalNode I() { return getToken(CmavoParser.I, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 92, RULE_cmavojk);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAI:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				jai();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				ja();
				}
				break;
			case JOHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				johi();
				}
				break;
			case JOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				joi();
				}
				break;
			case KEHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				kehe();
				}
				break;
			case KEI:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				kei();
				}
				break;
			case KE:
				enterOuterAlt(_localctx, 7);
				{
				setState(417);
				ke();
				}
				break;
			case KI:
				enterOuterAlt(_localctx, 8);
				{
				setState(418);
				ki();
				}
				break;
			case KOHA:
				enterOuterAlt(_localctx, 9);
				{
				setState(419);
				koha();
				}
				break;
			case KUHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(420);
				kuhe();
				}
				break;
			case KUHO:
				enterOuterAlt(_localctx, 11);
				{
				setState(421);
				kuho();
				}
				break;
			case KU:
				enterOuterAlt(_localctx, 12);
				{
				setState(422);
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
		public TerminalNode JAI() { return getToken(CmavoParser.JAI, 0); }
		public JaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jai; }
	}

	public final JaiContext jai() throws RecognitionException {
		JaiContext _localctx = new JaiContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		public TerminalNode JA() { return getToken(CmavoParser.JA, 0); }
		public JaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ja; }
	}

	public final JaContext ja() throws RecognitionException {
		JaContext _localctx = new JaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		public TerminalNode JOHI() { return getToken(CmavoParser.JOHI, 0); }
		public JohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_johi; }
	}

	public final JohiContext johi() throws RecognitionException {
		JohiContext _localctx = new JohiContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_johi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		public TerminalNode JOI() { return getToken(CmavoParser.JOI, 0); }
		public JoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joi; }
	}

	public final JoiContext joi() throws RecognitionException {
		JoiContext _localctx = new JoiContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		public TerminalNode KEHE() { return getToken(CmavoParser.KEHE, 0); }
		public KeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kehe; }
	}

	public final KeheContext kehe() throws RecognitionException {
		KeheContext _localctx = new KeheContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		public TerminalNode KEI() { return getToken(CmavoParser.KEI, 0); }
		public KeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kei; }
	}

	public final KeiContext kei() throws RecognitionException {
		KeiContext _localctx = new KeiContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_kei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		public TerminalNode KE() { return getToken(CmavoParser.KE, 0); }
		public KeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ke; }
	}

	public final KeContext ke() throws RecognitionException {
		KeContext _localctx = new KeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		public TerminalNode KI() { return getToken(CmavoParser.KI, 0); }
		public KiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ki; }
	}

	public final KiContext ki() throws RecognitionException {
		KiContext _localctx = new KiContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		public TerminalNode KOHA() { return getToken(CmavoParser.KOHA, 0); }
		public KohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koha; }
	}

	public final KohaContext koha() throws RecognitionException {
		KohaContext _localctx = new KohaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_koha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		public TerminalNode KUHE() { return getToken(CmavoParser.KUHE, 0); }
		public KuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuhe; }
	}

	public final KuheContext kuhe() throws RecognitionException {
		KuheContext _localctx = new KuheContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_kuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
		public TerminalNode KUHO() { return getToken(CmavoParser.KUHO, 0); }
		public KuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuho; }
	}

	public final KuhoContext kuho() throws RecognitionException {
		KuhoContext _localctx = new KuhoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		public TerminalNode KU() { return getToken(CmavoParser.KU, 0); }
		public KuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ku; }
	}

	public final KuContext ku() throws RecognitionException {
		KuContext _localctx = new KuContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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

	public static class CmavolContext extends ParserRuleContext {
		public LaheContext lahe() {
			return getRuleContext(LaheContext.class,0);
		}
		public LaContext la() {
			return getRuleContext(LaContext.class,0);
		}
		public LauContext lau() {
			return getRuleContext(LauContext.class,0);
		}
		public LehuContext lehu() {
			return getRuleContext(LehuContext.class,0);
		}
		public LeContext le() {
			return getRuleContext(LeContext.class,0);
		}
		public LihuContext lihu() {
			return getRuleContext(LihuContext.class,0);
		}
		public LiContext li() {
			return getRuleContext(LiContext.class,0);
		}
		public LohoContext loho() {
			return getRuleContext(LohoContext.class,0);
		}
		public LohuContext lohu() {
			return getRuleContext(LohuContext.class,0);
		}
		public LuhuContext luhu() {
			return getRuleContext(LuhuContext.class,0);
		}
		public LuContext lu() {
			return getRuleContext(LuContext.class,0);
		}
		public CmavolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavol; }
	}

	public final CmavolContext cmavol() throws RecognitionException {
		CmavolContext _localctx = new CmavolContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cmavol);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				lahe();
				}
				break;
			case LA:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				la();
				}
				break;
			case LAU:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				lau();
				}
				break;
			case LEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				lehu();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(453);
				le();
				}
				break;
			case LIHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				lihu();
				}
				break;
			case LI:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				li();
				}
				break;
			case LOHO:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
				loho();
				}
				break;
			case LOHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(457);
				lohu();
				}
				break;
			case LUHU:
				enterOuterAlt(_localctx, 10);
				{
				setState(458);
				luhu();
				}
				break;
			case LU:
				enterOuterAlt(_localctx, 11);
				{
				setState(459);
				lu();
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

	public static class LaheContext extends ParserRuleContext {
		public TerminalNode LAHE() { return getToken(CmavoParser.LAHE, 0); }
		public LaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lahe; }
	}

	public final LaheContext lahe() throws RecognitionException {
		LaheContext _localctx = new LaheContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(LAHE);
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

	public static class LaContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(CmavoParser.LA, 0); }
		public LaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_la; }
	}

	public final LaContext la() throws RecognitionException {
		LaContext _localctx = new LaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_la);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LA);
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

	public static class LauContext extends ParserRuleContext {
		public TerminalNode LAU() { return getToken(CmavoParser.LAU, 0); }
		public LauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lau; }
	}

	public final LauContext lau() throws RecognitionException {
		LauContext _localctx = new LauContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(LAU);
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

	public static class LehuContext extends ParserRuleContext {
		public TerminalNode LEHU() { return getToken(CmavoParser.LEHU, 0); }
		public LehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lehu; }
	}

	public final LehuContext lehu() throws RecognitionException {
		LehuContext _localctx = new LehuContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_lehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(LEHU);
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

	public static class LeContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(CmavoParser.LE, 0); }
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LE);
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

	public static class LihuContext extends ParserRuleContext {
		public TerminalNode LIHU() { return getToken(CmavoParser.LIHU, 0); }
		public LihuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lihu; }
	}

	public final LihuContext lihu() throws RecognitionException {
		LihuContext _localctx = new LihuContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_lihu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(LIHU);
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

	public static class LiContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(CmavoParser.LI, 0); }
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_li);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LI);
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

	public static class LohoContext extends ParserRuleContext {
		public TerminalNode LOHO() { return getToken(CmavoParser.LOHO, 0); }
		public LohoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loho; }
	}

	public final LohoContext loho() throws RecognitionException {
		LohoContext _localctx = new LohoContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_loho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(LOHO);
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

	public static class LohuContext extends ParserRuleContext {
		public TerminalNode LOHU() { return getToken(CmavoParser.LOHU, 0); }
		public LohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lohu; }
	}

	public final LohuContext lohu() throws RecognitionException {
		LohuContext _localctx = new LohuContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(LOHU);
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

	public static class LuhuContext extends ParserRuleContext {
		public TerminalNode LUHU() { return getToken(CmavoParser.LUHU, 0); }
		public LuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_luhu; }
	}

	public final LuhuContext luhu() throws RecognitionException {
		LuhuContext _localctx = new LuhuContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_luhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LUHU);
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

	public static class LuContext extends ParserRuleContext {
		public TerminalNode LU() { return getToken(CmavoParser.LU, 0); }
		public LuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lu; }
	}

	public final LuContext lu() throws RecognitionException {
		LuContext _localctx = new LuContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LU);
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
		enterRule(_localctx, 142, RULE_cmavomn);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				maho();
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				mai();
				}
				break;
			case MEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				mehu();
				}
				break;
			case ME:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				me();
				}
				break;
			case MOHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				mohe();
				}
				break;
			case MOHI:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				mohi();
				}
				break;
			case MOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(490);
				moi();
				}
				break;
			case NAHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(491);
				nahe();
				}
				break;
			case NAHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(492);
				nahu();
				}
				break;
			case NAI:
				enterOuterAlt(_localctx, 10);
				{
				setState(493);
				nai();
				}
				break;
			case NA:
				enterOuterAlt(_localctx, 11);
				{
				setState(494);
				na();
				}
				break;
			case NIHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(495);
				nihe();
				}
				break;
			case NIHO:
				enterOuterAlt(_localctx, 13);
				{
				setState(496);
				niho();
				}
				break;
			case NOI:
				enterOuterAlt(_localctx, 14);
				{
				setState(497);
				noi();
				}
				break;
			case NUHA:
				enterOuterAlt(_localctx, 15);
				{
				setState(498);
				nuha();
				}
				break;
			case NUHI:
				enterOuterAlt(_localctx, 16);
				{
				setState(499);
				nuhi();
				}
				break;
			case NUHU:
				enterOuterAlt(_localctx, 17);
				{
				setState(500);
				nuhu();
				}
				break;
			case NU:
				enterOuterAlt(_localctx, 18);
				{
				setState(501);
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
		public TerminalNode MAHO() { return getToken(CmavoParser.MAHO, 0); }
		public MahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maho; }
	}

	public final MahoContext maho() throws RecognitionException {
		MahoContext _localctx = new MahoContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_maho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		public TerminalNode MAI() { return getToken(CmavoParser.MAI, 0); }
		public MaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mai; }
	}

	public final MaiContext mai() throws RecognitionException {
		MaiContext _localctx = new MaiContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_mai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		public TerminalNode MEHU() { return getToken(CmavoParser.MEHU, 0); }
		public MehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mehu; }
	}

	public final MehuContext mehu() throws RecognitionException {
		MehuContext _localctx = new MehuContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_mehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		public TerminalNode ME() { return getToken(CmavoParser.ME, 0); }
		public MeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_me; }
	}

	public final MeContext me() throws RecognitionException {
		MeContext _localctx = new MeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_me);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		public TerminalNode MOHE() { return getToken(CmavoParser.MOHE, 0); }
		public MoheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohe; }
	}

	public final MoheContext mohe() throws RecognitionException {
		MoheContext _localctx = new MoheContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_mohe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		public TerminalNode MOHI() { return getToken(CmavoParser.MOHI, 0); }
		public MohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohi; }
	}

	public final MohiContext mohi() throws RecognitionException {
		MohiContext _localctx = new MohiContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_mohi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		public TerminalNode MOI() { return getToken(CmavoParser.MOI, 0); }
		public MoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moi; }
	}

	public final MoiContext moi() throws RecognitionException {
		MoiContext _localctx = new MoiContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_moi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		public TerminalNode NAHE() { return getToken(CmavoParser.NAHE, 0); }
		public NaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahe; }
	}

	public final NaheContext nahe() throws RecognitionException {
		NaheContext _localctx = new NaheContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_nahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		public TerminalNode NAHU() { return getToken(CmavoParser.NAHU, 0); }
		public NahuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahu; }
	}

	public final NahuContext nahu() throws RecognitionException {
		NahuContext _localctx = new NahuContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nahu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
		public TerminalNode NAI() { return getToken(CmavoParser.NAI, 0); }
		public NaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nai; }
	}

	public final NaiContext nai() throws RecognitionException {
		NaiContext _localctx = new NaiContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_nai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
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
		public TerminalNode NA() { return getToken(CmavoParser.NA, 0); }
		public NaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_na; }
	}

	public final NaContext na() throws RecognitionException {
		NaContext _localctx = new NaContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_na);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		public TerminalNode NIHE() { return getToken(CmavoParser.NIHE, 0); }
		public NiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nihe; }
	}

	public final NiheContext nihe() throws RecognitionException {
		NiheContext _localctx = new NiheContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_nihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		public TerminalNode NIHO() { return getToken(CmavoParser.NIHO, 0); }
		public NihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niho; }
	}

	public final NihoContext niho() throws RecognitionException {
		NihoContext _localctx = new NihoContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_niho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
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
		public TerminalNode NOI() { return getToken(CmavoParser.NOI, 0); }
		public NoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noi; }
	}

	public final NoiContext noi() throws RecognitionException {
		NoiContext _localctx = new NoiContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_noi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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
		public TerminalNode NUHA() { return getToken(CmavoParser.NUHA, 0); }
		public NuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuha; }
	}

	public final NuhaContext nuha() throws RecognitionException {
		NuhaContext _localctx = new NuhaContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_nuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		public TerminalNode NUHI() { return getToken(CmavoParser.NUHI, 0); }
		public NuhiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhi; }
	}

	public final NuhiContext nuhi() throws RecognitionException {
		NuhiContext _localctx = new NuhiContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nuhi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		public TerminalNode NUHU() { return getToken(CmavoParser.NUHU, 0); }
		public NuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhu; }
	}

	public final NuhuContext nuhu() throws RecognitionException {
		NuhuContext _localctx = new NuhuContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_nuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		public TerminalNode NU() { return getToken(CmavoParser.NU, 0); }
		public NuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nu; }
	}

	public final NuContext nu() throws RecognitionException {
		NuContext _localctx = new NuContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_nu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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

	public static class CmavopContext extends ParserRuleContext {
		public PaContext pa() {
			return getRuleContext(PaContext.class,0);
		}
		public PeheContext pehe() {
			return getRuleContext(PeheContext.class,0);
		}
		public PehoContext peho() {
			return getRuleContext(PehoContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public CmavopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavop; }
	}

	public final CmavopContext cmavop() throws RecognitionException {
		CmavopContext _localctx = new CmavopContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_cmavop);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				pa();
				}
				break;
			case PEHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				pehe();
				}
				break;
			case PEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				peho();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				pu();
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
		enterRule(_localctx, 182, RULE_pa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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

	public static class PeheContext extends ParserRuleContext {
		public TerminalNode PEHE() { return getToken(CmavoParser.PEHE, 0); }
		public PeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pehe; }
	}

	public final PeheContext pehe() throws RecognitionException {
		PeheContext _localctx = new PeheContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_pehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(PEHE);
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

	public static class PehoContext extends ParserRuleContext {
		public TerminalNode PEHO() { return getToken(CmavoParser.PEHO, 0); }
		public PehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peho; }
	}

	public final PehoContext peho() throws RecognitionException {
		PehoContext _localctx = new PehoContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_peho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(PEHO);
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

	public static class PuContext extends ParserRuleContext {
		public TerminalNode PU() { return getToken(CmavoParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(PU);
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
		enterRule(_localctx, 190, RULE_cmavors);
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				raho();
				}
				break;
			case ROI:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				roi();
				}
				break;
			case SA:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				sa();
				}
				break;
			case SEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				sehu();
				}
				break;
			case SEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				sei();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				se();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				si();
				}
				break;
			case SOI:
				enterOuterAlt(_localctx, 8);
				{
				setState(561);
				soi();
				}
				break;
			case SU:
				enterOuterAlt(_localctx, 9);
				{
				setState(562);
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
		public TerminalNode RAHO() { return getToken(CmavoParser.RAHO, 0); }
		public RahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raho; }
	}

	public final RahoContext raho() throws RecognitionException {
		RahoContext _localctx = new RahoContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_raho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		public TerminalNode ROI() { return getToken(CmavoParser.ROI, 0); }
		public RoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roi; }
	}

	public final RoiContext roi() throws RecognitionException {
		RoiContext _localctx = new RoiContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_roi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		public TerminalNode SA() { return getToken(CmavoParser.SA, 0); }
		public SaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sa; }
	}

	public final SaContext sa() throws RecognitionException {
		SaContext _localctx = new SaContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_sa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		public TerminalNode SEHU() { return getToken(CmavoParser.SEHU, 0); }
		public SehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehu; }
	}

	public final SehuContext sehu() throws RecognitionException {
		SehuContext _localctx = new SehuContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_sehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		public TerminalNode SEI() { return getToken(CmavoParser.SEI, 0); }
		public SeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sei; }
	}

	public final SeiContext sei() throws RecognitionException {
		SeiContext _localctx = new SeiContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_sei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		public TerminalNode SE() { return getToken(CmavoParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		public TerminalNode SI() { return getToken(CmavoParser.SI, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		public TerminalNode SOI() { return getToken(CmavoParser.SOI, 0); }
		public SoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soi; }
	}

	public final SoiContext soi() throws RecognitionException {
		SoiContext _localctx = new SoiContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_soi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
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
		public TerminalNode SU() { return getToken(CmavoParser.SU, 0); }
		public SuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_su; }
	}

	public final SuContext su() throws RecognitionException {
		SuContext _localctx = new SuContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_su);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
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

	public static class CmavotContext extends ParserRuleContext {
		public TaheContext tahe() {
			return getRuleContext(TaheContext.class,0);
		}
		public TehuContext tehu() {
			return getRuleContext(TehuContext.class,0);
		}
		public TeiContext tei() {
			return getRuleContext(TeiContext.class,0);
		}
		public ToiContext toi() {
			return getRuleContext(ToiContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TuheContext tuhe() {
			return getRuleContext(TuheContext.class,0);
		}
		public TuhuContext tuhu() {
			return getRuleContext(TuhuContext.class,0);
		}
		public CmavotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavot; }
	}

	public final CmavotContext cmavot() throws RecognitionException {
		CmavotContext _localctx = new CmavotContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_cmavot);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				tahe();
				}
				break;
			case TEHU:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				tehu();
				}
				break;
			case TEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				tei();
				}
				break;
			case TOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				toi();
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				to();
				}
				break;
			case TUHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				tuhe();
				}
				break;
			case TUHU:
				enterOuterAlt(_localctx, 7);
				{
				setState(589);
				tuhu();
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

	public static class TaheContext extends ParserRuleContext {
		public TerminalNode TAHE() { return getToken(CmavoParser.TAHE, 0); }
		public TaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tahe; }
	}

	public final TaheContext tahe() throws RecognitionException {
		TaheContext _localctx = new TaheContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_tahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(TAHE);
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

	public static class TehuContext extends ParserRuleContext {
		public TerminalNode TEHU() { return getToken(CmavoParser.TEHU, 0); }
		public TehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehu; }
	}

	public final TehuContext tehu() throws RecognitionException {
		TehuContext _localctx = new TehuContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_tehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(TEHU);
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

	public static class TeiContext extends ParserRuleContext {
		public TerminalNode TEI() { return getToken(CmavoParser.TEI, 0); }
		public TeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tei; }
	}

	public final TeiContext tei() throws RecognitionException {
		TeiContext _localctx = new TeiContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_tei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(TEI);
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

	public static class ToiContext extends ParserRuleContext {
		public TerminalNode TOI() { return getToken(CmavoParser.TOI, 0); }
		public ToiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toi; }
	}

	public final ToiContext toi() throws RecognitionException {
		ToiContext _localctx = new ToiContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_toi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(TOI);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(CmavoParser.TO, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(TO);
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

	public static class TuheContext extends ParserRuleContext {
		public TerminalNode TUHE() { return getToken(CmavoParser.TUHE, 0); }
		public TuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhe; }
	}

	public final TuheContext tuhe() throws RecognitionException {
		TuheContext _localctx = new TuheContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_tuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(TUHE);
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

	public static class TuhuContext extends ParserRuleContext {
		public TerminalNode TUHU() { return getToken(CmavoParser.TUHU, 0); }
		public TuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhu; }
	}

	public final TuhuContext tuhu() throws RecognitionException {
		TuhuContext _localctx = new TuhuContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_tuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(TUHU);
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
		enterRule(_localctx, 226, RULE_cmavovy);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VA:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				va();
				}
				break;
			case VAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				vau();
				}
				break;
			case VEHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				veha();
				}
				break;
			case VEHO:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				veho();
				}
				break;
			case VEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				vei();
				}
				break;
			case VIHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				viha();
				}
				break;
			case VUHO:
				enterOuterAlt(_localctx, 7);
				{
				setState(612);
				vuho();
				}
				break;
			case VUHU:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				vuhu();
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 9);
				{
				setState(614);
				xi();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 10);
				{
				setState(615);
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
		public TerminalNode VA() { return getToken(CmavoParser.VA, 0); }
		public VaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va; }
	}

	public final VaContext va() throws RecognitionException {
		VaContext _localctx = new VaContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_va);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		public TerminalNode VAU() { return getToken(CmavoParser.VAU, 0); }
		public VauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vau; }
	}

	public final VauContext vau() throws RecognitionException {
		VauContext _localctx = new VauContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_vau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		public TerminalNode VEHA() { return getToken(CmavoParser.VEHA, 0); }
		public VehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veha; }
	}

	public final VehaContext veha() throws RecognitionException {
		VehaContext _localctx = new VehaContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_veha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
		public TerminalNode VEHO() { return getToken(CmavoParser.VEHO, 0); }
		public VehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veho; }
	}

	public final VehoContext veho() throws RecognitionException {
		VehoContext _localctx = new VehoContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_veho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		public TerminalNode VEI() { return getToken(CmavoParser.VEI, 0); }
		public VeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vei; }
	}

	public final VeiContext vei() throws RecognitionException {
		VeiContext _localctx = new VeiContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_vei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
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
		public TerminalNode VIHA() { return getToken(CmavoParser.VIHA, 0); }
		public VihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viha; }
	}

	public final VihaContext viha() throws RecognitionException {
		VihaContext _localctx = new VihaContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_viha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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
		public TerminalNode VUHO() { return getToken(CmavoParser.VUHO, 0); }
		public VuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuho; }
	}

	public final VuhoContext vuho() throws RecognitionException {
		VuhoContext _localctx = new VuhoContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_vuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
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
		public TerminalNode VUHU() { return getToken(CmavoParser.VUHU, 0); }
		public VuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuhu; }
	}

	public final VuhuContext vuhu() throws RecognitionException {
		VuhuContext _localctx = new VuhuContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_vuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
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
		public TerminalNode XI() { return getToken(CmavoParser.XI, 0); }
		public XiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xi; }
	}

	public final XiContext xi() throws RecognitionException {
		XiContext _localctx = new XiContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_xi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		public TerminalNode Y() { return getToken(CmavoParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
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
		enterRule(_localctx, 248, RULE_cmavoz);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				zaho();
				}
				break;
			case ZEHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				zeha();
				}
				break;
			case ZEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				zei();
				}
				break;
			case ZIHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(641);
				zihe();
				}
				break;
			case ZI:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				zi();
				}
				break;
			case ZOHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(643);
				zohu();
				}
				break;
			case ZOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(644);
				zoi();
				}
				break;
			case ZO:
				enterOuterAlt(_localctx, 8);
				{
				setState(645);
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
		public TerminalNode ZAHO() { return getToken(CmavoParser.ZAHO, 0); }
		public ZahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zaho; }
	}

	public final ZahoContext zaho() throws RecognitionException {
		ZahoContext _localctx = new ZahoContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_zaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
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
		public TerminalNode ZEHA() { return getToken(CmavoParser.ZEHA, 0); }
		public ZehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeha; }
	}

	public final ZehaContext zeha() throws RecognitionException {
		ZehaContext _localctx = new ZehaContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_zeha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
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
		public TerminalNode ZEI() { return getToken(CmavoParser.ZEI, 0); }
		public ZeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zei; }
	}

	public final ZeiContext zei() throws RecognitionException {
		ZeiContext _localctx = new ZeiContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_zei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		public TerminalNode ZIHE() { return getToken(CmavoParser.ZIHE, 0); }
		public ZiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zihe; }
	}

	public final ZiheContext zihe() throws RecognitionException {
		ZiheContext _localctx = new ZiheContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_zihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		public TerminalNode ZI() { return getToken(CmavoParser.ZI, 0); }
		public ZiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zi; }
	}

	public final ZiContext zi() throws RecognitionException {
		ZiContext _localctx = new ZiContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_zi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
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
		public TerminalNode ZOHU() { return getToken(CmavoParser.ZOHU, 0); }
		public ZohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zohu; }
	}

	public final ZohuContext zohu() throws RecognitionException {
		ZohuContext _localctx = new ZohuContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_zohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
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
		public TerminalNode ZOI() { return getToken(CmavoParser.ZOI, 0); }
		public ZoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zoi; }
	}

	public final ZoiContext zoi() throws RecognitionException {
		ZoiContext _localctx = new ZoiContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_zoi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
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
		public TerminalNode ZO() { return getToken(CmavoParser.ZO, 0); }
		public ZoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zo; }
	}

	public final ZoContext zo() throws RecognitionException {
		ZoContext _localctx = new ZoContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_zo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u029b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\u011c\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0127"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u014b\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u018a\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u01aa\n\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\5=\u01cf\n=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\5I\u01f9\nI\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3"+
		"Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3"+
		"\\\3\\\3\\\5\\\u0223\n\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\5a\u0236\na\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j"+
		"\3j\3k\3k\3k\3k\3k\3k\3k\5k\u0251\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q"+
		"\3q\3r\3r\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u026b\ns\3t\3t\3u\3u\3v\3v"+
		"\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\3~\3~\3~\3~\5~"+
		"\u0289\n~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\2\2\u0087\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\2\2\2\u028c\2\u011b\3\2\2\2\4\u0126\3\2\2\2\6"+
		"\u0128\3\2\2\2\b\u012a\3\2\2\2\n\u012c\3\2\2\2\f\u012e\3\2\2\2\16\u0130"+
		"\3\2\2\2\20\u0132\3\2\2\2\22\u0134\3\2\2\2\24\u0136\3\2\2\2\26\u0138\3"+
		"\2\2\2\30\u013a\3\2\2\2\32\u013c\3\2\2\2\34\u013e\3\2\2\2\36\u014a\3\2"+
		"\2\2 \u014c\3\2\2\2\"\u014e\3\2\2\2$\u0150\3\2\2\2&\u0152\3\2\2\2(\u0154"+
		"\3\2\2\2*\u0156\3\2\2\2,\u0158\3\2\2\2.\u015a\3\2\2\2\60\u015c\3\2\2\2"+
		"\62\u015e\3\2\2\2\64\u016a\3\2\2\2\66\u016c\3\2\2\28\u016e\3\2\2\2:\u0170"+
		"\3\2\2\2<\u0172\3\2\2\2>\u0174\3\2\2\2@\u0176\3\2\2\2B\u0178\3\2\2\2D"+
		"\u017a\3\2\2\2F\u017c\3\2\2\2H\u017e\3\2\2\2J\u0189\3\2\2\2L\u018b\3\2"+
		"\2\2N\u018d\3\2\2\2P\u018f\3\2\2\2R\u0191\3\2\2\2T\u0193\3\2\2\2V\u0195"+
		"\3\2\2\2X\u0197\3\2\2\2Z\u0199\3\2\2\2\\\u019b\3\2\2\2^\u01a9\3\2\2\2"+
		"`\u01ab\3\2\2\2b\u01ad\3\2\2\2d\u01af\3\2\2\2f\u01b1\3\2\2\2h\u01b3\3"+
		"\2\2\2j\u01b5\3\2\2\2l\u01b7\3\2\2\2n\u01b9\3\2\2\2p\u01bb\3\2\2\2r\u01bd"+
		"\3\2\2\2t\u01bf\3\2\2\2v\u01c1\3\2\2\2x\u01ce\3\2\2\2z\u01d0\3\2\2\2|"+
		"\u01d2\3\2\2\2~\u01d4\3\2\2\2\u0080\u01d6\3\2\2\2\u0082\u01d8\3\2\2\2"+
		"\u0084\u01da\3\2\2\2\u0086\u01dc\3\2\2\2\u0088\u01de\3\2\2\2\u008a\u01e0"+
		"\3\2\2\2\u008c\u01e2\3\2\2\2\u008e\u01e4\3\2\2\2\u0090\u01f8\3\2\2\2\u0092"+
		"\u01fa\3\2\2\2\u0094\u01fc\3\2\2\2\u0096\u01fe\3\2\2\2\u0098\u0200\3\2"+
		"\2\2\u009a\u0202\3\2\2\2\u009c\u0204\3\2\2\2\u009e\u0206\3\2\2\2\u00a0"+
		"\u0208\3\2\2\2\u00a2\u020a\3\2\2\2\u00a4\u020c\3\2\2\2\u00a6\u020e\3\2"+
		"\2\2\u00a8\u0210\3\2\2\2\u00aa\u0212\3\2\2\2\u00ac\u0214\3\2\2\2\u00ae"+
		"\u0216\3\2\2\2\u00b0\u0218\3\2\2\2\u00b2\u021a\3\2\2\2\u00b4\u021c\3\2"+
		"\2\2\u00b6\u0222\3\2\2\2\u00b8\u0224\3\2\2\2\u00ba\u0226\3\2\2\2\u00bc"+
		"\u0228\3\2\2\2\u00be\u022a\3\2\2\2\u00c0\u0235\3\2\2\2\u00c2\u0237\3\2"+
		"\2\2\u00c4\u0239\3\2\2\2\u00c6\u023b\3\2\2\2\u00c8\u023d\3\2\2\2\u00ca"+
		"\u023f\3\2\2\2\u00cc\u0241\3\2\2\2\u00ce\u0243\3\2\2\2\u00d0\u0245\3\2"+
		"\2\2\u00d2\u0247\3\2\2\2\u00d4\u0250\3\2\2\2\u00d6\u0252\3\2\2\2\u00d8"+
		"\u0254\3\2\2\2\u00da\u0256\3\2\2\2\u00dc\u0258\3\2\2\2\u00de\u025a\3\2"+
		"\2\2\u00e0\u025c\3\2\2\2\u00e2\u025e\3\2\2\2\u00e4\u026a\3\2\2\2\u00e6"+
		"\u026c\3\2\2\2\u00e8\u026e\3\2\2\2\u00ea\u0270\3\2\2\2\u00ec\u0272\3\2"+
		"\2\2\u00ee\u0274\3\2\2\2\u00f0\u0276\3\2\2\2\u00f2\u0278\3\2\2\2\u00f4"+
		"\u027a\3\2\2\2\u00f6\u027c\3\2\2\2\u00f8\u027e\3\2\2\2\u00fa\u0288\3\2"+
		"\2\2\u00fc\u028a\3\2\2\2\u00fe\u028c\3\2\2\2\u0100\u028e\3\2\2\2\u0102"+
		"\u0290\3\2\2\2\u0104\u0292\3\2\2\2\u0106\u0294\3\2\2\2\u0108\u0296\3\2"+
		"\2\2\u010a\u0298\3\2\2\2\u010c\u011c\5\4\3\2\u010d\u011c\5\30\r\2\u010e"+
		"\u011c\5\32\16\2\u010f\u011c\5\36\20\2\u0110\u011c\5\64\33\2\u0111\u011c"+
		"\5J&\2\u0112\u011c\5^\60\2\u0113\u011c\5x=\2\u0114\u011c\5\u0090I\2\u0115"+
		"\u011c\5\u00b6\\\2\u0116\u011c\5\u00c0a\2\u0117\u011c\5\u00d4k\2\u0118"+
		"\u011c\5\34\17\2\u0119\u011c\5\u00e4s\2\u011a\u011c\5\u00fa~\2\u011b\u010c"+
		"\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u010e\3\2\2\2\u011b\u010f\3\2\2\2\u011b"+
		"\u0110\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2"+
		"\2\2\u011b\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2"+
		"\2\2\u011c\3\3\2\2\2\u011d\u0127\5\6\4\2\u011e\u0127\5\b\5\2\u011f\u0127"+
		"\5\n\6\2\u0120\u0127\5\f\7\2\u0121\u0127\5\16\b\2\u0122\u0127\5\20\t\2"+
		"\u0123\u0127\5\22\n\2\u0124\u0127\5\24\13\2\u0125\u0127\5\26\f\2\u0126"+
		"\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2"+
		"\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\5\3\2\2\2\u0128\u0129\7\3\2\2"+
		"\u0129\7\3\2\2\2\u012a\u012b\7\4\2\2\u012b\t\3\2\2\2\u012c\u012d\7\5\2"+
		"\2\u012d\13\3\2\2\2\u012e\u012f\7\6\2\2\u012f\r\3\2\2\2\u0130\u0131\7"+
		"\7\2\2\u0131\17\3\2\2\2\u0132\u0133\7\b\2\2\u0133\21\3\2\2\2\u0134\u0135"+
		"\7\n\2\2\u0135\23\3\2\2\2\u0136\u0137\7\13\2\2\u0137\25\3\2\2\2\u0138"+
		"\u0139\7\f\2\2\u0139\27\3\2\2\2\u013a\u013b\7\r\2\2\u013b\31\3\2\2\2\u013c"+
		"\u013d\7\16\2\2\u013d\33\3\2\2\2\u013e\u013f\7\17\2\2\u013f\35\3\2\2\2"+
		"\u0140\u014b\5 \21\2\u0141\u014b\5\"\22\2\u0142\u014b\5$\23\2\u0143\u014b"+
		"\5&\24\2\u0144\u014b\5(\25\2\u0145\u014b\5*\26\2\u0146\u014b\5,\27\2\u0147"+
		"\u014b\5.\30\2\u0148\u014b\5\60\31\2\u0149\u014b\5\62\32\2\u014a\u0140"+
		"\3\2\2\2\u014a\u0141\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014a"+
		"\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\37\3\2\2\2\u014c\u014d"+
		"\7\20\2\2\u014d!\3\2\2\2\u014e\u014f\7\21\2\2\u014f#\3\2\2\2\u0150\u0151"+
		"\7\22\2\2\u0151%\3\2\2\2\u0152\u0153\7\23\2\2\u0153\'\3\2\2\2\u0154\u0155"+
		"\7\24\2\2\u0155)\3\2\2\2\u0156\u0157\7\25\2\2\u0157+\3\2\2\2\u0158\u0159"+
		"\7\26\2\2\u0159-\3\2\2\2\u015a\u015b\7\27\2\2\u015b/\3\2\2\2\u015c\u015d"+
		"\7\30\2\2\u015d\61\3\2\2\2\u015e\u015f\7\32\2\2\u015f\63\3\2\2\2\u0160"+
		"\u016b\5\66\34\2\u0161\u016b\58\35\2\u0162\u016b\5:\36\2\u0163\u016b\5"+
		"<\37\2\u0164\u016b\5> \2\u0165\u016b\5@!\2\u0166\u016b\5B\"\2\u0167\u016b"+
		"\5D#\2\u0168\u016b\5F$\2\u0169\u016b\5H%\2\u016a\u0160\3\2\2\2\u016a\u0161"+
		"\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u0169\3\2\2\2\u016b\65\3\2\2\2\u016c\u016d\7\33\2\2\u016d\67"+
		"\3\2\2\2\u016e\u016f\7\34\2\2\u016f9\3\2\2\2\u0170\u0171\7\35\2\2\u0171"+
		";\3\2\2\2\u0172\u0173\7\36\2\2\u0173=\3\2\2\2\u0174\u0175\7\37\2\2\u0175"+
		"?\3\2\2\2\u0176\u0177\7 \2\2\u0177A\3\2\2\2\u0178\u0179\7!\2\2\u0179C"+
		"\3\2\2\2\u017a\u017b\7\"\2\2\u017bE\3\2\2\2\u017c\u017d\7#\2\2\u017dG"+
		"\3\2\2\2\u017e\u017f\7$\2\2\u017fI\3\2\2\2\u0180\u018a\5L\'\2\u0181\u018a"+
		"\5N(\2\u0182\u018a\5P)\2\u0183\u018a\5R*\2\u0184\u018a\5T+\2\u0185\u018a"+
		"\5V,\2\u0186\u018a\5X-\2\u0187\u018a\5Z.\2\u0188\u018a\5\\/\2\u0189\u0180"+
		"\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0183\3\2\2\2\u0189"+
		"\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u0188\3\2\2\2\u018aK\3\2\2\2\u018b\u018c\7%\2\2\u018cM\3\2"+
		"\2\2\u018d\u018e\7&\2\2\u018eO\3\2\2\2\u018f\u0190\7\'\2\2\u0190Q\3\2"+
		"\2\2\u0191\u0192\7(\2\2\u0192S\3\2\2\2\u0193\u0194\7)\2\2\u0194U\3\2\2"+
		"\2\u0195\u0196\7*\2\2\u0196W\3\2\2\2\u0197\u0198\7+\2\2\u0198Y\3\2\2\2"+
		"\u0199\u019a\7,\2\2\u019a[\3\2\2\2\u019b\u019c\7-\2\2\u019c]\3\2\2\2\u019d"+
		"\u01aa\5`\61\2\u019e\u01aa\5b\62\2\u019f\u01aa\5d\63\2\u01a0\u01aa\5f"+
		"\64\2\u01a1\u01aa\5h\65\2\u01a2\u01aa\5j\66\2\u01a3\u01aa\5l\67\2\u01a4"+
		"\u01aa\5n8\2\u01a5\u01aa\5p9\2\u01a6\u01aa\5r:\2\u01a7\u01aa\5t;\2\u01a8"+
		"\u01aa\5v<\2\u01a9\u019d\3\2\2\2\u01a9\u019e\3\2\2\2\u01a9\u019f\3\2\2"+
		"\2\u01a9\u01a0\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9\u01a2\3\2\2\2\u01a9\u01a3"+
		"\3\2\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa_\3\2\2\2\u01ab\u01ac\7.\2\2\u01ac"+
		"a\3\2\2\2\u01ad\u01ae\7/\2\2\u01aec\3\2\2\2\u01af\u01b0\7\60\2\2\u01b0"+
		"e\3\2\2\2\u01b1\u01b2\7\61\2\2\u01b2g\3\2\2\2\u01b3\u01b4\7\62\2\2\u01b4"+
		"i\3\2\2\2\u01b5\u01b6\7\63\2\2\u01b6k\3\2\2\2\u01b7\u01b8\7\64\2\2\u01b8"+
		"m\3\2\2\2\u01b9\u01ba\7\65\2\2\u01bao\3\2\2\2\u01bb\u01bc\7\66\2\2\u01bc"+
		"q\3\2\2\2\u01bd\u01be\7\67\2\2\u01bes\3\2\2\2\u01bf\u01c0\78\2\2\u01c0"+
		"u\3\2\2\2\u01c1\u01c2\79\2\2\u01c2w\3\2\2\2\u01c3\u01cf\5z>\2\u01c4\u01cf"+
		"\5|?\2\u01c5\u01cf\5~@\2\u01c6\u01cf\5\u0080A\2\u01c7\u01cf\5\u0082B\2"+
		"\u01c8\u01cf\5\u0084C\2\u01c9\u01cf\5\u0086D\2\u01ca\u01cf\5\u0088E\2"+
		"\u01cb\u01cf\5\u008aF\2\u01cc\u01cf\5\u008cG\2\u01cd\u01cf\5\u008eH\2"+
		"\u01ce\u01c3\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c5\3\2\2\2\u01ce\u01c6"+
		"\3\2\2\2\u01ce\u01c7\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01c9\3\2\2\2\u01ce"+
		"\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01cfy\3\2\2\2\u01d0\u01d1\7:\2\2\u01d1{\3\2\2\2\u01d2\u01d3\7;\2"+
		"\2\u01d3}\3\2\2\2\u01d4\u01d5\7<\2\2\u01d5\177\3\2\2\2\u01d6\u01d7\7="+
		"\2\2\u01d7\u0081\3\2\2\2\u01d8\u01d9\7>\2\2\u01d9\u0083\3\2\2\2\u01da"+
		"\u01db\7?\2\2\u01db\u0085\3\2\2\2\u01dc\u01dd\7@\2\2\u01dd\u0087\3\2\2"+
		"\2\u01de\u01df\7A\2\2\u01df\u0089\3\2\2\2\u01e0\u01e1\7B\2\2\u01e1\u008b"+
		"\3\2\2\2\u01e2\u01e3\7C\2\2\u01e3\u008d\3\2\2\2\u01e4\u01e5\7D\2\2\u01e5"+
		"\u008f\3\2\2\2\u01e6\u01f9\5\u0092J\2\u01e7\u01f9\5\u0094K\2\u01e8\u01f9"+
		"\5\u0096L\2\u01e9\u01f9\5\u0098M\2\u01ea\u01f9\5\u009aN\2\u01eb\u01f9"+
		"\5\u009cO\2\u01ec\u01f9\5\u009eP\2\u01ed\u01f9\5\u00a0Q\2\u01ee\u01f9"+
		"\5\u00a2R\2\u01ef\u01f9\5\u00a4S\2\u01f0\u01f9\5\u00a6T\2\u01f1\u01f9"+
		"\5\u00a8U\2\u01f2\u01f9\5\u00aaV\2\u01f3\u01f9\5\u00acW\2\u01f4\u01f9"+
		"\5\u00aeX\2\u01f5\u01f9\5\u00b0Y\2\u01f6\u01f9\5\u00b2Z\2\u01f7\u01f9"+
		"\5\u00b4[\2\u01f8\u01e6\3\2\2\2\u01f8\u01e7\3\2\2\2\u01f8\u01e8\3\2\2"+
		"\2\u01f8\u01e9\3\2\2\2\u01f8\u01ea\3\2\2\2\u01f8\u01eb\3\2\2\2\u01f8\u01ec"+
		"\3\2\2\2\u01f8\u01ed\3\2\2\2\u01f8\u01ee\3\2\2\2\u01f8\u01ef\3\2\2\2\u01f8"+
		"\u01f0\3\2\2\2\u01f8\u01f1\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3\2"+
		"\2\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u0091\3\2\2\2\u01fa\u01fb\7E\2\2\u01fb\u0093\3\2"+
		"\2\2\u01fc\u01fd\7F\2\2\u01fd\u0095\3\2\2\2\u01fe\u01ff\7G\2\2\u01ff\u0097"+
		"\3\2\2\2\u0200\u0201\7H\2\2\u0201\u0099\3\2\2\2\u0202\u0203\7I\2\2\u0203"+
		"\u009b\3\2\2\2\u0204\u0205\7J\2\2\u0205\u009d\3\2\2\2\u0206\u0207\7K\2"+
		"\2\u0207\u009f\3\2\2\2\u0208\u0209\7L\2\2\u0209\u00a1\3\2\2\2\u020a\u020b"+
		"\7M\2\2\u020b\u00a3\3\2\2\2\u020c\u020d\7N\2\2\u020d\u00a5\3\2\2\2\u020e"+
		"\u020f\7O\2\2\u020f\u00a7\3\2\2\2\u0210\u0211\7P\2\2\u0211\u00a9\3\2\2"+
		"\2\u0212\u0213\7Q\2\2\u0213\u00ab\3\2\2\2\u0214\u0215\7R\2\2\u0215\u00ad"+
		"\3\2\2\2\u0216\u0217\7S\2\2\u0217\u00af\3\2\2\2\u0218\u0219\7T\2\2\u0219"+
		"\u00b1\3\2\2\2\u021a\u021b\7U\2\2\u021b\u00b3\3\2\2\2\u021c\u021d\7V\2"+
		"\2\u021d\u00b5\3\2\2\2\u021e\u0223\5\u00b8]\2\u021f\u0223\5\u00ba^\2\u0220"+
		"\u0223\5\u00bc_\2\u0221\u0223\5\u00be`\2\u0222\u021e\3\2\2\2\u0222\u021f"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u00b7\3\2\2\2\u0224"+
		"\u0225\7W\2\2\u0225\u00b9\3\2\2\2\u0226\u0227\7X\2\2\u0227\u00bb\3\2\2"+
		"\2\u0228\u0229\7Y\2\2\u0229\u00bd\3\2\2\2\u022a\u022b\7Z\2\2\u022b\u00bf"+
		"\3\2\2\2\u022c\u0236\5\u00c2b\2\u022d\u0236\5\u00c4c\2\u022e\u0236\5\u00c6"+
		"d\2\u022f\u0236\5\u00c8e\2\u0230\u0236\5\u00caf\2\u0231\u0236\5\u00cc"+
		"g\2\u0232\u0236\5\u00ceh\2\u0233\u0236\5\u00d0i\2\u0234\u0236\5\u00d2"+
		"j\2\u0235\u022c\3\2\2\2\u0235\u022d\3\2\2\2\u0235\u022e\3\2\2\2\u0235"+
		"\u022f\3\2\2\2\u0235\u0230\3\2\2\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u00c1\3\2\2\2\u0237"+
		"\u0238\7[\2\2\u0238\u00c3\3\2\2\2\u0239\u023a\7\\\2\2\u023a\u00c5\3\2"+
		"\2\2\u023b\u023c\7]\2\2\u023c\u00c7\3\2\2\2\u023d\u023e\7^\2\2\u023e\u00c9"+
		"\3\2\2\2\u023f\u0240\7_\2\2\u0240\u00cb\3\2\2\2\u0241\u0242\7`\2\2\u0242"+
		"\u00cd\3\2\2\2\u0243\u0244\7a\2\2\u0244\u00cf\3\2\2\2\u0245\u0246\7b\2"+
		"\2\u0246\u00d1\3\2\2\2\u0247\u0248\7c\2\2\u0248\u00d3\3\2\2\2\u0249\u0251"+
		"\5\u00d6l\2\u024a\u0251\5\u00d8m\2\u024b\u0251\5\u00dan\2\u024c\u0251"+
		"\5\u00dco\2\u024d\u0251\5\u00dep\2\u024e\u0251\5\u00e0q\2\u024f\u0251"+
		"\5\u00e2r\2\u0250\u0249\3\2\2\2\u0250\u024a\3\2\2\2\u0250\u024b\3\2\2"+
		"\2\u0250\u024c\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f"+
		"\3\2\2\2\u0251\u00d5\3\2\2\2\u0252\u0253\7d\2\2\u0253\u00d7\3\2\2\2\u0254"+
		"\u0255\7e\2\2\u0255\u00d9\3\2\2\2\u0256\u0257\7f\2\2\u0257\u00db\3\2\2"+
		"\2\u0258\u0259\7g\2\2\u0259\u00dd\3\2\2\2\u025a\u025b\7h\2\2\u025b\u00df"+
		"\3\2\2\2\u025c\u025d\7i\2\2\u025d\u00e1\3\2\2\2\u025e\u025f\7j\2\2\u025f"+
		"\u00e3\3\2\2\2\u0260\u026b\5\u00e6t\2\u0261\u026b\5\u00e8u\2\u0262\u026b"+
		"\5\u00eav\2\u0263\u026b\5\u00ecw\2\u0264\u026b\5\u00eex\2\u0265\u026b"+
		"\5\u00f0y\2\u0266\u026b\5\u00f2z\2\u0267\u026b\5\u00f4{\2\u0268\u026b"+
		"\5\u00f6|\2\u0269\u026b\5\u00f8}\2\u026a\u0260\3\2\2\2\u026a\u0261\3\2"+
		"\2\2\u026a\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2\2\2\u026a"+
		"\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026a\u0269\3\2\2\2\u026b\u00e5\3\2\2\2\u026c\u026d\7k\2\2\u026d"+
		"\u00e7\3\2\2\2\u026e\u026f\7l\2\2\u026f\u00e9\3\2\2\2\u0270\u0271\7m\2"+
		"\2\u0271\u00eb\3\2\2\2\u0272\u0273\7n\2\2\u0273\u00ed\3\2\2\2\u0274\u0275"+
		"\7o\2\2\u0275\u00ef\3\2\2\2\u0276\u0277\7p\2\2\u0277\u00f1\3\2\2\2\u0278"+
		"\u0279\7q\2\2\u0279\u00f3\3\2\2\2\u027a\u027b\7r\2\2\u027b\u00f5\3\2\2"+
		"\2\u027c\u027d\7s\2\2\u027d\u00f7\3\2\2\2\u027e\u027f\7t\2\2\u027f\u00f9"+
		"\3\2\2\2\u0280\u0289\5\u00fc\177\2\u0281\u0289\5\u00fe\u0080\2\u0282\u0289"+
		"\5\u0100\u0081\2\u0283\u0289\5\u0102\u0082\2\u0284\u0289\5\u0104\u0083"+
		"\2\u0285\u0289\5\u0106\u0084\2\u0286\u0289\5\u0108\u0085\2\u0287\u0289"+
		"\5\u010a\u0086\2\u0288\u0280\3\2\2\2\u0288\u0281\3\2\2\2\u0288\u0282\3"+
		"\2\2\2\u0288\u0283\3\2\2\2\u0288\u0284\3\2\2\2\u0288\u0285\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289\u00fb\3\2\2\2\u028a\u028b\7u"+
		"\2\2\u028b\u00fd\3\2\2\2\u028c\u028d\7v\2\2\u028d\u00ff\3\2\2\2\u028e"+
		"\u028f\7w\2\2\u028f\u0101\3\2\2\2\u0290\u0291\7x\2\2\u0291\u0103\3\2\2"+
		"\2\u0292\u0293\7y\2\2\u0293\u0105\3\2\2\2\u0294\u0295\7z\2\2\u0295\u0107"+
		"\3\2\2\2\u0296\u0297\7{\2\2\u0297\u0109\3\2\2\2\u0298\u0299\7|\2\2\u0299"+
		"\u010b\3\2\2\2\17\u011b\u0126\u014a\u016a\u0189\u01a9\u01ce\u01f8\u0222"+
		"\u0235\u0250\u026a\u0288";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}