// Generated from Lujvo.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LujvoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Y=2, Q=3, C=4, V=5;
	public static final int
		RULE_lujvo = 0, RULE_bobvo = 1, RULE_cobvo = 2, RULE_dobvo = 3, RULE_fobvo = 4, 
		RULE_tworafcon = 5, RULE_y = 6, RULE_tailvo = 7, RULE_tworafvow = 8, RULE_stump = 9, 
		RULE_rafstump = 10, RULE_balraf = 11, RULE_q = 12, RULE_broraf = 13, RULE_bauraf = 14, 
		RULE_vuraf = 15, RULE_gismu = 16, RULE_cafourraf = 17, RULE_ckfourraf = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"lujvo", "bobvo", "cobvo", "dobvo", "fobvo", "tworafcon", "y", "tailvo", 
			"tworafvow", "stump", "rafstump", "balraf", "q", "broraf", "bauraf", 
			"vuraf", "gismu", "cafourraf", "ckfourraf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'''", "'y'", "'q'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Y", "Q", "C", "V"
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
	public String getGrammarFileName() { return "Lujvo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LujvoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterLujvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitLujvo(this);
		}
	}

	public final LujvoContext lujvo() throws RecognitionException {
		LujvoContext _localctx = new LujvoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lujvo);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterBobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitBobvo(this);
		}
	}

	public final BobvoContext bobvo() throws RecognitionException {
		BobvoContext _localctx = new BobvoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			tworafcon();
			setState(45);
			y();
			setState(46);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterCobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitCobvo(this);
		}
	}

	public final CobvoContext cobvo() throws RecognitionException {
		CobvoContext _localctx = new CobvoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(48);
				tworafcon();
				}
				break;
			case 2:
				{
				setState(49);
				tworafvow();
				}
				break;
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(52);
				tailvo();
				}
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterDobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitDobvo(this);
		}
	}

	public final DobvoContext dobvo() throws RecognitionException {
		DobvoContext _localctx = new DobvoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			stump();
			setState(56);
			y();
			setState(57);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterFobvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitFobvo(this);
		}
	}

	public final FobvoContext fobvo() throws RecognitionException {
		FobvoContext _localctx = new FobvoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fobvo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			rafstump();
			setState(60);
			y();
			setState(61);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterTworafcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitTworafcon(this);
		}
	}

	public final TworafconContext tworafcon() throws RecognitionException {
		TworafconContext _localctx = new TworafconContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tworafcon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(63);
				balraf();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(64);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(67);
				broraf();
				}
				break;
			case 3:
				{
				setState(68);
				bauraf();
				setState(69);
				q();
				}
				break;
			}
			setState(73);
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
		public TerminalNode Y() { return getToken(LujvoParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitY(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterTailvo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitTailvo(this);
		}
	}

	public final TailvoContext tailvo() throws RecognitionException {
		TailvoContext _localctx = new TailvoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tailvo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(77);
						balraf();
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(78);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(81);
						stump();
						setState(82);
						y();
						}
						break;
					case 3:
						{
						setState(84);
						vuraf();
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(90);
				vuraf();
				}
				break;
			case 2:
				{
				setState(91);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterTworafvow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitTworafvow(this);
		}
	}

	public final TworafvowContext tworafvow() throws RecognitionException {
		TworafvowContext _localctx = new TworafvowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tworafvow);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(94);
					balraf();
					}
					break;
				case 2:
					{
					setState(95);
					broraf();
					}
					break;
				case 3:
					{
					setState(96);
					bauraf();
					}
					break;
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(99);
					q();
					}
				}

				setState(102);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(104);
					balraf();
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Q) {
						{
						setState(105);
						q();
						}
					}

					}
					break;
				case 2:
					{
					setState(108);
					vuraf();
					setState(109);
					q();
					}
					break;
				}
				setState(113);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterStump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitStump(this);
		}
	}

	public final StumpContext stump() throws RecognitionException {
		StumpContext _localctx = new StumpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stump);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				cafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterRafstump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitRafstump(this);
		}
	}

	public final RafstumpContext rafstump() throws RecognitionException {
		RafstumpContext _localctx = new RafstumpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rafstump);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				balraf();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(122);
					q();
					}
				}

				setState(125);
				stump();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				vuraf();
				setState(128);
				q();
				setState(129);
				cafourraf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				vuraf();
				setState(132);
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
		public List<TerminalNode> C() { return getTokens(LujvoParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoParser.V, 0); }
		public BalrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterBalraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitBalraf(this);
		}
	}

	public final BalrafContext balraf() throws RecognitionException {
		BalrafContext _localctx = new BalrafContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(C);
			setState(137);
			match(V);
			setState(138);
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
		public TerminalNode Q() { return getToken(LujvoParser.Q, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		public List<TerminalNode> C() { return getTokens(LujvoParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoParser.V, 0); }
		public BrorafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterBroraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitBroraf(this);
		}
	}

	public final BrorafContext broraf() throws RecognitionException {
		BrorafContext _localctx = new BrorafContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(C);
			setState(143);
			match(C);
			setState(144);
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
		public TerminalNode C() { return getToken(LujvoParser.C, 0); }
		public List<TerminalNode> V() { return getTokens(LujvoParser.V); }
		public TerminalNode V(int i) {
			return getToken(LujvoParser.V, i);
		}
		public BaurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bauraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterBauraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitBauraf(this);
		}
	}

	public final BaurafContext bauraf() throws RecognitionException {
		BaurafContext _localctx = new BaurafContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(C);
			setState(147);
			match(V);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(148);
				match(T__0);
				}
			}

			setState(151);
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
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterVuraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitVuraf(this);
		}
	}

	public final VurafContext vuraf() throws RecognitionException {
		VurafContext _localctx = new VurafContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_vuraf);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				bauraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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

	public static class GismuContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(LujvoParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(LujvoParser.V); }
		public TerminalNode V(int i) {
			return getToken(LujvoParser.V, i);
		}
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterGismu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitGismu(this);
		}
	}

	public final GismuContext gismu() throws RecognitionException {
		GismuContext _localctx = new GismuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(C);
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(158);
				match(C);
				setState(159);
				match(V);
				}
				break;
			case V:
				{
				setState(160);
				match(V);
				setState(161);
				match(C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			match(C);
			setState(165);
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

	public static class CafourrafContext extends ParserRuleContext {
		public List<TerminalNode> C() { return getTokens(LujvoParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoParser.V, 0); }
		public CafourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cafourraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterCafourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitCafourraf(this);
		}
	}

	public final CafourrafContext cafourraf() throws RecognitionException {
		CafourrafContext _localctx = new CafourrafContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(C);
			setState(168);
			match(V);
			setState(169);
			match(C);
			setState(170);
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
		public List<TerminalNode> C() { return getTokens(LujvoParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoParser.V, 0); }
		public CkfourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ckfourraf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).enterCkfourraf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LujvoListener ) ((LujvoListener)listener).exitCkfourraf(this);
		}
	}

	public final CkfourrafContext ckfourraf() throws RecognitionException {
		CkfourrafContext _localctx = new CkfourrafContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ckfourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(C);
			setState(173);
			match(C);
			setState(174);
			match(V);
			setState(175);
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
		"\u0004\u0001\u0005\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005B\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"P\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"V\b\u0007\n\u0007\f\u0007Y\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"]\b\u0007\u0001\b\u0001\b\u0001\b\u0003\bb\b\b\u0001\b\u0003\be\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bp\b\b\u0001\b\u0001\b\u0003\bt\b\b\u0001\t\u0001\t\u0003\tx\b\t\u0001"+
		"\n\u0001\n\u0003\n|\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0087\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0096\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u009c\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a3\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0000\u00b8"+
		"\u0000*\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u00042"+
		"\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b;\u0001\u0000"+
		"\u0000\u0000\nG\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000e"+
		"W\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012w\u0001"+
		"\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u0088\u0001"+
		"\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u008e\u0001"+
		"\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u009b\u0001"+
		"\u0000\u0000\u0000 \u009d\u0001\u0000\u0000\u0000\"\u00a7\u0001\u0000"+
		"\u0000\u0000$\u00ac\u0001\u0000\u0000\u0000&+\u0003\u0002\u0001\u0000"+
		"\'+\u0003\u0004\u0002\u0000(+\u0003\u0006\u0003\u0000)+\u0003\b\u0004"+
		"\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000"+
		"\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0001\u0001\u0000\u0000\u0000"+
		",-\u0003\n\u0005\u0000-.\u0003\f\u0006\u0000./\u0003\u000e\u0007\u0000"+
		"/\u0003\u0001\u0000\u0000\u000003\u0003\n\u0005\u000013\u0003\u0010\b"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000046\u0003\u000e\u0007\u000054\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0003\u0012\t\u0000"+
		"89\u0003\f\u0006\u00009:\u0003\u000e\u0007\u0000:\u0007\u0001\u0000\u0000"+
		"\u0000;<\u0003\u0014\n\u0000<=\u0003\f\u0006\u0000=>\u0003\u000e\u0007"+
		"\u0000>\t\u0001\u0000\u0000\u0000?A\u0003\u0016\u000b\u0000@B\u0003\u0018"+
		"\f\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BH\u0001\u0000"+
		"\u0000\u0000CH\u0003\u001a\r\u0000DE\u0003\u001c\u000e\u0000EF\u0003\u0018"+
		"\f\u0000FH\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000GC\u0001\u0000"+
		"\u0000\u0000GD\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0003"+
		"\u0016\u000b\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0005\u0002\u0000"+
		"\u0000L\r\u0001\u0000\u0000\u0000MO\u0003\u0016\u000b\u0000NP\u0003\f"+
		"\u0006\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PV\u0001"+
		"\u0000\u0000\u0000QR\u0003\u0012\t\u0000RS\u0003\f\u0006\u0000SV\u0001"+
		"\u0000\u0000\u0000TV\u0003\u001e\u000f\u0000UM\u0001\u0000\u0000\u0000"+
		"UQ\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\\\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0003\u001e\u000f\u0000[]\u0003"+
		" \u0010\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000f"+
		"\u0001\u0000\u0000\u0000^b\u0003\u0016\u000b\u0000_b\u0003\u001a\r\u0000"+
		"`b\u0003\u001c\u000e\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ce\u0003\u0018"+
		"\f\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0003\u001a\r\u0000gt\u0001\u0000\u0000\u0000hj\u0003\u0016"+
		"\u000b\u0000ik\u0003\u0018\f\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kp\u0001\u0000\u0000\u0000lm\u0003\u001e\u000f\u0000mn\u0003"+
		"\u0018\f\u0000np\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000ol\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0003\u001c\u000e\u0000"+
		"rt\u0001\u0000\u0000\u0000sa\u0001\u0000\u0000\u0000so\u0001\u0000\u0000"+
		"\u0000t\u0011\u0001\u0000\u0000\u0000ux\u0003\"\u0011\u0000vx\u0003$\u0012"+
		"\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0016\u000b\u0000z|\u0003\u0018\f\u0000{z\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0003\u0012\t\u0000~\u0087\u0001\u0000\u0000\u0000\u007f\u0080\u0003"+
		"\u001e\u000f\u0000\u0080\u0081\u0003\u0018\f\u0000\u0081\u0082\u0003\""+
		"\u0011\u0000\u0082\u0087\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u001e"+
		"\u000f\u0000\u0084\u0085\u0003$\u0012\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086y\u0001\u0000\u0000\u0000\u0086\u007f\u0001\u0000\u0000\u0000"+
		"\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000"+
		"\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u0019\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0005\u0004\u0000\u0000"+
		"\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u001b\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0095\u0005\u0005\u0000\u0000"+
		"\u0094\u0096\u0005\u0001\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u001d\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0003\u001c\u000e\u0000\u009a\u009c\u0003\u001a\r\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u001f\u0001\u0000\u0000\u0000\u009d\u00a2\u0005\u0004\u0000\u0000\u009e"+
		"\u009f\u0005\u0004\u0000\u0000\u009f\u00a3\u0005\u0005\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0005\u0000\u0000\u00a1\u00a3\u0005\u0004\u0000\u0000\u00a2"+
		"\u009e\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0005\u0000\u0000\u00a6!\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0004\u0000\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab#\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0004\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0004\u0000\u0000\u00ae\u00af\u0005\u0005\u0000\u0000\u00af\u00b0\u0005"+
		"\u0004\u0000\u0000\u00b0%\u0001\u0000\u0000\u0000\u0014*25AGOUW\\adjo"+
		"sw{\u0086\u0095\u009b\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}