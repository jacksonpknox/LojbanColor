// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoF.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FA=1, FAHA=2, FAHO=3, FEHE=4, FEHU=5, FIHO=6, FOI=7, FUHA=8, FUHE=9, FUHO=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FA", "FAHA", "FAHO", "FEHE", "FEHU", "FIHO", "FOI", "FUHA", "FUHE", 
			"FUHO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'fa'o'", "'fe'e'", "'fe'u'", "'fi'o'", "'foi'", "'fu'a'", 
			"'fu'e'", "'fu'o'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FA", "FAHA", "FAHO", "FEHE", "FEHU", "FIHO", "FOI", "FUHA", "FUHE", 
			"FUHO"
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


	public CmavoFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoF.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3{\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3"+
		"\2\2\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3"+
		"(\3\2\2\2\5z\3\2\2\2\7|\3\2\2\2\t\u0081\3\2\2\2\13\u0086\3\2\2\2\r\u008b"+
		"\3\2\2\2\17\u0090\3\2\2\2\21\u0094\3\2\2\2\23\u0099\3\2\2\2\25\u009e\3"+
		"\2\2\2\27\30\7h\2\2\30)\7c\2\2\31\32\7h\2\2\32)\7g\2\2\33\34\7h\2\2\34"+
		")\7k\2\2\35\36\7h\2\2\36)\7q\2\2\37 \7h\2\2 )\7w\2\2!\"\7h\2\2\"#\7k\2"+
		"\2#$\7)\2\2$)\7c\2\2%&\7h\2\2&\'\7c\2\2\')\7k\2\2(\27\3\2\2\2(\31\3\2"+
		"\2\2(\33\3\2\2\2(\35\3\2\2\2(\37\3\2\2\2(!\3\2\2\2(%\3\2\2\2)\4\3\2\2"+
		"\2*+\7e\2\2+,\7c\2\2,-\7)\2\2-{\7w\2\2./\7v\2\2/\60\7k\2\2\60\61\7)\2"+
		"\2\61{\7c\2\2\62\63\7|\2\2\63\64\7w\2\2\64\65\7)\2\2\65{\7c\2\2\66\67"+
		"\7i\2\2\678\7c\2\289\7)\2\29{\7w\2\2:;\7p\2\2;<\7k\2\2<=\7)\2\2={\7c\2"+
		"\2>?\7p\2\2?@\7g\2\2@A\7)\2\2A{\7k\2\2BC\7t\2\2CD\7w\2\2DE\7)\2\2E{\7"+
		"w\2\2FG\7r\2\2GH\7c\2\2HI\7)\2\2I{\7q\2\2JK\7p\2\2KL\7g\2\2LM\7)\2\2M"+
		"{\7c\2\2NO\7v\2\2OP\7g\2\2PQ\7)\2\2Q{\7g\2\2RS\7t\2\2ST\7g\2\2TU\7)\2"+
		"\2U{\7q\2\2VW\7h\2\2WX\7c\2\2XY\7)\2\2Y{\7c\2\2Z[\7v\2\2[\\\7q\2\2\\]"+
		"\7)\2\2]{\7q\2\2^_\7|\2\2_`\7q\2\2`a\7)\2\2a{\7k\2\2bc\7|\2\2cd\7g\2\2"+
		"de\7)\2\2e{\7q\2\2fg\7|\2\2gh\7q\2\2hi\7)\2\2i{\7c\2\2jk\7d\2\2kl\7g\2"+
		"\2lm\7)\2\2m{\7c\2\2no\7p\2\2op\7g\2\2pq\7)\2\2q{\7w\2\2rs\7f\2\2st\7"+
		"w\2\2tu\7)\2\2u{\7c\2\2vw\7x\2\2wx\7w\2\2xy\7)\2\2y{\7c\2\2z*\3\2\2\2"+
		"z.\3\2\2\2z\62\3\2\2\2z\66\3\2\2\2z:\3\2\2\2z>\3\2\2\2zB\3\2\2\2zF\3\2"+
		"\2\2zJ\3\2\2\2zN\3\2\2\2zR\3\2\2\2zV\3\2\2\2zZ\3\2\2\2z^\3\2\2\2zb\3\2"+
		"\2\2zf\3\2\2\2zj\3\2\2\2zn\3\2\2\2zr\3\2\2\2zv\3\2\2\2{\6\3\2\2\2|}\7"+
		"h\2\2}~\7c\2\2~\177\7)\2\2\177\u0080\7q\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7h\2\2\u0082\u0083\7g\2\2\u0083\u0084\7)\2\2\u0084\u0085\7g\2\2\u0085"+
		"\n\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7g\2\2\u0088\u0089\7)\2\2\u0089"+
		"\u008a\7w\2\2\u008a\f\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7)\2\2\u008e\u008f\7q\2\2\u008f\16\3\2\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7q\2\2\u0092\u0093\7k\2\2\u0093\20\3\2\2\2\u0094\u0095\7h\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7)\2\2\u0097\u0098\7c\2\2\u0098\22\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7w\2\2\u009b\u009c\7)\2\2\u009c\u009d\7g\2\2"+
		"\u009d\24\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7"+
		")\2\2\u00a1\u00a2\7q\2\2\u00a2\26\3\2\2\2\5\2(z\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}