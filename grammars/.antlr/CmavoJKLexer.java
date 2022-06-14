// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoJK.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoJKLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JAI=1, JA=2, JOHI=3, JOI=4, KEHE=5, KEI=6, KE=7, KI=8, KOHA=9, KUHE=10, 
		KUHO=11, KU=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"JAI", "JA", "JOHI", "JOI", "KEHE", "KEI", "KE", "KI", "KOHA", "KUHE", 
			"KUHO", "KU"
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


	public CmavoJKLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoJK.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0108\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00fa\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\3\2\2\2\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\tK\3"+
		"\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21Y\3\2\2\2\23\u00f9\3\2\2\2"+
		"\25\u00fb\3\2\2\2\27\u0100\3\2\2\2\31\u0105\3\2\2\2\33\34\7l\2\2\34\35"+
		"\7c\2\2\35\36\7k\2\2\36\4\3\2\2\2\37 \7l\2\2 (\7c\2\2!\"\7l\2\2\"(\7g"+
		"\2\2#$\7l\2\2$(\7q\2\2%&\7l\2\2&(\7w\2\2\'\37\3\2\2\2\'!\3\2\2\2\'#\3"+
		"\2\2\2\'%\3\2\2\2(\6\3\2\2\2)*\7l\2\2*+\7q\2\2+,\7)\2\2,-\7k\2\2-\b\3"+
		"\2\2\2./\7l\2\2/\60\7q\2\2\60L\7k\2\2\61\62\7e\2\2\62L\7g\2\2\63\64\7"+
		"e\2\2\64\65\7g\2\2\65\66\7)\2\2\66L\7q\2\2\678\7l\2\289\7q\2\29:\7)\2"+
		"\2:L\7w\2\2;<\7h\2\2<=\7c\2\2=>\7)\2\2>L\7w\2\2?@\7l\2\2@A\7q\2\2AB\7"+
		")\2\2BL\7g\2\2CD\7m\2\2DE\7w\2\2EF\7)\2\2FL\7c\2\2GH\7r\2\2HI\7k\2\2I"+
		"J\7)\2\2JL\7w\2\2K.\3\2\2\2K\61\3\2\2\2K\63\3\2\2\2K\67\3\2\2\2K;\3\2"+
		"\2\2K?\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\n\3\2\2\2MN\7m\2\2NO\7g\2\2OP\7)\2"+
		"\2PQ\7g\2\2Q\f\3\2\2\2RS\7m\2\2ST\7g\2\2TU\7k\2\2U\16\3\2\2\2VW\7m\2\2"+
		"WX\7g\2\2X\20\3\2\2\2YZ\7m\2\2Z[\7k\2\2[\22\3\2\2\2\\]\7o\2\2]\u00fa\7"+
		"k\2\2^_\7f\2\2_\u00fa\7q\2\2`a\7o\2\2ab\7k\2\2bc\7)\2\2c\u00fa\7q\2\2"+
		"de\7o\2\2ef\7k\2\2fg\7)\2\2g\u00fa\7c\2\2hi\7o\2\2ij\7c\2\2jk\7)\2\2k"+
		"\u00fa\7c\2\2lm\7f\2\2mn\7q\2\2no\7)\2\2o\u00fa\7q\2\2pq\7m\2\2q\u00fa"+
		"\7q\2\2rs\7v\2\2s\u00fa\7k\2\2tu\7v\2\2u\u00fa\7c\2\2vw\7v\2\2w\u00fa"+
		"\7w\2\2xy\7f\2\2yz\7k\2\2z{\7)\2\2{\u00fa\7w\2\2|}\7f\2\2}~\7k\2\2~\177"+
		"\7)\2\2\177\u00fa\7g\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7)\2\2\u0083\u00fa\7w\2\2\u0084\u0085\7f\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7)\2\2\u0087\u00fa\7w\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2"+
		"\u008a\u008b\7)\2\2\u008b\u00fa\7g\2\2\u008c\u008d\7f\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7)\2\2\u008f\u00fa\7g\2\2\u0090\u0091\7f\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7)\2\2\u0093\u00fa\7g\2\2\u0094\u0095\7f\2\2"+
		"\u0095\u0096\7g\2\2\u0096\u00fa\7k\2\2\u0097\u0098\7f\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7)\2\2\u009a\u00fa\7k\2\2\u009b\u009c\7m\2\2\u009c"+
		"\u009d\7q\2\2\u009d\u009e\7)\2\2\u009e\u00fa\7c\2\2\u009f\u00a0\7m\2\2"+
		"\u00a0\u00a1\7q\2\2\u00a1\u00a2\7)\2\2\u00a2\u00fa\7g\2\2\u00a3\u00a4"+
		"\7m\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7)\2\2\u00a6\u00fa\7k\2\2\u00a7"+
		"\u00a8\7m\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7)\2\2\u00aa\u00fa\7q\2\2"+
		"\u00ab\u00ac\7m\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7)\2\2\u00ae\u00fa"+
		"\7w\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7)\2\2\u00b2"+
		"\u00fa\7c\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7)\2\2"+
		"\u00b6\u00fa\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba"+
		"\7)\2\2\u00ba\u00fa\7k\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7)\2\2\u00be\u00fa\7q\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7q\2\2"+
		"\u00c1\u00c2\7)\2\2\u00c2\u00fa\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00fa"+
		"\7k\2\2\u00c5\u00c6\7t\2\2\u00c6\u00fa\7c\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\u00fa\7w\2\2\u00c9\u00ca\7|\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7)\2\2"+
		"\u00cc\u00fa\7g\2\2\u00cd\u00ce\7|\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0"+
		"\7)\2\2\u00d0\u00fa\7k\2\2\u00d1\u00d2\7|\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7)\2\2\u00d4\u00fa\7q\2\2\u00d5\u00d6\7x\2\2\u00d6\u00d7\7q\2\2"+
		"\u00d7\u00d8\7)\2\2\u00d8\u00fa\7c\2\2\u00d9\u00da\7x\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7)\2\2\u00dc\u00fa\7g\2\2\u00dd\u00de\7x\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7)\2\2\u00e0\u00fa\7k\2\2\u00e1\u00e2\7x\2\2"+
		"\u00e2\u00e3\7q\2\2\u00e3\u00e4\7)\2\2\u00e4\u00fa\7q\2\2\u00e5\u00e6"+
		"\7x\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7)\2\2\u00e8\u00fa\7w\2\2\u00e9"+
		"\u00ea\7o\2\2\u00ea\u00fa\7c\2\2\u00eb\u00ec\7m\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7)\2\2\u00ee\u00fa\7c\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1"+
		"\7g\2\2\u00f1\u00f2\7)\2\2\u00f2\u00fa\7w\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"\u00fa\7c\2\2\u00f5\u00f6\7f\2\2\u00f6\u00fa\7g\2\2\u00f7\u00f8\7f\2\2"+
		"\u00f8\u00fa\7k\2\2\u00f9\\\3\2\2\2\u00f9^\3\2\2\2\u00f9`\3\2\2\2\u00f9"+
		"d\3\2\2\2\u00f9h\3\2\2\2\u00f9l\3\2\2\2\u00f9p\3\2\2\2\u00f9r\3\2\2\2"+
		"\u00f9t\3\2\2\2\u00f9v\3\2\2\2\u00f9x\3\2\2\2\u00f9|\3\2\2\2\u00f9\u0080"+
		"\3\2\2\2\u00f9\u0084\3\2\2\2\u00f9\u0088\3\2\2\2\u00f9\u008c\3\2\2\2\u00f9"+
		"\u0090\3\2\2\2\u00f9\u0094\3\2\2\2\u00f9\u0097\3\2\2\2\u00f9\u009b\3\2"+
		"\2\2\u00f9\u009f\3\2\2\2\u00f9\u00a3\3\2\2\2\u00f9\u00a7\3\2\2\2\u00f9"+
		"\u00ab\3\2\2\2\u00f9\u00af\3\2\2\2\u00f9\u00b3\3\2\2\2\u00f9\u00b7\3\2"+
		"\2\2\u00f9\u00bb\3\2\2\2\u00f9\u00bf\3\2\2\2\u00f9\u00c3\3\2\2\2\u00f9"+
		"\u00c5\3\2\2\2\u00f9\u00c7\3\2\2\2\u00f9\u00c9\3\2\2\2\u00f9\u00cd\3\2"+
		"\2\2\u00f9\u00d1\3\2\2\2\u00f9\u00d5\3\2\2\2\u00f9\u00d9\3\2\2\2\u00f9"+
		"\u00dd\3\2\2\2\u00f9\u00e1\3\2\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00e9\3\2"+
		"\2\2\u00f9\u00eb\3\2\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\24\3\2\2\2\u00fb\u00fc\7m\2\2"+
		"\u00fc\u00fd\7w\2\2\u00fd\u00fe\7)\2\2\u00fe\u00ff\7g\2\2\u00ff\26\3\2"+
		"\2\2\u0100\u0101\7m\2\2\u0101\u0102\7w\2\2\u0102\u0103\7)\2\2\u0103\u0104"+
		"\7q\2\2\u0104\30\3\2\2\2\u0105\u0106\7m\2\2\u0106\u0107\7w\2\2\u0107\32"+
		"\3\2\2\2\6\2\'K\u00f9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}