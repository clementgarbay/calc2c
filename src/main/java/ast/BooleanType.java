package ast;

/**
 * @author Clément Garbay
 */
public class BooleanType extends PrimitiveType {
    private Boolean value;

    public BooleanType(Boolean value) {
        this.value = value;
    }

    @Override
    public Type getFinalType() {
        return Type.BOOLEAN;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + Boolean.toString(this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BooleanType)) return false;
        BooleanType booleanType = (BooleanType) obj;
        return this.value.equals(booleanType.value);
    }

    @Override
    public String toString() {
        return "Boolean(" + this.value.toString() + ")";
    }
}
