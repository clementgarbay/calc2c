package ast;

/**
 * @author Clément Garbay
 */
public class ParenthesizedExpression extends Expression {
    public Expression expression;

    public ParenthesizedExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Type getFinalType() {
        return this.expression.getFinalType();
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
