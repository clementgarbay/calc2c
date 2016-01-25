package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class Boolean extends Expression {
    public boolean value;

    public Boolean(boolean value) {
        this.value = value;
    }
}
