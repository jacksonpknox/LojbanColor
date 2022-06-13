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
public class Color2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, PA=4, GISMU=5, LUJVO=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "PA", "GISMU", "LUJVO", "GISUM", "BOBVO", "COBVO", 
			"DOBVO", "FOBVO", "C", "V", "RAFPAIRCON", "Y", "TAILVO", "RAFPAIRVOW", 
			"STUMP", "RAFSTUMP", "BALRAF", "Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", 
			"CKSTUMP"
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
			null, null, null, "WS", "PA", "GISMU", "LUJVO"
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


	public Color2Lexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\np\n\n\3\n\5\ns\n\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0083\n"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\5\21\u0091\n\21\3\21\3\21\3\21\3\21\7\21\u0097\n\21\f\21\16\21\u009a"+
		"\13\21\3\21\3\21\5\21\u009e\n\21\3\22\3\22\3\22\5\22\u00a3\n\22\3\22\5"+
		"\22\u00a6\n\22\3\22\3\22\3\22\3\22\5\22\u00ac\n\22\3\22\3\22\3\22\5\22"+
		"\u00b1\n\22\3\22\3\22\5\22\u00b5\n\22\3\23\3\23\5\23\u00b9\n\23\3\24\3"+
		"\24\5\24\u00bd\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00c8\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\5\31\u00db\n\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\3"+
		"\2\5\4\2\13\13\"\"\n\2dfhilprrtvxxzz||\7\2ccggkkqqww\2\u00f3\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\67\3"+
		"\2\2\2\59\3\2\2\2\7;\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\r[\3\2\2\2\17]\3\2"+
		"\2\2\21i\3\2\2\2\23o\3\2\2\2\25t\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33~\3"+
		"\2\2\2\35\u0088\3\2\2\2\37\u008c\3\2\2\2!\u0098\3\2\2\2#\u00b4\3\2\2\2"+
		"%\u00b8\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cd\3\2\2\2-\u00cf\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00e1\3\2\2"+
		"\2\678\7\17\2\28\4\3\2\2\29:\7\f\2\2:\6\3\2\2\2;<\t\2\2\2<=\3\2\2\2=>"+
		"\b\4\2\2>\b\3\2\2\2?@\7r\2\2@T\7c\2\2AB\7t\2\2BT\7g\2\2CD\7e\2\2DT\7k"+
		"\2\2EF\7x\2\2FT\7q\2\2GH\7o\2\2HT\7w\2\2IJ\7z\2\2JT\7c\2\2KL\7|\2\2LT"+
		"\7g\2\2MN\7d\2\2NT\7k\2\2OP\7u\2\2PT\7q\2\2QR\7p\2\2RT\7q\2\2S?\3\2\2"+
		"\2SA\3\2\2\2SC\3\2\2\2SE\3\2\2\2SG\3\2\2\2SI\3\2\2\2SK\3\2\2\2SM\3\2\2"+
		"\2SO\3\2\2\2SQ\3\2\2\2T\n\3\2\2\2UV\5\17\b\2V\f\3\2\2\2W\\\5\21\t\2X\\"+
		"\5\23\n\2Y\\\5\25\13\2Z\\\5\27\f\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\16\3\2\2\2]d\5\31\r\2^_\5\31\r\2_`\5\33\16\2`e\3\2\2\2ab\5\33\16"+
		"\2bc\5\31\r\2ce\3\2\2\2d^\3\2\2\2da\3\2\2\2ef\3\2\2\2fg\5\31\r\2gh\5\33"+
		"\16\2h\20\3\2\2\2ij\5\35\17\2jk\5\37\20\2kl\5!\21\2l\22\3\2\2\2mp\5\35"+
		"\17\2np\5#\22\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs\5!\21\2rq\3\2\2\2rs\3"+
		"\2\2\2s\24\3\2\2\2tu\5%\23\2uv\5\37\20\2vw\5!\21\2w\26\3\2\2\2xy\5\'\24"+
		"\2yz\5\37\20\2z{\5!\21\2{\30\3\2\2\2|}\t\3\2\2}\32\3\2\2\2~\177\t\4\2"+
		"\2\177\34\3\2\2\2\u0080\u0082\5)\25\2\u0081\u0083\5+\26\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0089\3\2\2\2\u0084\u0089\5-\27\2\u0085"+
		"\u0086\5/\30\2\u0086\u0087\5+\26\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2"+
		"\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\5)\25\2\u008b\36\3\2\2\2\u008c\u008d\7{\2\2\u008d \3\2\2\2\u008e"+
		"\u0090\5)\25\2\u008f\u0091\5\37\20\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0097\3\2\2\2\u0092\u0093\5%\23\2\u0093\u0094\5\37\20\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0097\5\61\31\2\u0096\u008e\3\2\2\2\u0096\u0092\3"+
		"\2\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e\5\61"+
		"\31\2\u009c\u009e\5\17\b\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a3\5)\25\2\u00a0\u00a3\5-\27\2\u00a1\u00a3\5/\30\2"+
		"\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u00a6\5+\26\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\5-\27\2\u00a8\u00b5\3\2\2\2\u00a9\u00ab\5)"+
		"\25\2\u00aa\u00ac\5+\26\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00b1\3\2\2\2\u00ad\u00ae\5\61\31\2\u00ae\u00af\5+\26\2\u00af\u00b1\3"+
		"\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\5/\30\2\u00b3\u00b5\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5$\3\2\2\2\u00b6\u00b9\5\63\32\2\u00b7\u00b9\5\65\33\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9&\3\2\2\2\u00ba\u00bc\5)\25\2"+
		"\u00bb\u00bd\5+\26\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\5%\23\2\u00bf\u00c8\3\2\2\2\u00c0\u00c1\5\61\31\2"+
		"\u00c1\u00c2\5+\26\2\u00c2\u00c3\5\63\32\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5"+
		"\5\61\31\2\u00c5\u00c6\5\65\33\2\u00c6\u00c8\3\2\2\2\u00c7\u00ba\3\2\2"+
		"\2\u00c7\u00c0\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8(\3\2\2\2\u00c9\u00ca"+
		"\5\31\r\2\u00ca\u00cb\5\33\16\2\u00cb\u00cc\5\31\r\2\u00cc*\3\2\2\2\u00cd"+
		"\u00ce\7s\2\2\u00ce,\3\2\2\2\u00cf\u00d0\5\31\r\2\u00d0\u00d1\5\31\r\2"+
		"\u00d1\u00d2\5\33\16\2\u00d2.\3\2\2\2\u00d3\u00d4\5\31\r\2\u00d4\u00d5"+
		"\5\33\16\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\5\33\16\2\u00d7\60\3\2\2\2\u00d8"+
		"\u00db\5/\30\2\u00d9\u00db\5-\27\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\62\3\2\2\2\u00dc\u00dd\5\31\r\2\u00dd\u00de\5\33\16\2\u00de"+
		"\u00df\5\31\r\2\u00df\u00e0\5\31\r\2\u00e0\64\3\2\2\2\u00e1\u00e2\5\31"+
		"\r\2\u00e2\u00e3\5\31\r\2\u00e3\u00e4\5\33\16\2\u00e4\u00e5\5\31\r\2\u00e5"+
		"\66\3\2\2\2\27\2S[dor\u0082\u0088\u0090\u0096\u0098\u009d\u00a2\u00a5"+
		"\u00ab\u00b0\u00b4\u00b8\u00bc\u00c7\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}