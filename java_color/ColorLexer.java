// Generated from grammars/Color.g4 by ANTLR 4.10.1
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
		T__0=1, T__1=2, WS=3, LUJVO=4, PA=5, CMAVOAB=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "LUJVO", "BOBVO", "COBVO", "DOBVO", "FOBVO", "GISMU", 
			"C", "V", "RAFPAIRCON", "Y", "TAILVO", "RAFPAIRVOW", "STUMP", "RAFSTUMP", 
			"BALRAF", "Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", "CKSTUMP", "PA", 
			"CMAVOAB", "A", "BAHE", "BEHO", "BEI", "BE", "BIHE", "BIHI", "BOI", "BO", 
			"BU"
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
			null, null, null, "WS", "LUJVO", "PA", "CMAVOAB"
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
		"\u0004\u0000\u0006\u013a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!"+
		"\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003W\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005_\b\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"s\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b~\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0084\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0003\r\u008c\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0092\b\r\n\r\f\r\u0095\t\r\u0001\r\u0001\r\u0003\r\u0099\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e\u0001"+
		"\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00ac\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b0\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b4\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00b8\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00c3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00d2\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d8\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00f8\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0104\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0110\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u012f\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0000\u0000$\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013"+
		"\u0000\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f"+
		"\u0000!\u0000#\u0000%\u0000\'\u0000)\u0000+\u0000-\u0000/\u00001\u0005"+
		"3\u00065\u00007\u00009\u0000;\u0000=\u0000?\u0000A\u0000C\u0000E\u0000"+
		"G\u0000\u0001\u0000\u0003\u0002\u0000\t\t  \b\u0000bdfgjnpprtvvxxzz\u0005"+
		"\u0000aaeeiioouu\u014b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K\u0001\u0000\u0000\u0000"+
		"\u0005M\u0001\u0000\u0000\u0000\u0007V\u0001\u0000\u0000\u0000\tX\u0001"+
		"\u0000\u0000\u0000\u000b^\u0001\u0000\u0000\u0000\rc\u0001\u0000\u0000"+
		"\u0000\u000fg\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013"+
		"w\u0001\u0000\u0000\u0000\u0015y\u0001\u0000\u0000\u0000\u0017\u0083\u0001"+
		"\u0000\u0000\u0000\u0019\u0087\u0001\u0000\u0000\u0000\u001b\u0093\u0001"+
		"\u0000\u0000\u0000\u001d\u00af\u0001\u0000\u0000\u0000\u001f\u00b3\u0001"+
		"\u0000\u0000\u0000!\u00c2\u0001\u0000\u0000\u0000#\u00c4\u0001\u0000\u0000"+
		"\u0000%\u00c8\u0001\u0000\u0000\u0000\'\u00ca\u0001\u0000\u0000\u0000"+
		")\u00ce\u0001\u0000\u0000\u0000+\u00d7\u0001\u0000\u0000\u0000-\u00d9"+
		"\u0001\u0000\u0000\u0000/\u00de\u0001\u0000\u0000\u00001\u00f7\u0001\u0000"+
		"\u0000\u00003\u0103\u0001\u0000\u0000\u00005\u0105\u0001\u0000\u0000\u0000"+
		"7\u010f\u0001\u0000\u0000\u00009\u0111\u0001\u0000\u0000\u0000;\u0116"+
		"\u0001\u0000\u0000\u0000=\u011a\u0001\u0000\u0000\u0000?\u011d\u0001\u0000"+
		"\u0000\u0000A\u012e\u0001\u0000\u0000\u0000C\u0130\u0001\u0000\u0000\u0000"+
		"E\u0134\u0001\u0000\u0000\u0000G\u0137\u0001\u0000\u0000\u0000IJ\u0005"+
		"\r\u0000\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005\n\u0000\u0000L\u0004"+
		"\u0001\u0000\u0000\u0000MN\u0007\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0006\u0002\u0000\u0000P\u0006\u0001\u0000\u0000\u0000QW\u0003"+
		"\t\u0004\u0000RW\u0003\u000b\u0005\u0000SW\u0003\r\u0006\u0000TW\u0003"+
		"\u000f\u0007\u0000UW\u0003\u0011\b\u0000VQ\u0001\u0000\u0000\u0000VR\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000W\b\u0001\u0000\u0000\u0000XY\u0003\u0017\u000b"+
		"\u0000YZ\u0003\u0019\f\u0000Z[\u0003\u001b\r\u0000[\n\u0001\u0000\u0000"+
		"\u0000\\_\u0003\u0017\u000b\u0000]_\u0003\u001d\u000e\u0000^\\\u0001\u0000"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`b\u0003"+
		"\u001b\r\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\f"+
		"\u0001\u0000\u0000\u0000cd\u0003\u001f\u000f\u0000de\u0003\u0019\f\u0000"+
		"ef\u0003\u001b\r\u0000f\u000e\u0001\u0000\u0000\u0000gh\u0003!\u0010\u0000"+
		"hi\u0003\u0019\f\u0000ij\u0003\u001b\r\u0000j\u0010\u0001\u0000\u0000"+
		"\u0000kr\u0003\u0013\t\u0000lm\u0003\u0013\t\u0000mn\u0003\u0015\n\u0000"+
		"ns\u0001\u0000\u0000\u0000op\u0003\u0015\n\u0000pq\u0003\u0013\t\u0000"+
		"qs\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0003\u0013\t\u0000uv\u0003\u0015\n"+
		"\u0000v\u0012\u0001\u0000\u0000\u0000wx\u0007\u0001\u0000\u0000x\u0014"+
		"\u0001\u0000\u0000\u0000yz\u0007\u0002\u0000\u0000z\u0016\u0001\u0000"+
		"\u0000\u0000{}\u0003#\u0011\u0000|~\u0003%\u0012\u0000}|\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0084\u0001\u0000\u0000\u0000\u007f"+
		"\u0084\u0003\'\u0013\u0000\u0080\u0081\u0003)\u0014\u0000\u0081\u0082"+
		"\u0003%\u0012\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083{\u0001\u0000"+
		"\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0003#\u0011"+
		"\u0000\u0086\u0018\u0001\u0000\u0000\u0000\u0087\u0088\u0005y\u0000\u0000"+
		"\u0088\u001a\u0001\u0000\u0000\u0000\u0089\u008b\u0003#\u0011\u0000\u008a"+
		"\u008c\u0003\u0019\f\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u0092\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0003\u001f\u000f\u0000\u008e\u008f\u0003\u0019\f\u0000\u008f\u0092\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0003+\u0015\u0000\u0091\u0089\u0001\u0000"+
		"\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0098\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0003+\u0015"+
		"\u0000\u0097\u0099\u0003\u0011\b\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u001c\u0001\u0000\u0000\u0000"+
		"\u009a\u009e\u0003#\u0011\u0000\u009b\u009e\u0003\'\u0013\u0000\u009c"+
		"\u009e\u0003)\u0014\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0003%\u0012\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0003\'\u0013\u0000\u00a3\u00b0\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0003#\u0011\u0000\u00a5\u00a7\u0003%\u0012\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00ac\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003+\u0015\u0000\u00a9"+
		"\u00aa\u0003%\u0012\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a4"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003)\u0014\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u009d\u0001\u0000\u0000\u0000\u00af\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b0\u001e\u0001\u0000\u0000\u0000\u00b1\u00b4\u0003"+
		"-\u0016\u0000\u00b2\u00b4\u0003/\u0017\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4 \u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0003#\u0011\u0000\u00b6\u00b8\u0003%\u0012\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u001f\u000f\u0000\u00ba\u00c3"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003+\u0015\u0000\u00bc\u00bd\u0003"+
		"%\u0012\u0000\u00bd\u00be\u0003-\u0016\u0000\u00be\u00c3\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0003+\u0015\u0000\u00c0\u00c1\u0003/\u0017\u0000\u00c1"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c3"+
		"\"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003\u0013\t\u0000\u00c5\u00c6"+
		"\u0003\u0015\n\u0000\u00c6\u00c7\u0003\u0013\t\u0000\u00c7$\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005q\u0000\u0000\u00c9&\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0003\u0013\t\u0000\u00cb\u00cc\u0003\u0013\t\u0000\u00cc"+
		"\u00cd\u0003\u0015\n\u0000\u00cd(\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0003\u0013\t\u0000\u00cf\u00d1\u0003\u0015\n\u0000\u00d0\u00d2\u0005"+
		"\'\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003\u0015"+
		"\n\u0000\u00d4*\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003)\u0014\u0000"+
		"\u00d6\u00d8\u0003\'\u0013\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8,\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003\u0013\t\u0000\u00da\u00db\u0003\u0015\n\u0000\u00db\u00dc\u0003"+
		"\u0013\t\u0000\u00dc\u00dd\u0003\u0013\t\u0000\u00dd.\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0003\u0013\t\u0000\u00df\u00e0\u0003\u0013\t\u0000"+
		"\u00e0\u00e1\u0003\u0015\n\u0000\u00e1\u00e2\u0003\u0013\t\u0000\u00e2"+
		"0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005p\u0000\u0000\u00e4\u00f8\u0005"+
		"a\u0000\u0000\u00e5\u00e6\u0005r\u0000\u0000\u00e6\u00f8\u0005e\u0000"+
		"\u0000\u00e7\u00e8\u0005c\u0000\u0000\u00e8\u00f8\u0005i\u0000\u0000\u00e9"+
		"\u00ea\u0005v\u0000\u0000\u00ea\u00f8\u0005o\u0000\u0000\u00eb\u00ec\u0005"+
		"m\u0000\u0000\u00ec\u00f8\u0005u\u0000\u0000\u00ed\u00ee\u0005x\u0000"+
		"\u0000\u00ee\u00f8\u0005a\u0000\u0000\u00ef\u00f0\u0005z\u0000\u0000\u00f0"+
		"\u00f8\u0005e\u0000\u0000\u00f1\u00f2\u0005b\u0000\u0000\u00f2\u00f8\u0005"+
		"i\u0000\u0000\u00f3\u00f4\u0005s\u0000\u0000\u00f4\u00f8\u0005o\u0000"+
		"\u0000\u00f5\u00f6\u0005n\u0000\u0000\u00f6\u00f8\u0005o\u0000\u0000\u00f7"+
		"\u00e3\u0001\u0000\u0000\u0000\u00f7\u00e5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00e7\u0001\u0000\u0000\u0000\u00f7\u00e9\u0001\u0000\u0000\u0000\u00f7"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f7"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"2\u0001\u0000\u0000\u0000\u00f9\u0104\u00035\u001a\u0000\u00fa\u0104\u0003"+
		"7\u001b\u0000\u00fb\u0104\u00039\u001c\u0000\u00fc\u0104\u0003;\u001d"+
		"\u0000\u00fd\u0104\u0003=\u001e\u0000\u00fe\u0104\u0003?\u001f\u0000\u00ff"+
		"\u0104\u0003A \u0000\u0100\u0104\u0003C!\u0000\u0101\u0104\u0003E\"\u0000"+
		"\u0102\u0104\u0003G#\u0000\u0103\u00f9\u0001\u0000\u0000\u0000\u0103\u00fa"+
		"\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000\u0103\u00fc"+
		"\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000\u0000\u0000\u0103\u00fe"+
		"\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u01044\u0001\u0000\u0000\u0000\u0105\u0106\u0007"+
		"\u0002\u0000\u0000\u01066\u0001\u0000\u0000\u0000\u0107\u0108\u0005b\u0000"+
		"\u0000\u0108\u0109\u0005a\u0000\u0000\u0109\u010a\u0005\'\u0000\u0000"+
		"\u010a\u0110\u0005e\u0000\u0000\u010b\u010c\u0005z\u0000\u0000\u010c\u010d"+
		"\u0005a\u0000\u0000\u010d\u010e\u0005\'\u0000\u0000\u010e\u0110\u0005"+
		"e\u0000\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u010b\u0001\u0000"+
		"\u0000\u0000\u01108\u0001\u0000\u0000\u0000\u0111\u0112\u0005b\u0000\u0000"+
		"\u0112\u0113\u0005e\u0000\u0000\u0113\u0114\u0005\'\u0000\u0000\u0114"+
		"\u0115\u0005o\u0000\u0000\u0115:\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"b\u0000\u0000\u0117\u0118\u0005e\u0000\u0000\u0118\u0119\u0005i\u0000"+
		"\u0000\u0119<\u0001\u0000\u0000\u0000\u011a\u011b\u0005b\u0000\u0000\u011b"+
		"\u011c\u0005e\u0000\u0000\u011c>\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"b\u0000\u0000\u011e\u011f\u0005i\u0000\u0000\u011f\u0120\u0005\'\u0000"+
		"\u0000\u0120\u0121\u0005e\u0000\u0000\u0121@\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005b\u0000\u0000\u0123\u0124\u0005i\u0000\u0000\u0124\u0125\u0005"+
		"\'\u0000\u0000\u0125\u012f\u0005i\u0000\u0000\u0126\u0127\u0005b\u0000"+
		"\u0000\u0127\u0128\u0005i\u0000\u0000\u0128\u0129\u0005\'\u0000\u0000"+
		"\u0129\u012f\u0005o\u0000\u0000\u012a\u012b\u0005m\u0000\u0000\u012b\u012c"+
		"\u0005i\u0000\u0000\u012c\u012d\u0005\'\u0000\u0000\u012d\u012f\u0005"+
		"i\u0000\u0000\u012e\u0122\u0001\u0000\u0000\u0000\u012e\u0126\u0001\u0000"+
		"\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012fB\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005b\u0000\u0000\u0131\u0132\u0005o\u0000\u0000\u0132"+
		"\u0133\u0005i\u0000\u0000\u0133D\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"b\u0000\u0000\u0135\u0136\u0005o\u0000\u0000\u0136F\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005b\u0000\u0000\u0138\u0139\u0005u\u0000\u0000\u0139"+
		"H\u0001\u0000\u0000\u0000\u0019\u0000V^ar}\u0083\u008b\u0091\u0093\u0098"+
		"\u009d\u00a0\u00a6\u00ab\u00af\u00b3\u00b7\u00c2\u00d1\u00d7\u00f7\u0103"+
		"\u010f\u012e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}