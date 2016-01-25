package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class CondExp extends Expression {

    public Expression expr1;
    public Expression expr2;
    public Expression expr3;

    public CondExp(Expression expr1, Expression expr2, Expression expr3) {
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.expr3 = expr3;
    }
}
