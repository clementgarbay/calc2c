package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class FunctionCall extends Expression {
    public String functionName;

    public FunctionCall(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public Type getFinalType(List<Definition> definitions) {
        return Type.INTEGER;
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions) {

    }

    @Override
    public String gen(int padding) {
        return super.paddingToSpace(padding) + this.functionName + "()";
    }

    @Override
    public String toString() {
        return "FunctionCall(" + this.functionName + ")";
    }
}
