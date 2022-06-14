// Generated from c:\Users\Jackson Paul Knox\VSCodeProjects\LojbanColor\grammars\CmavoP.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmavoPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PEHE=2, PEHO=3, PU=4;
	public static final int
		RULE_cmavop = 0, RULE_pa = 1, RULE_pehe = 2, RULE_peho = 3, RULE_pu = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmavop", "pa", "pehe", "peho", "pu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pe'e'", "'pe'o'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PEHE", "PEHO", "PU"
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
	public String getGrammarFileName() { return "CmavoP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmavoPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmavopContext extends ParserRuleContext {
		public PaContext pa() {
			return getRuleContext(PaContext.class,0);
		}
		public PeheContext pehe() {
			return getRuleContext(PeheContext.class,0);
		}
		public PehoContext peho() {
			return getRuleContext(PehoContext.class,0);
		}
		public PuContext pu() {
			return getRuleContext(PuContext.class,0);
		}
		public CmavopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmavop; }
	}

	public final CmavopContext cmavop() throws RecognitionException {
		CmavopContext _localctx = new CmavopContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmavop);
		try {
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				pa();
				}
				break;
			case PEHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				pehe();
				}
				break;
			case PEHO:
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				peho();
				}
				break;
			case PU:
				enterOuterAlt(_localctx, 4);
				{
				setState(13);
				pu();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PaContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(CmavoPParser.PA, 0); }
		public PaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pa; }
	}

	public final PaContext pa() throws RecognitionException {
		PaContext _localctx = new PaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
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

	public static class PeheContext extends ParserRuleContext {
		public TerminalNode PEHE() { return getToken(CmavoPParser.PEHE, 0); }
		public PeheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pehe; }
	}

	public final PeheContext pehe() throws RecognitionException {
		PeheContext _localctx = new PeheContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pehe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(PEHE);
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

	public static class PehoContext extends ParserRuleContext {
		public TerminalNode PEHO() { return getToken(CmavoPParser.PEHO, 0); }
		public PehoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peho; }
	}

	public final PehoContext peho() throws RecognitionException {
		PehoContext _localctx = new PehoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_peho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(PEHO);
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

	public static class PuContext extends ParserRuleContext {
		public TerminalNode PU() { return getToken(CmavoPParser.PU, 0); }
		public PuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pu; }
	}

	public final PuContext pu() throws RecognitionException {
		PuContext _localctx = new PuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(PU);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2\30\2\20\3\2\2\2\4\22\3\2"+
		"\2\2\6\24\3\2\2\2\b\26\3\2\2\2\n\30\3\2\2\2\f\21\5\4\3\2\r\21\5\6\4\2"+
		"\16\21\5\b\5\2\17\21\5\n\6\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20"+
		"\17\3\2\2\2\21\3\3\2\2\2\22\23\7\3\2\2\23\5\3\2\2\2\24\25\7\4\2\2\25\7"+
		"\3\2\2\2\26\27\7\5\2\2\27\t\3\2\2\2\30\31\7\6\2\2\31\13\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}