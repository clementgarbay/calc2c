package ast;

import java.util.Arrays;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public enum BinaryOperator {
    PLUS ("+"),
    MINUS ("-"),
    TIMES ("*"),
    DIVIDE ("/"),
    LOWER ("<"),
    GREATER (">"),
    LOWER_OR_EQUAL ("<="),
    GREATER_OR_EQUAL (">="),
    EQUALS ("=="),
    NOT_EQUALS ("!="),
    AND ("&&"),
    OR ("||");

    private final String op;

    BinaryOperator(final String op) {
        this.op = op;
    }

    public static BinaryOperator fromString(String op) {
        return Arrays.asList(BinaryOperator.values())
                .stream()
                .filter(e -> op.equalsIgnoreCase(e.op))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(op + " is not value of BinaryOperator"));
    }

    @Override
    public String toString() {
        return this.op;
    }
}