package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class UnaExp extends Expression {

    public UnaryOperator operator;
    public Expression expr;

    public UnaExp(UnaryOperator operator, Expression expr) {
        this.operator = operator;
        this.expr = expr;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.operator + this.expr.gen(1);
    }
}