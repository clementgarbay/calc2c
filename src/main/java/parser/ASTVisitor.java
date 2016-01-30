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

	public AST visitIntegerExpression(CCalcParser.IntegerExpressionContext ctx) {
        return new IntegerExpression(Integer.parseInt(ctx.getText()));
	}

    public AST visitBooleanExpression(CCalcParser.BooleanExpressionContext ctx) {
        return new BooleanExpression(Boolean.parseBoolean(ctx.getText()));
    }

	public AST visitParenthesizedExpression(CCalcParser.ParenthesizedExpressionContext ctx) {
		Expression expr = (Expression)visit(ctx.expression());
		return new ParenthesizedExpression(expr);
	}

    public AST visitBinaryExpression(CCalcParser.BinaryExpressionContext ctx) {
        Expression expr1 = (Expression)visit(ctx.getChild(0));
        Expression expr2 = (Expression)visit(ctx.getChild(2));
        BinaryOperator operator = BinaryOperator.fromString(ctx.getChild(1).getText());
        return new BinaryExpression(operator, expr1, expr2);
    }

    public AST visitUnaryExpression(CCalcParser.UnaryExpressionContext ctx) {
        UnaryOperator operator = UnaryOperator.fromString(ctx.getChild(0).getText());
        Expression expr = (Expression)visit(ctx.getChild(1));
        return new UnaryExpression(operator, expr);
    }

    public AST visitConditionalExpression(CCalcParser.ConditionalExpressionContext ctx) {
        Expression expr1 = (Expression)visit(ctx.getChild(0));
        Expression expr2 = (Expression)visit(ctx.getChild(2));
        Expression expr3 = (Expression)visit(ctx.getChild(4));
        return new ConditionalExpression(expr1, expr2, expr3);
    }
}