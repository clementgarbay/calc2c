package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public abstract class Expression extends AST {

    /**
     * Get the final type of the expression.
     *
     * @param definitions
     * @return
     */
    public abstract Type getFinalType(List<Definition> definitions);

    /**
     * Find the various expression error (type, undefined variable, arithmetic, operator acceptance, ...).
     *
     * @param definitions
     */
    public abstract void checkExpression(List<Definition> definitions);
}
