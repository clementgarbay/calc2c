package ast;

import error.UndefinedVariableException;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class VariableCall extends Expression {

    public String variableName;

    public VariableCall(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Type getFinalType(List<Definition> definitions) {
        for (Definition definition : definitions) {
            if (definition.getVariableName().getName().equals(this.variableName)) {
                return definition.getExpression().getFinalType(definitions);
            }
        }

        throw new UndefinedVariableException();
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions) {
        // Variable existence
        this.getFinalType(definitions);
    }

    @Override
    public String gen(int padding) {
        return super.paddingToSpace(padding) + this.variableName;
    }

    @Override
    public String toString() {
        return "VariableCall(" + this.variableName + ")";
    }
}
