package ast;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Clément Garbay
 */
public enum BinaryOperator implements Operator {
    PLUS ("+"),
    MINUS ("-"),
    TIMES ("*"),
    DIVIDE ("/"),
    LOWER ("<"),
    GREATER (">"),
    LOWER_OR_EQUAL ("<="),
    GREATER_OR_EQUAL (">="),
    EQUAL ("=="),
    NOT_EQUAL ("!="),
    AND ("&&"),
    OR ("||");

    private final String op;

    BinaryOperator(final String op) {
        this.op = op;
    }

    /**
     * Get the '==' and '!=' operators.
     */
    public static Set<BinaryOperator> getEqualityOperators() {
        return new HashSet<>(Arrays.asList(BinaryOperator.EQUAL, BinaryOperator.NOT_EQUAL));
    }

    /**
     * Get the '+' , '-' , '*' and '/' operators.
     */
    public static Set<BinaryOperator> getArithmeticOperators() {
        return new HashSet<>(Arrays.asList(BinaryOperator.PLUS, BinaryOperator.MINUS, BinaryOperator.TIMES, BinaryOperator.DIVIDE));
    }

    /**
     * Get the '<' , '>' , '<=' and '>=' operators.
     */
    public static Set<BinaryOperator> getComparisonOperators() {
        return new HashSet<>(Arrays.asList(BinaryOperator.LOWER, BinaryOperator.GREATER, BinaryOperator.LOWER_OR_EQUAL, BinaryOperator.GREATER_OR_EQUAL));
    }

    /**
     * Get the '&&' and '||' operators.
     */
    public static Set<BinaryOperator> getLogicalOperators() {
        return new HashSet<>(Arrays.asList(BinaryOperator.AND, BinaryOperator.OR));
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