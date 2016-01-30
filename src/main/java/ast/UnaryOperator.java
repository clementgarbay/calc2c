package ast;

import java.util.Arrays;

/**
 * @author Clément Garbay
 */
public enum UnaryOperator implements Operator {
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