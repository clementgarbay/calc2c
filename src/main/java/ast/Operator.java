package ast;

import java.util.Arrays;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public enum Operator {
    PLUS ("+"),
    MINUS ("-"),
    TIMES ("*"),
    DIVIDE ("/"),
    LOWER ("<"),
    GREATER (">");

    private final String op;

    Operator(final String op) {
        this.op = op;
    }

    public static Operator fromString(String op){
        return Arrays.asList(Operator.values())
                .stream()
                .filter(e -> op.equalsIgnoreCase(e.op))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(op + " is not value of Operator"));
    }

    @Override
    public String toString() {
        return this.op;
    }
}