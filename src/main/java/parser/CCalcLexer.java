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
		T__1=1, T__0=2, INTLIT=3, BOOLIT=4, OP=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "INTLIT", "BOOLIT", "OP", "WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "INTLIT", "BOOLIT", "OP", "WS"
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
		case 5: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\b.\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4"+
		"\27\n\4\f\4\16\4\32\13\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\'\n\5\3\6\3\6\3\7\3\7\3\7\3\7\2\b\3\3\1\5\4\1\7\5\1\t\6\1\13\7"+
		"\1\r\b\2\3\2\4\7\2,-//\61\61>>@@\5\2\13\f\17\17\"\"\60\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2"+
		"\5\21\3\2\2\2\7\33\3\2\2\2\t&\3\2\2\2\13(\3\2\2\2\r*\3\2\2\2\17\20\7+"+
		"\2\2\20\4\3\2\2\2\21\22\7*\2\2\22\6\3\2\2\2\23\34\7\62\2\2\24\30\4\63"+
		";\2\25\27\4\62;\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2"+
		"\2\2\31\34\3\2\2\2\32\30\3\2\2\2\33\23\3\2\2\2\33\24\3\2\2\2\34\b\3\2"+
		"\2\2\35\36\7v\2\2\36\37\7t\2\2\37 \7w\2\2 \'\7g\2\2!\"\7h\2\2\"#\7c\2"+
		"\2#$\7n\2\2$%\7u\2\2%\'\7g\2\2&\35\3\2\2\2&!\3\2\2\2\'\n\3\2\2\2()\t\2"+
		"\2\2)\f\3\2\2\2*+\t\3\2\2+,\3\2\2\2,-\b\7\2\2-\16\3\2\2\2\6\2\30\33&";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}