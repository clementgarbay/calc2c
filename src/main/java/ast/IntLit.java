package ast;

public class IntLit extends Expression {
	public int value;

	public IntLit(int value) {
		this.value = value;
	}

	@Override
	public String gen(int padding) {
		return this.paddingToSpace(padding) + Integer.toString(this.value);
	}
}
