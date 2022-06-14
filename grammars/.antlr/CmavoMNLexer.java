// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoMN.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoMNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAHO=1, MAI=2, MEHU=3, ME=4, MOHE=5, MOHI=6, MOI=7, NAHE=8, NAHU=9, NAI=10, 
		NA=11, NIHE=12, NIHO=13, NOI=14, NUHA=15, NUHI=16, NUHU=17, NU=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAHO", "MAI", "MEHU", "ME", "MOHE", "MOHI", "MOI", "NAHE", "NAHU", "NAI", 
			"NA", "NIHE", "NIHO", "NOI", "NUHA", "NUHI", "NUHU", "NU"
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


	public CmavoMNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoMN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"h\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\2\2\24\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\3\2\2\2\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t:"+
		"\3\2\2\2\13=\3\2\2\2\rB\3\2\2\2\17Y\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25"+
		"n\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33\177\3\2\2\2\35\u008d\3\2\2\2\37\u008f"+
		"\3\2\2\2!\u0094\3\2\2\2#\u0099\3\2\2\2%\u00c4\3\2\2\2\'(\7o\2\2()\7c\2"+
		"\2)*\7)\2\2*+\7q\2\2+\4\3\2\2\2,-\7o\2\2-.\7c\2\2.\64\7k\2\2/\60\7o\2"+
		"\2\60\61\7q\2\2\61\62\7)\2\2\62\64\7q\2\2\63,\3\2\2\2\63/\3\2\2\2\64\6"+
		"\3\2\2\2\65\66\7o\2\2\66\67\7g\2\2\678\7)\2\289\7w\2\29\b\3\2\2\2:;\7"+
		"o\2\2;<\7g\2\2<\n\3\2\2\2=>\7o\2\2>?\7q\2\2?@\7)\2\2@A\7g\2\2A\f\3\2\2"+
		"\2BC\7o\2\2CD\7q\2\2DE\7)\2\2EF\7k\2\2F\16\3\2\2\2GH\7o\2\2HI\7q\2\2I"+
		"Z\7k\2\2JK\7o\2\2KL\7g\2\2LZ\7k\2\2MN\7u\2\2NO\7k\2\2OP\7)\2\2PZ\7g\2"+
		"\2QR\7e\2\2RS\7w\2\2ST\7)\2\2TZ\7q\2\2UV\7x\2\2VW\7c\2\2WX\7)\2\2XZ\7"+
		"g\2\2YG\3\2\2\2YJ\3\2\2\2YM\3\2\2\2YQ\3\2\2\2YU\3\2\2\2Z\20\3\2\2\2[\\"+
		"\7p\2\2\\]\7c\2\2]^\7)\2\2^h\7g\2\2_`\7v\2\2`a\7q\2\2ab\7)\2\2bh\7g\2"+
		"\2cd\7p\2\2de\7q\2\2ef\7)\2\2fh\7g\2\2g[\3\2\2\2g_\3\2\2\2gc\3\2\2\2h"+
		"\22\3\2\2\2ij\7p\2\2jk\7c\2\2kl\7)\2\2lm\7w\2\2m\24\3\2\2\2no\7p\2\2o"+
		"p\7c\2\2pq\7k\2\2q\26\3\2\2\2rs\7p\2\2sy\7c\2\2tu\7l\2\2uv\7c\2\2vw\7"+
		")\2\2wy\7c\2\2xr\3\2\2\2xt\3\2\2\2y\30\3\2\2\2z{\7p\2\2{|\7k\2\2|}\7)"+
		"\2\2}~\7g\2\2~\32\3\2\2\2\177\u0080\7p\2\2\u0080\u0081\7k\2\2\u0081\u0082"+
		"\7)\2\2\u0082\u0083\7q\2\2\u0083\34\3\2\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u008e\7k\2\2\u0087\u0088\7r\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008e\7k\2\2\u008a\u008b\7x\2\2\u008b\u008c\7q\2\2\u008c\u008e\7k\2\2"+
		"\u008d\u0084\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\36"+
		"\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091\7w\2\2\u0091\u0092\7)\2\2\u0092"+
		"\u0093\7c\2\2\u0093 \3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7)\2\2\u0097\u0098\7k\2\2\u0098\"\3\2\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u009c\7)\2\2\u009c\u009d\7w\2\2\u009d$\3\2\2\2\u009e"+
		"\u009f\7p\2\2\u009f\u00c5\7w\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7w\2\2"+
		"\u00a2\u00a3\7)\2\2\u00a3\u00c5\7g\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7)\2\2\u00a7\u00c5\7w\2\2\u00a8\u00a9\7|\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7)\2\2\u00ab\u00c5\7q\2\2\u00ac\u00ad\7|\2\2"+
		"\u00ad\u00ae\7c\2\2\u00ae\u00af\7)\2\2\u00af\u00c5\7k\2\2\u00b0\u00b1"+
		"\7m\2\2\u00b1\u00c5\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00c5\7k\2\2\u00b4"+
		"\u00b5\7f\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7\7)\2\2\u00b7\u00c5\7w\2\2"+
		"\u00b8\u00b9\7n\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7)\2\2\u00bb\u00c5"+
		"\7k\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7)\2\2\u00bf"+
		"\u00c5\7q\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7)\2\2"+
		"\u00c3\u00c5\7w\2\2\u00c4\u009e\3\2\2\2\u00c4\u00a0\3\2\2\2\u00c4\u00a4"+
		"\3\2\2\2\u00c4\u00a8\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00b0\3\2\2\2\u00c4"+
		"\u00b2\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5&\3\2\2\2\t\2\63Ygx\u008d\u00c4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}