package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class IntegerType extends PrimitiveType<Integer> {
	private Integer value;

	public IntegerType(Integer value) {
        this.value = value;
	}

    @Override
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        return Type.INTEGER;
    }

	@Override
	public String gen(int padding) {
		return this.paddingToSpace(padding) + Integer.toString(this.value);
	}

    @Override
    public Integer getValue() {
        return this.value;
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
