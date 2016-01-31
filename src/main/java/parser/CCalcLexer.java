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
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, IDENTIFIER=22, INT=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "','", "'+'", "'*'", "'-'", "'('", "':'", "'<'", "'='", "'false'", 
		"'!='", "'<='", "'&&'", "'?'", "'||'", "'>'", "'/'", "'=='", "'>='", "'true'", 
		"'!'", "IDENTIFIER", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "IDENTIFIER", "INT", "WS"
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
		case 23: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\32\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27m\n\27\f\27\16"+
		"\27p\13\27\3\30\3\30\3\30\7\30u\n\30\f\30\16\30x\13\30\5\30z\n\30\3\31"+
		"\3\31\3\31\3\31\2\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\2\3\2\4\4\2\62;c|\5\2\13\f"+
		"\17\17\"\"\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2"+
		"\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2"+
		"\25E\3\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35T\3\2\2\2\37V\3\2\2"+
		"\2!Y\3\2\2\2#[\3\2\2\2%]\3\2\2\2\'`\3\2\2\2)c\3\2\2\2+h\3\2\2\2-j\3\2"+
		"\2\2/y\3\2\2\2\61{\3\2\2\2\63\64\7+\2\2\64\4\3\2\2\2\65\66\7.\2\2\66\6"+
		"\3\2\2\2\678\7-\2\28\b\3\2\2\29:\7,\2\2:\n\3\2\2\2;<\7/\2\2<\f\3\2\2\2"+
		"=>\7*\2\2>\16\3\2\2\2?@\7<\2\2@\20\3\2\2\2AB\7>\2\2B\22\3\2\2\2CD\7?\2"+
		"\2D\24\3\2\2\2EF\7h\2\2FG\7c\2\2GH\7n\2\2HI\7u\2\2IJ\7g\2\2J\26\3\2\2"+
		"\2KL\7#\2\2LM\7?\2\2M\30\3\2\2\2NO\7>\2\2OP\7?\2\2P\32\3\2\2\2QR\7(\2"+
		"\2RS\7(\2\2S\34\3\2\2\2TU\7A\2\2U\36\3\2\2\2VW\7~\2\2WX\7~\2\2X \3\2\2"+
		"\2YZ\7@\2\2Z\"\3\2\2\2[\\\7\61\2\2\\$\3\2\2\2]^\7?\2\2^_\7?\2\2_&\3\2"+
		"\2\2`a\7@\2\2ab\7?\2\2b(\3\2\2\2cd\7v\2\2de\7t\2\2ef\7w\2\2fg\7g\2\2g"+
		"*\3\2\2\2hi\7#\2\2i,\3\2\2\2jn\4c|\2km\t\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o.\3\2\2\2pn\3\2\2\2qz\7\62\2\2rv\4\63;\2su\4\62;\2ts"+
		"\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2y"+
		"r\3\2\2\2z\60\3\2\2\2{|\t\3\2\2|}\3\2\2\2}~\b\31\2\2~\62\3\2\2\2\6\2n"+
		"vy";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}