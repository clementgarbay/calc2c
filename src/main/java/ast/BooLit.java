package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class BooLit extends Expression {
    public boolean value;

    public BooLit(boolean value) {
        this.value = value;
    }
}
