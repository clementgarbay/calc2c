package ast;

/**
 * Created by clementgarbay on 25/01/2016.
 */
public class BooLit extends Expression {
    public boolean value;

    public BooLit(boolean value) {
        this.value = value;
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + Boolean.toString(this.value);
    }
}
