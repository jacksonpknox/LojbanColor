// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\BAI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BAILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BAI=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BAI"
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
			null, "BAI"
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


	public BAILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BAI.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\3\u00fb\b\1\4\2\t"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\u00fa\n\2\2\2\3\3\3\3\2\2\2\u0139\2\3\3\2\2\2\3\u00f9\3\2\2\2\5\6\7"+
		"d\2\2\6\7\7c\2\2\7\b\7)\2\2\b\u00fa\7k\2\2\t\n\7d\2\2\n\13\7c\2\2\13\u00fa"+
		"\7k\2\2\f\r\7d\2\2\r\16\7c\2\2\16\u00fa\7w\2\2\17\20\7d\2\2\20\21\7g\2"+
		"\2\21\22\7)\2\2\22\u00fa\7k\2\2\23\24\7e\2\2\24\25\7c\2\2\25\26\7)\2\2"+
		"\26\u00fa\7k\2\2\27\30\7e\2\2\30\31\7c\2\2\31\u00fa\7w\2\2\32\33\7e\2"+
		"\2\33\34\7k\2\2\34\35\7)\2\2\35\u00fa\7g\2\2\36\37\7e\2\2\37 \7k\2\2 "+
		"!\7)\2\2!\u00fa\7q\2\2\"#\7e\2\2#$\7k\2\2$%\7)\2\2%\u00fa\7w\2\2&\'\7"+
		"e\2\2\'(\7w\2\2()\7)\2\2)\u00fa\7w\2\2*+\7f\2\2+,\7g\2\2,-\7)\2\2-\u00fa"+
		"\7k\2\2./\7f\2\2/\60\7k\2\2\60\61\7)\2\2\61\u00fa\7q\2\2\62\63\7f\2\2"+
		"\63\64\7q\2\2\64\65\7)\2\2\65\u00fa\7g\2\2\66\67\7f\2\2\678\7w\2\289\7"+
		")\2\29\u00fa\7k\2\2:;\7f\2\2;<\7w\2\2<=\7)\2\2=\u00fa\7q\2\2>?\7h\2\2"+
		"?@\7c\2\2@A\7)\2\2A\u00fa\7g\2\2BC\7h\2\2CD\7c\2\2D\u00fa\7w\2\2EF\7h"+
		"\2\2FG\7k\2\2GH\7)\2\2H\u00fa\7g\2\2IJ\7i\2\2JK\7c\2\2KL\7)\2\2L\u00fa"+
		"\7c\2\2MN\7i\2\2NO\7c\2\2O\u00fa\7w\2\2PQ\7l\2\2QR\7c\2\2RS\7)\2\2S\u00fa"+
		"\7g\2\2TU\7l\2\2UV\7c\2\2VW\7)\2\2W\u00fa\7k\2\2XY\7l\2\2YZ\7k\2\2Z[\7"+
		")\2\2[\u00fa\7g\2\2\\]\7l\2\2]^\7k\2\2^_\7)\2\2_\u00fa\7q\2\2`a\7l\2\2"+
		"ab\7k\2\2bc\7)\2\2c\u00fa\7w\2\2de\7m\2\2ef\7c\2\2fg\7)\2\2g\u00fa\7c"+
		"\2\2hi\7m\2\2ij\7c\2\2jk\7)\2\2k\u00fa\7k\2\2lm\7m\2\2mn\7c\2\2n\u00fa"+
		"\7k\2\2op\7m\2\2pq\7k\2\2qr\7)\2\2r\u00fa\7k\2\2st\7m\2\2tu\7k\2\2uv\7"+
		")\2\2v\u00fa\7w\2\2wx\7m\2\2xy\7q\2\2y\u00fa\7k\2\2z{\7m\2\2{|\7w\2\2"+
		"|}\7)\2\2}\u00fa\7w\2\2~\177\7n\2\2\177\u0080\7c\2\2\u0080\u0081\7)\2"+
		"\2\u0081\u00fa\7w\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7)\2\2\u0085\u00fa\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7)\2\2\u0089\u00fa\7g\2\2\u008a\u008b\7o\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7)\2\2\u008d\u00fa\7g\2\2\u008e\u008f\7o\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7)\2\2\u0091\u00fa\7k\2\2\u0092\u0093\7o\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u00fa\7w\2\2\u0095\u0096\7o\2\2\u0096\u0097\7g\2\2"+
		"\u0097\u0098\7)\2\2\u0098\u00fa\7c\2\2\u0099\u009a\7o\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7)\2\2\u009c\u00fa\7g\2\2\u009d\u009e\7o\2\2\u009e"+
		"\u009f\7w\2\2\u009f\u00a0\7)\2\2\u00a0\u00fa\7k\2\2\u00a1\u00a2\7o\2\2"+
		"\u00a2\u00a3\7w\2\2\u00a3\u00a4\7)\2\2\u00a4\u00fa\7w\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7)\2\2\u00a8\u00fa\7k\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7)\2\2\u00ac\u00fa\7c\2\2"+
		"\u00ad\u00ae\7r\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7)\2\2\u00b0\u00fa"+
		"\7w\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7)\2\2\u00b4"+
		"\u00fa\7q\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7)\2\2"+
		"\u00b8\u00fa\7k\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc"+
		"\7)\2\2\u00bc\u00fa\7c\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7w\2\2\u00bf"+
		"\u00c0\7)\2\2\u00c0\u00fa\7g\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7c\2\2"+
		"\u00c3\u00c4\7)\2\2\u00c4\u00fa\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7)\2\2\u00c8\u00fa\7k\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00fa\7k\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7)\2\2\u00cf\u00fa\7c\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00fa\7w\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7)\2\2\u00d6\u00fa\7w\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7)\2\2\u00da\u00fa\7k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00fa\7k\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7)\2\2\u00e1\u00fa\7k\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7k\2\2"+
		"\u00e4\u00e5\7)\2\2\u00e5\u00fa\7w\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8"+
		"\7w\2\2\u00e8\u00e9\7)\2\2\u00e9\u00fa\7k\2\2\u00ea\u00eb\7x\2\2\u00eb"+
		"\u00ec\7c\2\2\u00ec\u00ed\7)\2\2\u00ed\u00fa\7q\2\2\u00ee\u00ef\7x\2\2"+
		"\u00ef\u00f0\7c\2\2\u00f0\u00f1\7)\2\2\u00f1\u00fa\7w\2\2\u00f2\u00f3"+
		"\7|\2\2\u00f3\u00f4\7c\2\2\u00f4\u00fa\7w\2\2\u00f5\u00f6\7|\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7)\2\2\u00f8\u00fa\7g\2\2\u00f9\5\3\2\2\2\u00f9"+
		"\t\3\2\2\2\u00f9\f\3\2\2\2\u00f9\17\3\2\2\2\u00f9\23\3\2\2\2\u00f9\27"+
		"\3\2\2\2\u00f9\32\3\2\2\2\u00f9\36\3\2\2\2\u00f9\"\3\2\2\2\u00f9&\3\2"+
		"\2\2\u00f9*\3\2\2\2\u00f9.\3\2\2\2\u00f9\62\3\2\2\2\u00f9\66\3\2\2\2\u00f9"+
		":\3\2\2\2\u00f9>\3\2\2\2\u00f9B\3\2\2\2\u00f9E\3\2\2\2\u00f9I\3\2\2\2"+
		"\u00f9M\3\2\2\2\u00f9P\3\2\2\2\u00f9T\3\2\2\2\u00f9X\3\2\2\2\u00f9\\\3"+
		"\2\2\2\u00f9`\3\2\2\2\u00f9d\3\2\2\2\u00f9h\3\2\2\2\u00f9l\3\2\2\2\u00f9"+
		"o\3\2\2\2\u00f9s\3\2\2\2\u00f9w\3\2\2\2\u00f9z\3\2\2\2\u00f9~\3\2\2\2"+
		"\u00f9\u0082\3\2\2\2\u00f9\u0086\3\2\2\2\u00f9\u008a\3\2\2\2\u00f9\u008e"+
		"\3\2\2\2\u00f9\u0092\3\2\2\2\u00f9\u0095\3\2\2\2\u00f9\u0099\3\2\2\2\u00f9"+
		"\u009d\3\2\2\2\u00f9\u00a1\3\2\2\2\u00f9\u00a5\3\2\2\2\u00f9\u00a9\3\2"+
		"\2\2\u00f9\u00ad\3\2\2\2\u00f9\u00b1\3\2\2\2\u00f9\u00b5\3\2\2\2\u00f9"+
		"\u00b9\3\2\2\2\u00f9\u00bd\3\2\2\2\u00f9\u00c1\3\2\2\2\u00f9\u00c5\3\2"+
		"\2\2\u00f9\u00c9\3\2\2\2\u00f9\u00cc\3\2\2\2\u00f9\u00d0\3\2\2\2\u00f9"+
		"\u00d3\3\2\2\2\u00f9\u00d7\3\2\2\2\u00f9\u00db\3\2\2\2\u00f9\u00de\3\2"+
		"\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e6\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9"+
		"\u00ee\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\4\3\2\2\2"+
		"\4\2\u00f9\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}