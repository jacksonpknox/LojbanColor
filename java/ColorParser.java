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
		T__0=1, T__1=2, WS=3, PA=4, Y=5, Q=6, C=7, V=8;
	public static final int
		RULE_folio = 0, RULE_sentence = 1, RULE_word = 2, RULE_cmavo = 3, RULE_lujvo = 4, 
		RULE_bobvo = 5, RULE_lobvo = 6, RULE_vobvo = 7, RULE_sobvo = 8, RULE_cabvo = 9, 
		RULE_tailvo = 10, RULE_vabvo = 11, RULE_fourraf = 12, RULE_curaf = 13, 
		RULE_vuraf = 14, RULE_vafourraf = 15, RULE_cafourraf = 16, RULE_gismu = 17, 
		RULE_y = 18, RULE_q = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmavo", "lujvo", "bobvo", "lobvo", "vobvo", 
			"sobvo", "cabvo", "tailvo", "vabvo", "fourraf", "curaf", "vuraf", "vafourraf", 
			"cafourraf", "gismu", "y", "q"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				sentence();
				setState(41);
				match(T__0);
				}
				}
				setState(45); 
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
			setState(47);
			word();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PA || _la==C) {
				{
				{
				setState(48);
				word();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(59);
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

	public static class LujvoContext extends ParserRuleContext {
		public BobvoContext bobvo() {
			return getRuleContext(BobvoContext.class,0);
		}
		public LobvoContext lobvo() {
			return getRuleContext(LobvoContext.class,0);
		}
		public VobvoContext vobvo() {
			return getRuleContext(VobvoContext.class,0);
		}
		public SobvoContext sobvo() {
			return getRuleContext(SobvoContext.class,0);
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
		enterRule(_localctx, 8, RULE_lujvo);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				lobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				vobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				sobvo();
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
		public CabvoContext cabvo() {
			return getRuleContext(CabvoContext.class,0);
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
		enterRule(_localctx, 10, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			cabvo();
			setState(68);
			y();
			setState(69);
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

	public static class LobvoContext extends ParserRuleContext {
		public CabvoContext cabvo() {
			return getRuleContext(CabvoContext.class,0);
		}
		public VabvoContext vabvo() {
			return getRuleContext(VabvoContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public LobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterLobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitLobvo(this);
		}
	}

	public final LobvoContext lobvo() throws RecognitionException {
		LobvoContext _localctx = new LobvoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				cabvo();
				}
				break;
			case 2:
				{
				setState(72);
				vabvo();
				}
				break;
			}
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
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

	public static class VobvoContext extends ParserRuleContext {
		public FourrafContext fourraf() {
			return getRuleContext(FourrafContext.class,0);
		}
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public VobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterVobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitVobvo(this);
		}
	}

	public final VobvoContext vobvo() throws RecognitionException {
		VobvoContext _localctx = new VobvoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			fourraf();
			setState(79);
			y();
			setState(80);
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

	public static class SobvoContext extends ParserRuleContext {
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public CurafContext curaf() {
			return getRuleContext(CurafContext.class,0);
		}
		public FourrafContext fourraf() {
			return getRuleContext(FourrafContext.class,0);
		}
		public VurafContext vuraf() {
			return getRuleContext(VurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public VafourrafContext vafourraf() {
			return getRuleContext(VafourrafContext.class,0);
		}
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public SobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sobvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterSobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitSobvo(this);
		}
	}

	public final SobvoContext sobvo() throws RecognitionException {
		SobvoContext _localctx = new SobvoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
				curaf();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(83);
					q();
					}
				}

				setState(86);
				fourraf();
				}
				break;
			case 2:
				{
				setState(88);
				vuraf();
				setState(89);
				q();
				setState(90);
				vafourraf();
				}
				break;
			case 3:
				{
				setState(92);
				vuraf();
				setState(93);
				cafourraf();
				}
				break;
			}
			setState(97);
			y();
			setState(98);
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

	public static class CabvoContext extends ParserRuleContext {
		public List<CurafContext> curaf() {
			return getRuleContexts(CurafContext.class);
		}
		public CurafContext curaf(int i) {
			return getRuleContext(CurafContext.class,i);
		}
		public VurafContext vuraf() {
			return getRuleContext(VurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public CabvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCabvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCabvo(this);
		}
	}

	public final CabvoContext cabvo() throws RecognitionException {
		CabvoContext _localctx = new CabvoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cabvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				curaf();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(101);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(104);
				vuraf();
				setState(105);
				q();
				}
				break;
			}
			setState(109);
			curaf();
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
		public List<CurafContext> curaf() {
			return getRuleContexts(CurafContext.class);
		}
		public CurafContext curaf(int i) {
			return getRuleContext(CurafContext.class,i);
		}
		public List<FourrafContext> fourraf() {
			return getRuleContexts(FourrafContext.class);
		}
		public FourrafContext fourraf(int i) {
			return getRuleContext(FourrafContext.class,i);
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
		enterRule(_localctx, 20, RULE_tailvo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(111);
						curaf();
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(112);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(115);
						fourraf();
						setState(116);
						y();
						}
						break;
					case 3:
						{
						setState(118);
						vuraf();
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(124);
				vuraf();
				}
				break;
			case 2:
				{
				setState(125);
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

	public static class VabvoContext extends ParserRuleContext {
		public List<VurafContext> vuraf() {
			return getRuleContexts(VurafContext.class);
		}
		public VurafContext vuraf(int i) {
			return getRuleContext(VurafContext.class,i);
		}
		public CurafContext curaf() {
			return getRuleContext(CurafContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public VabvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vabvo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterVabvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitVabvo(this);
		}
	}

	public final VabvoContext vabvo() throws RecognitionException {
		VabvoContext _localctx = new VabvoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vabvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(128);
				curaf();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(129);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(132);
				vuraf();
				setState(133);
				q();
				}
				break;
			}
			setState(137);
			vuraf();
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

	public static class FourrafContext extends ParserRuleContext {
		public VafourrafContext vafourraf() {
			return getRuleContext(VafourrafContext.class,0);
		}
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public FourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fourraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterFourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitFourraf(this);
		}
	}

	public final FourrafContext fourraf() throws RecognitionException {
		FourrafContext _localctx = new FourrafContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fourraf);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				vafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				cafourraf();
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

	public static class CurafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public CurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curaf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterCuraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitCuraf(this);
		}
	}

	public final CurafContext curaf() throws RecognitionException {
		CurafContext _localctx = new CurafContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_curaf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(C);
			setState(144);
			match(V);
			setState(145);
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

	public static class VurafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(ColorParser.V); }
		public TerminalNode V(int i) {
			return getToken(ColorParser.V, i);
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
		enterRule(_localctx, 28, RULE_vuraf);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(C);
				setState(148);
				match(V);
				setState(149);
				match(V);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(C);
				setState(151);
				match(C);
				setState(152);
				match(V);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(C);
				setState(154);
				match(V);
				setState(155);
				match(T__1);
				setState(156);
				match(V);
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

	public static class VafourrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(ColorParser.C); }
		public TerminalNode C(int i) {
			return getToken(ColorParser.C, i);
		}
		public TerminalNode V() { return getToken(ColorParser.V, 0); }
		public VafourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vafourraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).enterVafourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ColorListener ) ((ColorListener)listener).exitVafourraf(this);
		}
	}

	public final VafourrafContext vafourraf() throws RecognitionException {
		VafourrafContext _localctx = new VafourrafContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(C);
			setState(160);
			match(V);
			setState(161);
			match(C);
			setState(162);
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
		enterRule(_localctx, 32, RULE_cafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(C);
			setState(165);
			match(C);
			setState(166);
			match(V);
			setState(167);
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
		enterRule(_localctx, 34, RULE_gismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(C);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(170);
				match(C);
				setState(171);
				match(V);
				}
				break;
			case V:
				{
				setState(172);
				match(V);
				setState(173);
				match(C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(C);
			setState(177);
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
		enterRule(_localctx, 36, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 38, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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

	public static final String _serializedATN =
		"\u0004\u0001\b\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0001\u0001\u0001\u0005\u00012\b"+
		"\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006J\b\u0006\u0001"+
		"\u0006\u0003\u0006M\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\bU\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\tg\b\t\u0001\t\u0001\t\u0001\t\u0003\tl\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0003\nr\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nx\b\n\n\n\f\n{\t\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0083\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0088\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u008e\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00af\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0000\u00bc\u0000+\u0001\u0000\u0000\u0000\u0002"+
		"/\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006;\u0001"+
		"\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010_\u0001"+
		"\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000"+
		"\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008d\u0001\u0000\u0000"+
		"\u0000\u001a\u008f\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000\u0000"+
		"\u0000\u001e\u009f\u0001\u0000\u0000\u0000 \u00a4\u0001\u0000\u0000\u0000"+
		"\"\u00a9\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000\u0000&\u00b5"+
		"\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005\u0001\u0000"+
		"\u0000*,\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0001"+
		"\u0001\u0000\u0000\u0000/3\u0003\u0004\u0002\u000002\u0003\u0004\u0002"+
		"\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u00006:\u0003\u0006\u0003\u00007:\u0003\"\u0011\u0000"+
		"8:\u0003\b\u0004\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005\u0004"+
		"\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=B\u0003\n\u0005\u0000>B\u0003"+
		"\f\u0006\u0000?B\u0003\u000e\u0007\u0000@B\u0003\u0010\b\u0000A=\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"A@\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0003\u0012\t"+
		"\u0000DE\u0003$\u0012\u0000EF\u0003\u0014\n\u0000F\u000b\u0001\u0000\u0000"+
		"\u0000GJ\u0003\u0012\t\u0000HJ\u0003\u0016\u000b\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KM\u0003\u0014"+
		"\n\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\r\u0001"+
		"\u0000\u0000\u0000NO\u0003\u0018\f\u0000OP\u0003$\u0012\u0000PQ\u0003"+
		"\u0014\n\u0000Q\u000f\u0001\u0000\u0000\u0000RT\u0003\u001a\r\u0000SU"+
		"\u0003&\u0013\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0003\u0018\f\u0000W`\u0001\u0000\u0000\u0000"+
		"XY\u0003\u001c\u000e\u0000YZ\u0003&\u0013\u0000Z[\u0003\u001e\u000f\u0000"+
		"[`\u0001\u0000\u0000\u0000\\]\u0003\u001c\u000e\u0000]^\u0003 \u0010\u0000"+
		"^`\u0001\u0000\u0000\u0000_R\u0001\u0000\u0000\u0000_X\u0001\u0000\u0000"+
		"\u0000_\\\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0003$\u0012"+
		"\u0000bc\u0003\u0014\n\u0000c\u0011\u0001\u0000\u0000\u0000df\u0003\u001a"+
		"\r\u0000eg\u0003&\u0013\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gl\u0001\u0000\u0000\u0000hi\u0003\u001c\u000e\u0000ij\u0003"+
		"&\u0013\u0000jl\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003\u001a\r\u0000n\u0013"+
		"\u0001\u0000\u0000\u0000oq\u0003\u001a\r\u0000pr\u0003$\u0012\u0000qp"+
		"\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rx\u0001\u0000\u0000"+
		"\u0000st\u0003\u0018\f\u0000tu\u0003$\u0012\u0000ux\u0001\u0000\u0000"+
		"\u0000vx\u0003\u001c\u000e\u0000wo\u0001\u0000\u0000\u0000ws\u0001\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z~\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|\u007f\u0003\u001c\u000e\u0000}\u007f\u0003"+
		"\"\u0011\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0015\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u001a\r\u0000\u0081\u0083"+
		"\u0003&\u0013\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u001c\u000e\u0000\u0085\u0086\u0003&\u0013\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0080\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u001c"+
		"\u000e\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u008e\u0003\u001e"+
		"\u000f\u0000\u008c\u008e\u0003 \u0010\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000"+
		"\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u001b\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\u0007\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095"+
		"\u009e\u0005\b\u0000\u0000\u0096\u0097\u0005\u0007\u0000\u0000\u0097\u0098"+
		"\u0005\u0007\u0000\u0000\u0098\u009e\u0005\b\u0000\u0000\u0099\u009a\u0005"+
		"\u0007\u0000\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005\u0002"+
		"\u0000\u0000\u009c\u009e\u0005\b\u0000\u0000\u009d\u0093\u0001\u0000\u0000"+
		"\u0000\u009d\u0096\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000"+
		"\u0000\u009e\u001d\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0007\u0000"+
		"\u0000\u00a0\u00a1\u0005\b\u0000\u0000\u00a1\u00a2\u0005\u0007\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0007\u0000\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000"+
		"\u00a6\u00a7\u0005\b\u0000\u0000\u00a7\u00a8\u0005\u0007\u0000\u0000\u00a8"+
		"!\u0001\u0000\u0000\u0000\u00a9\u00ae\u0005\u0007\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0007\u0000\u0000\u00ab\u00af\u0005\b\u0000\u0000\u00ac\u00ad\u0005"+
		"\b\u0000\u0000\u00ad\u00af\u0005\u0007\u0000\u0000\u00ae\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000\u00b1\u00b2\u0005\b\u0000"+
		"\u0000\u00b2#\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0005\u0000\u0000"+
		"\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6"+
		"\'\u0001\u0000\u0000\u0000\u0013-39AILT_fkqwy~\u0082\u0087\u008d\u009d"+
		"\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}