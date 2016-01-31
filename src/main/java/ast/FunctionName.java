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
        return this.paddingToSpace(padding) + this.name + "()";
    }

    @Override
    public String toString() {
        return "FunctionName(" + this.name + ")";
    }
}