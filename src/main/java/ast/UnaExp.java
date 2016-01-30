package ast;

/**
 * @author Clément Garbay
 */
public class UnaExp extends Expression {

    public UnaryOperator operator;
    public Expression expression;

    public UnaExp(UnaryOperator operator, Expression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    @Override
    public Class<? extends PrimitiveType> getFinalType() {
        return this.expression.getFinalType();
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.operator + this.expression.gen(1);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ParExp)) return false;
        UnaExp unaExp = (UnaExp) obj;
        return this.operator.equals(unaExp.operator) && this.expression.equals(unaExp.expression);
    }
}
