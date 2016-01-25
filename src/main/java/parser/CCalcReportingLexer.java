package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

import error.ErrorFlag;

public class CCalcReportingLexer extends CCalcLexer {
	public CCalcReportingLexer(CharStream input) {
		super(input);
	}
	public void recover(LexerNoViableAltException e) {
		ErrorFlag.setFlag();
		super.recover(e);
	}
}
