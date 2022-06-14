// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\lujvolyzer\LujvoForLex.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LujvoForLexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "LujvoForLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LujvoForLexParser(TokenStream input) {
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
		public List<TerminalNode> C() { return getTokens(LujvoForLexParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoForLexParser.C, i);
		}
		public List<TerminalNode> V() { return getTokens(LujvoForLexParser.V); }
		public TerminalNode V(int i) {
			return getToken(LujvoForLexParser.V, i);
		}
		public GismuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gismu; }
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
		public TerminalNode Y() { return getToken(LujvoForLexParser.Y, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
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
		public List<BaurafContext> bauraf() {
			return getRuleContexts(BaurafContext.class);
		}
		public BaurafContext bauraf(int i) {
			return getRuleContext(BaurafContext.class,i);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public TworafvowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tworafvow; }
	}

	public final TworafvowContext tworafvow() throws RecognitionException {
		TworafvowContext _localctx = new TworafvowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tworafvow);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(115);
						balraf();
						}
						break;
					case 2:
						{
						setState(116);
						broraf();
						}
						break;
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Q) {
						{
						setState(119);
						q();
						}
					}

					}
					break;
				case 2:
					{
					setState(122);
					bauraf();
					setState(123);
					q();
					}
					break;
				}
				setState(127);
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
		enterRule(_localctx, 20, RULE_stump);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				cafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 22, RULE_rafstump);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				balraf();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(136);
					q();
					}
				}

				setState(139);
				stump();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				vuraf();
				setState(142);
				q();
				setState(143);
				cafourraf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				vuraf();
				setState(146);
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
		public List<TerminalNode> C() { return getTokens(LujvoForLexParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoForLexParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoForLexParser.V, 0); }
		public BalrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balraf; }
	}

	public final BalrafContext balraf() throws RecognitionException {
		BalrafContext _localctx = new BalrafContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(C);
			setState(151);
			match(V);
			setState(152);
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
		public TerminalNode Q() { return getToken(LujvoForLexParser.Q, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		public List<TerminalNode> C() { return getTokens(LujvoForLexParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoForLexParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoForLexParser.V, 0); }
		public BrorafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_broraf; }
	}

	public final BrorafContext broraf() throws RecognitionException {
		BrorafContext _localctx = new BrorafContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(C);
			setState(157);
			match(C);
			setState(158);
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
		public TerminalNode C() { return getToken(LujvoForLexParser.C, 0); }
		public List<TerminalNode> V() { return getTokens(LujvoForLexParser.V); }
		public TerminalNode V(int i) {
			return getToken(LujvoForLexParser.V, i);
		}
		public BaurafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bauraf; }
	}

	public final BaurafContext bauraf() throws RecognitionException {
		BaurafContext _localctx = new BaurafContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(C);
			setState(161);
			match(V);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(162);
				match(T__0);
				}
			}

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
		enterRule(_localctx, 32, RULE_vuraf);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				bauraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
		public List<TerminalNode> C() { return getTokens(LujvoForLexParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoForLexParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoForLexParser.V, 0); }
		public CafourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cafourraf; }
	}

	public final CafourrafContext cafourraf() throws RecognitionException {
		CafourrafContext _localctx = new CafourrafContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(C);
			setState(172);
			match(V);
			setState(173);
			match(C);
			setState(174);
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
		public List<TerminalNode> C() { return getTokens(LujvoForLexParser.C); }
		public TerminalNode C(int i) {
			return getToken(LujvoForLexParser.C, i);
		}
		public TerminalNode V() { return getToken(LujvoForLexParser.V, 0); }
		public CkfourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ckfourraf; }
	}

	public final CkfourrafContext ckfourraf() throws RecognitionException {
		CkfourrafContext _localctx = new CkfourrafContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ckfourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(C);
			setState(177);
			match(C);
			setState(178);
			match(V);
			setState(179);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4\66\n\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7H\n\7\3\7\3\7\3\7\3\b\3\b\5\bO\n\b\3\b\3\b\3\b\3\b\5\bU"+
		"\n\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n]\n\n\3\n\3\n\3\n\3\n\7\nc\n\n\f\n\16"+
		"\nf\13\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\5\13o\n\13\3\13\5\13r\n\13\3"+
		"\13\3\13\3\13\3\13\5\13x\n\13\3\13\5\13{\n\13\3\13\3\13\3\13\5\13\u0080"+
		"\n\13\3\13\3\13\5\13\u0084\n\13\3\f\3\f\5\f\u0088\n\f\3\r\3\r\5\r\u008c"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a6\n\21\3\21"+
		"\3\21\3\22\3\22\5\22\u00ac\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2"+
		"\2\u00c0\2-\3\2\2\2\4/\3\2\2\2\6\65\3\2\2\2\b:\3\2\2\2\n>\3\2\2\2\fB\3"+
		"\2\2\2\16T\3\2\2\2\20X\3\2\2\2\22d\3\2\2\2\24\u0083\3\2\2\2\26\u0087\3"+
		"\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u009c\3\2\2\2\36\u009e\3\2"+
		"\2\2 \u00a2\3\2\2\2\"\u00ab\3\2\2\2$\u00ad\3\2\2\2&\u00b2\3\2\2\2(.\5"+
		"\4\3\2).\5\6\4\2*.\5\b\5\2+.\5\n\6\2,.\5\f\7\2-(\3\2\2\2-)\3\2\2\2-*\3"+
		"\2\2\2-+\3\2\2\2-,\3\2\2\2.\3\3\2\2\2/\60\5\16\b\2\60\61\5\20\t\2\61\62"+
		"\5\22\n\2\62\5\3\2\2\2\63\66\5\16\b\2\64\66\5\24\13\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\668\3\2\2\2\679\5\22\n\28\67\3\2\2\289\3\2\2\29\7\3\2\2\2"+
		":;\5\26\f\2;<\5\20\t\2<=\5\22\n\2=\t\3\2\2\2>?\5\30\r\2?@\5\20\t\2@A\5"+
		"\22\n\2A\13\3\2\2\2BG\7\6\2\2CD\7\6\2\2DH\7\7\2\2EF\7\7\2\2FH\7\6\2\2"+
		"GC\3\2\2\2GE\3\2\2\2HI\3\2\2\2IJ\7\6\2\2JK\7\7\2\2K\r\3\2\2\2LN\5\32\16"+
		"\2MO\5\34\17\2NM\3\2\2\2NO\3\2\2\2OU\3\2\2\2PU\5\36\20\2QR\5 \21\2RS\5"+
		"\34\17\2SU\3\2\2\2TL\3\2\2\2TP\3\2\2\2TQ\3\2\2\2UV\3\2\2\2VW\5\32\16\2"+
		"W\17\3\2\2\2XY\7\4\2\2Y\21\3\2\2\2Z\\\5\32\16\2[]\5\20\t\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]c\3\2\2\2^_\5\26\f\2_`\5\20\t\2`c\3\2\2\2ac\5\"\22\2bZ\3\2"+
		"\2\2b^\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ei\3\2\2\2fd\3\2"+
		"\2\2gj\5\"\22\2hj\5\f\7\2ig\3\2\2\2ih\3\2\2\2j\23\3\2\2\2ko\5\32\16\2"+
		"lo\5\36\20\2mo\5 \21\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2oq\3\2\2\2pr\5\34"+
		"\17\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\5\36\20\2t\u0084\3\2\2\2ux\5\32"+
		"\16\2vx\5\36\20\2wu\3\2\2\2wv\3\2\2\2xz\3\2\2\2y{\5\34\17\2zy\3\2\2\2"+
		"z{\3\2\2\2{\u0080\3\2\2\2|}\5 \21\2}~\5\34\17\2~\u0080\3\2\2\2\177w\3"+
		"\2\2\2\177|\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5 \21\2\u0082\u0084"+
		"\3\2\2\2\u0083n\3\2\2\2\u0083\177\3\2\2\2\u0084\25\3\2\2\2\u0085\u0088"+
		"\5$\23\2\u0086\u0088\5&\24\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\27\3\2\2\2\u0089\u008b\5\32\16\2\u008a\u008c\5\34\17\2\u008b\u008a\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\26\f\2\u008e"+
		"\u0097\3\2\2\2\u008f\u0090\5\"\22\2\u0090\u0091\5\34\17\2\u0091\u0092"+
		"\5$\23\2\u0092\u0097\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\5&\24\2"+
		"\u0095\u0097\3\2\2\2\u0096\u0089\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0093"+
		"\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009a\7\7\2\2\u009a"+
		"\u009b\7\6\2\2\u009b\33\3\2\2\2\u009c\u009d\7\5\2\2\u009d\35\3\2\2\2\u009e"+
		"\u009f\7\6\2\2\u009f\u00a0\7\6\2\2\u00a0\u00a1\7\7\2\2\u00a1\37\3\2\2"+
		"\2\u00a2\u00a3\7\6\2\2\u00a3\u00a5\7\7\2\2\u00a4\u00a6\7\3\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\7\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00ac\5 \21\2\u00aa\u00ac\5\36\20\2\u00ab\u00a9\3\2\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af"+
		"\7\7\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7\6\2\2\u00b1%\3\2\2\2\u00b2"+
		"\u00b3\7\6\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\7\6"+
		"\2\2\u00b6\'\3\2\2\2\27-\658GNT\\bdinqwz\177\u0083\u0087\u008b\u0096\u00a5"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}