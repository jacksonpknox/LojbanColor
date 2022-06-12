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
		RULE_fourraf = 14, RULE_balraf = 15, RULE_q = 16, RULE_vuraf = 17, RULE_cafourraf = 18, 
		RULE_ckfourraf = 19, RULE_bauraf = 20, RULE_broraf = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"folio", "sentence", "word", "cmavo", "gismu", "lujvo", "bobvo", "cobvo", 
			"dobvo", "fobvo", "tworafcon", "y", "tailvo", "tworafvow", "fourraf", 
			"balraf", "q", "vuraf", "cafourraf", "ckfourraf", "bauraf", "broraf"
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				sentence();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(45);
					match(T__0);
					}
				}

				setState(48);
				match(T__1);
				}
				}
				setState(52); 
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				word();
				}
				}
				setState(57); 
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				gismu();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
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
			setState(64);
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
			setState(66);
			match(C);
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case C:
				{
				setState(67);
				match(C);
				setState(68);
				match(V);
				}
				break;
			case V:
				{
				setState(69);
				match(V);
				setState(70);
				match(C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(73);
			match(C);
			setState(74);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				bobvo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				cobvo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				dobvo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
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
			setState(82);
			tworafcon();
			setState(83);
			y();
			setState(84);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				tworafcon();
				}
				break;
			case 2:
				{
				setState(87);
				tworafvow();
				}
				break;
			}
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(90);
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
		public FourrafContext fourraf() {
			return getRuleContext(FourrafContext.class,0);
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
			setState(93);
			fourraf();
			setState(94);
			y();
			setState(95);
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
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TailvoContext tailvo() {
			return getRuleContext(TailvoContext.class,0);
		}
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
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
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public CkfourrafContext ckfourraf() {
			return getRuleContext(CkfourrafContext.class,0);
		}
		public FobvoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fobvo; }
	}

	public final FobvoContext fobvo() throws RecognitionException {
		FobvoContext _localctx = new FobvoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fobvo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(97);
				balraf();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(98);
					q();
					}
				}

				setState(101);
				fourraf();
				}
				break;
			case 2:
				{
				setState(103);
				vuraf();
				setState(104);
				q();
				setState(105);
				cafourraf();
				}
				break;
			case 3:
				{
				setState(107);
				vuraf();
				setState(108);
				ckfourraf();
				}
				break;
			}
			setState(112);
			y();
			setState(113);
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
		public VurafContext vuraf() {
			return getRuleContext(VurafContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
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
			setState(126);
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
	}

	public final TailvoContext tailvo() throws RecognitionException {
		TailvoContext _localctx = new TailvoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tailvo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(128);
						balraf();
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Y) {
							{
							setState(129);
							y();
							}
						}

						}
						break;
					case 2:
						{
						setState(132);
						fourraf();
						setState(133);
						y();
						}
						break;
					case 3:
						{
						setState(135);
						vuraf();
						}
						break;
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(141);
				vuraf();
				}
				break;
			case 2:
				{
				setState(142);
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
		public List<VurafContext> vuraf() {
			return getRuleContexts(VurafContext.class);
		}
		public VurafContext vuraf(int i) {
			return getRuleContext(VurafContext.class,i);
		}
		public BalrafContext balraf() {
			return getRuleContext(BalrafContext.class,0);
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
		enterRule(_localctx, 26, RULE_tworafvow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(145);
				balraf();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Q) {
					{
					setState(146);
					q();
					}
				}

				}
				break;
			case 2:
				{
				setState(149);
				vuraf();
				setState(150);
				q();
				}
				break;
			}
			setState(154);
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
		public CafourrafContext cafourraf() {
			return getRuleContext(CafourrafContext.class,0);
		}
		public CkfourrafContext ckfourraf() {
			return getRuleContext(CkfourrafContext.class,0);
		}
		public FourrafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fourraf; }
	}

	public final FourrafContext fourraf() throws RecognitionException {
		FourrafContext _localctx = new FourrafContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fourraf);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				cafourraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
		enterRule(_localctx, 30, RULE_balraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(C);
			setState(161);
			match(V);
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

	public static class QContext extends ParserRuleContext {
		public TerminalNode Q() { return getToken(ColorParser.Q, 0); }
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		enterRule(_localctx, 34, RULE_vuraf);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				bauraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
		enterRule(_localctx, 36, RULE_cafourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(C);
			setState(171);
			match(V);
			setState(172);
			match(C);
			setState(173);
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
		enterRule(_localctx, 38, RULE_ckfourraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(C);
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
		enterRule(_localctx, 40, RULE_bauraf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(C);
			setState(181);
			match(V);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(182);
				match(T__2);
				}
			}

			setState(185);
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
		enterRule(_localctx, 42, RULE_broraf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(C);
			setState(188);
			match(C);
			setState(189);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\5\4"+
		"A\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\5\7S\n\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t[\n\t\3\t\5\t^\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\5\13f\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13q\n\13\3\13\3\13\3\13\3\f\3\f\5\fx\n\f\3\f\3\f\3\f\5\f}\n\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\7\16\u008b\n\16"+
		"\f\16\16\16\u008e\13\16\3\16\3\16\5\16\u0092\n\16\3\17\3\17\5\17\u0096"+
		"\n\17\3\17\3\17\3\17\5\17\u009b\n\17\3\17\3\17\3\20\3\20\5\20\u00a1\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00ab\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00ba\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,\2\2\2\u00c5\2\64\3\2\2\2\49\3\2\2\2\6@\3\2\2\2\b"+
		"B\3\2\2\2\nD\3\2\2\2\fR\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22_\3\2\2\2\24"+
		"p\3\2\2\2\26|\3\2\2\2\30\u0080\3\2\2\2\32\u008c\3\2\2\2\34\u009a\3\2\2"+
		"\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00a6\3\2\2\2$\u00aa\3\2\2\2&\u00ac"+
		"\3\2\2\2(\u00b1\3\2\2\2*\u00b6\3\2\2\2,\u00bd\3\2\2\2.\60\5\4\3\2/\61"+
		"\7\3\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\4\2\2\63\65\3"+
		"\2\2\2\64.\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2"+
		"\2\28:\5\6\4\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=A\5"+
		"\b\5\2>A\5\n\6\2?A\5\f\7\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC"+
		"\7\7\2\2C\t\3\2\2\2DI\7\n\2\2EF\7\n\2\2FJ\7\13\2\2GH\7\13\2\2HJ\7\n\2"+
		"\2IE\3\2\2\2IG\3\2\2\2JK\3\2\2\2KL\7\n\2\2LM\7\13\2\2M\13\3\2\2\2NS\5"+
		"\16\b\2OS\5\20\t\2PS\5\22\n\2QS\5\24\13\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2"+
		"\2RQ\3\2\2\2S\r\3\2\2\2TU\5\26\f\2UV\5\30\r\2VW\5\32\16\2W\17\3\2\2\2"+
		"X[\5\26\f\2Y[\5\34\17\2ZX\3\2\2\2ZY\3\2\2\2[]\3\2\2\2\\^\5\32\16\2]\\"+
		"\3\2\2\2]^\3\2\2\2^\21\3\2\2\2_`\5\36\20\2`a\5\30\r\2ab\5\32\16\2b\23"+
		"\3\2\2\2ce\5 \21\2df\5\"\22\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\36\20"+
		"\2hq\3\2\2\2ij\5$\23\2jk\5\"\22\2kl\5&\24\2lq\3\2\2\2mn\5$\23\2no\5(\25"+
		"\2oq\3\2\2\2pc\3\2\2\2pi\3\2\2\2pm\3\2\2\2qr\3\2\2\2rs\5\30\r\2st\5\32"+
		"\16\2t\25\3\2\2\2uw\5 \21\2vx\5\"\22\2wv\3\2\2\2wx\3\2\2\2x}\3\2\2\2y"+
		"z\5$\23\2z{\5\"\22\2{}\3\2\2\2|u\3\2\2\2|y\3\2\2\2}~\3\2\2\2~\177\5 \21"+
		"\2\177\27\3\2\2\2\u0080\u0081\7\b\2\2\u0081\31\3\2\2\2\u0082\u0084\5 "+
		"\21\2\u0083\u0085\5\30\r\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u008b\3\2\2\2\u0086\u0087\5\36\20\2\u0087\u0088\5\30\r\2\u0088\u008b"+
		"\3\2\2\2\u0089\u008b\5$\23\2\u008a\u0082\3\2\2\2\u008a\u0086\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0091\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\5$\23\2\u0090"+
		"\u0092\5\n\6\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\33\3\2\2"+
		"\2\u0093\u0095\5 \21\2\u0094\u0096\5\"\22\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0098\5$\23\2\u0098\u0099\5\""+
		"\22\2\u0099\u009b\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\5$\23\2\u009d\35\3\2\2\2\u009e\u00a1\5&\24"+
		"\2\u009f\u00a1\5(\25\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\37"+
		"\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\7\n\2\2"+
		"\u00a5!\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7#\3\2\2\2\u00a8\u00ab\5*\26\2"+
		"\u00a9\u00ab\5,\27\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab%\3"+
		"\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\7\n\2\2\u00af"+
		"\u00b0\7\n\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\7\n\2\2"+
		"\u00b3\u00b4\7\13\2\2\u00b4\u00b5\7\n\2\2\u00b5)\3\2\2\2\u00b6\u00b7\7"+
		"\n\2\2\u00b7\u00b9\7\13\2\2\u00b8\u00ba\7\5\2\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\13\2\2\u00bc+\3\2\2\2"+
		"\u00bd\u00be\7\n\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\7\13\2\2\u00c0-\3"+
		"\2\2\2\27\60\66;@IRZ]epw|\u0084\u008a\u008c\u0091\u0095\u009a\u00a0\u00aa"+
		"\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}