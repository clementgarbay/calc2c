package ast;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Clément Garbay
 */
public class IntegerExpression extends PrimitiveType {
	private Integer value;
    private final Set<Operator> acceptedOperators = new HashSet<Operator>() {
        {
            add(UnaryOperator.MINUS);
            addAll(BinaryOperator.getEqualityOperators());
            addAll(BinaryOperator.getArithmeticOperators());
            addAll(BinaryOperator.getComparisonOperators());
        }
    };

	public IntegerExpression(Integer value) {
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
		return this.paddingToSpace(padding) + Integer.toString(this.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof IntegerExpression)) return false;
		IntegerExpression integerExpression = (IntegerExpression) obj;
		return this.value.equals(integerExpression.value);
	}

    @Override
    public String toString() {
        return "IntLit(" + this.value.toString() + ")";
    }
}
