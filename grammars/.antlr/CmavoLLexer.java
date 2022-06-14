// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LAHE=1, LA=2, LAU=3, LEHU=4, LE=5, LIHU=6, LI=7, LOHO=8, LOHU=9, LUHU=10, 
		LU=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LAHE", "LA", "LAU", "LEHU", "LE", "LIHU", "LI", "LOHO", "LOHU", "LUHU", 
			"LU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'la'", null, "'le'u'", null, "'li'u'", "'li'", "'lo'o'", 
			"'lo'u'", "'lu'u'", "'lu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LAHE", "LA", "LAU", "LEHU", "LE", "LIHU", "LI", "LOHO", "LOHU", 
			"LUHU", "LU"
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


	public CmavoLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rn\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\66\n\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\3\2\2\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13R\3\2\2\2\r"+
		"T\3\2\2\2\17Y\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27k\3\2\2\2"+
		"\31\32\7n\2\2\32\33\7c\2\2\33\34\7)\2\2\34\66\7g\2\2\35\36\7n\2\2\36\37"+
		"\7w\2\2\37 \7)\2\2 \66\7g\2\2!\"\7v\2\2\"#\7w\2\2#$\7)\2\2$\66\7c\2\2"+
		"%&\7n\2\2&\'\7w\2\2\'(\7)\2\2(\66\7c\2\2)*\7n\2\2*+\7w\2\2+,\7)\2\2,\66"+
		"\7k\2\2-.\7n\2\2./\7w\2\2/\60\7)\2\2\60\66\7q\2\2\61\62\7x\2\2\62\63\7"+
		"w\2\2\63\64\7)\2\2\64\66\7k\2\2\65\31\3\2\2\2\65\35\3\2\2\2\65!\3\2\2"+
		"\2\65%\3\2\2\2\65)\3\2\2\2\65-\3\2\2\2\65\61\3\2\2\2\66\4\3\2\2\2\678"+
		"\7n\2\289\7c\2\29\6\3\2\2\2:;\7v\2\2;<\7c\2\2<H\7w\2\2=>\7|\2\2>?\7c\2"+
		"\2?H\7k\2\2@A\7e\2\2AB\7g\2\2BC\7)\2\2CH\7c\2\2DE\7n\2\2EF\7c\2\2FH\7"+
		"w\2\2G:\3\2\2\2G=\3\2\2\2G@\3\2\2\2GD\3\2\2\2H\b\3\2\2\2IJ\7n\2\2JK\7"+
		"g\2\2KL\7)\2\2LM\7w\2\2M\n\3\2\2\2NO\7n\2\2OS\7g\2\2PQ\7n\2\2QS\7q\2\2"+
		"RN\3\2\2\2RP\3\2\2\2S\f\3\2\2\2TU\7n\2\2UV\7k\2\2VW\7)\2\2WX\7w\2\2X\16"+
		"\3\2\2\2YZ\7n\2\2Z[\7k\2\2[\20\3\2\2\2\\]\7n\2\2]^\7q\2\2^_\7)\2\2_`\7"+
		"q\2\2`\22\3\2\2\2ab\7n\2\2bc\7q\2\2cd\7)\2\2de\7w\2\2e\24\3\2\2\2fg\7"+
		"n\2\2gh\7w\2\2hi\7)\2\2ij\7w\2\2j\26\3\2\2\2kl\7n\2\2lm\7w\2\2m\30\3\2"+
		"\2\2\6\2\65GR\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}