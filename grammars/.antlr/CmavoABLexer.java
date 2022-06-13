// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoAB.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoABLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, BAHE=2, BEHO=3, BEI=4, BE=5, BIHE=6, BIHI=7, BOI=8, BO=9, BU=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", "BU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'be'o'", "'bei'", "'be'", "'bi'e'", null, "'boi'", 
			"'bo'", "'bu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", 
			"BU"
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


	public CmavoABLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoAB.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2"+
		"\3\7\2ccggkkqqww\2N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\3\27\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t(\3\2\2\2\13,\3\2\2\2\r/\3"+
		"\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23F\3\2\2\2\25I\3\2\2\2\27\30\t\2\2\2\30"+
		"\4\3\2\2\2\31\32\7d\2\2\32\33\7c\2\2\33\34\7)\2\2\34\"\7g\2\2\35\36\7"+
		"|\2\2\36\37\7c\2\2\37 \7)\2\2 \"\7g\2\2!\31\3\2\2\2!\35\3\2\2\2\"\6\3"+
		"\2\2\2#$\7d\2\2$%\7g\2\2%&\7)\2\2&\'\7q\2\2\'\b\3\2\2\2()\7d\2\2)*\7g"+
		"\2\2*+\7k\2\2+\n\3\2\2\2,-\7d\2\2-.\7g\2\2.\f\3\2\2\2/\60\7d\2\2\60\61"+
		"\7k\2\2\61\62\7)\2\2\62\63\7g\2\2\63\16\3\2\2\2\64\65\7d\2\2\65\66\7k"+
		"\2\2\66\67\7)\2\2\67A\7k\2\289\7d\2\29:\7k\2\2:;\7)\2\2;A\7q\2\2<=\7o"+
		"\2\2=>\7k\2\2>?\7)\2\2?A\7k\2\2@\64\3\2\2\2@8\3\2\2\2@<\3\2\2\2A\20\3"+
		"\2\2\2BC\7d\2\2CD\7q\2\2DE\7k\2\2E\22\3\2\2\2FG\7d\2\2GH\7q\2\2H\24\3"+
		"\2\2\2IJ\7d\2\2JK\7w\2\2K\26\3\2\2\2\5\2!@\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}