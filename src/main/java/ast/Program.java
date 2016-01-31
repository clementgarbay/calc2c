package ast;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class Program extends AST {

    private List<Function> functions;
	private Body body;

    public Program(List<Function> functions, Body body) {
        this.functions = functions;
        this.body = body;
    }

    @Override
	public String gen(int padding) {
		return "";
	}

    public String gen() {
        StringBuilder stringBuilder = new StringBuilder();

        // Includes
        stringBuilder.append("#include <stdio.h> \n");
        stringBuilder.append("#include <stdbool.h> \n");
        stringBuilder.append("\n");

        // Functions
        for (Function function : this.functions) {
            stringBuilder.append(function.gen());
        }

        // Main
        stringBuilder.append(this.body.genMain());

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Program(" + this.functions + ", " + this.body + ")";
    }
}
