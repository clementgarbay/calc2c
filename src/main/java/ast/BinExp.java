package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class BinExp extends Expression {

    public Expression expr1;
    public Expression expr2;
    public BinaryOperator operator;

    public BinExp(BinaryOperator operator, Expression expr1, Expression expr2) {
        this.operator = operator;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.expr1.gen(0) + " " + this.operator.toString() + this.expr2.gen(1);
    }
}
