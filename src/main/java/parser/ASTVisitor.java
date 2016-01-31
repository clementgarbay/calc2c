package parser;

import ast.*;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CCalcBaseVisitor<AST> {
	public AST visitProgram(CCalcParser.ProgramContext ctx) {
        // retrieve ASTs for functions
        List<CCalcParser.FunctionContext> functionCtxs = ctx.function();
        List<Function> functions = new ArrayList<>();
        for (CCalcParser.FunctionContext functionCtx : functionCtxs)
          functions.add((Function)visit(functionCtx));
        // retrieve AST for body
        Body body = (Body)visit(ctx.body());
        // return AST for program
        return new Program(functions, body);
	}

    public AST visitFunction(CCalcParser.FunctionContext ctx) {
        Head head = (Head) visit(ctx.getChild(0));
        Body body = (Body) visit(ctx.getChild(1));
        return new Function(head, body);
    }

    public AST visitHead(CCalcParser.HeadContext ctx) {
        FunctionName functionName = (FunctionName)visit(ctx.getChild(0));
        return new Head(functionName);
    }

	public AST visitBody(CCalcParser.BodyContext ctx) {
        List<Definition> definitions = new ArrayList<>();

        ctx.definition()
                .stream()
                .forEach(def -> definitions.add((Definition) visit(def)));

		Expression expr = (Expression)visit(ctx.expression());

		return new Body(definitions, expr);
	}

    public AST visitDefinition(CCalcParser.DefinitionContext ctx) {
        VariableName variableName = (VariableName)visit(ctx.getChild(0));
        Expression expression = (Expression) visit(ctx.getChild(2));
        return new Definition(variableName, expression);
    }

	public AST visitIntegerType(CCalcParser.IntegerTypeContext ctx) {
        return new IntegerType(Integer.parseInt(ctx.getText()));
	}

    public AST visitBooleanType(CCalcParser.BooleanTypeContext ctx) {
        return new BooleanType(Boolean.parseBoolean(ctx.getText()));
    }

    public AST visitVariableName(CCalcParser.VariableNameContext ctx) {
        return new VariableName(ctx.getText());
    }

    public AST visitVariableCall(CCalcParser.VariableCallContext ctx) {
        return new VariableCall(ctx.getText());
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

    public AST visitFunctionName(CCalcParser.FunctionNameContext ctx) {
        return new FunctionName(ctx.getText());
    }

    public AST visitFunctionCall(CCalcParser.FunctionCallContext ctx) {
        return new FunctionCall(ctx.getChild(0).getText());
    }
}