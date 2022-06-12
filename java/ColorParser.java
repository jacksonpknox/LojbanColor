// Generated from Color.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
			null, "'\\r'", "'\\n'", "'''", "' '", null, "'y'", "'q'"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFolio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFolio(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitSentence(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitWord(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCmavo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterGismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitGismu(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterLujvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitLujvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBobvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCobvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterDobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitDobvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFobvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterTworafcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitTworafcon(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitY(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterTailvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitTailvo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterTworafvow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitTworafvow(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterStump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitStump(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterRafstump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitRafstump(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBalraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBalraf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitQ(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBroraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBroraf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterBauraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitBauraf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterVuraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitVuraf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCafourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCafourraf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCkfourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCkfourraf(this);
		}
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
		"\u0004\u0001\t\u00d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000\f\u00006\u0001"+
		"\u0001\u0004\u0001:\b\u0001\u000b\u0001\f\u0001;\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\u0007"+
		"\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nj\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\np\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0003\fx\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f~\b\f\n\f"+
		"\f\f\u0081\t\f\u0001\f\u0001\f\u0003\f\u0085\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u008a\b\r\u0001\r\u0003\r\u008d\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0093\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001"+
		"\r\u0001\r\u0003\r\u009c\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u00a0"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00a4\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00af\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00be\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00c4\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0000\u00d7\u00004\u0001"+
		"\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000"+
		"\u0000\u0006B\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nR\u0001"+
		"\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000"+
		"\u0000\u0010_\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014"+
		"o\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018\u007f\u0001"+
		"\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000\u001c\u009f\u0001"+
		"\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000"+
		"\u0000\u0000\"\u00b4\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000\u0000"+
		"\u0000&\u00ba\u0001\u0000\u0000\u0000(\u00c3\u0001\u0000\u0000\u0000*"+
		"\u00c5\u0001\u0000\u0000\u0000,\u00ca\u0001\u0000\u0000\u0000.0\u0003"+
		"\u0002\u0001\u0000/1\u0005\u0001\u0000\u00000/\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005\u0002\u0000"+
		"\u000035\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0001"+
		"\u0001\u0000\u0000\u00008:\u0003\u0004\u0002\u000098\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=A\u0003\u0006\u0003\u0000"+
		">A\u0003\b\u0004\u0000?A\u0003\n\u0005\u0000@=\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0005\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0005\u0000\u0000C\u0007\u0001\u0000\u0000\u0000"+
		"DI\u0005\b\u0000\u0000EF\u0005\b\u0000\u0000FJ\u0005\t\u0000\u0000GH\u0005"+
		"\t\u0000\u0000HJ\u0005\b\u0000\u0000IE\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\b\u0000\u0000LM\u0005"+
		"\t\u0000\u0000M\t\u0001\u0000\u0000\u0000NS\u0003\f\u0006\u0000OS\u0003"+
		"\u000e\u0007\u0000PS\u0003\u0010\b\u0000QS\u0003\u0012\t\u0000RN\u0001"+
		"\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003\u0014"+
		"\n\u0000UV\u0003\u0016\u000b\u0000VW\u0003\u0018\f\u0000W\r\u0001\u0000"+
		"\u0000\u0000X[\u0003\u0014\n\u0000Y[\u0003\u001a\r\u0000ZX\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0003"+
		"\u0018\f\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000_`\u0003\u001c\u000e\u0000`a\u0003\u0016\u000b"+
		"\u0000ab\u0003\u0018\f\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0003\u001e"+
		"\u000f\u0000de\u0003\u0016\u000b\u0000ef\u0003\u0018\f\u0000f\u0013\u0001"+
		"\u0000\u0000\u0000gi\u0003 \u0010\u0000hj\u0003\"\u0011\u0000ih\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jp\u0001\u0000\u0000\u0000"+
		"kp\u0003$\u0012\u0000lm\u0003&\u0013\u0000mn\u0003\"\u0011\u0000np\u0001"+
		"\u0000\u0000\u0000og\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000"+
		"ol\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0003 \u0010\u0000"+
		"r\u0015\u0001\u0000\u0000\u0000st\u0005\u0006\u0000\u0000t\u0017\u0001"+
		"\u0000\u0000\u0000uw\u0003 \u0010\u0000vx\u0003\u0016\u000b\u0000wv\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x~\u0001\u0000\u0000\u0000"+
		"yz\u0003\u001c\u000e\u0000z{\u0003\u0016\u000b\u0000{~\u0001\u0000\u0000"+
		"\u0000|~\u0003(\u0014\u0000}u\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0084"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0003(\u0014\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0019\u0001"+
		"\u0000\u0000\u0000\u0086\u008a\u0003 \u0010\u0000\u0087\u008a\u0003$\u0012"+
		"\u0000\u0088\u008a\u0003&\u0013\u0000\u0089\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u0003\"\u0011\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0003$\u0012\u0000\u008f\u009c"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0003 \u0010\u0000\u0091\u0093\u0003"+
		"\"\u0011\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0098\u0001\u0000\u0000\u0000\u0094\u0095\u0003(\u0014"+
		"\u0000\u0095\u0096\u0003\"\u0011\u0000\u0096\u0098\u0001\u0000\u0000\u0000"+
		"\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0003&\u0013\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0089\u0001\u0000\u0000\u0000\u009b"+
		"\u0097\u0001\u0000\u0000\u0000\u009c\u001b\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0003*\u0015\u0000\u009e\u00a0\u0003,\u0016\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u001d\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0003 \u0010\u0000\u00a2\u00a4\u0003\""+
		"\u0011\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u001c"+
		"\u000e\u0000\u00a6\u00af\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003(\u0014"+
		"\u0000\u00a8\u00a9\u0003\"\u0011\u0000\u00a9\u00aa\u0003*\u0015\u0000"+
		"\u00aa\u00af\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003(\u0014\u0000\u00ac"+
		"\u00ad\u0003,\u0016\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a1"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000\u0000\u00ae\u00ab"+
		"\u0001\u0000\u0000\u0000\u00af\u001f\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\b\u0000\u0000\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\u00b3\u0005"+
		"\b\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0007"+
		"\u0000\u0000\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\b\u0000"+
		"\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8\u00b9\u0005\t\u0000\u0000"+
		"\u00b9%\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\b\u0000\u0000\u00bb"+
		"\u00bd\u0005\t\u0000\u0000\u00bc\u00be\u0005\u0003\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\'\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0003&\u0013\u0000\u00c2\u00c4\u0003$\u0012"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4)\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000"+
		"\u00c6\u00c7\u0005\t\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000\u00c8"+
		"\u00c9\u0005\b\u0000\u0000\u00c9+\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\b\u0000\u0000\u00cb\u00cc\u0005\b\u0000\u0000\u00cc\u00cd\u0005"+
		"\t\u0000\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce-\u0001\u0000\u0000"+
		"\u0000\u001806;@IRZ]iow}\u007f\u0084\u0089\u008c\u0092\u0097\u009b\u009f"+
		"\u00a3\u00ae\u00bd\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}