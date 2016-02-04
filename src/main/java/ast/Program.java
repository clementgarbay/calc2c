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

    /**
     * Magic method to find all the possible errors in the body of the function
     */
    public void errorsControl() {
        this.body.errorsControl(this.functions);
    }

    @Override
    public String gen(int padding) {
        this.errorsControl();

        StringBuilder stringBuilder = new StringBuilder();

        // Includes
        stringBuilder.append("#include <stdio.h> \n");
        stringBuilder.append("#include <stdbool.h> \n");
        stringBuilder.append("\n");

        // Functions
        this.functions.stream().forEach(function -> stringBuilder.append(function.gen()));

        // Main
        stringBuilder.append(this.body.genMain(this.functions));

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Program(" + this.functions + ", " + this.body + ")";
    }
}
