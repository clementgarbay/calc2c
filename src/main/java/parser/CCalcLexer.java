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
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, INTLIT=18, BOOLIT=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'+'", "'*'", "'-'", "':'", "'('", "'<'", "'!='", "'<='", "'&&'", 
		"'?'", "'||'", "'>'", "'=='", "'/'", "'>='", "'!'", "INTLIT", "BOOLIT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
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
		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\7\23W\n\23\f\23\16\23Z\13\23\5\23\\\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24g\n\24\3\25\3\25\3\25\3\25\2\26\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\2\3\2\3\5\2\13"+
		"\f\17\17\"\"n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2"+
		"\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21"+
		"9\3\2\2\2\23<\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31D\3\2\2\2\33G\3\2\2\2"+
		"\35I\3\2\2\2\37L\3\2\2\2!N\3\2\2\2#Q\3\2\2\2%[\3\2\2\2\'f\3\2\2\2)h\3"+
		"\2\2\2+,\7+\2\2,\4\3\2\2\2-.\7-\2\2.\6\3\2\2\2/\60\7,\2\2\60\b\3\2\2\2"+
		"\61\62\7/\2\2\62\n\3\2\2\2\63\64\7<\2\2\64\f\3\2\2\2\65\66\7*\2\2\66\16"+
		"\3\2\2\2\678\7>\2\28\20\3\2\2\29:\7#\2\2:;\7?\2\2;\22\3\2\2\2<=\7>\2\2"+
		"=>\7?\2\2>\24\3\2\2\2?@\7(\2\2@A\7(\2\2A\26\3\2\2\2BC\7A\2\2C\30\3\2\2"+
		"\2DE\7~\2\2EF\7~\2\2F\32\3\2\2\2GH\7@\2\2H\34\3\2\2\2IJ\7?\2\2JK\7?\2"+
		"\2K\36\3\2\2\2LM\7\61\2\2M \3\2\2\2NO\7@\2\2OP\7?\2\2P\"\3\2\2\2QR\7#"+
		"\2\2R$\3\2\2\2S\\\7\62\2\2TX\4\63;\2UW\4\62;\2VU\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2\2[T\3\2\2\2\\&\3\2\2\2]"+
		"^\7v\2\2^_\7t\2\2_`\7w\2\2`g\7g\2\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2"+
		"\2eg\7g\2\2f]\3\2\2\2fa\3\2\2\2g(\3\2\2\2hi\t\2\2\2ij\3\2\2\2jk\b\25\2"+
		"\2k*\3\2\2\2\6\2X[f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}