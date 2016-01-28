// Generated from /Users/clementgarbay/Documents/Mines/Langage de programmation/Structure et exécution des langages de programmation/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCalcParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, INTLIT=18, BOOLIT=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'*'", "'-'", "':'", "'('", "'<'", "'!='", 
		"'<='", "'&&'", "'?'", "'||'", "'>'", "'=='", "'/'", "'>='", "'!'", "INTLIT", 
		"BOOLIT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_expression = 2;
	public static final String[] ruleNames = {
		"program", "body", "expression"
	};

	@Override
	public String getGrammarFileName() { return "CCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CCalcParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); body();
			setState(7); match(EOF);
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

	public static class BodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BooLitContext extends ExpressionContext {
		public TerminalNode BOOLIT() { return getToken(CCalcParser.BOOLIT, 0); }
		public BooLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitBooLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CondExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitCondExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinExpContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitBinExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitContext extends ExpressionContext {
		public TerminalNode INTLIT() { return getToken(CCalcParser.INTLIT, 0); }
		public IntLitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitUnaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CCalcVisitor ) return ((CCalcVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			switch (_input.LA(1)) {
			case 4:
			case 17:
				{
				_localctx = new UnaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(12);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==17) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(13); expression(11);
				}
				break;
			case 6:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14); match(6);
				setState(15); expression(0);
				setState(16); match(1);
				}
				break;
			case BOOLIT:
				{
				_localctx = new BooLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18); match(BOOLIT);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19); match(INTLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(22);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(23);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==15) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(24); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(25);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(26);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==4) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(27); expression(10);
						}
						break;

					case 3:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(28);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(29);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 13) | (1L << 16))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(30); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(31);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(32);
						_la = _input.LA(1);
						if ( !(_la==8 || _la==14) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(33); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(34);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						{
						setState(35); match(10);
						}
						setState(36); expression(7);
						}
						break;

					case 6:
						{
						_localctx = new BinExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(37);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						{
						setState(38); match(12);
						}
						setState(39); expression(6);
						}
						break;

					case 7:
						{
						_localctx = new CondExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(41); match(11);
						setState(42); expression(0);
						setState(43); match(5);
						setState(44); expression(4);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\27\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4\3\4\2"+
		"\5\2\4\6\2\7\4\2\6\6\23\23\4\2\5\5\21\21\4\2\4\4\6\6\6\2\t\t\13\13\17"+
		"\17\22\22\4\2\n\n\20\20<\2\b\3\2\2\2\4\13\3\2\2\2\6\26\3\2\2\2\b\t\5\4"+
		"\3\2\t\n\7\2\2\3\n\3\3\2\2\2\13\f\5\6\4\2\f\5\3\2\2\2\r\16\b\4\1\2\16"+
		"\17\t\2\2\2\17\27\5\6\4\2\20\21\7\b\2\2\21\22\5\6\4\2\22\23\7\3\2\2\23"+
		"\27\3\2\2\2\24\27\7\25\2\2\25\27\7\24\2\2\26\r\3\2\2\2\26\20\3\2\2\2\26"+
		"\24\3\2\2\2\26\25\3\2\2\2\27\62\3\2\2\2\30\31\6\4\2\3\31\32\t\3\2\2\32"+
		"\61\5\6\4\2\33\34\6\4\3\3\34\35\t\4\2\2\35\61\5\6\4\2\36\37\6\4\4\3\37"+
		" \t\5\2\2 \61\5\6\4\2!\"\6\4\5\3\"#\t\6\2\2#\61\5\6\4\2$%\6\4\6\3%&\7"+
		"\f\2\2&\61\5\6\4\2\'(\6\4\7\3()\7\16\2\2)\61\5\6\4\2*+\6\4\b\3+,\7\r\2"+
		"\2,-\5\6\4\2-.\7\7\2\2./\5\6\4\2/\61\3\2\2\2\60\30\3\2\2\2\60\33\3\2\2"+
		"\2\60\36\3\2\2\2\60!\3\2\2\2\60$\3\2\2\2\60\'\3\2\2\2\60*\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\5\26\60"+
		"\62";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}