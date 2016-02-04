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
     * @param functions
     * @return
     */
    public abstract Type getFinalType(List<Definition> definitions, List<Function> functions);

    /**
     * Find the various expression error (type, undefined variable, arithmetic, operator acceptance, ...).
     *
     * @param definitions
     * @param functions
     */
    public abstract void checkExpressionErrors(List<Definition> definitions, List<Function> functions);
}
