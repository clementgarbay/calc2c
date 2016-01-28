package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class ParExp extends Expression {
    public Expression expression;

    public ParExp(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String gen(int padding) {
        return '(' + expression.gen(padding) + ')';
    }
}
