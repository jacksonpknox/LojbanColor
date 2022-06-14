// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoCD.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoCDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CAHA=1, CAI=2, CEHE=3, CEI=4, CO=5, COI=6, CU=7, CUHE=8, DAHO=9, DOHU=10, 
		DOI=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CAHA", "CAI", "CEHE", "CEI", "CO", "COI", "CU", "CUHE", "DAHO", "DOHU", 
			"DOI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'ce'e'", "'cei'", "'co'", null, "'cu'", null, "'da'o'", 
			"'do'u'", "'doi'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CAHA", "CAI", "CEHE", "CEI", "CO", "COI", "CU", "CUHE", "DAHO", 
			"DOHU", "DOI"
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


	public CmavoCDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmavoCD.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00a1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0092\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\3\2\2\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\3)\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\tC\3\2\2\2\13G"+
		"\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0091\3\2\2\2\23\u0093\3"+
		"\2\2\2\25\u0098\3\2\2\2\27\u009d\3\2\2\2\31\32\7e\2\2\32\33\7c\2\2\33"+
		"\34\7)\2\2\34*\7c\2\2\35\36\7m\2\2\36\37\7c\2\2\37 \7)\2\2 *\7g\2\2!\""+
		"\7p\2\2\"#\7w\2\2#$\7)\2\2$*\7q\2\2%&\7r\2\2&\'\7w\2\2\'(\7)\2\2(*\7k"+
		"\2\2)\31\3\2\2\2)\35\3\2\2\2)!\3\2\2\2)%\3\2\2\2*\4\3\2\2\2+,\7e\2\2,"+
		"-\7c\2\2-=\7k\2\2./\7u\2\2/\60\7c\2\2\60=\7k\2\2\61\62\7t\2\2\62\63\7"+
		"w\2\2\63\64\7)\2\2\64=\7g\2\2\65\66\7e\2\2\66\67\7w\2\2\678\7)\2\28=\7"+
		"k\2\29:\7r\2\2:;\7g\2\2;=\7k\2\2<+\3\2\2\2<.\3\2\2\2<\61\3\2\2\2<\65\3"+
		"\2\2\2<9\3\2\2\2=\6\3\2\2\2>?\7e\2\2?@\7g\2\2@A\7)\2\2AB\7g\2\2B\b\3\2"+
		"\2\2CD\7e\2\2DE\7g\2\2EF\7k\2\2F\n\3\2\2\2GH\7e\2\2HI\7q\2\2I\f\3\2\2"+
		"\2JK\7e\2\2KL\7q\2\2L\u0086\7k\2\2MN\7e\2\2NO\7q\2\2OP\7)\2\2P\u0086\7"+
		"q\2\2QR\7l\2\2RS\7w\2\2ST\7)\2\2T\u0086\7k\2\2UV\7p\2\2VW\7w\2\2WX\7)"+
		"\2\2X\u0086\7g\2\2YZ\7r\2\2Z[\7g\2\2[\\\7)\2\2\\\u0086\7w\2\2]^\7m\2\2"+
		"^_\7k\2\2_`\7)\2\2`\u0086\7g\2\2ab\7h\2\2bc\7k\2\2cd\7)\2\2d\u0086\7k"+
		"\2\2ef\7d\2\2fg\7g\2\2gh\7)\2\2h\u0086\7g\2\2ij\7t\2\2jk\7g\2\2kl\7)\2"+
		"\2l\u0086\7k\2\2mn\7o\2\2no\7w\2\2op\7)\2\2p\u0086\7q\2\2qr\7l\2\2rs\7"+
		"g\2\2st\7)\2\2t\u0086\7g\2\2uv\7x\2\2vw\7k\2\2wx\7)\2\2x\u0086\7q\2\2"+
		"yz\7m\2\2z{\7g\2\2{|\7)\2\2|\u0086\7q\2\2}~\7h\2\2~\177\7g\2\2\177\u0080"+
		"\7)\2\2\u0080\u0086\7q\2\2\u0081\u0082\7o\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7)\2\2\u0084\u0086\7g\2\2\u0085J\3\2\2\2\u0085M\3\2\2\2\u0085Q"+
		"\3\2\2\2\u0085U\3\2\2\2\u0085Y\3\2\2\2\u0085]\3\2\2\2\u0085a\3\2\2\2\u0085"+
		"e\3\2\2\2\u0085i\3\2\2\2\u0085m\3\2\2\2\u0085q\3\2\2\2\u0085u\3\2\2\2"+
		"\u0085y\3\2\2\2\u0085}\3\2\2\2\u0085\u0081\3\2\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\7e\2\2\u0088\u0089\7w\2\2\u0089\20\3\2\2\2\u008a\u008b\7e\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7)\2\2\u008d\u0092\7g\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0092\7w\2\2\u0091\u008a\3\2\2\2\u0091\u008e"+
		"\3\2\2\2\u0092\22\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095\7c\2\2\u0095"+
		"\u0096\7)\2\2\u0096\u0097\7q\2\2\u0097\24\3\2\2\2\u0098\u0099\7f\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7)\2\2\u009b\u009c\7w\2\2\u009c\26\3\2\2\2\u009d"+
		"\u009e\7f\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7k\2\2\u00a0\30\3\2\2\2\7"+
		"\2)<\u0085\u0091\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}