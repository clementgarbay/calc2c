package ast;

/**
 * @author Clément Garbay
 */
public class Definition extends AST {

    private VariableName variableName;
    private Expression expression;

    public Definition(VariableName variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    public VariableName getVariableName() {
        return this.variableName;
    }

    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public String gen(int padding) {
        return this.variableName.gen(padding) + " = " + this.expression.gen() + ";\n";
    }

    @Override
    public String toString() {
        return "Definition(" + this.variableName + ", " + this.expression + ")";
    }
}
