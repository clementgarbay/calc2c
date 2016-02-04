package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public abstract class PrimitiveType<T> extends Expression {
    public abstract T getValue();
    public void checkExpressionErrors(List<Definition> definitions, List<Function> functions) {}
}
