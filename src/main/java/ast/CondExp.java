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

    @Override
    public String gen(int padding) {
        // return this.paddingToSpace(padding) + "if (" + this.expr1.gen(0) + ") {\n" + this.expr2.gen(padding + 4) + "\n} else {\n" + this.expr3.gen(padding + 4) + "\n}";
        return this.paddingToSpace(padding) + this.expr1.gen(0) + " ? " + this.expr2.gen(0) + " : " + this.expr3.gen(0);
    }
}
