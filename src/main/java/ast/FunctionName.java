package ast;

/**
 * @author Clément Garbay
 */
public class FunctionName extends AST {

    private String name;

    public FunctionName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionName)) return false;
        FunctionName functionName = (FunctionName) obj;
        return this.name.equals(functionName.getName());
    }

    @Override
    public String toString() {
        return "FunctionName(" + this.name + ")";
    }
}