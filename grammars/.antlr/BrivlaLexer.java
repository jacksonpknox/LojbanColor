// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\Brivla.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrivlaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, GISMU=2, LUJVO=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "GISMU", "GISUM", "LUJVO", "BOBVO", "COBVO", "DOBVO", "FOBVO", 
			"C", "V", "RAFPAIRCON", "TAILVO", "RAFPAIRVOW", "STUMP", "RAFSTUMP", 
			"BALRAF", "Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", "CKSTUMP", "Y"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "GISMU", "LUJVO"
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


	public BrivlaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Brivla.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5\u00cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7P\n\7\3\7\5\7S\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\fc\n\f\3\f\3"+
		"\f\3\f\3\f\5\fi\n\f\3\f\3\f\3\r\3\r\5\ro\n\r\3\r\3\r\3\r\3\r\7\ru\n\r"+
		"\f\r\16\rx\13\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\5\16\u0081\n\16\3\16\5"+
		"\16\u0084\n\16\3\16\3\16\3\16\3\16\5\16\u008a\n\16\3\16\5\16\u008d\n\16"+
		"\3\16\3\16\3\16\5\16\u0092\n\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\5"+
		"\17\u009a\n\17\3\20\3\20\5\20\u009e\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u00b8\n\24\3\24\3\24\3\25\3\25\5\25\u00be"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\2\2"+
		"\31\3\3\5\4\7\2\t\5\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\3\2\6\4\2\13\13\"\"\n\2dfhilprrtvxxzz||\7"+
		"\2ccggkkqqww\4\2nnst\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\3\61"+
		"\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rO\3\2\2\2\17"+
		"T\3\2\2\2\21X\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27h\3\2\2\2\31v\3\2\2\2"+
		"\33\u0095\3\2\2\2\35\u0099\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2#\u00ae"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00b4\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2"+
		"-\u00c4\3\2\2\2/\u00c9\3\2\2\2\61\62\t\2\2\2\62\63\3\2\2\2\63\64\b\2\2"+
		"\2\64\4\3\2\2\2\65\66\5\7\4\2\66\6\3\2\2\2\67>\5\23\n\289\5\23\n\29:\5"+
		"\25\13\2:?\3\2\2\2;<\5\25\13\2<=\5\23\n\2=?\3\2\2\2>8\3\2\2\2>;\3\2\2"+
		"\2?@\3\2\2\2@A\5\23\n\2AB\5\25\13\2B\b\3\2\2\2CH\5\13\6\2DH\5\r\7\2EH"+
		"\5\17\b\2FH\5\21\t\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\n\3\2\2"+
		"\2IJ\5\27\f\2JK\5/\30\2KL\5\31\r\2L\f\3\2\2\2MP\5\27\f\2NP\5\33\16\2O"+
		"M\3\2\2\2ON\3\2\2\2PR\3\2\2\2QS\5\31\r\2RQ\3\2\2\2RS\3\2\2\2S\16\3\2\2"+
		"\2TU\5\35\17\2UV\5/\30\2VW\5\31\r\2W\20\3\2\2\2XY\5\37\20\2YZ\5/\30\2"+
		"Z[\5\31\r\2[\22\3\2\2\2\\]\t\3\2\2]\24\3\2\2\2^_\t\4\2\2_\26\3\2\2\2`"+
		"b\5!\21\2ac\5#\22\2ba\3\2\2\2bc\3\2\2\2ci\3\2\2\2di\5%\23\2ef\5\'\24\2"+
		"fg\5#\22\2gi\3\2\2\2h`\3\2\2\2hd\3\2\2\2he\3\2\2\2ij\3\2\2\2jk\5!\21\2"+
		"k\30\3\2\2\2ln\5!\21\2mo\5/\30\2nm\3\2\2\2no\3\2\2\2ou\3\2\2\2pq\5\35"+
		"\17\2qr\5/\30\2ru\3\2\2\2su\5)\25\2tl\3\2\2\2tp\3\2\2\2ts\3\2\2\2ux\3"+
		"\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xv\3\2\2\2y|\5)\25\2z|\5\7\4\2{y\3"+
		"\2\2\2{z\3\2\2\2|\32\3\2\2\2}\u0081\5!\21\2~\u0081\5%\23\2\177\u0081\5"+
		"\'\24\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0083\3"+
		"\2\2\2\u0082\u0084\5#\22\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5%\23\2\u0086\u0096\3\2\2\2\u0087\u008a\5!"+
		"\21\2\u0088\u008a\5%\23\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u008d\5#\22\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0092\3\2\2\2\u008e\u008f\5\'\24\2\u008f\u0090\5#\22\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\5\'\24\2\u0094\u0096\3\2\2\2\u0095\u0080\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0096\34\3\2\2\2\u0097\u009a\5+\26\2\u0098\u009a\5-\27"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\36\3\2\2\2\u009b\u009d"+
		"\5!\21\2\u009c\u009e\5#\22\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\5\35\17\2\u00a0\u00a9\3\2\2\2\u00a1\u00a2\5"+
		")\25\2\u00a2\u00a3\5#\22\2\u00a3\u00a4\5+\26\2\u00a4\u00a9\3\2\2\2\u00a5"+
		"\u00a6\5)\25\2\u00a6\u00a7\5-\27\2\u00a7\u00a9\3\2\2\2\u00a8\u009b\3\2"+
		"\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9 \3\2\2\2\u00aa\u00ab"+
		"\5\23\n\2\u00ab\u00ac\5\25\13\2\u00ac\u00ad\5\23\n\2\u00ad\"\3\2\2\2\u00ae"+
		"\u00af\t\5\2\2\u00af$\3\2\2\2\u00b0\u00b1\5\23\n\2\u00b1\u00b2\5\23\n"+
		"\2\u00b2\u00b3\5\25\13\2\u00b3&\3\2\2\2\u00b4\u00b5\5\23\n\2\u00b5\u00b7"+
		"\5\25\13\2\u00b6\u00b8\7)\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\25\13\2\u00ba(\3\2\2\2\u00bb\u00be"+
		"\5\'\24\2\u00bc\u00be\5%\23\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be*\3\2\2\2\u00bf\u00c0\5\23\n\2\u00c0\u00c1\5\25\13\2\u00c1\u00c2"+
		"\5\23\n\2\u00c2\u00c3\5\23\n\2\u00c3,\3\2\2\2\u00c4\u00c5\5\23\n\2\u00c5"+
		"\u00c6\5\23\n\2\u00c6\u00c7\5\25\13\2\u00c7\u00c8\5\23\n\2\u00c8.\3\2"+
		"\2\2\u00c9\u00ca\7{\2\2\u00ca\60\3\2\2\2\30\2>GORbhntv{\u0080\u0083\u0089"+
		"\u008c\u0091\u0095\u0099\u009d\u00a8\u00b7\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}