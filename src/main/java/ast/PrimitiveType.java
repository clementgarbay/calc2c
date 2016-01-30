package ast;

/**
 * @author Clément Garbay
 */
public abstract class PrimitiveType extends Expression {
    public abstract boolean acceptsOperator(Operator operator);
}
