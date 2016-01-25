package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class BinExp extends Expression {

    public Expression expr1;
    public Expression expr2;
    public Operator operator;

    public BinExp(Operator operator, Expression expr1, Expression expr2) {
        this.operator = operator;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }


}