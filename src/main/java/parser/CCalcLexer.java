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
		T__3=1, T__2=2, T__1=3, T__0=4, INTLIT=5, BOOLIT=6, MINUS=7, NOT=8, OP=9, 
		WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "':'", "'('", "'?'", "INTLIT", "BOOLIT", "'-'", "'!'", "OP", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "INTLIT", "BOOLIT", "MINUS", "NOT", "OP", 
		"WS"
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
		case 9: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\fA\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6#\n\6\f\6\16\6&\13"+
		"\6\5\6(\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\5\n<\n\n\3\13\3\13\3\13\3\13\2\f\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\2\3\2\4\6\2,-\61\61>>@@\5"+
		"\2\13\f\17\17\"\"D\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\'\3\2\2\2\r"+
		"\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27\30"+
		"\7+\2\2\30\4\3\2\2\2\31\32\7<\2\2\32\6\3\2\2\2\33\34\7*\2\2\34\b\3\2\2"+
		"\2\35\36\7A\2\2\36\n\3\2\2\2\37(\7\62\2\2 $\4\63;\2!#\4\62;\2\"!\3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2\2\'\37\3\2\2\2\' "+
		"\3\2\2\2(\f\3\2\2\2)*\7v\2\2*+\7t\2\2+,\7w\2\2,\63\7g\2\2-.\7h\2\2./\7"+
		"c\2\2/\60\7n\2\2\60\61\7u\2\2\61\63\7g\2\2\62)\3\2\2\2\62-\3\2\2\2\63"+
		"\16\3\2\2\2\64\65\7/\2\2\65\20\3\2\2\2\66\67\7#\2\2\67\22\3\2\2\28<\t"+
		"\2\2\29:\7?\2\2:<\7?\2\2;8\3\2\2\2;9\3\2\2\2<\24\3\2\2\2=>\t\3\2\2>?\3"+
		"\2\2\2?@\b\13\2\2@\26\3\2\2\2\7\2$\'\62;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}