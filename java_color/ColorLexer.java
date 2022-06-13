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
		T__0=1, T__1=2, WS=3, PA=4, LUJVO=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "PA", "LUJVO", "BOBVO", "COBVO", "DOBVO", "FOBVO", 
			"GISMU", "C", "V", "RAFPAIRCON", "Y", "TAILVO", "RAFPAIRVOW", "STUMP", 
			"RAFSTUMP", "BALRAF", "Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", "CKSTUMP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\r'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "PA", "LUJVO"
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
		"\u0004\u0000\u0005\u00e3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003P\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006_\b\u0006\u0001\u0006"+
		"\u0003\u0006b\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\ts\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f~\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0084\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u008c\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0092\b\u000e\n\u000e\f\u000e\u0095\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0099\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u009e\b\u000f\u0001\u000f\u0003\u000f\u00a1\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a7"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ac\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00b4\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00b8\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00d2\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00d8\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015"+
		"\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000!\u0000"+
		"#\u0000%\u0000\'\u0000)\u0000+\u0000-\u0000/\u00001\u0000\u0001\u0000"+
		"\u0003\u0002\u0000\t\t  \b\u0000bdfgjnpprtvvxxzz\u0005\u0000aaeeiioou"+
		"u\u00f2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000"+
		"\u00035\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000\u0000\u0007O"+
		"\u0001\u0000\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000bX\u0001\u0000"+
		"\u0000\u0000\r^\u0001\u0000\u0000\u0000\u000fc\u0001\u0000\u0000\u0000"+
		"\u0011g\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000\u0000\u0015w"+
		"\u0001\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019\u0083\u0001"+
		"\u0000\u0000\u0000\u001b\u0087\u0001\u0000\u0000\u0000\u001d\u0093\u0001"+
		"\u0000\u0000\u0000\u001f\u00af\u0001\u0000\u0000\u0000!\u00b3\u0001\u0000"+
		"\u0000\u0000#\u00c2\u0001\u0000\u0000\u0000%\u00c4\u0001\u0000\u0000\u0000"+
		"\'\u00c8\u0001\u0000\u0000\u0000)\u00ca\u0001\u0000\u0000\u0000+\u00ce"+
		"\u0001\u0000\u0000\u0000-\u00d7\u0001\u0000\u0000\u0000/\u00d9\u0001\u0000"+
		"\u0000\u00001\u00de\u0001\u0000\u0000\u000034\u0005\r\u0000\u00004\u0002"+
		"\u0001\u0000\u0000\u000056\u0005\n\u0000\u00006\u0004\u0001\u0000\u0000"+
		"\u000078\u0007\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0006\u0002"+
		"\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005p\u0000\u0000<P\u0005"+
		"a\u0000\u0000=>\u0005r\u0000\u0000>P\u0005e\u0000\u0000?@\u0005c\u0000"+
		"\u0000@P\u0005i\u0000\u0000AB\u0005v\u0000\u0000BP\u0005o\u0000\u0000"+
		"CD\u0005m\u0000\u0000DP\u0005u\u0000\u0000EF\u0005x\u0000\u0000FP\u0005"+
		"a\u0000\u0000GH\u0005z\u0000\u0000HP\u0005e\u0000\u0000IJ\u0005b\u0000"+
		"\u0000JP\u0005i\u0000\u0000KL\u0005s\u0000\u0000LP\u0005o\u0000\u0000"+
		"MN\u0005n\u0000\u0000NP\u0005o\u0000\u0000O;\u0001\u0000\u0000\u0000O"+
		"=\u0001\u0000\u0000\u0000O?\u0001\u0000\u0000\u0000OA\u0001\u0000\u0000"+
		"\u0000OC\u0001\u0000\u0000\u0000OE\u0001\u0000\u0000\u0000OG\u0001\u0000"+
		"\u0000\u0000OI\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000P\b\u0001\u0000\u0000\u0000QW\u0003\u000b\u0005\u0000"+
		"RW\u0003\r\u0006\u0000SW\u0003\u000f\u0007\u0000TW\u0003\u0011\b\u0000"+
		"UW\u0003\u0013\t\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000"+
		"VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\n\u0001\u0000\u0000\u0000XY\u0003\u0019\f\u0000YZ\u0003\u001b"+
		"\r\u0000Z[\u0003\u001d\u000e\u0000[\f\u0001\u0000\u0000\u0000\\_\u0003"+
		"\u0019\f\u0000]_\u0003\u001f\u000f\u0000^\\\u0001\u0000\u0000\u0000^]"+
		"\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`b\u0003\u001d\u000e"+
		"\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000e\u0001"+
		"\u0000\u0000\u0000cd\u0003!\u0010\u0000de\u0003\u001b\r\u0000ef\u0003"+
		"\u001d\u000e\u0000f\u0010\u0001\u0000\u0000\u0000gh\u0003#\u0011\u0000"+
		"hi\u0003\u001b\r\u0000ij\u0003\u001d\u000e\u0000j\u0012\u0001\u0000\u0000"+
		"\u0000kr\u0003\u0015\n\u0000lm\u0003\u0015\n\u0000mn\u0003\u0017\u000b"+
		"\u0000ns\u0001\u0000\u0000\u0000op\u0003\u0017\u000b\u0000pq\u0003\u0015"+
		"\n\u0000qs\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0003\u0015\n\u0000uv\u0003\u0017"+
		"\u000b\u0000v\u0014\u0001\u0000\u0000\u0000wx\u0007\u0001\u0000\u0000"+
		"x\u0016\u0001\u0000\u0000\u0000yz\u0007\u0002\u0000\u0000z\u0018\u0001"+
		"\u0000\u0000\u0000{}\u0003%\u0012\u0000|~\u0003\'\u0013\u0000}|\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0084\u0001\u0000\u0000"+
		"\u0000\u007f\u0084\u0003)\u0014\u0000\u0080\u0081\u0003+\u0015\u0000\u0081"+
		"\u0082\u0003\'\u0013\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083{"+
		"\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0080"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0003%\u0012\u0000\u0086\u001a\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"y\u0000\u0000\u0088\u001c\u0001\u0000\u0000\u0000\u0089\u008b\u0003%\u0012"+
		"\u0000\u008a\u008c\u0003\u001b\r\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0092\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0003!\u0010\u0000\u008e\u008f\u0003\u001b\r\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u0092\u0003-\u0016\u0000\u0091\u0089"+
		"\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0098"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0003-\u0016\u0000\u0097\u0099\u0003\u0013\t\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u001e\u0001"+
		"\u0000\u0000\u0000\u009a\u009e\u0003%\u0012\u0000\u009b\u009e\u0003)\u0014"+
		"\u0000\u009c\u009e\u0003+\u0015\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\'\u0013\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003)\u0014\u0000\u00a3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003%\u0012\u0000\u00a5\u00a7\u0003"+
		"\'\u0013\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003-\u0016"+
		"\u0000\u00a9\u00aa\u0003\'\u0013\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003+\u0015\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u009d\u0001\u0000\u0000\u0000\u00af"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b0 \u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0003/\u0017\u0000\u00b2\u00b4\u00031\u0018\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\"\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0003%\u0012\u0000\u00b6\u00b8\u0003\'\u0013\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003!\u0010\u0000\u00ba"+
		"\u00c3\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003-\u0016\u0000\u00bc\u00bd"+
		"\u0003\'\u0013\u0000\u00bd\u00be\u0003/\u0017\u0000\u00be\u00c3\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0003-\u0016\u0000\u00c0\u00c1\u00031\u0018"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c3$\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0015\n\u0000"+
		"\u00c5\u00c6\u0003\u0017\u000b\u0000\u00c6\u00c7\u0003\u0015\n\u0000\u00c7"+
		"&\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005q\u0000\u0000\u00c9(\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0003\u0015\n\u0000\u00cb\u00cc\u0003\u0015"+
		"\n\u0000\u00cc\u00cd\u0003\u0017\u000b\u0000\u00cd*\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0003\u0015\n\u0000\u00cf\u00d1\u0003\u0017\u000b\u0000"+
		"\u00d0\u00d2\u0005\'\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0003\u0017\u000b\u0000\u00d4,\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0003+\u0015\u0000\u00d6\u00d8\u0003)\u0014\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8.\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0003\u0015\n\u0000\u00da\u00db\u0003\u0017\u000b\u0000"+
		"\u00db\u00dc\u0003\u0015\n\u0000\u00dc\u00dd\u0003\u0015\n\u0000\u00dd"+
		"0\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u0015\n\u0000\u00df\u00e0"+
		"\u0003\u0015\n\u0000\u00e0\u00e1\u0003\u0017\u000b\u0000\u00e1\u00e2\u0003"+
		"\u0015\n\u0000\u00e22\u0001\u0000\u0000\u0000\u0016\u0000OV^ar}\u0083"+
		"\u008b\u0091\u0093\u0098\u009d\u00a0\u00a6\u00ab\u00af\u00b3\u00b7\u00c2"+
		"\u00d1\u00d7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}