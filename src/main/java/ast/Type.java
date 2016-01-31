package ast;

import java.util.HashSet;

/**
 * @author Clément Garbay
 */
public enum Type {
    INTEGER ("int", new HashSet<Operator>() {
        {
            add(UnaryOperator.MINUS);
            addAll(BinaryOperator.getEqualityOperators());
            addAll(BinaryOperator.getArithmeticOperators());
            addAll(BinaryOperator.getComparisonOperators());
        }
    }),
    BOOLEAN ("int", new HashSet<Operator>() {
        {
            add(UnaryOperator.EXCLAMATION);
            addAll(BinaryOperator.getEqualityOperators());
            addAll(BinaryOperator.getLogicalOperators());
        }
    }),
    STRING ("char", new HashSet<Operator>() {
        {
            addAll(BinaryOperator.getEqualityOperators());
        }
    });

    private final String typeInC;
    private final HashSet<Operator> acceptedOperators;

    Type(String typeInC, HashSet<Operator> acceptedOperators) {
        this.typeInC = typeInC;
        this.acceptedOperators = acceptedOperators;
    }

    /**
     * TOREVIEW : not fully functional for String type
     */
    public String getTypeInC() {
        return typeInC;
    }

    public boolean acceptsOperator(Operator operator) {
        return acceptedOperators.contains(operator);
    }
}
