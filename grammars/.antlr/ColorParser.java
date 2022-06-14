// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\Color.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, GISMU=4, LUJVO=5, A=6, BAHE=7, BEHO=8, BEI=9, BE=10, 
		BIHE=11, BIHI=12, BOI=13, BO=14, BU=15, BAI=16, BY=17, UI=18, CAHA=19, 
		CAI=20, CEHE=21, CEI=22, CO=23, COI=24, CU=25, CUHE=26, DAHO=27, DOHU=28, 
		DOI=29, FA=30, FAHA=31, FAHO=32, FEHE=33, FEHU=34, FIHO=35, FOI=36, FUHA=37, 
		FUHE=38, FUHO=39, GA=40, GAHO=41, GEHU=42, GI=43, GIHA=44, GOHA=45, GOI=46, 
		GUHA=47, I=48, JAI=49, JA=50, JOHI=51, JOI=52, KEHE=53, KEI=54, KE=55, 
		KI=56, KOHA=57, KUHE=58, KUHO=59, KU=60, LAHE=61, LA=62, LAU=63, LEHU=64, 
		LE=65, LIHU=66, LI=67, LOHO=68, LOHU=69, LUHU=70, LU=71, MAHO=72, MAI=73, 
		MEHU=74, ME=75, MOHE=76, MOHI=77, MOI=78, NAHE=79, NAHU=80, NAI=81, NA=82, 
		NIHE=83, NIHO=84, NOI=85, NUHA=86, NUHI=87, NUHU=88, NU=89, PA=90, PEHE=91, 
		PEHO=92, PU=93, RAHO=94, ROI=95, SA=96, SEHU=97, SEI=98, SE=99, SI=100, 
		SOI=101, SU=102, TAHE=103, TEHU=104, TEI=105, TOI=106, TO=107, TUHE=108, 
		TUHU=109, VA=110, VAU=111, VEHA=112, VEHO=113, VEI=114, VIHA=115, VUHO=116, 
		VUHU=117, XI=118, ZAHO=119, ZEHA=120, ZEI=121, ZIHE=122, ZI=123, ZOHU=124, 
		ZOI=125, ZO=126, Y=127;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_brivla = 3, RULE_lujvo = 4, 
		RULE_gismu = 5, RULE_cmavo = 6, RULE_cmavoab = 7, RULE_a = 8, RULE_bahe = 9, 
		RULE_beho = 10, RULE_bei = 11, RULE_be = 12, RULE_bihe = 13, RULE_boi = 14, 
		RULE_bo = 15, RULE_bu = 16, RULE_bai = 17, RULE_by = 18, RULE_ui = 19, 
		RULE_cmavocd = 20, RULE_caha = 21, RULE_cai = 22, RULE_cehe = 23, RULE_cei = 24, 
		RULE_co = 25, RULE_coi = 26, RULE_cu = 27, RULE_cuhe = 28, RULE_daho = 29, 
		RULE_doi = 30, RULE_cmavof = 31, RULE_fa = 32, RULE_faha = 33, RULE_faho = 34, 
		RULE_fehe = 35, RULE_fehu = 36, RULE_fiho = 37, RULE_foi = 38, RULE_fuha = 39, 
		RULE_fuhe = 40, RULE_fuho = 41, RULE_cmavogi = 42, RULE_ga = 43, RULE_gaho = 44, 
		RULE_gehu = 45, RULE_gi = 46, RULE_giha = 47, RULE_goha = 48, RULE_goi = 49, 
		RULE_guha = 50, RULE_i = 51, RULE_cmavojk = 52, RULE_jai = 53, RULE_ja = 54, 
		RULE_johi = 55, RULE_joi = 56, RULE_kehe = 57, RULE_kei = 58, RULE_ke = 59, 
		RULE_ki = 60, RULE_koha = 61, RULE_kuhe = 62, RULE_kuho = 63, RULE_ku = 64, 
		RULE_cmavol = 65, RULE_lahe = 66, RULE_la = 67, RULE_lau = 68, RULE_lehu = 69, 
		RULE_le = 70, RULE_lihu = 71, RULE_li = 72, RULE_loho = 73, RULE_lohu = 74, 
		RULE_luhu = 75, RULE_lu = 76, RULE_cmavomn = 77, RULE_maho = 78, RULE_mai = 79, 
		RULE_mehu = 80, RULE_me = 81, RULE_mohe = 82, RULE_mohi = 83, RULE_moi = 84, 
		RULE_nahe = 85, RULE_nahu = 86, RULE_nai = 87, RULE_na = 88, RULE_nihe = 89, 
		RULE_niho = 90, RULE_noi = 91, RULE_nuha = 92, RULE_nuhi = 93, RULE_nuhu = 94, 
		RULE_nu = 95, RULE_cmavop = 96, RULE_pa = 97, RULE_pehe = 98, RULE_peho = 99, 
		RULE_pu = 100, RULE_cmavors = 101, RULE_raho = 102, RULE_roi = 103, RULE_sa = 104, 
		RULE_sehu = 105, RULE_sei = 106, RULE_se = 107, RULE_si = 108, RULE_soi = 109, 
		RULE_su = 110, RULE_cmavot = 111, RULE_tahe = 112, RULE_tehu = 113, RULE_tei = 114, 
		RULE_toi = 115, RULE_to = 116, RULE_tuhe = 117, RULE_tuhu = 118, RULE_cmavovy = 119, 
		RULE_va = 120, RULE_vau = 121, RULE_veha = 122, RULE_veho = 123, RULE_vei = 124, 
		RULE_viha = 125, RULE_vuho = 126, RULE_vuhu = 127, RULE_xi = 128, RULE_y = 129, 
		RULE_cmavoz = 130, RULE_zaho = 131, RULE_zeha = 132, RULE_zei = 133, RULE_zihe = 134, 
		RULE_zi = 135, RULE_zohu = 136, RULE_zoi = 137, RULE_zo = 138;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "brivla", "lujvo", "gismu", "cmavo", "cmavoab", 
			"a", "bahe", "beho", "bei", "be", "bihe", "boi", "bo", "bu", "bai", "by", 
			"ui", "cmavocd", "caha", "cai", "cehe", "cei", "co", "coi", "cu", "cuhe", 
			"daho", "doi", "cmavof", "fa", "faha", "faho", "fehe", "fehu", "fiho", 
			"foi", "fuha", "fuhe", "fuho", "cmavogi", "ga", "gaho", "gehu", "gi", 
			"giha", "goha", "goi", "guha", "i", "cmavojk", "jai", "ja", "johi", "joi", 
			"kehe", "kei", "ke", "ki", "koha", "kuhe", "kuho", "ku", "cmavol", "lahe", 
			"la", "lau", "lehu", "le", "lihu", "li", "loho", "lohu", "luhu", "lu", 
			"cmavomn", "maho", "mai", "mehu", "me", "mohe", "mohi", "moi", "nahe", 
			"nahu", "nai", "na", "nihe", "niho", "noi", "nuha", "nuhi", "nuhu", "nu", 
			"cmavop", "pa", "pehe", "peho", "pu", "cmavors", "raho", "roi", "sa", 
			"sehu", "sei", "se", "si", "soi", "su", "cmavot", "tahe", "tehu", "tei", 
			"toi", "to", "tuhe", "tuhu", "cmavovy", "va", "vau", "veha", "veho", 
			"vei", "viha", "vuho", "vuhu", "xi", "y", "cmavoz", "zaho", "zeha", "zei", 
			"zihe", "zi", "zohu", "zoi", "zo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'", null, null, null, null, null, "'be'o'", "'bei'", 
			"'be'", "'bi'e'", null, "'boi'", "'bo'", "'bu'", null, null, null, null, 
			null, "'ce'e'", "'cei'", "'co'", null, "'cu'", null, "'da'o'", "'do'u'", 
			"'doi'", null, null, "'fa'o'", "'fe'e'", "'fe'u'", "'fi'o'", "'foi'", 
			"'fu'a'", "'fu'e'", "'fu'o'", null, null, "'ge'u'", "'gi'", null, null, 
			null, null, "'.i'", "'jai'", null, "'jo'i'", null, "'ke'e'", "'kei'", 
			"'ke'", "'ki'", null, "'ku'e'", "'ku'o'", "'ku'", null, "'la'", null, 
			"'le'u'", null, "'li'u'", "'li'", "'lo'o'", "'lo'u'", "'lu'u'", "'lu'", 
			"'ma'o'", null, "'me'u'", "'me'", "'mo'e'", "'mo'i'", null, null, "'na'u'", 
			"'nai'", null, "'ni'e'", "'ni'o'", null, "'nu'a'", "'nu'i'", "'nu'u'", 
			null, null, "'pe'e'", "'pe'o'", null, "'ra'o'", null, "'sa'", "'se'u'", 
			"'sei'", null, "'si'", "'soi'", "'su'", null, "'te'u'", "'tei'", "'toi'", 
			"'to'", "'tu'e'", "'tu'u'", null, "'vau'", null, "'ve'o'", "'vei'", null, 
			"'vu'o'", null, "'xi'", null, null, "'zei'", "'zi'e'", null, "'zo'u'", 
			"'zoi'", "'zo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "GISMU", "LUJVO", "A", "BAHE", "BEHO", "BEI", 
			"BE", "BIHE", "BIHI", "BOI", "BO", "BU", "BAI", "BY", "UI", "CAHA", "CAI", 
			"CEHE", "CEI", "CO", "COI", "CU", "CUHE", "DAHO", "DOHU", "DOI", "FA", 
			"FAHA", "FAHO", "FEHE", "FEHU", "FIHO", "FOI", "FUHA", "FUHE", "FUHO", 
			"GA", "GAHO", "GEHU", "GI", "GIHA", "GOHA", "GOI", "GUHA", "I", "JAI", 
			"JA", "JOHI", "JOI", "KEHE", "KEI", "KE", "KI", "KOHA", "KUHE", "KUHO", 
			"KU", "LAHE", "LA", "LAU", "LEHU", "LE", "LIHU", "LI", "LOHO", "LOHU", 
			"LUHU", "LU", "MAHO", "MAI", "MEHU", "ME", "MOHE", "MOHI", "MOI", "NAHE", 
			"NAHU", "NAI", "NA", "NIHE", "NIHO", "NOI", "NUHA", "NUHI", "NUHU", "NU", 
			"PA", "PEHE", "PEHO", "PU", "RAHO", "ROI", "SA", "SEHU", "SEI", "SE", 
			"SI", "SOI", "SU", "TAHE", "TEHU", "TEI", "TOI", "TO", "TUHE", "TUHU", 
			"VA", "VAU", "VEHA", "VEHO", "VEI", "VIHA", "VUHO", "VUHU", "XI", "ZAHO", 
			"ZEHA", "ZEI", "ZIHE", "ZI", "ZOHU", "ZOI", "ZO", "Y"
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
	public String getGrammarFileName() { return "Color.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ColorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FolioContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folio; }
	}

	public final FolioContext folio() throws RecognitionException {
		FolioContext _localctx = new FolioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_folio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				sentence();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(279);
					match(T__0);
					}
				}

				setState(282);
				match(T__1);
				}
				}
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GISMU) | (1L << LUJVO) | (1L << A) | (1L << BAHE) | (1L << BEHO) | (1L << BEI) | (1L << BE) | (1L << BIHE) | (1L << BOI) | (1L << BO) | (1L << BU) | (1L << BAI) | (1L << BY) | (1L << UI) | (1L << CAHA) | (1L << CAI) | (1L << CEHE) | (1L << CEI) | (1L << CO) | (1L << COI) | (1L << CU) | (1L << CUHE) | (1L << DAHO) | (1L << DOI) | (1L << FA) | (1L << FAHA) | (1L << FAHO) | (1L << FEHE) | (1L << FEHU) | (1L << FIHO) | (1L << FOI) | (1L << FUHA) | (1L << FUHE) | (1L << FUHO) | (1L << GA) | (1L << GAHO) | (1L << GEHU) | (1L << GI) | (1L << GIHA) | (1L << GOHA) | (1L << GOI) | (1L << GUHA) | (1L << I) | (1L << JAI) | (1L << JA) | (1L << JOHI) | (1L << JOI) | (1L << KEHE) | (1L << KEI) | (1L << KE) | (1L << KI) | (1L << KOHA) | (1L << KUHE) | (1L << KUHO) | (1L << KU) | (1L << LAHE) | (1L << LA) | (1L << LAU))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LEHU - 64)) | (1L << (LE - 64)) | (1L << (LIHU - 64)) | (1L << (LI - 64)) | (1L << (LOHO - 64)) | (1L << (LOHU - 64)) | (1L << (LUHU - 64)) | (1L << (LU - 64)) | (1L << (MAHO - 64)) | (1L << (MAI - 64)) | (1L << (MEHU - 64)) | (1L << (ME - 64)) | (1L << (MOHE - 64)) | (1L << (MOHI - 64)) | (1L << (MOI - 64)) | (1L << (NAHE - 64)) | (1L << (NAHU - 64)) | (1L << (NAI - 64)) | (1L << (NA - 64)) | (1L << (NIHE - 64)) | (1L << (NIHO - 64)) | (1L << (NOI - 64)) | (1L << (NUHA - 64)) | (1L << (NUHI - 64)) | (1L << (NUHU - 64)) | (1L << (NU - 64)) | (1L << (PA - 64)) | (1L << (PEHE - 64)) | (1L << (PEHO - 64)) | (1L << (PU - 64)) | (1L << (RAHO - 64)) | (1L << (ROI - 64)) | (1L << (SA - 64)) | (1L << (SEHU - 64)) | (1L << (SEI - 64)) | (1L << (SE - 64)) | (1L << (SI - 64)) | (1L << (SOI - 64)) | (1L << (SU - 64)) | (1L << (TAHE - 64)) | (1L << (TEHU - 64)) | (1L << (TEI - 64)) | (1L << (TOI - 64)) | (1L << (TO - 64)) | (1L << (TUHE - 64)) | (1L << (TUHU - 64)) | (1L << (VA - 64)) | (1L << (VAU - 64)) | (1L << (VEHA - 64)) | (1L << (VEHO - 64)) | (1L << (VEI - 64)) | (1L << (VIHA - 64)) | (1L << (VUHO - 64)) | (1L << (VUHU - 64)) | (1L << (XI - 64)) | (1L << (ZAHO - 64)) | (1L << (ZEHA - 64)) | (1L << (ZEI - 64)) | (1L << (ZIHE - 64)) | (1L << (ZI - 64)) | (1L << (ZOHU - 64)) | (1L << (ZOI - 64)) | (1L << (ZO - 64)) | (1L << (Y - 64)))) != 0) );
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

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				word();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GISMU) | (1L << LUJVO) | (1L << A) | (1L << BAHE) | (1L << BEHO) | (1L << BEI) | (1L << BE) | (1L << BIHE) | (1L << BOI) | (1L << BO) | (1L << BU) | (1L << BAI) | (1L << BY) | (1L << UI) | (1L << CAHA) | (1L << CAI) | (1L << CEHE) | (1L << CEI) | (1L << CO) | (1L << COI) | (1L << CU) | (1L << CUHE) | (1L << DAHO) | (1L << DOI) | (1L << FA) | (1L << FAHA) | (1L << FAHO) | (1L << FEHE) | (1L << FEHU) | (1L << FIHO) | (1L << FOI) | (1L << FUHA) | (1L << FUHE) | (1L << FUHO) | (1L << GA) | (1L << GAHO) | (1L << GEHU) | (1L << GI) | (1L << GIHA) | (1L << GOHA) | (1L << GOI) | (1L << GUHA) | (1L << I) | (1L << JAI) | (1L << JA) | (1L << JOHI) | (1L << JOI) | (1L << KEHE) | (1L << KEI) | (1L << KE) | (1L << KI) | (1L << KOHA) | (1L << KUHE) | (1L << KUHO) | (1L << KU) | (1L << LAHE) | (1L << LA) | (1L << LAU))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LEHU - 64)) | (1L << (LE - 64)) | (1L << (LIHU - 64)) | (1L << (LI - 64)) | (1L << (LOHO - 64)) | (1L << (LOHU - 64)) | (1L << (LUHU - 64)) | (1L << (LU - 64)) | (1L << (MAHO - 64)) | (1L << (MAI - 64)) | (1L << (MEHU - 64)) | (1L << (ME - 64)) | (1L << (MOHE - 64)) | (1L << (MOHI - 64)) | (1L << (MOI - 64)) | (1L << (NAHE - 64)) | (1L << (NAHU - 64)) | (1L << (NAI - 64)) | (1L << (NA - 64)) | (1L << (NIHE - 64)) | (1L << (NIHO - 64)) | (1L << (NOI - 64)) | (1L << (NUHA - 64)) | (1L << (NUHI - 64)) | (1L << (NUHU - 64)) | (1L << (NU - 64)) | (1L << (PA - 64)) | (1L << (PEHE - 64)) | (1L << (PEHO - 64)) | (1L << (PU - 64)) | (1L << (RAHO - 64)) | (1L << (ROI - 64)) | (1L << (SA - 64)) | (1L << (SEHU - 64)) | (1L << (SEI - 64)) | (1L << (SE - 64)) | (1L << (SI - 64)) | (1L << (SOI - 64)) | (1L << (SU - 64)) | (1L << (TAHE - 64)) | (1L << (TEHU - 64)) | (1L << (TEI - 64)) | (1L << (TOI - 64)) | (1L << (TO - 64)) | (1L << (TUHE - 64)) | (1L << (TUHU - 64)) | (1L << (VA - 64)) | (1L << (VAU - 64)) | (1L << (VEHA - 64)) | (1L << (VEHO - 64)) | (1L << (VEI - 64)) | (1L << (VIHA - 64)) | (1L << (VUHO - 64)) | (1L << (VUHU - 64)) | (1L << (XI - 64)) | (1L << (ZAHO - 64)) | (1L << (ZEHA - 64)) | (1L << (ZEI - 64)) | (1L << (ZIHE - 64)) | (1L << (ZI - 64)) | (1L << (ZOHU - 64)) | (1L << (ZOI - 64)) | (1L << (ZO - 64)) | (1L << (Y - 64)))) != 0) );
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

	public static class WordContext extends ParserRuleContext {
		public CmavoContext cmavo() {
			return getRuleContext(CmavoContext.class,0);
		}
		public BrivlaContext brivla() {
			return getRuleContext(BrivlaContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			setState(295);
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
			case BAI:
			case BY:
			case UI:
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
			case GA:
			case GAHO:
			case GEHU:
			case GI:
			case GIHA:
			case GOHA:
			case GOI:
			case GUHA:
			case I:
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
			case PA:
			case PEHE:
			case PEHO:
			case PU:
			case RAHO:
			case ROI:
			case SA:
			case SEHU:
			case SEI:
			case SE:
			case SI:
			case SOI:
			case SU:
			case TAHE:
			case TEHU:
			case TEI:
			case TOI:
			case TO:
			case TUHE:
			case TUHU:
			case VA:
			case VAU:
			case VEHA:
			case VEHO:
			case VEI:
			case VIHA:
			case VUHO:
			case VUHU:
			case XI:
			case ZAHO:
			case ZEHA:
			case ZEI:
			case ZIHE:
			case ZI:
			case ZOHU:
			case ZOI:
			case ZO:
			case Y:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				cmavo();
				}
				break;
			case GISMU:
			case LUJVO:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				brivla();
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

	public static class BrivlaContext extends ParserRuleContext {
		public LujvoContext lujvo() {
			return getRuleContext(LujvoContext.class,0);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public BrivlaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brivla; }
	}

	public final BrivlaContext brivla() throws RecognitionException {
		BrivlaContext _localctx = new BrivlaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_brivla);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LUJVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				lujvo();
				}
				break;
			case GISMU:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				gismu();
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

	public static class LujvoContext extends ParserRuleContext {
		public TerminalNode LUJVO() { return getToken(ColorParser.LUJVO, 0); }
		public LujvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lujvo; }
	}

	public final LujvoContext lujvo() throws RecognitionException {
		LujvoContext _localctx = new LujvoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lujvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LUJVO);
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

	public static class GismuContext extends ParserRuleContext {
		public TerminalNode GISMU() { return getToken(ColorParser.GISMU, 0); }
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
	}

	public final GismuContext gismu() throws RecognitionException {
		GismuContext _localctx = new GismuContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(GISMU);
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
		enterRule(_localctx, 12, RULE_cmavo);
		try {
			setState(320);
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
				setState(305);
				cmavoab();
				}
				break;
			case BAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				bai();
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
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
				setState(308);
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
				setState(309);
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
				setState(310);
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
				setState(311);
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
				setState(312);
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
				setState(313);
				cmavomn();
				}
				break;
			case PA:
			case PEHE:
			case PEHO:
			case PU:
				enterOuterAlt(_localctx, 10);
				{
				setState(314);
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
				setState(315);
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
				setState(316);
				cmavot();
				}
				break;
			case UI:
				enterOuterAlt(_localctx, 13);
				{
				setState(317);
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
				setState(318);
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
				setState(319);
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
		enterRule(_localctx, 14, RULE_cmavoab);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				a();
				}
				break;
			case BAHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				bahe();
				}
				break;
			case BEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				beho();
				}
				break;
			case BEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				bei();
				}
				break;
			case BE:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				be();
				}
				break;
			case BIHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				bihe();
				}
				break;
			case BOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(328);
				boi();
				}
				break;
			case BO:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				bo();
				}
				break;
			case BU:
				enterOuterAlt(_localctx, 9);
				{
				setState(330);
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
		public TerminalNode A() { return getToken(ColorParser.A, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		public TerminalNode BAHE() { return getToken(ColorParser.BAHE, 0); }
		public BaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bahe; }
	}

	public final BaheContext bahe() throws RecognitionException {
		BaheContext _localctx = new BaheContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public TerminalNode BEHO() { return getToken(ColorParser.BEHO, 0); }
		public BehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beho; }
	}

	public final BehoContext beho() throws RecognitionException {
		BehoContext _localctx = new BehoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_beho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
		public TerminalNode BEI() { return getToken(ColorParser.BEI, 0); }
		public BeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bei; }
	}

	public final BeiContext bei() throws RecognitionException {
		BeiContext _localctx = new BeiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		public TerminalNode BE() { return getToken(ColorParser.BE, 0); }
		public BeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_be; }
	}

	public final BeContext be() throws RecognitionException {
		BeContext _localctx = new BeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_be);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		public TerminalNode BIHE() { return getToken(ColorParser.BIHE, 0); }
		public BiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bihe; }
	}

	public final BiheContext bihe() throws RecognitionException {
		BiheContext _localctx = new BiheContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		public TerminalNode BOI() { return getToken(ColorParser.BOI, 0); }
		public BoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boi; }
	}

	public final BoiContext boi() throws RecognitionException {
		BoiContext _localctx = new BoiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
		public TerminalNode BO() { return getToken(ColorParser.BO, 0); }
		public BoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bo; }
	}

	public final BoContext bo() throws RecognitionException {
		BoContext _localctx = new BoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		public TerminalNode BU() { return getToken(ColorParser.BU, 0); }
		public BuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bu; }
	}

	public final BuContext bu() throws RecognitionException {
		BuContext _localctx = new BuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		public TerminalNode BAI() { return getToken(ColorParser.BAI, 0); }
		public BaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bai; }
	}

	public final BaiContext bai() throws RecognitionException {
		BaiContext _localctx = new BaiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		public TerminalNode BY() { return getToken(ColorParser.BY, 0); }
		public ByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by; }
	}

	public final ByContext by() throws RecognitionException {
		ByContext _localctx = new ByContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_by);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		public TerminalNode UI() { return getToken(ColorParser.UI, 0); }
		public UiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ui; }
	}

	public final UiContext ui() throws RecognitionException {
		UiContext _localctx = new UiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		enterRule(_localctx, 40, RULE_cmavocd);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				caha();
				}
				break;
			case CAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				cai();
				}
				break;
			case CEHE:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				cehe();
				}
				break;
			case CEI:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				cei();
				}
				break;
			case CO:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				co();
				}
				break;
			case COI:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				coi();
				}
				break;
			case CU:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				cu();
				}
				break;
			case CUHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(364);
				cuhe();
				}
				break;
			case DAHO:
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				daho();
				}
				break;
			case DOI:
				enterOuterAlt(_localctx, 10);
				{
				setState(366);
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
		public TerminalNode CAHA() { return getToken(ColorParser.CAHA, 0); }
		public CahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caha; }
	}

	public final CahaContext caha() throws RecognitionException {
		CahaContext _localctx = new CahaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		public TerminalNode CAI() { return getToken(ColorParser.CAI, 0); }
		public CaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cai; }
	}

	public final CaiContext cai() throws RecognitionException {
		CaiContext _localctx = new CaiContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		public TerminalNode CEHE() { return getToken(ColorParser.CEHE, 0); }
		public CeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cehe; }
	}

	public final CeheContext cehe() throws RecognitionException {
		CeheContext _localctx = new CeheContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		public TerminalNode CEI() { return getToken(ColorParser.CEI, 0); }
		public CeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cei; }
	}

	public final CeiContext cei() throws RecognitionException {
		CeiContext _localctx = new CeiContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		public TerminalNode CO() { return getToken(ColorParser.CO, 0); }
		public CoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_co; }
	}

	public final CoContext co() throws RecognitionException {
		CoContext _localctx = new CoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_co);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		public TerminalNode COI() { return getToken(ColorParser.COI, 0); }
		public CoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coi; }
	}

	public final CoiContext coi() throws RecognitionException {
		CoiContext _localctx = new CoiContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_coi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
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
		public TerminalNode CU() { return getToken(ColorParser.CU, 0); }
		public CuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cu; }
	}

	public final CuContext cu() throws RecognitionException {
		CuContext _localctx = new CuContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		public TerminalNode CUHE() { return getToken(ColorParser.CUHE, 0); }
		public CuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuhe; }
	}

	public final CuheContext cuhe() throws RecognitionException {
		CuheContext _localctx = new CuheContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		public TerminalNode DAHO() { return getToken(ColorParser.DAHO, 0); }
		public DahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daho; }
	}

	public final DahoContext daho() throws RecognitionException {
		DahoContext _localctx = new DahoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_daho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		public TerminalNode DOI() { return getToken(ColorParser.DOI, 0); }
		public DoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doi; }
	}

	public final DoiContext doi() throws RecognitionException {
		DoiContext _localctx = new DoiContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 62, RULE_cmavof);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FA:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				fa();
				}
				break;
			case FAHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				faha();
				}
				break;
			case FAHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				faho();
				}
				break;
			case FEHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				fehe();
				}
				break;
			case FEHU:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				fehu();
				}
				break;
			case FIHO:
				enterOuterAlt(_localctx, 6);
				{
				setState(394);
				fiho();
				}
				break;
			case FOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				foi();
				}
				break;
			case FUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(396);
				fuha();
				}
				break;
			case FUHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(397);
				fuhe();
				}
				break;
			case FUHO:
				enterOuterAlt(_localctx, 10);
				{
				setState(398);
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
		public TerminalNode FA() { return getToken(ColorParser.FA, 0); }
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		public TerminalNode FAHA() { return getToken(ColorParser.FAHA, 0); }
		public FahaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faha; }
	}

	public final FahaContext faha() throws RecognitionException {
		FahaContext _localctx = new FahaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_faha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		public TerminalNode FAHO() { return getToken(ColorParser.FAHO, 0); }
		public FahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faho; }
	}

	public final FahoContext faho() throws RecognitionException {
		FahoContext _localctx = new FahoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_faho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		public TerminalNode FEHE() { return getToken(ColorParser.FEHE, 0); }
		public FeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehe; }
	}

	public final FeheContext fehe() throws RecognitionException {
		FeheContext _localctx = new FeheContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		public TerminalNode FEHU() { return getToken(ColorParser.FEHU, 0); }
		public FehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehu; }
	}

	public final FehuContext fehu() throws RecognitionException {
		FehuContext _localctx = new FehuContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		public TerminalNode FIHO() { return getToken(ColorParser.FIHO, 0); }
		public FihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiho; }
	}

	public final FihoContext fiho() throws RecognitionException {
		FihoContext _localctx = new FihoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fiho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		public TerminalNode FOI() { return getToken(ColorParser.FOI, 0); }
		public FoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foi; }
	}

	public final FoiContext foi() throws RecognitionException {
		FoiContext _localctx = new FoiContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_foi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		public TerminalNode FUHA() { return getToken(ColorParser.FUHA, 0); }
		public FuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuha; }
	}

	public final FuhaContext fuha() throws RecognitionException {
		FuhaContext _localctx = new FuhaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		public TerminalNode FUHE() { return getToken(ColorParser.FUHE, 0); }
		public FuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuhe; }
	}

	public final FuheContext fuhe() throws RecognitionException {
		FuheContext _localctx = new FuheContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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
		public TerminalNode FUHO() { return getToken(ColorParser.FUHO, 0); }
		public FuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuho; }
	}

	public final FuhoContext fuho() throws RecognitionException {
		FuhoContext _localctx = new FuhoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 84, RULE_cmavogi);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GA:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				ga();
				}
				break;
			case GAHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				gaho();
				}
				break;
			case GEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				gehu();
				}
				break;
			case GI:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				gi();
				}
				break;
			case GIHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				giha();
				}
				break;
			case GOHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				goha();
				}
				break;
			case GOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				goi();
				}
				break;
			case GUHA:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				guha();
				}
				break;
			case I:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
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
		public TerminalNode GA() { return getToken(ColorParser.GA, 0); }
		public GaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ga; }
	}

	public final GaContext ga() throws RecognitionException {
		GaContext _localctx = new GaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		public TerminalNode GAHO() { return getToken(ColorParser.GAHO, 0); }
		public GahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gaho; }
	}

	public final GahoContext gaho() throws RecognitionException {
		GahoContext _localctx = new GahoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_gaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		public TerminalNode GEHU() { return getToken(ColorParser.GEHU, 0); }
		public GehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gehu; }
	}

	public final GehuContext gehu() throws RecognitionException {
		GehuContext _localctx = new GehuContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_gehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
		public TerminalNode GI() { return getToken(ColorParser.GI, 0); }
		public GiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gi; }
	}

	public final GiContext gi() throws RecognitionException {
		GiContext _localctx = new GiContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_gi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		public TerminalNode GIHA() { return getToken(ColorParser.GIHA, 0); }
		public GihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giha; }
	}

	public final GihaContext giha() throws RecognitionException {
		GihaContext _localctx = new GihaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_giha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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
		public TerminalNode GOHA() { return getToken(ColorParser.GOHA, 0); }
		public GohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goha; }
	}

	public final GohaContext goha() throws RecognitionException {
		GohaContext _localctx = new GohaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_goha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		public TerminalNode GOI() { return getToken(ColorParser.GOI, 0); }
		public GoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goi; }
	}

	public final GoiContext goi() throws RecognitionException {
		GoiContext _localctx = new GoiContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_goi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		public TerminalNode GUHA() { return getToken(ColorParser.GUHA, 0); }
		public GuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guha; }
	}

	public final GuhaContext guha() throws RecognitionException {
		GuhaContext _localctx = new GuhaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_guha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		public TerminalNode I() { return getToken(ColorParser.I, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 104, RULE_cmavojk);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAI:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				jai();
				}
				break;
			case JA:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				ja();
				}
				break;
			case JOHI:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				johi();
				}
				break;
			case JOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				joi();
				}
				break;
			case KEHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				kehe();
				}
				break;
			case KEI:
				enterOuterAlt(_localctx, 6);
				{
				setState(455);
				kei();
				}
				break;
			case KE:
				enterOuterAlt(_localctx, 7);
				{
				setState(456);
				ke();
				}
				break;
			case KI:
				enterOuterAlt(_localctx, 8);
				{
				setState(457);
				ki();
				}
				break;
			case KOHA:
				enterOuterAlt(_localctx, 9);
				{
				setState(458);
				koha();
				}
				break;
			case KUHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(459);
				kuhe();
				}
				break;
			case KUHO:
				enterOuterAlt(_localctx, 11);
				{
				setState(460);
				kuho();
				}
				break;
			case KU:
				enterOuterAlt(_localctx, 12);
				{
				setState(461);
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
		public TerminalNode JAI() { return getToken(ColorParser.JAI, 0); }
		public JaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jai; }
	}

	public final JaiContext jai() throws RecognitionException {
		JaiContext _localctx = new JaiContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		public TerminalNode JA() { return getToken(ColorParser.JA, 0); }
		public JaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ja; }
	}

	public final JaContext ja() throws RecognitionException {
		JaContext _localctx = new JaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		public TerminalNode JOHI() { return getToken(ColorParser.JOHI, 0); }
		public JohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_johi; }
	}

	public final JohiContext johi() throws RecognitionException {
		JohiContext _localctx = new JohiContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_johi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		public TerminalNode JOI() { return getToken(ColorParser.JOI, 0); }
		public JoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joi; }
	}

	public final JoiContext joi() throws RecognitionException {
		JoiContext _localctx = new JoiContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_joi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		public TerminalNode KEHE() { return getToken(ColorParser.KEHE, 0); }
		public KeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kehe; }
	}

	public final KeheContext kehe() throws RecognitionException {
		KeheContext _localctx = new KeheContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_kehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		public TerminalNode KEI() { return getToken(ColorParser.KEI, 0); }
		public KeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kei; }
	}

	public final KeiContext kei() throws RecognitionException {
		KeiContext _localctx = new KeiContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		public TerminalNode KE() { return getToken(ColorParser.KE, 0); }
		public KeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ke; }
	}

	public final KeContext ke() throws RecognitionException {
		KeContext _localctx = new KeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
		public TerminalNode KI() { return getToken(ColorParser.KI, 0); }
		public KiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ki; }
	}

	public final KiContext ki() throws RecognitionException {
		KiContext _localctx = new KiContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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
		public TerminalNode KOHA() { return getToken(ColorParser.KOHA, 0); }
		public KohaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koha; }
	}

	public final KohaContext koha() throws RecognitionException {
		KohaContext _localctx = new KohaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_koha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		public TerminalNode KUHE() { return getToken(ColorParser.KUHE, 0); }
		public KuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuhe; }
	}

	public final KuheContext kuhe() throws RecognitionException {
		KuheContext _localctx = new KuheContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_kuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		public TerminalNode KUHO() { return getToken(ColorParser.KUHO, 0); }
		public KuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuho; }
	}

	public final KuhoContext kuho() throws RecognitionException {
		KuhoContext _localctx = new KuhoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_kuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		public TerminalNode KU() { return getToken(ColorParser.KU, 0); }
		public KuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ku; }
	}

	public final KuContext ku() throws RecognitionException {
		KuContext _localctx = new KuContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		enterRule(_localctx, 130, RULE_cmavol);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				lahe();
				}
				break;
			case LA:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				la();
				}
				break;
			case LAU:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				lau();
				}
				break;
			case LEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				lehu();
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				le();
				}
				break;
			case LIHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(493);
				lihu();
				}
				break;
			case LI:
				enterOuterAlt(_localctx, 7);
				{
				setState(494);
				li();
				}
				break;
			case LOHO:
				enterOuterAlt(_localctx, 8);
				{
				setState(495);
				loho();
				}
				break;
			case LOHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(496);
				lohu();
				}
				break;
			case LUHU:
				enterOuterAlt(_localctx, 10);
				{
				setState(497);
				luhu();
				}
				break;
			case LU:
				enterOuterAlt(_localctx, 11);
				{
				setState(498);
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
		public TerminalNode LAHE() { return getToken(ColorParser.LAHE, 0); }
		public LaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lahe; }
	}

	public final LaheContext lahe() throws RecognitionException {
		LaheContext _localctx = new LaheContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		public TerminalNode LA() { return getToken(ColorParser.LA, 0); }
		public LaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_la; }
	}

	public final LaContext la() throws RecognitionException {
		LaContext _localctx = new LaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_la);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		public TerminalNode LAU() { return getToken(ColorParser.LAU, 0); }
		public LauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lau; }
	}

	public final LauContext lau() throws RecognitionException {
		LauContext _localctx = new LauContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
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
		public TerminalNode LEHU() { return getToken(ColorParser.LEHU, 0); }
		public LehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lehu; }
	}

	public final LehuContext lehu() throws RecognitionException {
		LehuContext _localctx = new LehuContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
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
		public TerminalNode LE() { return getToken(ColorParser.LE, 0); }
		public LeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_le; }
	}

	public final LeContext le() throws RecognitionException {
		LeContext _localctx = new LeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_le);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
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
		public TerminalNode LIHU() { return getToken(ColorParser.LIHU, 0); }
		public LihuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lihu; }
	}

	public final LihuContext lihu() throws RecognitionException {
		LihuContext _localctx = new LihuContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lihu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
		public TerminalNode LI() { return getToken(ColorParser.LI, 0); }
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_li);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
		public TerminalNode LOHO() { return getToken(ColorParser.LOHO, 0); }
		public LohoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loho; }
	}

	public final LohoContext loho() throws RecognitionException {
		LohoContext _localctx = new LohoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_loho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
		public TerminalNode LOHU() { return getToken(ColorParser.LOHU, 0); }
		public LohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lohu; }
	}

	public final LohuContext lohu() throws RecognitionException {
		LohuContext _localctx = new LohuContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_lohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		public TerminalNode LUHU() { return getToken(ColorParser.LUHU, 0); }
		public LuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_luhu; }
	}

	public final LuhuContext luhu() throws RecognitionException {
		LuhuContext _localctx = new LuhuContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_luhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		public TerminalNode LU() { return getToken(ColorParser.LU, 0); }
		public LuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lu; }
	}

	public final LuContext lu() throws RecognitionException {
		LuContext _localctx = new LuContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_lu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 154, RULE_cmavomn);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				maho();
				}
				break;
			case MAI:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				mai();
				}
				break;
			case MEHU:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				mehu();
				}
				break;
			case ME:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				me();
				}
				break;
			case MOHE:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				mohe();
				}
				break;
			case MOHI:
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				mohi();
				}
				break;
			case MOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(529);
				moi();
				}
				break;
			case NAHE:
				enterOuterAlt(_localctx, 8);
				{
				setState(530);
				nahe();
				}
				break;
			case NAHU:
				enterOuterAlt(_localctx, 9);
				{
				setState(531);
				nahu();
				}
				break;
			case NAI:
				enterOuterAlt(_localctx, 10);
				{
				setState(532);
				nai();
				}
				break;
			case NA:
				enterOuterAlt(_localctx, 11);
				{
				setState(533);
				na();
				}
				break;
			case NIHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(534);
				nihe();
				}
				break;
			case NIHO:
				enterOuterAlt(_localctx, 13);
				{
				setState(535);
				niho();
				}
				break;
			case NOI:
				enterOuterAlt(_localctx, 14);
				{
				setState(536);
				noi();
				}
				break;
			case NUHA:
				enterOuterAlt(_localctx, 15);
				{
				setState(537);
				nuha();
				}
				break;
			case NUHI:
				enterOuterAlt(_localctx, 16);
				{
				setState(538);
				nuhi();
				}
				break;
			case NUHU:
				enterOuterAlt(_localctx, 17);
				{
				setState(539);
				nuhu();
				}
				break;
			case NU:
				enterOuterAlt(_localctx, 18);
				{
				setState(540);
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
		public TerminalNode MAHO() { return getToken(ColorParser.MAHO, 0); }
		public MahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maho; }
	}

	public final MahoContext maho() throws RecognitionException {
		MahoContext _localctx = new MahoContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_maho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		public TerminalNode MAI() { return getToken(ColorParser.MAI, 0); }
		public MaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mai; }
	}

	public final MaiContext mai() throws RecognitionException {
		MaiContext _localctx = new MaiContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_mai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		public TerminalNode MEHU() { return getToken(ColorParser.MEHU, 0); }
		public MehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mehu; }
	}

	public final MehuContext mehu() throws RecognitionException {
		MehuContext _localctx = new MehuContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_mehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		public TerminalNode ME() { return getToken(ColorParser.ME, 0); }
		public MeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_me; }
	}

	public final MeContext me() throws RecognitionException {
		MeContext _localctx = new MeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_me);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		public TerminalNode MOHE() { return getToken(ColorParser.MOHE, 0); }
		public MoheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohe; }
	}

	public final MoheContext mohe() throws RecognitionException {
		MoheContext _localctx = new MoheContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_mohe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		public TerminalNode MOHI() { return getToken(ColorParser.MOHI, 0); }
		public MohiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mohi; }
	}

	public final MohiContext mohi() throws RecognitionException {
		MohiContext _localctx = new MohiContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_mohi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		public TerminalNode MOI() { return getToken(ColorParser.MOI, 0); }
		public MoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moi; }
	}

	public final MoiContext moi() throws RecognitionException {
		MoiContext _localctx = new MoiContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_moi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		public TerminalNode NAHE() { return getToken(ColorParser.NAHE, 0); }
		public NaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahe; }
	}

	public final NaheContext nahe() throws RecognitionException {
		NaheContext _localctx = new NaheContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_nahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		public TerminalNode NAHU() { return getToken(ColorParser.NAHU, 0); }
		public NahuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nahu; }
	}

	public final NahuContext nahu() throws RecognitionException {
		NahuContext _localctx = new NahuContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_nahu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		public TerminalNode NAI() { return getToken(ColorParser.NAI, 0); }
		public NaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nai; }
	}

	public final NaiContext nai() throws RecognitionException {
		NaiContext _localctx = new NaiContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		public TerminalNode NA() { return getToken(ColorParser.NA, 0); }
		public NaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_na; }
	}

	public final NaContext na() throws RecognitionException {
		NaContext _localctx = new NaContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_na);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		public TerminalNode NIHE() { return getToken(ColorParser.NIHE, 0); }
		public NiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nihe; }
	}

	public final NiheContext nihe() throws RecognitionException {
		NiheContext _localctx = new NiheContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_nihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
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
		public TerminalNode NIHO() { return getToken(ColorParser.NIHO, 0); }
		public NihoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_niho; }
	}

	public final NihoContext niho() throws RecognitionException {
		NihoContext _localctx = new NihoContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_niho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		public TerminalNode NOI() { return getToken(ColorParser.NOI, 0); }
		public NoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noi; }
	}

	public final NoiContext noi() throws RecognitionException {
		NoiContext _localctx = new NoiContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_noi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		public TerminalNode NUHA() { return getToken(ColorParser.NUHA, 0); }
		public NuhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuha; }
	}

	public final NuhaContext nuha() throws RecognitionException {
		NuhaContext _localctx = new NuhaContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_nuha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
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
		public TerminalNode NUHI() { return getToken(ColorParser.NUHI, 0); }
		public NuhiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhi; }
	}

	public final NuhiContext nuhi() throws RecognitionException {
		NuhiContext _localctx = new NuhiContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_nuhi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
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
		public TerminalNode NUHU() { return getToken(ColorParser.NUHU, 0); }
		public NuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuhu; }
	}

	public final NuhuContext nuhu() throws RecognitionException {
		NuhuContext _localctx = new NuhuContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		public TerminalNode NU() { return getToken(ColorParser.NU, 0); }
		public NuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nu; }
	}

	public final NuContext nu() throws RecognitionException {
		NuContext _localctx = new NuContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_nu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 192, RULE_cmavop);
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				pa();
				}
				break;
			case PEHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				pehe();
				}
				break;
			case PEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				peho();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 4);
				{
				setState(582);
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
		public TerminalNode PA() { return getToken(ColorParser.PA, 0); }
		public PaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pa; }
	}

	public final PaContext pa() throws RecognitionException {
		PaContext _localctx = new PaContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_pa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		public TerminalNode PEHE() { return getToken(ColorParser.PEHE, 0); }
		public PeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pehe; }
	}

	public final PeheContext pehe() throws RecognitionException {
		PeheContext _localctx = new PeheContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_pehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		public TerminalNode PEHO() { return getToken(ColorParser.PEHO, 0); }
		public PehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peho; }
	}

	public final PehoContext peho() throws RecognitionException {
		PehoContext _localctx = new PehoContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_peho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		public TerminalNode PU() { return getToken(ColorParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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
		enterRule(_localctx, 202, RULE_cmavors);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				raho();
				}
				break;
			case ROI:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				roi();
				}
				break;
			case SA:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				sa();
				}
				break;
			case SEHU:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				sehu();
				}
				break;
			case SEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				sei();
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 6);
				{
				setState(598);
				se();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				si();
				}
				break;
			case SOI:
				enterOuterAlt(_localctx, 8);
				{
				setState(600);
				soi();
				}
				break;
			case SU:
				enterOuterAlt(_localctx, 9);
				{
				setState(601);
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
		public TerminalNode RAHO() { return getToken(ColorParser.RAHO, 0); }
		public RahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raho; }
	}

	public final RahoContext raho() throws RecognitionException {
		RahoContext _localctx = new RahoContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_raho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
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
		public TerminalNode ROI() { return getToken(ColorParser.ROI, 0); }
		public RoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roi; }
	}

	public final RoiContext roi() throws RecognitionException {
		RoiContext _localctx = new RoiContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_roi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
		public TerminalNode SA() { return getToken(ColorParser.SA, 0); }
		public SaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sa; }
	}

	public final SaContext sa() throws RecognitionException {
		SaContext _localctx = new SaContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_sa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
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
		public TerminalNode SEHU() { return getToken(ColorParser.SEHU, 0); }
		public SehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sehu; }
	}

	public final SehuContext sehu() throws RecognitionException {
		SehuContext _localctx = new SehuContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_sehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
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
		public TerminalNode SEI() { return getToken(ColorParser.SEI, 0); }
		public SeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sei; }
	}

	public final SeiContext sei() throws RecognitionException {
		SeiContext _localctx = new SeiContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_sei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		public TerminalNode SE() { return getToken(ColorParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
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
		public TerminalNode SI() { return getToken(ColorParser.SI, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
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
		public TerminalNode SOI() { return getToken(ColorParser.SOI, 0); }
		public SoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soi; }
	}

	public final SoiContext soi() throws RecognitionException {
		SoiContext _localctx = new SoiContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_soi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
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
		public TerminalNode SU() { return getToken(ColorParser.SU, 0); }
		public SuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_su; }
	}

	public final SuContext su() throws RecognitionException {
		SuContext _localctx = new SuContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_su);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		enterRule(_localctx, 222, RULE_cmavot);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAHE:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				tahe();
				}
				break;
			case TEHU:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				tehu();
				}
				break;
			case TEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				tei();
				}
				break;
			case TOI:
				enterOuterAlt(_localctx, 4);
				{
				setState(625);
				toi();
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 5);
				{
				setState(626);
				to();
				}
				break;
			case TUHE:
				enterOuterAlt(_localctx, 6);
				{
				setState(627);
				tuhe();
				}
				break;
			case TUHU:
				enterOuterAlt(_localctx, 7);
				{
				setState(628);
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
		public TerminalNode TAHE() { return getToken(ColorParser.TAHE, 0); }
		public TaheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tahe; }
	}

	public final TaheContext tahe() throws RecognitionException {
		TaheContext _localctx = new TaheContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_tahe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
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
		public TerminalNode TEHU() { return getToken(ColorParser.TEHU, 0); }
		public TehuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tehu; }
	}

	public final TehuContext tehu() throws RecognitionException {
		TehuContext _localctx = new TehuContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_tehu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
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
		public TerminalNode TEI() { return getToken(ColorParser.TEI, 0); }
		public TeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tei; }
	}

	public final TeiContext tei() throws RecognitionException {
		TeiContext _localctx = new TeiContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_tei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		public TerminalNode TOI() { return getToken(ColorParser.TOI, 0); }
		public ToiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toi; }
	}

	public final ToiContext toi() throws RecognitionException {
		ToiContext _localctx = new ToiContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_toi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
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
		public TerminalNode TO() { return getToken(ColorParser.TO, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		public TerminalNode TUHE() { return getToken(ColorParser.TUHE, 0); }
		public TuheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhe; }
	}

	public final TuheContext tuhe() throws RecognitionException {
		TuheContext _localctx = new TuheContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_tuhe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
		public TerminalNode TUHU() { return getToken(ColorParser.TUHU, 0); }
		public TuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuhu; }
	}

	public final TuhuContext tuhu() throws RecognitionException {
		TuhuContext _localctx = new TuhuContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_tuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
		enterRule(_localctx, 238, RULE_cmavovy);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VA:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				va();
				}
				break;
			case VAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				vau();
				}
				break;
			case VEHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				veha();
				}
				break;
			case VEHO:
				enterOuterAlt(_localctx, 4);
				{
				setState(648);
				veho();
				}
				break;
			case VEI:
				enterOuterAlt(_localctx, 5);
				{
				setState(649);
				vei();
				}
				break;
			case VIHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				viha();
				}
				break;
			case VUHO:
				enterOuterAlt(_localctx, 7);
				{
				setState(651);
				vuho();
				}
				break;
			case VUHU:
				enterOuterAlt(_localctx, 8);
				{
				setState(652);
				vuhu();
				}
				break;
			case XI:
				enterOuterAlt(_localctx, 9);
				{
				setState(653);
				xi();
				}
				break;
			case Y:
				enterOuterAlt(_localctx, 10);
				{
				setState(654);
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
		public TerminalNode VA() { return getToken(ColorParser.VA, 0); }
		public VaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_va; }
	}

	public final VaContext va() throws RecognitionException {
		VaContext _localctx = new VaContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_va);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
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
		public TerminalNode VAU() { return getToken(ColorParser.VAU, 0); }
		public VauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vau; }
	}

	public final VauContext vau() throws RecognitionException {
		VauContext _localctx = new VauContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_vau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
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
		public TerminalNode VEHA() { return getToken(ColorParser.VEHA, 0); }
		public VehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veha; }
	}

	public final VehaContext veha() throws RecognitionException {
		VehaContext _localctx = new VehaContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_veha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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
		public TerminalNode VEHO() { return getToken(ColorParser.VEHO, 0); }
		public VehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_veho; }
	}

	public final VehoContext veho() throws RecognitionException {
		VehoContext _localctx = new VehoContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_veho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
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
		public TerminalNode VEI() { return getToken(ColorParser.VEI, 0); }
		public VeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vei; }
	}

	public final VeiContext vei() throws RecognitionException {
		VeiContext _localctx = new VeiContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_vei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
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
		public TerminalNode VIHA() { return getToken(ColorParser.VIHA, 0); }
		public VihaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viha; }
	}

	public final VihaContext viha() throws RecognitionException {
		VihaContext _localctx = new VihaContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_viha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
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
		public TerminalNode VUHO() { return getToken(ColorParser.VUHO, 0); }
		public VuhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuho; }
	}

	public final VuhoContext vuho() throws RecognitionException {
		VuhoContext _localctx = new VuhoContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_vuho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
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
		public TerminalNode VUHU() { return getToken(ColorParser.VUHU, 0); }
		public VuhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuhu; }
	}

	public final VuhuContext vuhu() throws RecognitionException {
		VuhuContext _localctx = new VuhuContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_vuhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
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
		public TerminalNode XI() { return getToken(ColorParser.XI, 0); }
		public XiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xi; }
	}

	public final XiContext xi() throws RecognitionException {
		XiContext _localctx = new XiContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_xi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		public TerminalNode Y() { return getToken(ColorParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		enterRule(_localctx, 260, RULE_cmavoz);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZAHO:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				zaho();
				}
				break;
			case ZEHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				zeha();
				}
				break;
			case ZEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				zei();
				}
				break;
			case ZIHE:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				zihe();
				}
				break;
			case ZI:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				zi();
				}
				break;
			case ZOHU:
				enterOuterAlt(_localctx, 6);
				{
				setState(682);
				zohu();
				}
				break;
			case ZOI:
				enterOuterAlt(_localctx, 7);
				{
				setState(683);
				zoi();
				}
				break;
			case ZO:
				enterOuterAlt(_localctx, 8);
				{
				setState(684);
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
		public TerminalNode ZAHO() { return getToken(ColorParser.ZAHO, 0); }
		public ZahoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zaho; }
	}

	public final ZahoContext zaho() throws RecognitionException {
		ZahoContext _localctx = new ZahoContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_zaho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
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
		public TerminalNode ZEHA() { return getToken(ColorParser.ZEHA, 0); }
		public ZehaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeha; }
	}

	public final ZehaContext zeha() throws RecognitionException {
		ZehaContext _localctx = new ZehaContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_zeha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
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
		public TerminalNode ZEI() { return getToken(ColorParser.ZEI, 0); }
		public ZeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zei; }
	}

	public final ZeiContext zei() throws RecognitionException {
		ZeiContext _localctx = new ZeiContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_zei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		public TerminalNode ZIHE() { return getToken(ColorParser.ZIHE, 0); }
		public ZiheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zihe; }
	}

	public final ZiheContext zihe() throws RecognitionException {
		ZiheContext _localctx = new ZiheContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_zihe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		public TerminalNode ZI() { return getToken(ColorParser.ZI, 0); }
		public ZiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zi; }
	}

	public final ZiContext zi() throws RecognitionException {
		ZiContext _localctx = new ZiContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_zi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		public TerminalNode ZOHU() { return getToken(ColorParser.ZOHU, 0); }
		public ZohuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zohu; }
	}

	public final ZohuContext zohu() throws RecognitionException {
		ZohuContext _localctx = new ZohuContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_zohu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		public TerminalNode ZOI() { return getToken(ColorParser.ZOI, 0); }
		public ZoiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zoi; }
	}

	public final ZoiContext zoi() throws RecognitionException {
		ZoiContext _localctx = new ZoiContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_zoi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		public TerminalNode ZO() { return getToken(ColorParser.ZO, 0); }
		public ZoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zo; }
	}

	public final ZoContext zo() throws RecognitionException {
		ZoContext _localctx = new ZoContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_zo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0081\u02c2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\3\2\5\2\u011b\n\2"+
		"\3\2\3\2\6\2\u011f\n\2\r\2\16\2\u0120\3\3\6\3\u0124\n\3\r\3\16\3\u0125"+
		"\3\4\3\4\5\4\u012a\n\4\3\5\3\5\5\5\u012e\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0143\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u014e\n\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0172\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u0192\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01b1\n,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01d1\n\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01f6\nC\3D\3D\3E\3E\3F\3F\3G\3G\3H"+
		"\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0220\nO\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U"+
		"\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3"+
		"`\3a\3a\3b\3b\3b\3b\5b\u024a\nb\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3g\3g\3"+
		"g\3g\3g\3g\3g\5g\u025d\ng\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3"+
		"o\3o\3p\3p\3q\3q\3q\3q\3q\3q\3q\5q\u0278\nq\3r\3r\3s\3s\3t\3t\3u\3u\3"+
		"v\3v\3w\3w\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0292\ny\3z\3z\3{\3"+
		"{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u02b0\n\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\2\2\u008d\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\2\2\2\u02b2\2\u011e\3\2\2\2\4\u0123\3\2\2\2\6"+
		"\u0129\3\2\2\2\b\u012d\3\2\2\2\n\u012f\3\2\2\2\f\u0131\3\2\2\2\16\u0142"+
		"\3\2\2\2\20\u014d\3\2\2\2\22\u014f\3\2\2\2\24\u0151\3\2\2\2\26\u0153\3"+
		"\2\2\2\30\u0155\3\2\2\2\32\u0157\3\2\2\2\34\u0159\3\2\2\2\36\u015b\3\2"+
		"\2\2 \u015d\3\2\2\2\"\u015f\3\2\2\2$\u0161\3\2\2\2&\u0163\3\2\2\2(\u0165"+
		"\3\2\2\2*\u0171\3\2\2\2,\u0173\3\2\2\2.\u0175\3\2\2\2\60\u0177\3\2\2\2"+
		"\62\u0179\3\2\2\2\64\u017b\3\2\2\2\66\u017d\3\2\2\28\u017f\3\2\2\2:\u0181"+
		"\3\2\2\2<\u0183\3\2\2\2>\u0185\3\2\2\2@\u0191\3\2\2\2B\u0193\3\2\2\2D"+
		"\u0195\3\2\2\2F\u0197\3\2\2\2H\u0199\3\2\2\2J\u019b\3\2\2\2L\u019d\3\2"+
		"\2\2N\u019f\3\2\2\2P\u01a1\3\2\2\2R\u01a3\3\2\2\2T\u01a5\3\2\2\2V\u01b0"+
		"\3\2\2\2X\u01b2\3\2\2\2Z\u01b4\3\2\2\2\\\u01b6\3\2\2\2^\u01b8\3\2\2\2"+
		"`\u01ba\3\2\2\2b\u01bc\3\2\2\2d\u01be\3\2\2\2f\u01c0\3\2\2\2h\u01c2\3"+
		"\2\2\2j\u01d0\3\2\2\2l\u01d2\3\2\2\2n\u01d4\3\2\2\2p\u01d6\3\2\2\2r\u01d8"+
		"\3\2\2\2t\u01da\3\2\2\2v\u01dc\3\2\2\2x\u01de\3\2\2\2z\u01e0\3\2\2\2|"+
		"\u01e2\3\2\2\2~\u01e4\3\2\2\2\u0080\u01e6\3\2\2\2\u0082\u01e8\3\2\2\2"+
		"\u0084\u01f5\3\2\2\2\u0086\u01f7\3\2\2\2\u0088\u01f9\3\2\2\2\u008a\u01fb"+
		"\3\2\2\2\u008c\u01fd\3\2\2\2\u008e\u01ff\3\2\2\2\u0090\u0201\3\2\2\2\u0092"+
		"\u0203\3\2\2\2\u0094\u0205\3\2\2\2\u0096\u0207\3\2\2\2\u0098\u0209\3\2"+
		"\2\2\u009a\u020b\3\2\2\2\u009c\u021f\3\2\2\2\u009e\u0221\3\2\2\2\u00a0"+
		"\u0223\3\2\2\2\u00a2\u0225\3\2\2\2\u00a4\u0227\3\2\2\2\u00a6\u0229\3\2"+
		"\2\2\u00a8\u022b\3\2\2\2\u00aa\u022d\3\2\2\2\u00ac\u022f\3\2\2\2\u00ae"+
		"\u0231\3\2\2\2\u00b0\u0233\3\2\2\2\u00b2\u0235\3\2\2\2\u00b4\u0237\3\2"+
		"\2\2\u00b6\u0239\3\2\2\2\u00b8\u023b\3\2\2\2\u00ba\u023d\3\2\2\2\u00bc"+
		"\u023f\3\2\2\2\u00be\u0241\3\2\2\2\u00c0\u0243\3\2\2\2\u00c2\u0249\3\2"+
		"\2\2\u00c4\u024b\3\2\2\2\u00c6\u024d\3\2\2\2\u00c8\u024f\3\2\2\2\u00ca"+
		"\u0251\3\2\2\2\u00cc\u025c\3\2\2\2\u00ce\u025e\3\2\2\2\u00d0\u0260\3\2"+
		"\2\2\u00d2\u0262\3\2\2\2\u00d4\u0264\3\2\2\2\u00d6\u0266\3\2\2\2\u00d8"+
		"\u0268\3\2\2\2\u00da\u026a\3\2\2\2\u00dc\u026c\3\2\2\2\u00de\u026e\3\2"+
		"\2\2\u00e0\u0277\3\2\2\2\u00e2\u0279\3\2\2\2\u00e4\u027b\3\2\2\2\u00e6"+
		"\u027d\3\2\2\2\u00e8\u027f\3\2\2\2\u00ea\u0281\3\2\2\2\u00ec\u0283\3\2"+
		"\2\2\u00ee\u0285\3\2\2\2\u00f0\u0291\3\2\2\2\u00f2\u0293\3\2\2\2\u00f4"+
		"\u0295\3\2\2\2\u00f6\u0297\3\2\2\2\u00f8\u0299\3\2\2\2\u00fa\u029b\3\2"+
		"\2\2\u00fc\u029d\3\2\2\2\u00fe\u029f\3\2\2\2\u0100\u02a1\3\2\2\2\u0102"+
		"\u02a3\3\2\2\2\u0104\u02a5\3\2\2\2\u0106\u02af\3\2\2\2\u0108\u02b1\3\2"+
		"\2\2\u010a\u02b3\3\2\2\2\u010c\u02b5\3\2\2\2\u010e\u02b7\3\2\2\2\u0110"+
		"\u02b9\3\2\2\2\u0112\u02bb\3\2\2\2\u0114\u02bd\3\2\2\2\u0116\u02bf\3\2"+
		"\2\2\u0118\u011a\5\4\3\2\u0119\u011b\7\3\2\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\4\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u0118\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\3\3\2\2\2\u0122\u0124\5\6\4\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\5\3"+
		"\2\2\2\u0127\u012a\5\16\b\2\u0128\u012a\5\b\5\2\u0129\u0127\3\2\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\7\3\2\2\2\u012b\u012e\5\n\6\2\u012c\u012e\5\f\7\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\t\3\2\2\2\u012f\u0130\7"+
		"\7\2\2\u0130\13\3\2\2\2\u0131\u0132\7\6\2\2\u0132\r\3\2\2\2\u0133\u0143"+
		"\5\20\t\2\u0134\u0143\5$\23\2\u0135\u0143\5&\24\2\u0136\u0143\5*\26\2"+
		"\u0137\u0143\5@!\2\u0138\u0143\5V,\2\u0139\u0143\5j\66\2\u013a\u0143\5"+
		"\u0084C\2\u013b\u0143\5\u009cO\2\u013c\u0143\5\u00c2b\2\u013d\u0143\5"+
		"\u00ccg\2\u013e\u0143\5\u00e0q\2\u013f\u0143\5(\25\2\u0140\u0143\5\u00f0"+
		"y\2\u0141\u0143\5\u0106\u0084\2\u0142\u0133\3\2\2\2\u0142\u0134\3\2\2"+
		"\2\u0142\u0135\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0137\3\2\2\2\u0142\u0138"+
		"\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013a\3\2\2\2\u0142\u013b\3\2\2\2\u0142"+
		"\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\17\3\2\2\2\u0144\u014e"+
		"\5\22\n\2\u0145\u014e\5\24\13\2\u0146\u014e\5\26\f\2\u0147\u014e\5\30"+
		"\r\2\u0148\u014e\5\32\16\2\u0149\u014e\5\34\17\2\u014a\u014e\5\36\20\2"+
		"\u014b\u014e\5 \21\2\u014c\u014e\5\"\22\2\u014d\u0144\3\2\2\2\u014d\u0145"+
		"\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u0148\3\2\2\2\u014d"+
		"\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2"+
		"\2\2\u014e\21\3\2\2\2\u014f\u0150\7\b\2\2\u0150\23\3\2\2\2\u0151\u0152"+
		"\7\t\2\2\u0152\25\3\2\2\2\u0153\u0154\7\n\2\2\u0154\27\3\2\2\2\u0155\u0156"+
		"\7\13\2\2\u0156\31\3\2\2\2\u0157\u0158\7\f\2\2\u0158\33\3\2\2\2\u0159"+
		"\u015a\7\r\2\2\u015a\35\3\2\2\2\u015b\u015c\7\17\2\2\u015c\37\3\2\2\2"+
		"\u015d\u015e\7\20\2\2\u015e!\3\2\2\2\u015f\u0160\7\21\2\2\u0160#\3\2\2"+
		"\2\u0161\u0162\7\22\2\2\u0162%\3\2\2\2\u0163\u0164\7\23\2\2\u0164\'\3"+
		"\2\2\2\u0165\u0166\7\24\2\2\u0166)\3\2\2\2\u0167\u0172\5,\27\2\u0168\u0172"+
		"\5.\30\2\u0169\u0172\5\60\31\2\u016a\u0172\5\62\32\2\u016b\u0172\5\64"+
		"\33\2\u016c\u0172\5\66\34\2\u016d\u0172\58\35\2\u016e\u0172\5:\36\2\u016f"+
		"\u0172\5<\37\2\u0170\u0172\5> \2\u0171\u0167\3\2\2\2\u0171\u0168\3\2\2"+
		"\2\u0171\u0169\3\2\2\2\u0171\u016a\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u016c"+
		"\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172+\3\2\2\2\u0173\u0174\7\25\2\2\u0174-\3\2\2\2\u0175"+
		"\u0176\7\26\2\2\u0176/\3\2\2\2\u0177\u0178\7\27\2\2\u0178\61\3\2\2\2\u0179"+
		"\u017a\7\30\2\2\u017a\63\3\2\2\2\u017b\u017c\7\31\2\2\u017c\65\3\2\2\2"+
		"\u017d\u017e\7\32\2\2\u017e\67\3\2\2\2\u017f\u0180\7\33\2\2\u01809\3\2"+
		"\2\2\u0181\u0182\7\34\2\2\u0182;\3\2\2\2\u0183\u0184\7\35\2\2\u0184=\3"+
		"\2\2\2\u0185\u0186\7\37\2\2\u0186?\3\2\2\2\u0187\u0192\5B\"\2\u0188\u0192"+
		"\5D#\2\u0189\u0192\5F$\2\u018a\u0192\5H%\2\u018b\u0192\5J&\2\u018c\u0192"+
		"\5L\'\2\u018d\u0192\5N(\2\u018e\u0192\5P)\2\u018f\u0192\5R*\2\u0190\u0192"+
		"\5T+\2\u0191\u0187\3\2\2\2\u0191\u0188\3\2\2\2\u0191\u0189\3\2\2\2\u0191"+
		"\u018a\3\2\2\2\u0191\u018b\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u018d\3\2"+
		"\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192"+
		"A\3\2\2\2\u0193\u0194\7 \2\2\u0194C\3\2\2\2\u0195\u0196\7!\2\2\u0196E"+
		"\3\2\2\2\u0197\u0198\7\"\2\2\u0198G\3\2\2\2\u0199\u019a\7#\2\2\u019aI"+
		"\3\2\2\2\u019b\u019c\7$\2\2\u019cK\3\2\2\2\u019d\u019e\7%\2\2\u019eM\3"+
		"\2\2\2\u019f\u01a0\7&\2\2\u01a0O\3\2\2\2\u01a1\u01a2\7\'\2\2\u01a2Q\3"+
		"\2\2\2\u01a3\u01a4\7(\2\2\u01a4S\3\2\2\2\u01a5\u01a6\7)\2\2\u01a6U\3\2"+
		"\2\2\u01a7\u01b1\5X-\2\u01a8\u01b1\5Z.\2\u01a9\u01b1\5\\/\2\u01aa\u01b1"+
		"\5^\60\2\u01ab\u01b1\5`\61\2\u01ac\u01b1\5b\62\2\u01ad\u01b1\5d\63\2\u01ae"+
		"\u01b1\5f\64\2\u01af\u01b1\5h\65\2\u01b0\u01a7\3\2\2\2\u01b0\u01a8\3\2"+
		"\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b0"+
		"\u01ac\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2"+
		"\2\2\u01b1W\3\2\2\2\u01b2\u01b3\7*\2\2\u01b3Y\3\2\2\2\u01b4\u01b5\7+\2"+
		"\2\u01b5[\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7]\3\2\2\2\u01b8\u01b9\7-\2\2"+
		"\u01b9_\3\2\2\2\u01ba\u01bb\7.\2\2\u01bba\3\2\2\2\u01bc\u01bd\7/\2\2\u01bd"+
		"c\3\2\2\2\u01be\u01bf\7\60\2\2\u01bfe\3\2\2\2\u01c0\u01c1\7\61\2\2\u01c1"+
		"g\3\2\2\2\u01c2\u01c3\7\62\2\2\u01c3i\3\2\2\2\u01c4\u01d1\5l\67\2\u01c5"+
		"\u01d1\5n8\2\u01c6\u01d1\5p9\2\u01c7\u01d1\5r:\2\u01c8\u01d1\5t;\2\u01c9"+
		"\u01d1\5v<\2\u01ca\u01d1\5x=\2\u01cb\u01d1\5z>\2\u01cc\u01d1\5|?\2\u01cd"+
		"\u01d1\5~@\2\u01ce\u01d1\5\u0080A\2\u01cf\u01d1\5\u0082B\2\u01d0\u01c4"+
		"\3\2\2\2\u01d0\u01c5\3\2\2\2\u01d0\u01c6\3\2\2\2\u01d0\u01c7\3\2\2\2\u01d0"+
		"\u01c8\3\2\2\2\u01d0\u01c9\3\2\2\2\u01d0\u01ca\3\2\2\2\u01d0\u01cb\3\2"+
		"\2\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1k\3\2\2\2\u01d2\u01d3\7\63\2\2\u01d3m\3\2\2\2\u01d4"+
		"\u01d5\7\64\2\2\u01d5o\3\2\2\2\u01d6\u01d7\7\65\2\2\u01d7q\3\2\2\2\u01d8"+
		"\u01d9\7\66\2\2\u01d9s\3\2\2\2\u01da\u01db\7\67\2\2\u01dbu\3\2\2\2\u01dc"+
		"\u01dd\78\2\2\u01ddw\3\2\2\2\u01de\u01df\79\2\2\u01dfy\3\2\2\2\u01e0\u01e1"+
		"\7:\2\2\u01e1{\3\2\2\2\u01e2\u01e3\7;\2\2\u01e3}\3\2\2\2\u01e4\u01e5\7"+
		"<\2\2\u01e5\177\3\2\2\2\u01e6\u01e7\7=\2\2\u01e7\u0081\3\2\2\2\u01e8\u01e9"+
		"\7>\2\2\u01e9\u0083\3\2\2\2\u01ea\u01f6\5\u0086D\2\u01eb\u01f6\5\u0088"+
		"E\2\u01ec\u01f6\5\u008aF\2\u01ed\u01f6\5\u008cG\2\u01ee\u01f6\5\u008e"+
		"H\2\u01ef\u01f6\5\u0090I\2\u01f0\u01f6\5\u0092J\2\u01f1\u01f6\5\u0094"+
		"K\2\u01f2\u01f6\5\u0096L\2\u01f3\u01f6\5\u0098M\2\u01f4\u01f6\5\u009a"+
		"N\2\u01f5\u01ea\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f5"+
		"\u01ed\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f0\3\2"+
		"\2\2\u01f5\u01f1\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u0085\3\2\2\2\u01f7\u01f8\7?\2\2\u01f8\u0087\3\2"+
		"\2\2\u01f9\u01fa\7@\2\2\u01fa\u0089\3\2\2\2\u01fb\u01fc\7A\2\2\u01fc\u008b"+
		"\3\2\2\2\u01fd\u01fe\7B\2\2\u01fe\u008d\3\2\2\2\u01ff\u0200\7C\2\2\u0200"+
		"\u008f\3\2\2\2\u0201\u0202\7D\2\2\u0202\u0091\3\2\2\2\u0203\u0204\7E\2"+
		"\2\u0204\u0093\3\2\2\2\u0205\u0206\7F\2\2\u0206\u0095\3\2\2\2\u0207\u0208"+
		"\7G\2\2\u0208\u0097\3\2\2\2\u0209\u020a\7H\2\2\u020a\u0099\3\2\2\2\u020b"+
		"\u020c\7I\2\2\u020c\u009b\3\2\2\2\u020d\u0220\5\u009eP\2\u020e\u0220\5"+
		"\u00a0Q\2\u020f\u0220\5\u00a2R\2\u0210\u0220\5\u00a4S\2\u0211\u0220\5"+
		"\u00a6T\2\u0212\u0220\5\u00a8U\2\u0213\u0220\5\u00aaV\2\u0214\u0220\5"+
		"\u00acW\2\u0215\u0220\5\u00aeX\2\u0216\u0220\5\u00b0Y\2\u0217\u0220\5"+
		"\u00b2Z\2\u0218\u0220\5\u00b4[\2\u0219\u0220\5\u00b6\\\2\u021a\u0220\5"+
		"\u00b8]\2\u021b\u0220\5\u00ba^\2\u021c\u0220\5\u00bc_\2\u021d\u0220\5"+
		"\u00be`\2\u021e\u0220\5\u00c0a\2\u021f\u020d\3\2\2\2\u021f\u020e\3\2\2"+
		"\2\u021f\u020f\3\2\2\2\u021f\u0210\3\2\2\2\u021f\u0211\3\2\2\2\u021f\u0212"+
		"\3\2\2\2\u021f\u0213\3\2\2\2\u021f\u0214\3\2\2\2\u021f\u0215\3\2\2\2\u021f"+
		"\u0216\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u0218\3\2\2\2\u021f\u0219\3\2"+
		"\2\2\u021f\u021a\3\2\2\2\u021f\u021b\3\2\2\2\u021f\u021c\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u009d\3\2\2\2\u0221\u0222\7J"+
		"\2\2\u0222\u009f\3\2\2\2\u0223\u0224\7K\2\2\u0224\u00a1\3\2\2\2\u0225"+
		"\u0226\7L\2\2\u0226\u00a3\3\2\2\2\u0227\u0228\7M\2\2\u0228\u00a5\3\2\2"+
		"\2\u0229\u022a\7N\2\2\u022a\u00a7\3\2\2\2\u022b\u022c\7O\2\2\u022c\u00a9"+
		"\3\2\2\2\u022d\u022e\7P\2\2\u022e\u00ab\3\2\2\2\u022f\u0230\7Q\2\2\u0230"+
		"\u00ad\3\2\2\2\u0231\u0232\7R\2\2\u0232\u00af\3\2\2\2\u0233\u0234\7S\2"+
		"\2\u0234\u00b1\3\2\2\2\u0235\u0236\7T\2\2\u0236\u00b3\3\2\2\2\u0237\u0238"+
		"\7U\2\2\u0238\u00b5\3\2\2\2\u0239\u023a\7V\2\2\u023a\u00b7\3\2\2\2\u023b"+
		"\u023c\7W\2\2\u023c\u00b9\3\2\2\2\u023d\u023e\7X\2\2\u023e\u00bb\3\2\2"+
		"\2\u023f\u0240\7Y\2\2\u0240\u00bd\3\2\2\2\u0241\u0242\7Z\2\2\u0242\u00bf"+
		"\3\2\2\2\u0243\u0244\7[\2\2\u0244\u00c1\3\2\2\2\u0245\u024a\5\u00c4c\2"+
		"\u0246\u024a\5\u00c6d\2\u0247\u024a\5\u00c8e\2\u0248\u024a\5\u00caf\2"+
		"\u0249\u0245\3\2\2\2\u0249\u0246\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u0248"+
		"\3\2\2\2\u024a\u00c3\3\2\2\2\u024b\u024c\7\\\2\2\u024c\u00c5\3\2\2\2\u024d"+
		"\u024e\7]\2\2\u024e\u00c7\3\2\2\2\u024f\u0250\7^\2\2\u0250\u00c9\3\2\2"+
		"\2\u0251\u0252\7_\2\2\u0252\u00cb\3\2\2\2\u0253\u025d\5\u00ceh\2\u0254"+
		"\u025d\5\u00d0i\2\u0255\u025d\5\u00d2j\2\u0256\u025d\5\u00d4k\2\u0257"+
		"\u025d\5\u00d6l\2\u0258\u025d\5\u00d8m\2\u0259\u025d\5\u00dan\2\u025a"+
		"\u025d\5\u00dco\2\u025b\u025d\5\u00dep\2\u025c\u0253\3\2\2\2\u025c\u0254"+
		"\3\2\2\2\u025c\u0255\3\2\2\2\u025c\u0256\3\2\2\2\u025c\u0257\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2"+
		"\2\2\u025d\u00cd\3\2\2\2\u025e\u025f\7`\2\2\u025f\u00cf\3\2\2\2\u0260"+
		"\u0261\7a\2\2\u0261\u00d1\3\2\2\2\u0262\u0263\7b\2\2\u0263\u00d3\3\2\2"+
		"\2\u0264\u0265\7c\2\2\u0265\u00d5\3\2\2\2\u0266\u0267\7d\2\2\u0267\u00d7"+
		"\3\2\2\2\u0268\u0269\7e\2\2\u0269\u00d9\3\2\2\2\u026a\u026b\7f\2\2\u026b"+
		"\u00db\3\2\2\2\u026c\u026d\7g\2\2\u026d\u00dd\3\2\2\2\u026e\u026f\7h\2"+
		"\2\u026f\u00df\3\2\2\2\u0270\u0278\5\u00e2r\2\u0271\u0278\5\u00e4s\2\u0272"+
		"\u0278\5\u00e6t\2\u0273\u0278\5\u00e8u\2\u0274\u0278\5\u00eav\2\u0275"+
		"\u0278\5\u00ecw\2\u0276\u0278\5\u00eex\2\u0277\u0270\3\2\2\2\u0277\u0271"+
		"\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u00e1\3\2\2\2\u0279\u027a\7i"+
		"\2\2\u027a\u00e3\3\2\2\2\u027b\u027c\7j\2\2\u027c\u00e5\3\2\2\2\u027d"+
		"\u027e\7k\2\2\u027e\u00e7\3\2\2\2\u027f\u0280\7l\2\2\u0280\u00e9\3\2\2"+
		"\2\u0281\u0282\7m\2\2\u0282\u00eb\3\2\2\2\u0283\u0284\7n\2\2\u0284\u00ed"+
		"\3\2\2\2\u0285\u0286\7o\2\2\u0286\u00ef\3\2\2\2\u0287\u0292\5\u00f2z\2"+
		"\u0288\u0292\5\u00f4{\2\u0289\u0292\5\u00f6|\2\u028a\u0292\5\u00f8}\2"+
		"\u028b\u0292\5\u00fa~\2\u028c\u0292\5\u00fc\177\2\u028d\u0292\5\u00fe"+
		"\u0080\2\u028e\u0292\5\u0100\u0081\2\u028f\u0292\5\u0102\u0082\2\u0290"+
		"\u0292\5\u0104\u0083\2\u0291\u0287\3\2\2\2\u0291\u0288\3\2\2\2\u0291\u0289"+
		"\3\2\2\2\u0291\u028a\3\2\2\2\u0291\u028b\3\2\2\2\u0291\u028c\3\2\2\2\u0291"+
		"\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2"+
		"\2\2\u0292\u00f1\3\2\2\2\u0293\u0294\7p\2\2\u0294\u00f3\3\2\2\2\u0295"+
		"\u0296\7q\2\2\u0296\u00f5\3\2\2\2\u0297\u0298\7r\2\2\u0298\u00f7\3\2\2"+
		"\2\u0299\u029a\7s\2\2\u029a\u00f9\3\2\2\2\u029b\u029c\7t\2\2\u029c\u00fb"+
		"\3\2\2\2\u029d\u029e\7u\2\2\u029e\u00fd\3\2\2\2\u029f\u02a0\7v\2\2\u02a0"+
		"\u00ff\3\2\2\2\u02a1\u02a2\7w\2\2\u02a2\u0101\3\2\2\2\u02a3\u02a4\7x\2"+
		"\2\u02a4\u0103\3\2\2\2\u02a5\u02a6\7\u0081\2\2\u02a6\u0105\3\2\2\2\u02a7"+
		"\u02b0\5\u0108\u0085\2\u02a8\u02b0\5\u010a\u0086\2\u02a9\u02b0\5\u010c"+
		"\u0087\2\u02aa\u02b0\5\u010e\u0088\2\u02ab\u02b0\5\u0110\u0089\2\u02ac"+
		"\u02b0\5\u0112\u008a\2\u02ad\u02b0\5\u0114\u008b\2\u02ae\u02b0\5\u0116"+
		"\u008c\2\u02af\u02a7\3\2\2\2\u02af\u02a8\3\2\2\2\u02af\u02a9\3\2\2\2\u02af"+
		"\u02aa\3\2\2\2\u02af\u02ab\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2"+
		"\2\2\u02af\u02ae\3\2\2\2\u02b0\u0107\3\2\2\2\u02b1\u02b2\7y\2\2\u02b2"+
		"\u0109\3\2\2\2\u02b3\u02b4\7z\2\2\u02b4\u010b\3\2\2\2\u02b5\u02b6\7{\2"+
		"\2\u02b6\u010d\3\2\2\2\u02b7\u02b8\7|\2\2\u02b8\u010f\3\2\2\2\u02b9\u02ba"+
		"\7}\2\2\u02ba\u0111\3\2\2\2\u02bb\u02bc\7~\2\2\u02bc\u0113\3\2\2\2\u02bd"+
		"\u02be\7\177\2\2\u02be\u0115\3\2\2\2\u02bf\u02c0\7\u0080\2\2\u02c0\u0117"+
		"\3\2\2\2\24\u011a\u0120\u0125\u0129\u012d\u0142\u014d\u0171\u0191\u01b0"+
		"\u01d0\u01f5\u021f\u0249\u025c\u0277\u0291\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}