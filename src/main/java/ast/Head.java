package ast;

/**
 * @author Clément Garbay
 */
public class Head extends AST {

    private FunctionName functionName;

    public Head(FunctionName functionName) {
        this.functionName = functionName;
    }

    @Override
    public String gen(int padding) {
        return super.paddingToSpace(padding) + this.functionName.gen();
    }

    @Override
    public String toString() {
        return "Head(" + this.functionName + ")";
    }
}
