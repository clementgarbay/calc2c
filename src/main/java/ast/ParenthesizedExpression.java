package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class ParenthesizedExpression extends Expression {
    public Expression expression;

    public ParenthesizedExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        return this.expression.getFinalType(definitions, functions);
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        this.expression.checkExpressionErrors(definitions, functions);
    }

    @Override
    public String gen(int padding) {
        return '(' + expression.gen(padding) + ')';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ParenthesizedExpression)) return false;
        ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression) obj;
        return this.expression.equals(parenthesizedExpression.expression);
    }
}
