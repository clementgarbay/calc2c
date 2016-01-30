package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class Body extends AST {
    private List<Definition> definitions;
	private Expression expression;

	public Body(List<Definition> definitions, Expression expression) {
        this.definitions = definitions;
		this.expression = expression;
	}

	@Override
	public String gen(int padding) {
		return this.expression.gen(4);
	}

	public String genMain() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nint main() {\n");
        this.definitions.stream().forEach(definition -> {
            stringBuilder.append(definition.gen(4));
        });
		stringBuilder.append(this.paddingToSpace(4)).append("return printf(\"%i\\n\", ").append(this.expression.gen(0)).append(");");
		stringBuilder.append("\n}");
		return stringBuilder.toString();
	}

    @Override
    public String toString() {
        return "Body(" + this.definitions + ", " + this.expression + ")";
    }
}
