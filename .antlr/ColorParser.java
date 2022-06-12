// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\Color.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ColorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, PA=5, Y=6, Q=7, C=8, V=9;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_cmavo = 3, RULE_gismu = 4, 
		RULE_lujvo = 5, RULE_bobvo = 6, RULE_cobvo = 7, RULE_dobvo = 8, RULE_fobvo = 9, 
		RULE_tworafcon = 10, RULE_y = 11, RULE_tailvo = 12, RULE_tworafvow = 13, 
		RULE_stump = 14, RULE_rafstump = 15, RULE_balraf = 16, RULE_q = 17, RULE_broraf = 18, 
		RULE_bauraf = 19, RULE_vuraf = 20, RULE_cafourraf = 21, RULE_ckfourraf = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmavo", "gismu", "lujvo", "bobvo", "cobvo", 
			"dobvo", "fobvo", "tworafcon", "y", "tailvo", "tworafvow", "stump", "rafstump", 
			"balraf", "q", "broraf", "bauraf", "vuraf", "cafourraf", "ckfourraf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'", "'''", "' '", null, "'y'", "'q'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "PA", "Y", "Q", "C", "V"
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

	@Override
	public String getGrammarFileName() { return "Color.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ColorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FolioContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folio; }
	}

	public final FolioContext folio() throws RecognitionException {
		FolioContext _localctx = new FolioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_folio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				sentence();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(47);
					match(T__0);
					}
				}

				setState(50);
				match(T__1);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PA || _la==C );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				word();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PA || _la==C );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public CmavoContext cmavo() {
			return getRuleContext(CmavoContext.class,0);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public LujvoContext lujvo() {
			return getRuleContext(LujvoContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				lujvo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmavoContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(ColorParser.PA, 0); }
		public CmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavo; }
	}

	public final CmavoContext cmavo() throws RecognitionException {
		CmavoContext _localctx = new CmavoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmavo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
	}

	public final GismuContext gismu() throws RecognitionException {
		GismuContext _localctx = new GismuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(C);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(69);
				match(C);
				setState(70);
				match(V);
				}
				break;
			case V:
				{
				setState(71);
				match(V);
				setState(72);
				match(C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(75);
			match(C);
			setState(76);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LujvoContext extends ParserRuleContext {
		public BobvoContext bobvo() {
			return getRuleContext(BobvoContext.class,0);
		}
		public CobvoContext cobvo() {
			return getRuleContext(CobvoContext.class,0);
		}
		public DobvoContext dobvo() {
			return getRuleContext(DobvoContext.class,0);
		}
		public FobvoContext fobvo() {
			return getRuleContext(FobvoContext.class,0);
		}
		public LujvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lujvo; }
	}

	public final LujvoContext lujvo() throws RecognitionException {
		LujvoContext _localctx = new LujvoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lujvo);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				fobvo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BobvoContext extends ParserRuleContext {
		public TworafconContext tworafcon() {
			return getRuleContext(TworafconContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public BobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bobvo; }
	}

	public final BobvoContext bobvo() throws RecognitionException {
		BobvoContext _localctx = new BobvoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			tworafcon();
			setState(85);
			y();
			setState(86);
			tailvo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CobvoContext extends ParserRuleContext {
		public TworafconContext tworafcon() {
			return getRuleContext(TworafconContext.class,0);
		}
		public TworafvowContext tworafvow() {
			return getRuleContext(TworafvowContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public CobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobvo; }
	}

	public final CobvoContext cobvo() throws RecognitionException {
		CobvoContext _localctx = new CobvoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(88);
				tworafcon();
				}
				break;
			case 2:
				{
				setState(89);
				tworafvow();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(92);
				tailvo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DobvoContext extends ParserRuleContext {
		public StumpContext stump() {
			return getRuleContext(StumpContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public DobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobvo; }
	}

	public final DobvoContext dobvo() throws RecognitionException {
		DobvoContext _localctx = new DobvoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			stump();
			setState(96);
			y();
			setState(97);
			tailvo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FobvoContext extends ParserRuleContext {
		public RafstumpContext rafstump() {
			return getRuleContext(RafstumpContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public FobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fobvo; }
	}

	public final FobvoContext fobvo() throws RecognitionException {
		FobvoContext _localctx = new FobvoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			rafstump();
			setState(100);
			y();
			setState(101);
			tailvo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TworafconContext extends ParserRuleContext {
		public List<BalrafContext> balraf() {
			return getRuleContexts(BalrafContext.class);
		}
		public BalrafContext balraf(int i) {
			return getRuleContext(BalrafContext.class,i);
		}
		public BrorafContext broraf() {
			return getRuleContext(BrorafContext.class,0);
		}
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public TworafconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tworafcon; }
	}

	public final TworafconContext tworafcon() throws RecognitionException {
		TworafconContext _localctx = new TworafconContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tworafcon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				balraf();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(104);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(107);
				broraf();
				}
				break;
			case 3:
				{
				setState(108);
				bauraf();
				setState(109);
				q();
				}
				break;
			}
			setState(113);
			balraf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(ColorParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(Y);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailvoContext extends ParserRuleContext {
		public List<VurafContext> vuraf() {
			return getRuleContexts(VurafContext.class);
		}
		public VurafContext vuraf(int i) {
			return getRuleContext(VurafContext.class,i);
		}
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
		}
		public List<BalrafContext> balraf() {
			return getRuleContexts(BalrafContext.class);
		}
		public BalrafContext balraf(int i) {
			return getRuleContext(BalrafContext.class,i);
		}
		public List<StumpContext> stump() {
			return getRuleContexts(StumpContext.class);
		}
		public StumpContext stump(int i) {
			return getRuleContext(StumpContext.class,i);
		}
		public List<YContext> y() {
			return getRuleContexts(YContext.class);
		}
		public YContext y(int i) {
			return getRuleContext(YContext.class,i);
		}
		public TailvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tailvo; }
	}

	public final TailvoContext tailvo() throws RecognitionException {
		TailvoContext _localctx = new TailvoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tailvo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(117);
						balraf();
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(118);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(121);
						stump();
						setState(122);
						y();
						}
						break;
					case 3:
						{
						setState(124);
						vuraf();
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(130);
				vuraf();
				}
				break;
			case 2:
				{
				setState(131);
				gismu();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TworafvowContext extends ParserRuleContext {
		public List<BrorafContext> broraf() {
			return getRuleContexts(BrorafContext.class);
		}
		public BrorafContext broraf(int i) {
			return getRuleContext(BrorafContext.class,i);
		}
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
		}
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public VurafContext vuraf() {
			return getRuleContext(VurafContext.class,0);
		}
		public TworafvowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tworafvow; }
	}

	public final TworafvowContext tworafvow() throws RecognitionException {
		TworafvowContext _localctx = new TworafvowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tworafvow);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(134);
					balraf();
					}
					break;
				case 2:
					{
					setState(135);
					broraf();
					}
					break;
				case 3:
					{
					setState(136);
					bauraf();
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(139);
					q();
					}
				}

				setState(142);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(144);
					balraf();
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Q) {
						{
						setState(145);
						q();
						}
					}

					}
					break;
				case 2:
					{
					setState(148);
					vuraf();
					setState(149);
					q();
					}
					break;
				}
				setState(153);
				bauraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StumpContext extends ParserRuleContext {
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public CkfourrafContext ckfourraf() {
			return getRuleContext(CkfourrafContext.class,0);
		}
		public StumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stump; }
	}

	public final StumpContext stump() throws RecognitionException {
		StumpContext _localctx = new StumpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stump);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				cafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				ckfourraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RafstumpContext extends ParserRuleContext {
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
		}
		public StumpContext stump() {
			return getRuleContext(StumpContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public VurafContext vuraf() {
			return getRuleContext(VurafContext.class,0);
		}
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public CkfourrafContext ckfourraf() {
			return getRuleContext(CkfourrafContext.class,0);
		}
		public RafstumpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rafstump; }
	}

	public final RafstumpContext rafstump() throws RecognitionException {
		RafstumpContext _localctx = new RafstumpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rafstump);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				balraf();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(162);
					q();
					}
				}

				setState(165);
				stump();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				vuraf();
				setState(168);
				q();
				setState(169);
				cafourraf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				vuraf();
				setState(172);
				ckfourraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public BalrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balraf; }
	}

	public final BalrafContext balraf() throws RecognitionException {
		BalrafContext _localctx = new BalrafContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(C);
			setState(177);
			match(V);
			setState(178);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QContext extends ParserRuleContext {
		public TerminalNode Q() { return getToken(ColorParser.Q, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Q);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrorafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public BrorafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broraf; }
	}

	public final BrorafContext broraf() throws RecognitionException {
		BrorafContext _localctx = new BrorafContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(C);
			setState(183);
			match(C);
			setState(184);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaurafContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(ColorParser.C, 0); }
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
		}
		public BaurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bauraf; }
	}

	public final BaurafContext bauraf() throws RecognitionException {
		BaurafContext _localctx = new BaurafContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(C);
			setState(187);
			match(V);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(188);
				match(T__2);
				}
			}

			setState(191);
			match(V);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VurafContext extends ParserRuleContext {
		public BaurafContext bauraf() {
			return getRuleContext(BaurafContext.class,0);
		}
		public BrorafContext broraf() {
			return getRuleContext(BrorafContext.class,0);
		}
		public VurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuraf; }
	}

	public final VurafContext vuraf() throws RecognitionException {
		VurafContext _localctx = new VurafContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vuraf);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				bauraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				broraf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CafourrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public CafourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cafourraf; }
	}

	public final CafourrafContext cafourraf() throws RecognitionException {
		CafourrafContext _localctx = new CafourrafContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(C);
			setState(198);
			match(V);
			setState(199);
			match(C);
			setState(200);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CkfourrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public CkfourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ckfourraf; }
	}

	public final CkfourrafContext ckfourraf() throws RecognitionException {
		CkfourrafContext _localctx = new CkfourrafContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ckfourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(C);
			setState(203);
			match(C);
			setState(204);
			match(V);
			setState(205);
			match(C);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\2\3\2\6\2\67\n\2\r\2\16\28\3\3\6\3<\n\3\r\3\16\3=\3\4\3\4"+
		"\3\4\5\4C\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7U\n\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t]\n\t\3\t\5\t`\n\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\fl\n\f\3\f\3\f\3\f\3\f\5\fr\n"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16z\n\16\3\16\3\16\3\16\3\16\7\16\u0080"+
		"\n\16\f\16\16\16\u0083\13\16\3\16\3\16\5\16\u0087\n\16\3\17\3\17\3\17"+
		"\5\17\u008c\n\17\3\17\5\17\u008f\n\17\3\17\3\17\3\17\3\17\5\17\u0095\n"+
		"\17\3\17\3\17\3\17\5\17\u009a\n\17\3\17\3\17\5\17\u009e\n\17\3\20\3\20"+
		"\5\20\u00a2\n\20\3\21\3\21\5\21\u00a6\n\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00c0\n\25\3\25\3\25\3\26\3\26\5\26"+
		"\u00c6\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\2\2"+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00d9\2\66\3"+
		"\2\2\2\4;\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fT\3\2\2\2\16V\3\2"+
		"\2\2\20\\\3\2\2\2\22a\3\2\2\2\24e\3\2\2\2\26q\3\2\2\2\30u\3\2\2\2\32\u0081"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00a1\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2"+
		"\2\2$\u00b6\3\2\2\2&\u00b8\3\2\2\2(\u00bc\3\2\2\2*\u00c5\3\2\2\2,\u00c7"+
		"\3\2\2\2.\u00cc\3\2\2\2\60\62\5\4\3\2\61\63\7\3\2\2\62\61\3\2\2\2\62\63"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\7\4\2\2\65\67\3\2\2\2\66\60\3\2\2\2\678\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:<\5\6\4\2;:\3\2\2\2<=\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?C\5\b\5\2@C\5\n\6\2AC\5\f\7\2B?\3\2\2"+
		"\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\7\7\2\2E\t\3\2\2\2FK\7\n\2\2GH\7\n"+
		"\2\2HL\7\13\2\2IJ\7\13\2\2JL\7\n\2\2KG\3\2\2\2KI\3\2\2\2LM\3\2\2\2MN\7"+
		"\n\2\2NO\7\13\2\2O\13\3\2\2\2PU\5\16\b\2QU\5\20\t\2RU\5\22\n\2SU\5\24"+
		"\13\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\5\26\f\2WX"+
		"\5\30\r\2XY\5\32\16\2Y\17\3\2\2\2Z]\5\26\f\2[]\5\34\17\2\\Z\3\2\2\2\\"+
		"[\3\2\2\2]_\3\2\2\2^`\5\32\16\2_^\3\2\2\2_`\3\2\2\2`\21\3\2\2\2ab\5\36"+
		"\20\2bc\5\30\r\2cd\5\32\16\2d\23\3\2\2\2ef\5 \21\2fg\5\30\r\2gh\5\32\16"+
		"\2h\25\3\2\2\2ik\5\"\22\2jl\5$\23\2kj\3\2\2\2kl\3\2\2\2lr\3\2\2\2mr\5"+
		"&\24\2no\5(\25\2op\5$\23\2pr\3\2\2\2qi\3\2\2\2qm\3\2\2\2qn\3\2\2\2rs\3"+
		"\2\2\2st\5\"\22\2t\27\3\2\2\2uv\7\b\2\2v\31\3\2\2\2wy\5\"\22\2xz\5\30"+
		"\r\2yx\3\2\2\2yz\3\2\2\2z\u0080\3\2\2\2{|\5\36\20\2|}\5\30\r\2}\u0080"+
		"\3\2\2\2~\u0080\5*\26\2\177w\3\2\2\2\177{\3\2\2\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0087\5*\26\2\u0085\u0087\5\n\6\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\33\3\2\2\2\u0088\u008c\5\"\22\2\u0089\u008c"+
		"\5&\24\2\u008a\u008c\5(\25\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5$\23\2\u008e\u008d\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5&\24\2\u0091"+
		"\u009e\3\2\2\2\u0092\u0094\5\"\22\2\u0093\u0095\5$\23\2\u0094\u0093\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0097\5*\26\2\u0097"+
		"\u0098\5$\23\2\u0098\u009a\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0096\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5(\25\2\u009c\u009e\3\2\2\2\u009d"+
		"\u008b\3\2\2\2\u009d\u0099\3\2\2\2\u009e\35\3\2\2\2\u009f\u00a2\5,\27"+
		"\2\u00a0\u00a2\5.\30\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\37"+
		"\3\2\2\2\u00a3\u00a5\5\"\22\2\u00a4\u00a6\5$\23\2\u00a5\u00a4\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00b1"+
		"\3\2\2\2\u00a9\u00aa\5*\26\2\u00aa\u00ab\5$\23\2\u00ab\u00ac\5,\27\2\u00ac"+
		"\u00b1\3\2\2\2\u00ad\u00ae\5*\26\2\u00ae\u00af\5.\30\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00a3\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1"+
		"!\3\2\2\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\7\n\2\2"+
		"\u00b5#\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7%\3\2\2\2\u00b8\u00b9\7\n\2\2"+
		"\u00b9\u00ba\7\n\2\2\u00ba\u00bb\7\13\2\2\u00bb\'\3\2\2\2\u00bc\u00bd"+
		"\7\n\2\2\u00bd\u00bf\7\13\2\2\u00be\u00c0\7\5\2\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2)\3"+
		"\2\2\2\u00c3\u00c6\5(\25\2\u00c4\u00c6\5&\24\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6+\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\13\2\2"+
		"\u00c9\u00ca\7\n\2\2\u00ca\u00cb\7\n\2\2\u00cb-\3\2\2\2\u00cc\u00cd\7"+
		"\n\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\7\n\2\2\u00d0"+
		"/\3\2\2\2\32\628=BKT\\_kqy\177\u0081\u0086\u008b\u008e\u0094\u0099\u009d"+
		"\u00a1\u00a5\u00b0\u00bf\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}