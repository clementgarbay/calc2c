package ast;

/**
 * @author Clément Garbay
 */
public abstract class Expression extends AST {
    public abstract Class<? extends PrimitiveType> getFinalType();
}
