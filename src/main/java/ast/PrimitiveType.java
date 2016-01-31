package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public abstract class PrimitiveType<T> extends Expression {
    public abstract T getValue();
    public void checkExpression(List<Definition> definitions) {}
}
