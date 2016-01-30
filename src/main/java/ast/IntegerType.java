package ast;

/**
 * @author Clément Garbay
 */
public class IntegerType extends PrimitiveType {
	private Integer value;

	public IntegerType(Integer value) {
        this.value = value;
	}

    @Override
    public Type getFinalType() {
        return Type.INTEGER;
    }

	@Override
	public String gen(int padding) {
		return this.paddingToSpace(padding) + Integer.toString(this.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof IntegerType)) return false;
		IntegerType integerType = (IntegerType) obj;
		return this.value.equals(integerType.value);
	}

    @Override
    public String toString() {
        return "Integer(" + this.value.toString() + ")";
    }
}
