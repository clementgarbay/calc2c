// Generated from /Users/noye/Documents/Teaching/FIL1/SELP/workspace/CCalcV0/src/parser/CCalc.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCalcLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTLIT=1, WS=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INTLIT", "WS"
	};
	public static final String[] ruleNames = {
		"INTLIT", "WS"
	};


	public CCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CCalc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\4\25\b\1\4\2\t\2"+
		"\4\3\t\3\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\5\2\20\n\2\3\3\3\3\3"+
		"\3\3\3\2\4\3\3\1\5\4\2\3\2\3\5\2\13\f\17\17\"\"\26\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\3\17\3\2\2\2\5\21\3\2\2\2\7\20\7\62\2\2\b\f\4\63;\2\t\13\4\62;\2"+
		"\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\20\3\2\2\2\16\f\3"+
		"\2\2\2\17\7\3\2\2\2\17\b\3\2\2\2\20\4\3\2\2\2\21\22\t\2\2\2\22\23\3\2"+
		"\2\2\23\24\b\3\2\2\24\6\3\2\2\2\5\2\f\17";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}