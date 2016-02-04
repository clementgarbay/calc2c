package ast;

import error.IncompatibleTypeException;

import java.util.List;

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
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        return this.expr2.getFinalType(definitions, functions);
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        // Type checking
        if (this.expr2.getFinalType(definitions, functions) != this.expr3.getFinalType(definitions, functions)) throw new IncompatibleTypeException();
        // Condition must be boolean
        if (this.expr1.getFinalType(definitions, functions) != Type.BOOLEAN) throw new IncompatibleTypeException();

        this.expr1.checkExpressionErrors(definitions, functions);
        this.expr2.checkExpressionErrors(definitions, functions);
        this.expr3.checkExpressionErrors(definitions, functions);
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
