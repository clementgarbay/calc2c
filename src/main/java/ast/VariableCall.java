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

        throw new UndefinedVariableException("Variable " + variableName + " is undefined.");
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        // Variable existence
        boolean variableFoundInDefinitions = definitions.stream().anyMatch(definition -> definition.getVariableName().getName().equals(this.variableName));
        if (!variableFoundInDefinitions) throw new UndefinedVariableException("Variable " + variableName + " is undefined.");

        // TODO : check also in functions parameters
        //boolean variableFoundInFunctionParameters = functions.stream().anyMatch(function -> function..getName().equals(this.variableName));
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
