package ccalc;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ast.AST;
import error.ErrorFlag;
import error.ErrorListener;
import error.SyntaxError;
import parser.ASTVisitor;
// import error.ErrorFlag;
// import error.ErrorListener;
// import error.SyntaxError;
// import ast.AST;
// import parser.ASTVisitor;
import parser.CCalcLexer;
import parser.CCalcParser;
import parser.CCalcReportingLexer;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class CCalc {
	static boolean verbose = true;
	
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];        
        if (args.length>1 && args[1].equals("-v")) verbose = true;
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is); 
        CCalcLexer lexer = new CCalcReportingLexer(input); 
//        CCalcLexer lexer = new CCalcLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        CCalcParser parser = new CCalcParser(tokens); 
        parser.removeErrorListeners(); // remove standard ConsoleErrorListener 
		parser.addErrorListener(new ErrorListener()); // add ours
        ParseTree tree = parser.program(); 
        if (verbose) System.out.println(tree.toStringTree(parser));
        if (! ErrorFlag.getFlag()) {
        	ASTVisitor visitor = new ASTVisitor();
        	AST ast = visitor.visit(tree);
        	if (verbose) System.out.println(ast);
//        	((Program)ast) .collect();
            write(ast.gen(), inputFile);
       } else throw new SyntaxError();
        
    }
	// write code to .c file associated to .calc file passed as argument,
	// returning .c file relative filename
    static String write(String code, String filename) throws IOException {
    	String CFilename = filename.replaceFirst("\\.calc\\z", ".c");
    	if (verbose) System.out.println("writing C code to " + CFilename);
    	FileWriter out = new FileWriter(CFilename);
    	out.write(code);
    	out.flush();
    	out.close();
    	return CFilename;
    }
}        