package ast;

import error.FunctionNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Clément Garbay
 */
public class FunctionCall extends Expression {
    private FunctionName functionName;
    private List<Expression> parameters;

    public FunctionCall(FunctionName functionName, List<Expression> parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
    }

    @Override
    public Type getFinalType(List<Definition> definitions) {
        // TODO : find a better method to find the return type of the function
        return Type.INTEGER;

    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {
        // Check parameters errors
        this.parameters.stream().forEach(parameters -> parameters.checkExpressionErrors(definitions, functions));

        System.out.println(functions);

        Function function = functions.stream()
                .filter(func -> func.getHead().getFunctionName().equals(this.functionName))
                .findFirst()
                .orElseThrow(() -> new FunctionNotFoundException("Function " + this.functionName.getName() + " is not found"));

        // Match the real parameter name with expression in this function call (with the parameters order)
        List<VariableName> functionRealParameters = function.getHead().getParameters();
        List<Definition> definitionsForRealFunction = new ArrayList<>();
        for (int i = 0; i < functionRealParameters.size(); i++) {
            VariableName parameter = functionRealParameters.get(i);
            definitionsForRealFunction.add(new Definition(parameter, this.parameters.get(i)));
        }

        // Check the call of the corresponding real function with this parameters
        function.getBody().checkErrors(definitionsForRealFunction, functions);
    }

    @Override
    public String gen(int padding) {
        String params = this.parameters.stream()
                .map(AST::gen)
                .collect(Collectors.joining(", "));

        return super.paddingToSpace(padding) + this.functionName.gen() + "(" + params + ")";
    }

    @Override
    public String toString() {
        return "FunctionCall(" + this.functionName + ", " + this.parameters + ")";
    }
}
