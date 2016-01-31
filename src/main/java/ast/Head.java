package ast;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Clément Garbay
 */
public class Head extends AST {

    private FunctionName functionName;
    private List<VariableName> parameters;

    public Head(FunctionName functionName, List<VariableName> parameters) {
        this.functionName = functionName;
        this.parameters = parameters;
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
        return "Head(" + this.functionName + ", " + this.parameters + ")";
    }
}
