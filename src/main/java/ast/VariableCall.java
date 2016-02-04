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
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        for (Definition definition : definitions) {
            if (definition.getVariableName().getName().equals(this.variableName)) {
                return definition.getExpression().getFinalType(definitions, functions);
            }
        }

        throw new UndefinedVariableException("Variable " + variableName + " is undefined.");
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        // Variable existence
        boolean variableFoundInDefinitions = definitions.stream().anyMatch(definition -> definition.getVariableName().getName().equals(this.variableName));
        if (!variableFoundInDefinitions) throw new UndefinedVariableException("Variable " + variableName + " is undefined.");
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
