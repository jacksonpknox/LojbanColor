// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PEHE=2, PEHO=3, PU=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PA", "PEHE", "PEHO", "PU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pe'e'", "'pe'o'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PEHE", "PEHO", "PU"
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


	public CmavoPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\u00b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u009e\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b0\n"+
		"\5\2\2\6\3\3\5\4\7\5\t\6\3\2\2\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a4\3\2\2\2\t\u00af"+
		"\3\2\2\2\13\f\7r\2\2\f\u009e\7c\2\2\r\16\7t\2\2\16\u009e\7g\2\2\17\20"+
		"\7e\2\2\20\u009e\7k\2\2\21\22\7x\2\2\22\u009e\7q\2\2\23\24\7o\2\2\24\u009e"+
		"\7w\2\2\25\26\7z\2\2\26\u009e\7c\2\2\27\30\7|\2\2\30\u009e\7g\2\2\31\32"+
		"\7d\2\2\32\u009e\7k\2\2\33\34\7u\2\2\34\u009e\7q\2\2\35\36\7p\2\2\36\u009e"+
		"\7q\2\2\37 \7o\2\2 !\7c\2\2!\"\7)\2\2\"\u009e\7w\2\2#$\7p\2\2$%\7k\2\2"+
		"%&\7)\2\2&\u009e\7w\2\2\'(\7r\2\2(\u009e\7k\2\2)*\7h\2\2*+\7k\2\2+,\7"+
		")\2\2,\u009e\7w\2\2-.\7t\2\2./\7c\2\2/\60\7)\2\2\60\u009e\7g\2\2\61\62"+
		"\7e\2\2\62\63\7g\2\2\63\64\7)\2\2\64\u009e\7k\2\2\65\66\7m\2\2\66\67\7"+
		"k\2\2\678\7)\2\28\u009e\7q\2\29:\7e\2\2:;\7k\2\2;<\7)\2\2<\u009e\7k\2"+
		"\2=>\7m\2\2>?\7c\2\2?@\7)\2\2@\u009e\7q\2\2AB\7r\2\2BC\7c\2\2C\u009e\7"+
		"k\2\2DE\7v\2\2EF\7g\2\2FG\7)\2\2G\u009e\7q\2\2HI\7t\2\2I\u009e\7q\2\2"+
		"JK\7u\2\2KL\7q\2\2LM\7)\2\2M\u009e\7c\2\2NO\7u\2\2OP\7q\2\2PQ\7)\2\2Q"+
		"\u009e\7g\2\2RS\7u\2\2ST\7q\2\2TU\7)\2\2U\u009e\7k\2\2VW\7u\2\2WX\7q\2"+
		"\2XY\7)\2\2Y\u009e\7w\2\2Z[\7p\2\2[\\\7q\2\2\\]\7)\2\2]\u009e\7q\2\2^"+
		"_\7f\2\2_`\7c\2\2`a\7)\2\2a\u009e\7c\2\2bc\7t\2\2cd\7c\2\2d\u009e\7w\2"+
		"\2ef\7f\2\2fg\7w\2\2gh\7)\2\2h\u009e\7g\2\2ij\7o\2\2jk\7q\2\2kl\7)\2\2"+
		"l\u009e\7c\2\2mn\7f\2\2no\7c\2\2o\u009e\7w\2\2pq\7h\2\2qr\7g\2\2r\u009e"+
		"\7k\2\2st\7i\2\2tu\7c\2\2u\u009e\7k\2\2vw\7l\2\2wx\7c\2\2x\u009e\7w\2"+
		"\2yz\7t\2\2z{\7g\2\2{\u009e\7k\2\2|}\7x\2\2}~\7c\2\2~\u009e\7k\2\2\177"+
		"\u0080\7r\2\2\u0080\u0081\7k\2\2\u0081\u0082\7)\2\2\u0082\u009e\7g\2\2"+
		"\u0083\u0084\7z\2\2\u0084\u009e\7q\2\2\u0085\u0086\7v\2\2\u0086\u0087"+
		"\7w\2\2\u0087\u0088\7)\2\2\u0088\u009e\7q\2\2\u0089\u008a\7l\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7)\2\2\u008c\u009e\7k\2\2\u008d\u008e\7u\2\2"+
		"\u008e\u008f\7w\2\2\u008f\u0090\7)\2\2\u0090\u009e\7g\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7w\2\2\u0093\u0094\7)\2\2\u0094\u009e\7q\2\2\u0095"+
		"\u0096\7o\2\2\u0096\u0097\7g\2\2\u0097\u0098\7)\2\2\u0098\u009e\7k\2\2"+
		"\u0099\u009a\7|\2\2\u009a\u009b\7c\2\2\u009b\u009c\7)\2\2\u009c\u009e"+
		"\7w\2\2\u009d\13\3\2\2\2\u009d\r\3\2\2\2\u009d\17\3\2\2\2\u009d\21\3\2"+
		"\2\2\u009d\23\3\2\2\2\u009d\25\3\2\2\2\u009d\27\3\2\2\2\u009d\31\3\2\2"+
		"\2\u009d\33\3\2\2\2\u009d\35\3\2\2\2\u009d\37\3\2\2\2\u009d#\3\2\2\2\u009d"+
		"\'\3\2\2\2\u009d)\3\2\2\2\u009d-\3\2\2\2\u009d\61\3\2\2\2\u009d\65\3\2"+
		"\2\2\u009d9\3\2\2\2\u009d=\3\2\2\2\u009dA\3\2\2\2\u009dD\3\2\2\2\u009d"+
		"H\3\2\2\2\u009dJ\3\2\2\2\u009dN\3\2\2\2\u009dR\3\2\2\2\u009dV\3\2\2\2"+
		"\u009dZ\3\2\2\2\u009d^\3\2\2\2\u009db\3\2\2\2\u009de\3\2\2\2\u009di\3"+
		"\2\2\2\u009dm\3\2\2\2\u009dp\3\2\2\2\u009ds\3\2\2\2\u009dv\3\2\2\2\u009d"+
		"y\3\2\2\2\u009d|\3\2\2\2\u009d\177\3\2\2\2\u009d\u0083\3\2\2\2\u009d\u0085"+
		"\3\2\2\2\u009d\u0089\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0091\3\2\2\2\u009d"+
		"\u0095\3\2\2\2\u009d\u0099\3\2\2\2\u009e\4\3\2\2\2\u009f\u00a0\7r\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\7g\2\2\u00a3\6\3\2"+
		"\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8"+
		"\7q\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00b0\7w\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00b0\7c\2\2\u00ad\u00ae\7d\2\2\u00ae\u00b0\7c\2\2\u00af"+
		"\u00a9\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\n\3\2\2\2"+
		"\5\2\u009d\u00af\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}