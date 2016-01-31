package ast;

/**
 * @author Clément Garbay
 */
public abstract class PrimitiveType<T> extends Expression {
    public abstract T getValue();
}
