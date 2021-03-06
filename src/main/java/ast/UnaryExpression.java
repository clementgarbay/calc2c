package ast;

import error.IncompatibleOperatorException;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class UnaryExpression extends Expression {

    public UnaryOperator operator;
    public Expression expression;

    public UnaryExpression(UnaryOperator operator, Expression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        return this.expression.getFinalType(definitions, functions);
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        // Operator acceptance
        if (!this.expression.getFinalType(definitions, functions).acceptsOperator(this.operator)) throw new IncompatibleOperatorException();

        this.expression.checkExpressionErrors(definitions, functions);
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.operator + this.expression.gen(1);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ParenthesizedExpression)) return false;
        UnaryExpression unaryExpression = (UnaryExpression) obj;
        return this.operator.equals(unaryExpression.operator) && this.expression.equals(unaryExpression.expression);
    }
}
