package ast;

/**
 * @author Clément Garbay
 */
public class StringType extends PrimitiveType {
    private String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public Type getFinalType() {
        return Type.STRING;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BooleanType)) return false;
        StringType stringType = (StringType) obj;
        return this.value.equals(stringType.value);
    }

    @Override
    public String toString() {
        return "String(" + this.value + ")";
    }
}
