package ast;

/**
 * @author Clément Garbay
 */
public class VariableName extends AST {
    private String name;

    public VariableName(String name) {
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
    public String toString() {
        return "VariableName(" + this.name + ")";
    }
}
