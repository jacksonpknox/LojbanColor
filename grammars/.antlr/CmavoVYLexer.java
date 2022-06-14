// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoVY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoVYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VA=1, VAU=2, VEHA=3, VEHO=4, VEI=5, VIHA=6, VUHO=7, VUHU=8, XI=9, Y=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VA", "VAU", "VEHA", "VEHO", "VEI", "VIHA", "VUHO", "VUHU", "XI", "Y"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'vau'", null, "'ve'o'", "'vei'", null, "'vu'o'", null, "'xi'", 
			"'.y.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VA", "VAU", "VEHA", "VEHO", "VEI", "VIHA", "VUHO", "VUHU", "XI", 
			"Y"
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


	public CmavoVYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoVY.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u0089\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0081\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\2\2\u009a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7"+
		"\63\3\2\2\2\t\65\3\2\2\2\13:\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21\u0080\3"+
		"\2\2\2\23\u0082\3\2\2\2\25\u0085\3\2\2\2\27\30\7x\2\2\30\36\7k\2\2\31"+
		"\32\7x\2\2\32\36\7c\2\2\33\34\7x\2\2\34\36\7w\2\2\35\27\3\2\2\2\35\31"+
		"\3\2\2\2\35\33\3\2\2\2\36\4\3\2\2\2\37 \7x\2\2 !\7c\2\2!\"\7w\2\2\"\6"+
		"\3\2\2\2#$\7x\2\2$%\7g\2\2%&\7)\2\2&\64\7k\2\2\'(\7x\2\2()\7g\2\2)*\7"+
		")\2\2*\64\7c\2\2+,\7x\2\2,-\7g\2\2-.\7)\2\2.\64\7w\2\2/\60\7x\2\2\60\61"+
		"\7g\2\2\61\62\7)\2\2\62\64\7g\2\2\63#\3\2\2\2\63\'\3\2\2\2\63+\3\2\2\2"+
		"\63/\3\2\2\2\64\b\3\2\2\2\65\66\7x\2\2\66\67\7g\2\2\678\7)\2\289\7q\2"+
		"\29\n\3\2\2\2:;\7x\2\2;<\7g\2\2<=\7k\2\2=\f\3\2\2\2>?\7x\2\2?@\7k\2\2"+
		"@A\7)\2\2AO\7k\2\2BC\7x\2\2CD\7k\2\2DE\7)\2\2EO\7c\2\2FG\7x\2\2GH\7k\2"+
		"\2HI\7)\2\2IO\7w\2\2JK\7x\2\2KL\7k\2\2LM\7)\2\2MO\7g\2\2N>\3\2\2\2NB\3"+
		"\2\2\2NF\3\2\2\2NJ\3\2\2\2O\16\3\2\2\2PQ\7x\2\2QR\7w\2\2RS\7)\2\2ST\7"+
		"q\2\2T\20\3\2\2\2UV\7u\2\2VW\7w\2\2WX\7)\2\2X\u0081\7k\2\2YZ\7x\2\2Z["+
		"\7w\2\2[\\\7)\2\2\\\u0081\7w\2\2]^\7r\2\2^_\7k\2\2_`\7)\2\2`\u0081\7k"+
		"\2\2ab\7v\2\2bc\7g\2\2cd\7)\2\2d\u0081\7c\2\2ef\7x\2\2fg\7c\2\2gh\7)\2"+
		"\2h\u0081\7c\2\2ij\7l\2\2jk\7w\2\2kl\7)\2\2l\u0081\7w\2\2mn\7i\2\2no\7"+
		"g\2\2op\7)\2\2p\u0081\7c\2\2qr\7i\2\2rs\7g\2\2s\u0081\7k\2\2tu\7r\2\2"+
		"uv\7k\2\2vw\7)\2\2w\u0081\7c\2\2xy\7u\2\2yz\7c\2\2z{\7)\2\2{\u0081\7k"+
		"\2\2|}\7h\2\2}~\7g\2\2~\177\7)\2\2\177\u0081\7c\2\2\u0080U\3\2\2\2\u0080"+
		"Y\3\2\2\2\u0080]\3\2\2\2\u0080a\3\2\2\2\u0080e\3\2\2\2\u0080i\3\2\2\2"+
		"\u0080m\3\2\2\2\u0080q\3\2\2\2\u0080t\3\2\2\2\u0080x\3\2\2\2\u0080|\3"+
		"\2\2\2\u0081\22\3\2\2\2\u0082\u0083\7z\2\2\u0083\u0084\7k\2\2\u0084\24"+
		"\3\2\2\2\u0085\u0086\7\60\2\2\u0086\u0087\7{\2\2\u0087\u0088\7\60\2\2"+
		"\u0088\26\3\2\2\2\7\2\35\63N\u0080\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}