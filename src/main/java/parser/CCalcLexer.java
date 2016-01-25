// Generated from /Users/clementgarbay/Documents/Mines/Langage de programmation/Structure et exécution des langages de programmation/calc2c/src/main/java/parser/CCalc.g4 by ANTLR 4.1
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
		INTLIT=1, BOOLIT=2, WS=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INTLIT", "BOOLIT", "WS"
	};
	public static final String[] ruleNames = {
		"INTLIT", "BOOLIT", "WS"
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
		case 2: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\5\"\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\5\2\22\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\2\5\3\3\1\5"+
		"\4\1\7\5\2\3\2\3\5\2\13\f\17\17\"\"$\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\3\21\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t\22\7\62\2\2\n\16\4\63;\2\13"+
		"\r\4\62;\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\22"+
		"\3\2\2\2\20\16\3\2\2\2\21\t\3\2\2\2\21\n\3\2\2\2\22\4\3\2\2\2\23\24\7"+
		"v\2\2\24\25\7t\2\2\25\26\7w\2\2\26\35\7g\2\2\27\30\7h\2\2\30\31\7c\2\2"+
		"\31\32\7n\2\2\32\33\7u\2\2\33\35\7g\2\2\34\23\3\2\2\2\34\27\3\2\2\2\35"+
		"\6\3\2\2\2\36\37\t\2\2\2\37 \3\2\2\2 !\b\4\2\2!\b\3\2\2\2\6\2\16\21\34";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}