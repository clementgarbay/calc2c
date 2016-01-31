package ast;

/**
 * @author Clément Garbay
 */
public class Variable extends AST {
    private String name;

    public Variable(String name) {
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
        return "Variable(" + this.name + ")";
    }
}
