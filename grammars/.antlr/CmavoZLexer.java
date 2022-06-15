// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoZ.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoZLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZAHO=1, ZEHA=2, ZEI=3, ZIHE=4, ZI=5, ZOHU=6, ZOI=7, ZO=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZAHO", "ZEHA", "ZEI", "ZIHE", "ZI", "ZOHU", "ZOI", "ZO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'zei'", "'zi'e'", null, "'zo'u'", "'zoi'", "'zo'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZAHO", "ZEHA", "ZEI", "ZIHE", "ZI", "ZOHU", "ZOI", "ZO"
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


	public CmavoZLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoZ.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nh\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2<\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\3\2\2\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3;\3\2\2\2\5"+
		"I\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17a\3\2\2\2\21"+
		"e\3\2\2\2\23\24\7r\2\2\24\25\7w\2\2\25\26\7)\2\2\26<\7q\2\2\27\30\7e\2"+
		"\2\30\31\7c\2\2\31\32\7)\2\2\32<\7q\2\2\33\34\7d\2\2\34\35\7c\2\2\35\36"+
		"\7)\2\2\36<\7q\2\2\37 \7e\2\2 !\7q\2\2!\"\7)\2\2\"<\7c\2\2#$\7e\2\2$%"+
		"\7q\2\2%&\7)\2\2&<\7w\2\2\'(\7o\2\2()\7q\2\2)*\7)\2\2*<\7w\2\2+,\7|\2"+
		"\2,-\7c\2\2-.\7)\2\2.<\7q\2\2/\60\7e\2\2\60\61\7q\2\2\61\62\7)\2\2\62"+
		"<\7k\2\2\63\64\7f\2\2\64\65\7g\2\2\65\66\7)\2\2\66<\7c\2\2\678\7f\2\2"+
		"89\7k\2\29:\7)\2\2:<\7c\2\2;\23\3\2\2\2;\27\3\2\2\2;\33\3\2\2\2;\37\3"+
		"\2\2\2;#\3\2\2\2;\'\3\2\2\2;+\3\2\2\2;/\3\2\2\2;\63\3\2\2\2;\67\3\2\2"+
		"\2<\4\3\2\2\2=>\7|\2\2>?\7g\2\2?@\7)\2\2@J\7k\2\2AB\7|\2\2BC\7g\2\2CD"+
		"\7)\2\2DJ\7c\2\2EF\7|\2\2FG\7g\2\2GH\7)\2\2HJ\7w\2\2I=\3\2\2\2IA\3\2\2"+
		"\2IE\3\2\2\2J\6\3\2\2\2KL\7|\2\2LM\7g\2\2MN\7k\2\2N\b\3\2\2\2OP\7|\2\2"+
		"PQ\7k\2\2QR\7)\2\2RS\7g\2\2S\n\3\2\2\2TU\7|\2\2U[\7k\2\2VW\7|\2\2W[\7"+
		"c\2\2XY\7|\2\2Y[\7w\2\2ZT\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[\f\3\2\2\2\\]\7"+
		"|\2\2]^\7q\2\2^_\7)\2\2_`\7w\2\2`\16\3\2\2\2ab\7|\2\2bc\7q\2\2cd\7k\2"+
		"\2d\20\3\2\2\2ef\7|\2\2fg\7q\2\2g\22\3\2\2\2\6\2;IZ\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}