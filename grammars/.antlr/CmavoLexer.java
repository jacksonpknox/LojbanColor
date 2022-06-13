// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\Cmavo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, A=2, BAHE=3, BEHO=4, BEI=5, BE=6, BIHE=7, BIHI=8, BOI=9, BO=10, 
		BU=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PA", "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", 
			"BU"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'be'o'", "'bei'", "'be'", "'bi'e'", null, "'boi'", 
			"'bo'", "'bu'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", 
			"BO", "BU"
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


	public CmavoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmavo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rd\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tY\n\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\3\2\3\7\2ccggkkqqww\2o\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3-\3\2\2\2\5/\3\2\2"+
		"\2\79\3\2\2\2\t;\3\2\2\2\13@\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21X\3\2\2"+
		"\2\23Z\3\2\2\2\25^\3\2\2\2\27a\3\2\2\2\31\32\7r\2\2\32.\7c\2\2\33\34\7"+
		"t\2\2\34.\7g\2\2\35\36\7e\2\2\36.\7k\2\2\37 \7x\2\2 .\7q\2\2!\"\7o\2\2"+
		"\".\7w\2\2#$\7z\2\2$.\7c\2\2%&\7|\2\2&.\7g\2\2\'(\7d\2\2(.\7k\2\2)*\7"+
		"u\2\2*.\7q\2\2+,\7p\2\2,.\7q\2\2-\31\3\2\2\2-\33\3\2\2\2-\35\3\2\2\2-"+
		"\37\3\2\2\2-!\3\2\2\2-#\3\2\2\2-%\3\2\2\2-\'\3\2\2\2-)\3\2\2\2-+\3\2\2"+
		"\2.\4\3\2\2\2/\60\t\2\2\2\60\6\3\2\2\2\61\62\7d\2\2\62\63\7c\2\2\63\64"+
		"\7)\2\2\64:\7g\2\2\65\66\7|\2\2\66\67\7c\2\2\678\7)\2\28:\7g\2\29\61\3"+
		"\2\2\29\65\3\2\2\2:\b\3\2\2\2;<\7d\2\2<=\7g\2\2=>\7)\2\2>?\7q\2\2?\n\3"+
		"\2\2\2@A\7d\2\2AB\7g\2\2BC\7k\2\2C\f\3\2\2\2DE\7d\2\2EF\7g\2\2F\16\3\2"+
		"\2\2GH\7d\2\2HI\7k\2\2IJ\7)\2\2JK\7g\2\2K\20\3\2\2\2LM\7d\2\2MN\7k\2\2"+
		"NO\7)\2\2OY\7k\2\2PQ\7d\2\2QR\7k\2\2RS\7)\2\2SY\7q\2\2TU\7o\2\2UV\7k\2"+
		"\2VW\7)\2\2WY\7k\2\2XL\3\2\2\2XP\3\2\2\2XT\3\2\2\2Y\22\3\2\2\2Z[\7d\2"+
		"\2[\\\7q\2\2\\]\7k\2\2]\24\3\2\2\2^_\7d\2\2_`\7q\2\2`\26\3\2\2\2ab\7d"+
		"\2\2bc\7w\2\2c\30\3\2\2\2\6\2-9X\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}