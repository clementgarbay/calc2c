package ast;

/**
 * @author Clément Garbay
 */
public class Body extends AST {
	public Expression expr;

	public Body(Expression expr) {
		this.expr = expr;
	}

	@Override
	public String gen(int padding) {
		return this.expr.gen(4);
	}

	public String genMain() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nint main() {\n");
		stringBuilder.append(this.paddingToSpace(4)).append("return printf(\"%i\\n\", ").append(this.expr.gen(0)).append(");");
		stringBuilder.append("\n}");
		return stringBuilder.toString();
	}
}
