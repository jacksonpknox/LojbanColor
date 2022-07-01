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
		T__0=1, T__1=2, CMENE=3, WS=4, GISMU=5, LUJVO=6, CMAVO=7, COMPMO=8, FUHIVLA=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CMENE", "L", "C", "V", "WS", "GISMU", "GISUM", "CAGISMU", 
			"CKAGISMU", "LUJVO", "BOBVO", "COBVO", "DOBVO", "FOBVO", "GOBVO", "JOBVO", 
			"KOBVO", "RAFPAIRCON", "TAILVO", "RAFPAIRVOW", "STUMP", "RAFSTUMP", "BALRAF", 
			"Q", "BRORAF", "BAURAF", "VURAF", "CASTUMP", "CKSTUMP", "Y", "CMAVO", 
			"COMPMO", "CMAV", "FUHIVLA"
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
			null, null, null, "CMENE", "WS", "GISMU", "LUJVO", "CMAVO", "COMPMO", 
			"FUHIVLA"
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
		"\u0004\u0000\t\u0153\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0002\u0005\u0002R\b\u0002"+
		"\n\u0002\f\u0002U\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\\\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\bj\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u007f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0003\r\u0087\b\r\u0001\r\u0003\r\u008a\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0097\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u009d\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00a1\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00a9\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b0"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00b4\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00b9\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00bf\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00c5\b\u0014\n\u0014\f\u0014\u00c8"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cc\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00d1\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00d5\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00d9\b"+
		"\u0015\u0003\u0015\u00db\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00e2\b\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00e6\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00eb"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ef\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00f3\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00f7\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0102\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0111\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0117\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0127\b \u0001"+
		" \u0001 \u0001 \u0005 \u012c\b \n \f \u012f\t \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0135\b \u0001!\u0001!\u0004!\u0139\b!\u000b!\f!\u013a\u0001"+
		"\"\u0001\"\u0003\"\u013f\b\"\u0001\"\u0001\"\u0001\"\u0005\"\u0144\b\""+
		"\n\"\f\"\u0147\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u014d\b\"\u0001"+
		"#\u0004#\u0150\b#\u000b#\f#\u0151\u0000\u0000$\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0000\t\u0000\u000b\u0000\r\u0004\u000f\u0005\u0011"+
		"\u0000\u0013\u0000\u0015\u0000\u0017\u0006\u0019\u0000\u001b\u0000\u001d"+
		"\u0000\u001f\u0000!\u0000#\u0000%\u0000\'\u0000)\u0000+\u0000-\u0000/"+
		"\u00001\u00003\u00005\u00007\u00009\u0000;\u0000=\u0000?\u0000A\u0007"+
		"C\bE\u0000G\t\u0001\u0000\u0005\t\u0000,,bdfgjnpprtvvxxzz\u0006\u0000"+
		"aaeeiioouuyy\u0002\u0000\t\t  \u0002\u0000llqr\u0003\u0000\t\n\r\r  \u016e"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003K\u0001\u0000\u0000"+
		"\u0000\u0005N\u0001\u0000\u0000\u0000\u0007[\u0001\u0000\u0000\u0000\t"+
		"]\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\ra\u0001\u0000"+
		"\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011i\u0001\u0000\u0000\u0000"+
		"\u0013k\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017~"+
		"\u0001\u0000\u0000\u0000\u0019\u0080\u0001\u0000\u0000\u0000\u001b\u0086"+
		"\u0001\u0000\u0000\u0000\u001d\u008b\u0001\u0000\u0000\u0000\u001f\u008f"+
		"\u0001\u0000\u0000\u0000!\u00a0\u0001\u0000\u0000\u0000#\u00a2\u0001\u0000"+
		"\u0000\u0000%\u00a6\u0001\u0000\u0000\u0000\'\u00b8\u0001\u0000\u0000"+
		"\u0000)\u00c6\u0001\u0000\u0000\u0000+\u00ee\u0001\u0000\u0000\u0000-"+
		"\u00f2\u0001\u0000\u0000\u0000/\u0101\u0001\u0000\u0000\u00001\u0103\u0001"+
		"\u0000\u0000\u00003\u0107\u0001\u0000\u0000\u00005\u0109\u0001\u0000\u0000"+
		"\u00007\u010d\u0001\u0000\u0000\u00009\u0116\u0001\u0000\u0000\u0000;"+
		"\u0118\u0001\u0000\u0000\u0000=\u011d\u0001\u0000\u0000\u0000?\u0122\u0001"+
		"\u0000\u0000\u0000A\u0134\u0001\u0000\u0000\u0000C\u0136\u0001\u0000\u0000"+
		"\u0000E\u014c\u0001\u0000\u0000\u0000G\u014f\u0001\u0000\u0000\u0000I"+
		"J\u0005\r\u0000\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005\n\u0000\u0000"+
		"L\u0004\u0001\u0000\u0000\u0000MO\u0005.\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OS\u0001\u0000\u0000\u0000PR\u0003\u0007"+
		"\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0003\t\u0004\u0000WX\u0005.\u0000\u0000"+
		"X\u0006\u0001\u0000\u0000\u0000Y\\\u0003\t\u0004\u0000Z\\\u0003\u000b"+
		"\u0005\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\b\u0001"+
		"\u0000\u0000\u0000]^\u0007\u0000\u0000\u0000^\n\u0001\u0000\u0000\u0000"+
		"_`\u0007\u0001\u0000\u0000`\f\u0001\u0000\u0000\u0000ab\u0007\u0002\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0006\u0006\u0000\u0000d\u000e\u0001"+
		"\u0000\u0000\u0000ef\u0003\u0011\b\u0000f\u0010\u0001\u0000\u0000\u0000"+
		"gj\u0003\u0013\t\u0000hj\u0003\u0015\n\u0000ig\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000j\u0012\u0001\u0000\u0000\u0000kl\u0003\t\u0004"+
		"\u0000lm\u0003\u000b\u0005\u0000mn\u0003\t\u0004\u0000no\u0003\t\u0004"+
		"\u0000op\u0003\u000b\u0005\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0003"+
		"\t\u0004\u0000rs\u0003\t\u0004\u0000st\u0003\u000b\u0005\u0000tu\u0003"+
		"\t\u0004\u0000uv\u0003\u000b\u0005\u0000v\u0016\u0001\u0000\u0000\u0000"+
		"w\u007f\u0003\u0019\f\u0000x\u007f\u0003\u001b\r\u0000y\u007f\u0003\u001d"+
		"\u000e\u0000z\u007f\u0003\u001f\u000f\u0000{\u007f\u0003!\u0010\u0000"+
		"|\u007f\u0003#\u0011\u0000}\u007f\u0003%\u0012\u0000~w\u0001\u0000\u0000"+
		"\u0000~x\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000"+
		"\u0000\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0018\u0001\u0000\u0000\u0000\u0080\u0081\u0003"+
		"\'\u0013\u0000\u0081\u0082\u0003?\u001f\u0000\u0082\u0083\u0003)\u0014"+
		"\u0000\u0083\u001a\u0001\u0000\u0000\u0000\u0084\u0087\u0003\'\u0013\u0000"+
		"\u0085\u0087\u0003+\u0015\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0003)\u0014\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u001c\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003-\u0016\u0000\u008c\u008d\u0003?\u001f\u0000\u008d\u008e\u0003)"+
		"\u0014\u0000\u008e\u001e\u0001\u0000\u0000\u0000\u008f\u0090\u0003/\u0017"+
		"\u0000\u0090\u0091\u0003?\u001f\u0000\u0091\u0092\u0003)\u0014\u0000\u0092"+
		" \u0001\u0000\u0000\u0000\u0093\u0096\u00031\u0018\u0000\u0094\u0097\u0003"+
		"3\u0019\u0000\u0095\u0097\u0003?\u001f\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u000f\u0007"+
		"\u0000\u0099\u00a1\u0001\u0000\u0000\u0000\u009a\u009c\u00035\u001a\u0000"+
		"\u009b\u009d\u00033\u0019\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0003\u000f\u0007\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"\u0093\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a1"+
		"\"\u0001\u0000\u0000\u0000\u00a2\u00a3\u00037\u001b\u0000\u00a3\u00a4"+
		"\u00033\u0019\u0000\u00a4\u00a5\u0003\u0013\t\u0000\u00a5$\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u00037\u001b\u0000\u00a7\u00a9\u00033\u0019\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0015\n\u0000\u00ab"+
		"&\u0001\u0000\u0000\u0000\u00ac\u00af\u00031\u0018\u0000\u00ad\u00b0\u0003"+
		"3\u0019\u0000\u00ae\u00b0\u0003?\u001f\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b9\u0001\u0000\u0000\u0000\u00b1\u00b3\u00035\u001a\u0000"+
		"\u00b2\u00b4\u00033\u0019\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b9\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u00037\u001b\u0000\u00b6\u00b7\u00033\u0019\u0000\u00b7\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ac\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u00031\u0018\u0000\u00bb(\u0001\u0000\u0000"+
		"\u0000\u00bc\u00be\u00031\u0018\u0000\u00bd\u00bf\u0003?\u001f\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003-\u0016\u0000\u00c1\u00c2"+
		"\u0003?\u001f\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003"+
		"9\u001c\u0000\u00c4\u00bc\u0001\u0000\u0000\u0000\u00c4\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cb\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cc\u00039\u001c\u0000\u00ca\u00cc\u0003\u0011\b"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc*\u0001\u0000\u0000\u0000\u00cd\u00d0\u00031\u0018\u0000\u00ce"+
		"\u00d1\u00033\u0019\u0000\u00cf\u00d1\u0003?\u001f\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00db\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003"+
		"5\u001a\u0000\u00d3\u00d5\u00033\u0019\u0000\u00d4\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00db\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d8\u00037\u001b\u0000\u00d7\u00d9\u00033\u0019\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00cd\u0001\u0000\u0000\u0000\u00da"+
		"\u00d2\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u00035\u001a\u0000\u00dd\u00ef"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u00031\u0018\u0000\u00df\u00e2\u0003"+
		"3\u0019\u0000\u00e0\u00e2\u0003?\u001f\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00eb\u0001\u0000\u0000\u0000\u00e3\u00e5\u00035\u001a\u0000"+
		"\u00e4\u00e6\u00033\u0019\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00eb\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u00037\u001b\u0000\u00e8\u00e9\u00033\u0019\u0000\u00e9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ea\u00de\u0001\u0000\u0000\u0000\u00ea\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u00037\u001b\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00da\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ef,\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003;\u001d\u0000"+
		"\u00f1\u00f3\u0003=\u001e\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3.\u0001\u0000\u0000\u0000\u00f4\u00f6"+
		"\u00031\u0018\u0000\u00f5\u00f7\u00033\u0019\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0003-\u0016\u0000\u00f9\u0102\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u00039\u001c\u0000\u00fb\u00fc\u00033\u0019\u0000\u00fc"+
		"\u00fd\u0003;\u001d\u0000\u00fd\u0102\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u00039\u001c\u0000\u00ff\u0100\u0003=\u001e\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00f4\u0001\u0000\u0000\u0000\u0101\u00fa\u0001\u0000"+
		"\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u01020\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0003\t\u0004\u0000\u0104\u0105\u0003\u000b\u0005\u0000"+
		"\u0105\u0106\u0003\t\u0004\u0000\u01062\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0007\u0003\u0000\u0000\u01084\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0003\t\u0004\u0000\u010a\u010b\u0003\t\u0004\u0000\u010b\u010c\u0003"+
		"\u000b\u0005\u0000\u010c6\u0001\u0000\u0000\u0000\u010d\u010e\u0003\t"+
		"\u0004\u0000\u010e\u0110\u0003\u000b\u0005\u0000\u010f\u0111\u0005\'\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u000b\u0005"+
		"\u0000\u01138\u0001\u0000\u0000\u0000\u0114\u0117\u00037\u001b\u0000\u0115"+
		"\u0117\u00035\u001a\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0115"+
		"\u0001\u0000\u0000\u0000\u0117:\u0001\u0000\u0000\u0000\u0118\u0119\u0003"+
		"\t\u0004\u0000\u0119\u011a\u0003\u000b\u0005\u0000\u011a\u011b\u0003\t"+
		"\u0004\u0000\u011b\u011c\u0003\t\u0004\u0000\u011c<\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0003\t\u0004\u0000\u011e\u011f\u0003\t\u0004\u0000"+
		"\u011f\u0120\u0003\u000b\u0005\u0000\u0120\u0121\u0003\t\u0004\u0000\u0121"+
		">\u0001\u0000\u0000\u0000\u0122\u0123\u0005y\u0000\u0000\u0123@\u0001"+
		"\u0000\u0000\u0000\u0124\u0127\u0005.\u0000\u0000\u0125\u0127\u0003\t"+
		"\u0004\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012d\u0003\u000b"+
		"\u0005\u0000\u0129\u012c\u0005\'\u0000\u0000\u012a\u012c\u0003\u000b\u0005"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000"+
		"\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0135\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0003\t\u0004\u0000"+
		"\u0131\u0132\u0005y\u0000\u0000\u0132\u0133\u0005.\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0126\u0001\u0000\u0000\u0000\u0134\u0130"+
		"\u0001\u0000\u0000\u0000\u0135B\u0001\u0000\u0000\u0000\u0136\u0138\u0003"+
		"E\"\u0000\u0137\u0139\u0003E\"\u0000\u0138\u0137\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013bD\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0005.\u0000\u0000\u013d\u013f\u0003\t\u0004\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0145\u0003\u000b\u0005\u0000\u0141\u0144"+
		"\u0005\'\u0000\u0000\u0142\u0144\u0003\u000b\u0005\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u014d\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0003\t\u0004\u0000\u0149\u014a\u0005y"+
		"\u0000\u0000\u014a\u014b\u0005.\u0000\u0000\u014b\u014d\u0001\u0000\u0000"+
		"\u0000\u014c\u013e\u0001\u0000\u0000\u0000\u014c\u0148\u0001\u0000\u0000"+
		"\u0000\u014dF\u0001\u0000\u0000\u0000\u014e\u0150\b\u0004\u0000\u0000"+
		"\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152H\u0001\u0000\u0000\u0000*\u0000NS[i~\u0086\u0089\u0096\u009c\u00a0"+
		"\u00a8\u00af\u00b3\u00b8\u00be\u00c4\u00c6\u00cb\u00d0\u00d4\u00d8\u00da"+
		"\u00e1\u00e5\u00ea\u00ee\u00f2\u00f6\u0101\u0110\u0116\u0126\u012b\u012d"+
		"\u0134\u013a\u013e\u0143\u0145\u014c\u0151\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}