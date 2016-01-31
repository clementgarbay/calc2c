package ast;

/**
 * @author Clément Garbay
 */
public class Function extends AST {

    private Head head;
    private Body body;

    public Function(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    @Override
    public String gen(int padding) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.paddingToSpace(padding));
        stringBuilder.append("int").append(this.head.gen(1)).append(" {\n");
        stringBuilder.append(this.body.gen(padding + 4));
        stringBuilder.append("\n}\n");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Function(" + this.head + ", " + this.body + ")";
    }
}