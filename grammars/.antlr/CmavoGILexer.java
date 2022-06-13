// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoGI.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoGILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GA=1, GAHO=2, GEHU=3, GI=4, GIHA=5, GOHA=6, GOI=7, GUHA=8, I=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GA", "GAHO", "GEHU", "GI", "GIHA", "GOHA", "GOI", "GUHA", "I"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ge'u'", "'gi'", null, null, null, null, "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GA", "GAHO", "GEHU", "GI", "GIHA", "GOHA", "GOI", "GUHA", "I"
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


	public CmavoGILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoGI.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0087\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n"+
		"\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\2\2\u00b6\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\35\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2"+
		"\t.\3\2\2\2\13A\3\2\2\2\rr\3\2\2\2\17\u0086\3\2\2\2\21\u0098\3\2\2\2\23"+
		"\u009a\3\2\2\2\25\26\7i\2\2\26\36\7c\2\2\27\30\7i\2\2\30\36\7g\2\2\31"+
		"\32\7i\2\2\32\36\7q\2\2\33\34\7i\2\2\34\36\7w\2\2\35\25\3\2\2\2\35\27"+
		"\3\2\2\2\35\31\3\2\2\2\35\33\3\2\2\2\36\4\3\2\2\2\37 \7i\2\2 !\7c\2\2"+
		"!\"\7)\2\2\"(\7q\2\2#$\7m\2\2$%\7g\2\2%&\7)\2\2&(\7k\2\2\'\37\3\2\2\2"+
		"\'#\3\2\2\2(\6\3\2\2\2)*\7i\2\2*+\7g\2\2+,\7)\2\2,-\7w\2\2-\b\3\2\2\2"+
		"./\7i\2\2/\60\7k\2\2\60\n\3\2\2\2\61\62\7i\2\2\62\63\7k\2\2\63\64\7)\2"+
		"\2\64B\7c\2\2\65\66\7i\2\2\66\67\7k\2\2\678\7)\2\28B\7g\2\29:\7i\2\2:"+
		";\7k\2\2;<\7)\2\2<B\7q\2\2=>\7i\2\2>?\7k\2\2?@\7)\2\2@B\7w\2\2A\61\3\2"+
		"\2\2A\65\3\2\2\2A9\3\2\2\2A=\3\2\2\2B\f\3\2\2\2CD\7i\2\2DE\7q\2\2EF\7"+
		")\2\2Fs\7k\2\2GH\7i\2\2HI\7q\2\2IJ\7)\2\2Js\7c\2\2KL\7i\2\2LM\7q\2\2M"+
		"N\7)\2\2Ns\7w\2\2OP\7i\2\2PQ\7q\2\2QR\7)\2\2Rs\7g\2\2ST\7i\2\2TU\7q\2"+
		"\2UV\7)\2\2Vs\7q\2\2WX\7p\2\2XY\7g\2\2Ys\7k\2\2Z[\7p\2\2[\\\7q\2\2\\]"+
		"\7)\2\2]s\7c\2\2^_\7d\2\2_`\7w\2\2`a\7)\2\2as\7c\2\2bc\7d\2\2cd\7w\2\2"+
		"de\7)\2\2es\7g\2\2fg\7d\2\2gh\7w\2\2hi\7)\2\2is\7k\2\2jk\7e\2\2kl\7q\2"+
		"\2lm\7)\2\2ms\7g\2\2no\7o\2\2os\7q\2\2pq\7f\2\2qs\7w\2\2rC\3\2\2\2rG\3"+
		"\2\2\2rK\3\2\2\2rO\3\2\2\2rS\3\2\2\2rW\3\2\2\2rZ\3\2\2\2r^\3\2\2\2rb\3"+
		"\2\2\2rf\3\2\2\2rj\3\2\2\2rn\3\2\2\2rp\3\2\2\2s\16\3\2\2\2tu\7r\2\2u\u0087"+
		"\7g\2\2vw\7r\2\2w\u0087\7q\2\2xy\7r\2\2yz\7q\2\2z{\7)\2\2{\u0087\7g\2"+
		"\2|}\7r\2\2}~\7q\2\2~\177\7)\2\2\177\u0087\7w\2\2\u0080\u0081\7p\2\2\u0081"+
		"\u0087\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7q\2\2\u0084\u0085\7)\2\2"+
		"\u0085\u0087\7w\2\2\u0086t\3\2\2\2\u0086v\3\2\2\2\u0086x\3\2\2\2\u0086"+
		"|\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0087\20\3\2\2\2\u0088"+
		"\u0089\7i\2\2\u0089\u008a\7w\2\2\u008a\u008b\7)\2\2\u008b\u0099\7c\2\2"+
		"\u008c\u008d\7i\2\2\u008d\u008e\7w\2\2\u008e\u008f\7)\2\2\u008f\u0099"+
		"\7g\2\2\u0090\u0091\7i\2\2\u0091\u0092\7w\2\2\u0092\u0093\7)\2\2\u0093"+
		"\u0099\7q\2\2\u0094\u0095\7i\2\2\u0095\u0096\7w\2\2\u0096\u0097\7)\2\2"+
		"\u0097\u0099\7w\2\2\u0098\u0088\3\2\2\2\u0098\u008c\3\2\2\2\u0098\u0090"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0099\22\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\24\3\2\2\2\t\2\35\'Ar\u0086\u0098\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}