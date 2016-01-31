package ast;

/**
 * @author Clément Garbay
 */
public class Definition extends AST {

    private Variable variable;
    private Expression expression;

    public Definition(Variable variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    public Variable getVariable() {
        return this.variable;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String gen(int padding) {
        return this.variable.gen(padding) + " = " + this.expression.gen() + ";\n";
    }

    @Override
    public String toString() {
        return "Definition(" + this.variable + ", " + this.expression + ")";
    }
}
