package ast;

import java.util.Arrays;

/**
 * @author Clément Garbay
 */
public enum UnaryOperator implements Operator {
    EXCLAMATION ("!"),
    MINUS ("-");

    private final String op;

    UnaryOperator(final String op) {
        this.op = op;
    }

    /**
     * Checks if the operator is a boolean unary operator ('!').
     */
    public static boolean isBooleanOperator(Operator operator) {
        return operator == UnaryOperator.EXCLAMATION;
    }

    /**
     * Checks if the operator is an arithmetic unary operator ('-').
     */
    public static boolean isArithmeticOperator(Operator operator) {
        return operator == UnaryOperator.MINUS;
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