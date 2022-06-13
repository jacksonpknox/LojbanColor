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
		RULE_gismu = 5, RULE_tworafcon = 6, RULE_y = 7, RULE_tailvo = 8, RULE_tworafvow = 9, 
		RULE_stump = 10, RULE_rafstump = 11, RULE_balraf = 12, RULE_q = 13, RULE_broraf = 14, 
		RULE_bauraf = 15, RULE_vuraf = 16, RULE_cafourraf = 17, RULE_ckfourraf = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"lujvo", "bobvo", "cobvo", "dobvo", "fobvo", "gismu", "tworafcon", "y", 
			"tailvo", "tworafvow", "stump", "rafstump", "balraf", "q", "broraf", 
			"bauraf", "vuraf", "cafourraf", "ckfourraf"
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
		public GismuContext gismu() {
			return getRuleContext(GismuContext.class,0);
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
			setState(43);
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				gismu();
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
			setState(45);
			tworafcon();
			setState(46);
			y();
			setState(47);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(49);
				tworafcon();
				}
				break;
			case 2:
				{
				setState(50);
				tworafvow();
				}
				break;
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C) {
				{
				setState(53);
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
			setState(56);
			stump();
			setState(57);
			y();
			setState(58);
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
			setState(60);
			rafstump();
			setState(61);
			y();
			setState(62);
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
		enterRule(_localctx, 10, RULE_gismu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(C);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(65);
				match(C);
				setState(66);
				match(V);
				}
				break;
			case V:
				{
				setState(67);
				match(V);
				setState(68);
				match(C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(71);
			match(C);
			setState(72);
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
		enterRule(_localctx, 12, RULE_tworafcon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74);
				balraf();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(75);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(78);
				broraf();
				}
				break;
			case 3:
				{
				setState(79);
				bauraf();
				setState(80);
				q();
				}
				break;
			}
			setState(84);
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
		enterRule(_localctx, 14, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 16, RULE_tailvo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(88);
						balraf();
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(89);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(92);
						stump();
						setState(93);
						y();
						}
						break;
					case 3:
						{
						setState(95);
						vuraf();
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(101);
				vuraf();
				}
				break;
			case 2:
				{
				setState(102);
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
		enterRule(_localctx, 18, RULE_tworafvow);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(105);
					balraf();
					}
					break;
				case 2:
					{
					setState(106);
					broraf();
					}
					break;
				case 3:
					{
					setState(107);
					bauraf();
					}
					break;
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(110);
					q();
					}
				}

				setState(113);
				broraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(115);
					balraf();
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Q) {
						{
						setState(116);
						q();
						}
					}

					}
					break;
				case 2:
					{
					setState(119);
					vuraf();
					setState(120);
					q();
					}
					break;
				}
				setState(124);
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
		enterRule(_localctx, 20, RULE_stump);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				cafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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
		enterRule(_localctx, 22, RULE_rafstump);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				balraf();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(133);
					q();
					}
				}

				setState(136);
				stump();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				vuraf();
				setState(139);
				q();
				setState(140);
				cafourraf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				vuraf();
				setState(143);
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
		enterRule(_localctx, 24, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(C);
			setState(148);
			match(V);
			setState(149);
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
		enterRule(_localctx, 26, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 28, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(C);
			setState(154);
			match(C);
			setState(155);
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
		enterRule(_localctx, 30, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(C);
			setState(158);
			match(V);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(159);
				match(T__0);
				}
			}

			setState(162);
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
		enterRule(_localctx, 32, RULE_vuraf);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				bauraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
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
			setState(168);
			match(C);
			setState(169);
			match(V);
			setState(170);
			match(C);
			setState(171);
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
			setState(173);
			match(C);
			setState(174);
			match(C);
			setState(175);
			match(V);
			setState(176);
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
		"\u0004\u0001\u0005\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000,\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002\u0003\u00027\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005F\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b[\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\ba\b\b\n\b\f\bd\t\b\u0001\b\u0001\b\u0003\bh\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0003\tm\b\t\u0001\t\u0003\tp\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tv\b\t\u0001\t\u0001\t\u0001\t\u0003\t{\b\t\u0001"+
		"\t\u0001\t\u0003\t\u007f\b\t\u0001\n\u0001\n\u0003\n\u0083\b\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0087\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0092\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00a1\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00a7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0000"+
		"\u00ba\u0000+\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004"+
		"3\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b<\u0001\u0000"+
		"\u0000\u0000\n@\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000e"+
		"V\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000\u0012~\u0001"+
		"\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u0091\u0001"+
		"\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u0097\u0001"+
		"\u0000\u0000\u0000\u001c\u0099\u0001\u0000\u0000\u0000\u001e\u009d\u0001"+
		"\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\"\u00a8\u0001\u0000"+
		"\u0000\u0000$\u00ad\u0001\u0000\u0000\u0000&,\u0003\u0002\u0001\u0000"+
		"\',\u0003\u0004\u0002\u0000(,\u0003\u0006\u0003\u0000),\u0003\b\u0004"+
		"\u0000*,\u0003\n\u0005\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000"+
		"\u0000\u0000+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001"+
		"\u0000\u0000\u0000,\u0001\u0001\u0000\u0000\u0000-.\u0003\f\u0006\u0000"+
		"./\u0003\u000e\u0007\u0000/0\u0003\u0010\b\u00000\u0003\u0001\u0000\u0000"+
		"\u000014\u0003\f\u0006\u000024\u0003\u0012\t\u000031\u0001\u0000\u0000"+
		"\u000032\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000057\u0003\u0010"+
		"\b\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0005\u0001"+
		"\u0000\u0000\u000089\u0003\u0014\n\u00009:\u0003\u000e\u0007\u0000:;\u0003"+
		"\u0010\b\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0003\u0016\u000b\u0000"+
		"=>\u0003\u000e\u0007\u0000>?\u0003\u0010\b\u0000?\t\u0001\u0000\u0000"+
		"\u0000@E\u0005\u0004\u0000\u0000AB\u0005\u0004\u0000\u0000BF\u0005\u0005"+
		"\u0000\u0000CD\u0005\u0005\u0000\u0000DF\u0005\u0004\u0000\u0000EA\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0004\u0000\u0000HI\u0005\u0005\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0018\f\u0000KM\u0003\u001a\r\u0000LK\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MS\u0001\u0000\u0000\u0000NS\u0003"+
		"\u001c\u000e\u0000OP\u0003\u001e\u000f\u0000PQ\u0003\u001a\r\u0000QS\u0001"+
		"\u0000\u0000\u0000RJ\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0018\f\u0000"+
		"U\r\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000\u0000W\u000f\u0001\u0000"+
		"\u0000\u0000XZ\u0003\u0018\f\u0000Y[\u0003\u000e\u0007\u0000ZY\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[a\u0001\u0000\u0000\u0000\\]\u0003"+
		"\u0014\n\u0000]^\u0003\u000e\u0007\u0000^a\u0001\u0000\u0000\u0000_a\u0003"+
		" \u0010\u0000`X\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cg\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000eh\u0003 \u0010\u0000fh\u0003\n\u0005\u0000ge\u0001\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000h\u0011\u0001\u0000\u0000\u0000im\u0003"+
		"\u0018\f\u0000jm\u0003\u001c\u000e\u0000km\u0003\u001e\u000f\u0000li\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000"+
		"mo\u0001\u0000\u0000\u0000np\u0003\u001a\r\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0003\u001c\u000e"+
		"\u0000r\u007f\u0001\u0000\u0000\u0000su\u0003\u0018\f\u0000tv\u0003\u001a"+
		"\r\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v{\u0001\u0000"+
		"\u0000\u0000wx\u0003 \u0010\u0000xy\u0003\u001a\r\u0000y{\u0001\u0000"+
		"\u0000\u0000zs\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0003\u001e\u000f\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~l\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0013"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0003\"\u0011\u0000\u0081\u0083\u0003"+
		"$\u0012\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0015\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0018"+
		"\f\u0000\u0085\u0087\u0003\u001a\r\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0003\u0014\n\u0000\u0089\u0092\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003 \u0010\u0000\u008b\u008c\u0003\u001a\r\u0000\u008c"+
		"\u008d\u0003\"\u0011\u0000\u008d\u0092\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0003 \u0010\u0000\u008f\u0090\u0003$\u0012\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u0084\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000"+
		"\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092\u0017\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0004\u0000\u0000\u0094\u0095\u0005\u0005"+
		"\u0000\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0019\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u001b\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u0005\u0004"+
		"\u0000\u0000\u009b\u009c\u0005\u0005\u0000\u0000\u009c\u001d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e\u00a0\u0005\u0005"+
		"\u0000\u0000\u009f\u00a1\u0005\u0001\u0000\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000\u00a3\u001f\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a7\u0003\u001e\u000f\u0000\u00a5\u00a7\u0003\u001c"+
		"\u000e\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0004\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0005\u0004\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac#\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0005\u0004\u0000\u0000"+
		"\u00af\u00b0\u0005\u0005\u0000\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000"+
		"\u00b1%\u0001\u0000\u0000\u0000\u0014+36ELRZ`bglouz~\u0082\u0086\u0091"+
		"\u00a0\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}