// Generated from Color.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, PA=4, Y=5, Q=6, C=7, V=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "PA", "Y", "Q", "C", "V"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'''", "' '", null, "'y'", "'q'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "PA", "Y", "Q", "C", "V"
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


	public ColorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Color.g4"; }

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
		"\u0004\u0000\b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		".\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000"+
		"\u0002\b\u0000bdfgjnpprtvvxxzz\u0005\u0000aaeeiioouu?\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000"+
		"\u0000\u0003\u0013\u0001\u0000\u0000\u0000\u0005\u0015\u0001\u0000\u0000"+
		"\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b"+
		"1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0005\n\u0000\u0000\u0012\u0002\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\'\u0000\u0000\u0014\u0004\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005 \u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0006\u0002\u0000\u0000\u0018\u0006\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005p\u0000\u0000\u001a.\u0005a\u0000\u0000\u001b\u001c\u0005"+
		"r\u0000\u0000\u001c.\u0005e\u0000\u0000\u001d\u001e\u0005c\u0000\u0000"+
		"\u001e.\u0005i\u0000\u0000\u001f \u0005v\u0000\u0000 .\u0005o\u0000\u0000"+
		"!\"\u0005m\u0000\u0000\".\u0005u\u0000\u0000#$\u0005x\u0000\u0000$.\u0005"+
		"a\u0000\u0000%&\u0005z\u0000\u0000&.\u0005e\u0000\u0000\'(\u0005b\u0000"+
		"\u0000(.\u0005i\u0000\u0000)*\u0005s\u0000\u0000*.\u0005o\u0000\u0000"+
		"+,\u0005n\u0000\u0000,.\u0005o\u0000\u0000-\u0019\u0001\u0000\u0000\u0000"+
		"-\u001b\u0001\u0000\u0000\u0000-\u001d\u0001\u0000\u0000\u0000-\u001f"+
		"\u0001\u0000\u0000\u0000-!\u0001\u0000\u0000\u0000-#\u0001\u0000\u0000"+
		"\u0000-%\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-)\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005"+
		"y\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005q\u0000\u00002\f\u0001"+
		"\u0000\u0000\u000034\u0007\u0000\u0000\u00004\u000e\u0001\u0000\u0000"+
		"\u000056\u0007\u0001\u0000\u00006\u0010\u0001\u0000\u0000\u0000\u0002"+
		"\u0000-\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}