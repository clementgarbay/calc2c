package ast;

import error.IncompatibleTypeException;

/**
 * @author Clément Garbay
 */
public class ConditionalExpression extends Expression {

    public Expression expr1;
    public Expression expr2;
    public Expression expr3;

    public ConditionalExpression(Expression expr1, Expression expr2, Expression expr3) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.expr3 = expr3;
    }

    @Override
    public Class<? extends PrimitiveType> getFinalType() {
        // Type checking
        if (this.expr2.getFinalType() != this.expr3.getFinalType()) throw new IncompatibleTypeException();

        return this.expr2.getFinalType();
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.expr1.gen(0) + " ? " + this.expr2.gen(0) + " : " + this.expr3.gen(0);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ConditionalExpression)) return false;
        ConditionalExpression conditionalExpression = (ConditionalExpression) obj;
        return this.expr1.equals(conditionalExpression.expr1) && this.expr2.equals(conditionalExpression.expr2) && this.expr3.equals(conditionalExpression.expr3);
    }
}
