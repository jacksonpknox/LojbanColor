// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\BY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BY=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BY"
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
			null, "BY"
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


	public BYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BY.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\3Z\b\1\4\2\t\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2-\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2Y\n\2\2\2\3\3"+
		"\3\3\2\2\2q\2\3\3\2\2\2\3X\3\2\2\2\5\6\7\60\2\2\6\7\7{\2\2\7\b\7)\2\2"+
		"\b\t\7{\2\2\tY\7\60\2\2\n\13\7d\2\2\13\f\7{\2\2\fY\7\60\2\2\r\16\7e\2"+
		"\2\16\17\7{\2\2\17Y\7\60\2\2\20\21\7f\2\2\21\22\7{\2\2\22Y\7\60\2\2\23"+
		"\24\7h\2\2\24\25\7{\2\2\25Y\7\60\2\2\26\27\7i\2\2\27\30\7{\2\2\30Y\7\60"+
		"\2\2\31\32\7l\2\2\32\33\7{\2\2\33Y\7\60\2\2\34\35\7m\2\2\35\36\7{\2\2"+
		"\36Y\7\60\2\2\37 \7n\2\2 !\7{\2\2!Y\7\60\2\2\"#\7o\2\2#$\7{\2\2$Y\7\60"+
		"\2\2%&\7p\2\2&\'\7{\2\2\'Y\7\60\2\2()\7r\2\2)*\7{\2\2*,\3\2\2\2+-\7\60"+
		"\2\2,+\3\2\2\2,-\3\2\2\2-Y\3\2\2\2./\7t\2\2/\60\7{\2\2\60Y\7\60\2\2\61"+
		"\62\7u\2\2\62\63\7{\2\2\63Y\7\60\2\2\64\65\7v\2\2\65\66\7{\2\2\66Y\7\60"+
		"\2\2\678\7x\2\289\7{\2\29Y\7\60\2\2:;\7z\2\2;<\7{\2\2<Y\7\60\2\2=>\7|"+
		"\2\2>?\7{\2\2?Y\7\60\2\2@A\7n\2\2AB\7q\2\2BC\7)\2\2CY\7c\2\2DE\7i\2\2"+
		"EF\7g\2\2FG\7)\2\2GY\7q\2\2HI\7l\2\2IJ\7g\2\2JK\7)\2\2KY\7q\2\2LM\7l\2"+
		"\2MN\7q\2\2NO\7)\2\2OY\7q\2\2PQ\7t\2\2QR\7w\2\2RS\7)\2\2SY\7q\2\2TU\7"+
		"p\2\2UV\7c\2\2VW\7)\2\2WY\7c\2\2X\5\3\2\2\2X\n\3\2\2\2X\r\3\2\2\2X\20"+
		"\3\2\2\2X\23\3\2\2\2X\26\3\2\2\2X\31\3\2\2\2X\34\3\2\2\2X\37\3\2\2\2X"+
		"\"\3\2\2\2X%\3\2\2\2X(\3\2\2\2X.\3\2\2\2X\61\3\2\2\2X\64\3\2\2\2X\67\3"+
		"\2\2\2X:\3\2\2\2X=\3\2\2\2X@\3\2\2\2XD\3\2\2\2XH\3\2\2\2XL\3\2\2\2XP\3"+
		"\2\2\2XT\3\2\2\2Y\4\3\2\2\2\5\2,X\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}