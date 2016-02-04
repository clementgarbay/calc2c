package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class StringType extends PrimitiveType<String> {
    private String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public Type getFinalType(List<Definition> definitions, List<Function> functions) {
        return Type.STRING;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.value;
    }

    @Override
    public String getValue() {
        return this.value;
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
