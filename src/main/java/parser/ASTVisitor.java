package parser;

import ast.*;

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

    public AST visitBooLit(CCalcParser.BooLitContext ctx) {
        return new BooLit(Boolean.parseBoolean(ctx.getText()));
    }

	public AST visitParExp(CCalcParser.ParExpContext ctx) {
		Expression expr = (Expression)visit(ctx.expression());
		return new ParExp(expr);
	}

    public AST visitBinExp(CCalcParser.BinExpContext ctx) {
        Expression expr1 = (Expression)visit(ctx.getChild(0));
        Expression expr2 = (Expression)visit(ctx.getChild(2));
        Operator operator = Operator.fromString(ctx.getChild(1).getText());
        return new BinExp(operator, expr1, expr2);
    }
}