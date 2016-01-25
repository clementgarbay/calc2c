package ast;

import java.util.Arrays;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public enum UnaryOperator {
    MINUS ("-"),
    EXCLAMATION ("!");

    private final String op;

    UnaryOperator(final String op) {
        this.op = op;
    }

    public static UnaryOperator fromString(String op){
        return Arrays.asList(UnaryOperator.values())
                .stream()
                .filter(e -> op.equalsIgnoreCase(e.op))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(op + " is not value of UnaryOperator"));
    }

    @Override
    public String toString() {
        return this.op;
    }
}