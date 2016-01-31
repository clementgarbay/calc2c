package ast;

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
    public void checkExpressionErrors(List<Definition> definitions) {
        this.parameters.stream().forEach(parameters -> parameters.checkExpressionErrors(definitions));
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
