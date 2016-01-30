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

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.expression.getFinalType() + this.variable.gen(1) + " = " + this.expression.gen() + ";\n";
    }

    @Override
    public String toString() {
        return "Definition(" + this.variable + ", " + this.expression + ")";
    }
}
