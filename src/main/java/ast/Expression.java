package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public abstract class Expression extends AST {
    public abstract Type getFinalType(List<Definition> definitions);
}
