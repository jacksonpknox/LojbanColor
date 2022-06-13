// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\Color.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, PA=4, LUJVO=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "PA", "LUJVO", "BOBVO", "COBVO", "DOBVO", "FOBVO", 
			"GISMU", "C", "V", "RAFPAIRCON", "Y", "TAILVO", "RAFPAIRVOW", "STUMP", 
			"RAFSTUMP", "BALRAF", "Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", "CKSTUMP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "PA", "LUJVO"
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


	public ColorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Color.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\ba\n\b\3\b\5\bd\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"u\n\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0080\n\16\3\16\3"+
		"\16\3\16\3\16\5\16\u0086\n\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u008e"+
		"\n\20\3\20\3\20\3\20\3\20\7\20\u0094\n\20\f\20\16\20\u0097\13\20\3\20"+
		"\3\20\5\20\u009b\n\20\3\21\3\21\3\21\5\21\u00a0\n\21\3\21\5\21\u00a3\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\21\3\21\3\21\5\21\u00ae\n\21"+
		"\3\21\3\21\5\21\u00b2\n\21\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\5\23\u00ba"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00d4"+
		"\n\27\3\27\3\27\3\30\3\30\5\30\u00da\n\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\3\2\5\4"+
		"\2\13\13\"\"\n\2dfhilprrtvxxzz||\7\2ccggkkqqww\2\u00f4\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2"+
		"\2\79\3\2\2\2\tQ\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21e\3\2\2"+
		"\2\23i\3\2\2\2\25m\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33\u0085\3\2\2\2\35"+
		"\u0089\3\2\2\2\37\u0095\3\2\2\2!\u00b1\3\2\2\2#\u00b5\3\2\2\2%\u00c4\3"+
		"\2\2\2\'\u00c6\3\2\2\2)\u00ca\3\2\2\2+\u00cc\3\2\2\2-\u00d0\3\2\2\2/\u00d9"+
		"\3\2\2\2\61\u00db\3\2\2\2\63\u00e0\3\2\2\2\65\66\7\17\2\2\66\4\3\2\2\2"+
		"\678\7\f\2\28\6\3\2\2\29:\t\2\2\2:;\3\2\2\2;<\b\4\2\2<\b\3\2\2\2=>\7r"+
		"\2\2>R\7c\2\2?@\7t\2\2@R\7g\2\2AB\7e\2\2BR\7k\2\2CD\7x\2\2DR\7q\2\2EF"+
		"\7o\2\2FR\7w\2\2GH\7z\2\2HR\7c\2\2IJ\7|\2\2JR\7g\2\2KL\7d\2\2LR\7k\2\2"+
		"MN\7u\2\2NR\7q\2\2OP\7p\2\2PR\7q\2\2Q=\3\2\2\2Q?\3\2\2\2QA\3\2\2\2QC\3"+
		"\2\2\2QE\3\2\2\2QG\3\2\2\2QI\3\2\2\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\n"+
		"\3\2\2\2SY\5\r\7\2TY\5\17\b\2UY\5\21\t\2VY\5\23\n\2WY\5\25\13\2XS\3\2"+
		"\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\f\3\2\2\2Z[\5\33\16\2[\\"+
		"\5\35\17\2\\]\5\37\20\2]\16\3\2\2\2^a\5\33\16\2_a\5!\21\2`^\3\2\2\2`_"+
		"\3\2\2\2ac\3\2\2\2bd\5\37\20\2cb\3\2\2\2cd\3\2\2\2d\20\3\2\2\2ef\5#\22"+
		"\2fg\5\35\17\2gh\5\37\20\2h\22\3\2\2\2ij\5%\23\2jk\5\35\17\2kl\5\37\20"+
		"\2l\24\3\2\2\2mt\5\27\f\2no\5\27\f\2op\5\31\r\2pu\3\2\2\2qr\5\31\r\2r"+
		"s\5\27\f\2su\3\2\2\2tn\3\2\2\2tq\3\2\2\2uv\3\2\2\2vw\5\27\f\2wx\5\31\r"+
		"\2x\26\3\2\2\2yz\t\3\2\2z\30\3\2\2\2{|\t\4\2\2|\32\3\2\2\2}\177\5\'\24"+
		"\2~\u0080\5)\25\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\3\2\2\2\u0081"+
		"\u0086\5+\26\2\u0082\u0083\5-\27\2\u0083\u0084\5)\25\2\u0084\u0086\3\2"+
		"\2\2\u0085}\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\5\'\24\2\u0088\34\3\2\2\2\u0089\u008a\7{\2\2\u008a"+
		"\36\3\2\2\2\u008b\u008d\5\'\24\2\u008c\u008e\5\35\17\2\u008d\u008c\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0094\3\2\2\2\u008f\u0090\5#\22\2\u0090"+
		"\u0091\5\35\17\2\u0091\u0094\3\2\2\2\u0092\u0094\5/\30\2\u0093\u008b\3"+
		"\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009b\5/\30\2\u0099\u009b\5\25\13\2\u009a\u0098\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b \3\2\2\2\u009c\u00a0\5\'\24\2\u009d\u00a0\5+\26\2"+
		"\u009e\u00a0\5-\27\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5)\25\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\5+\26\2\u00a5\u00b2\3\2"+
		"\2\2\u00a6\u00a8\5\'\24\2\u00a7\u00a9\5)\25\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\5/\30\2\u00ab\u00ac\5)"+
		"\25\2\u00ac\u00ae\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\5-\27\2\u00b0\u00b2\3\2\2\2\u00b1\u009f\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b2\"\3\2\2\2\u00b3\u00b6\5\61\31\2\u00b4\u00b6"+
		"\5\63\32\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6$\3\2\2\2\u00b7"+
		"\u00b9\5\'\24\2\u00b8\u00ba\5)\25\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5#\22\2\u00bc\u00c5\3\2\2\2\u00bd"+
		"\u00be\5/\30\2\u00be\u00bf\5)\25\2\u00bf\u00c0\5\61\31\2\u00c0\u00c5\3"+
		"\2\2\2\u00c1\u00c2\5/\30\2\u00c2\u00c3\5\63\32\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00b7\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5&\3\2\2\2"+
		"\u00c6\u00c7\5\27\f\2\u00c7\u00c8\5\31\r\2\u00c8\u00c9\5\27\f\2\u00c9"+
		"(\3\2\2\2\u00ca\u00cb\7s\2\2\u00cb*\3\2\2\2\u00cc\u00cd\5\27\f\2\u00cd"+
		"\u00ce\5\27\f\2\u00ce\u00cf\5\31\r\2\u00cf,\3\2\2\2\u00d0\u00d1\5\27\f"+
		"\2\u00d1\u00d3\5\31\r\2\u00d2\u00d4\7)\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5\31\r\2\u00d6.\3\2\2\2\u00d7"+
		"\u00da\5-\27\2\u00d8\u00da\5+\26\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\60\3\2\2\2\u00db\u00dc\5\27\f\2\u00dc\u00dd\5\31\r\2\u00dd"+
		"\u00de\5\27\f\2\u00de\u00df\5\27\f\2\u00df\62\3\2\2\2\u00e0\u00e1\5\27"+
		"\f\2\u00e1\u00e2\5\27\f\2\u00e2\u00e3\5\31\r\2\u00e3\u00e4\5\27\f\2\u00e4"+
		"\64\3\2\2\2\30\2QX`ct\177\u0085\u008d\u0093\u0095\u009a\u009f\u00a2\u00a8"+
		"\u00ad\u00b1\u00b5\u00b9\u00c4\u00d3\u00d9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}