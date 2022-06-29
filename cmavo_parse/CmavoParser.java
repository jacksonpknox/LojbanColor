// Generated from Cmavo.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, C=2, V=3, AP=4, Y=5;
	public static final int
		RULE_cmavo = 0, RULE_cat_cmavo = 1, RULE_lerfu = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavo", "cat_cmavo", "lerfu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, "'''", "'y'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "C", "V", "AP", "Y"
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
	public String getGrammarFileName() { return "Cmavo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavoContext extends ParserRuleContext {
		public Cat_cmavoContext cat_cmavo() {
			return getRuleContext(Cat_cmavoContext.class,0);
		}
		public LerfuContext lerfu() {
			return getRuleContext(LerfuContext.class,0);
		}
		public CmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).enterCmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).exitCmavo(this);
		}
	}

	public final CmavoContext cmavo() throws RecognitionException {
		CmavoContext _localctx = new CmavoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavo);
		try {
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				cat_cmavo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				lerfu();
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

	public static class Cat_cmavoContext extends ParserRuleContext {
		public List<TerminalNode> V() { return getTokens(CmavoParser.V); }
		public TerminalNode V(int i) {
			return getToken(CmavoParser.V, i);
		}
		public TerminalNode DOT() { return getToken(CmavoParser.DOT, 0); }
		public TerminalNode C() { return getToken(CmavoParser.C, 0); }
		public List<TerminalNode> AP() { return getTokens(CmavoParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(CmavoParser.AP, i);
		}
		public Cat_cmavoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cat_cmavo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).enterCat_cmavo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).exitCat_cmavo(this);
		}
	}

	public final Cat_cmavoContext cat_cmavo() throws RecognitionException {
		Cat_cmavoContext _localctx = new Cat_cmavoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cat_cmavo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==C) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(11);
			match(V);
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==V || _la==AP) {
				{
				{
				setState(12);
				_la = _input.LA(1);
				if ( !(_la==V || _la==AP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(17);
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

	public static class LerfuContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(CmavoParser.C, 0); }
		public TerminalNode Y() { return getToken(CmavoParser.Y, 0); }
		public TerminalNode DOT() { return getToken(CmavoParser.DOT, 0); }
		public LerfuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lerfu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).enterLerfu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmavoListener ) ((CmavoListener)listener).exitLerfu(this);
		}
	}

	public final LerfuContext lerfu() throws RecognitionException {
		LerfuContext _localctx = new LerfuContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lerfu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(C);
			setState(19);
			match(Y);
			setState(20);
			match(DOT);
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
		"\u0004\u0001\u0005\u0017\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0003\u0000\t\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u000e\b\u0001\n\u0001"+
		"\f\u0001\u0011\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0002\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0003\u0004\u0015\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0002\n\u0001\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006"+
		"\t\u0003\u0002\u0001\u0000\u0007\t\u0003\u0004\u0002\u0000\b\u0006\u0001"+
		"\u0000\u0000\u0000\b\u0007\u0001\u0000\u0000\u0000\t\u0001\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0007\u0000\u0000\u0000\u000b\u000f\u0005\u0003\u0000"+
		"\u0000\f\u000e\u0007\u0001\u0000\u0000\r\f\u0001\u0000\u0000\u0000\u000e"+
		"\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0002\u0000\u0000\u0013\u0014"+
		"\u0005\u0005\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0005"+
		"\u0001\u0000\u0000\u0000\u0002\b\u000f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}