package parser;

import ast.AST;
import ast.Body;
import ast.Expression;
import ast.IntLit;
import ast.Program;

public class ASTVisitor extends CCalcBaseVisitor<AST> {
	public AST visitProgram(CCalcParser.ProgramContext ctx) {
        // retrieve ASTs for functions
//        List<CCalcParser.FunctionContext> functionCtxs = ctx.function();
//        List<Function> functions = new ArrayList<Function>();
//        for (CCalcParser.FunctionContext functionCtx : functionCtxs)
//          functions.add((Function)visit(functionCtx));
        // retrieve AST for body
        Body body = (Body)visit(ctx.body());
        // return AST for program
//        return new Program(functions, body);
        return new Program(body);
	}
	
	public AST visitBody(CCalcParser.BodyContext ctx) { 
		Expression expr = (Expression)visit(ctx.expression()); 
		return new Body(expr); 
	}

	public AST visitIntLit(CCalcParser.IntLitContext ctx) {
		return new IntLit(Integer.parseInt(ctx.getText()));
	}
}