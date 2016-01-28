package ast;

public class Program extends AST {
	public Body body;

	public Program(Body body) {
		this.body = body;
	}

	@Override
	public String gen(int padding) {
		return "";
	}

    public String gen() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#include <stdio.h> \n");
        stringBuilder.append("#include <stdbool.h> \n");
        stringBuilder.append(this.body.genMain());
        return stringBuilder.toString();
    }
}
