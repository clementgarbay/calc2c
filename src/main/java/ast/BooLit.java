package ast;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Clément Garbay
 */
public class BooLit extends PrimitiveType {
    private Boolean value;
    private final Set<Operator> acceptedOperators = new HashSet<Operator>() {
        {
            add(UnaryOperator.EXCLAMATION);
            addAll(BinaryOperator.getEqualityOperators());
            addAll(BinaryOperator.getLogicalOperators());
        }
    };

    public BooLit(Boolean value) {
        this.value = value;
    }

    @Override
    public Class<? extends PrimitiveType> getFinalType() {
        return this.getClass();
    }

    @Override
    public boolean acceptsOperator(Operator operator) {
        return this.acceptedOperators.contains(operator);
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + Boolean.toString(this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BooLit)) return false;
        BooLit booLit = (BooLit) obj;
        return this.value.equals(booLit.value);
    }

    @Override
    public String toString() {
        return "BooLit(" + this.value.toString() + ")";
    }
}
