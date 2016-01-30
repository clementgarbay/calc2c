package ast;

/**
 * @author Clément Garbay
 */
public abstract class Expression extends AST {
    public abstract Type getFinalType();
}
