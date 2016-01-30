package ast;

/**
 * @author Clément Garbay
 */
public class ParExp extends Expression {
    public Expression expression;

    public ParExp(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Class<? extends PrimitiveType> getFinalType() {
        return this.expression.getFinalType();
    }

    @Override
    public String gen(int padding) {
        return '(' + expression.gen(padding) + ')';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ParExp)) return false;
        ParExp parExp = (ParExp) obj;
        return this.expression.equals(parExp.expression);
    }
}
