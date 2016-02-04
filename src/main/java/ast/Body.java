package ast;

import error.ImmutableException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void checkErrors(List<Definition> definitions, List<Function> functions) {
        List<Definition> def = new ArrayList<>();
        this.definitions.stream().forEach(def::add);
        def.addAll(definitions);
        this.expression.checkExpressionErrors(def, functions);
    }

    /**
     * Magic method to find all the possible errors (type, undefined variable, arithmetic, operator acceptance, immutability problems, ...).
     */
    public void errorsControl(List<Function> functions) {
        // Check expressions errors in definitions
        List<Definition> definitionsProcessed = new ArrayList<>();
        for (Definition definition: this.definitions) {
            definitionsProcessed.add(definition);
            definition.getExpression().checkExpressionErrors(definitionsProcessed, functions);
        }

        // Check body expression errors
        this.expression.checkExpressionErrors(this.definitions, functions);

        // Check immutable definitions
        final List<String> duplicatedVariables = new ArrayList<>();
        Set<String> set = new HashSet<String>() {
            @Override
            public boolean add(String variableName) {
                if (contains(variableName)) {
                    duplicatedVariables.add(variableName);
                }
                return super.add(variableName);
            }
        };
        this.definitions.stream().forEach(definition -> set.add(definition.getVariableName().getName()));
        if (duplicatedVariables.size() > 0) {
            throw new ImmutableException("Variables " + duplicatedVariables.toString() + " are defined multiple times.");
        }
    }

	@Override
	public String gen(int padding) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Definition definition : this.definitions) {
            stringBuilder.append(super.paddingToSpace(4));
            stringBuilder.append(definition.getExpression().getFinalType(this.definitions).getTypeInC());
            stringBuilder.append(definition.gen(1));
        }

        stringBuilder.append(super.paddingToSpace(4));
        stringBuilder.append("return").append(this.expression.gen(1)).append(";");

		return stringBuilder.toString();
	}

    public String genMain() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nint main() {\n");

        // Definitions
        this.definitions.stream().forEach(definition -> {
            stringBuilder.append(super.paddingToSpace(4));
            stringBuilder.append(definition.getExpression().getFinalType(this.definitions).getTypeInC());
            stringBuilder.append(definition.gen(1));
        });

        // Final expression
        stringBuilder.append(super.paddingToSpace(4));
        if (this.expression.getFinalType(this.definitions) == Type.STRING) {
            stringBuilder.append("return printf(\"%s\\n\", ");
        } else {
            stringBuilder.append("return printf(\"%i\\n\", ");
        }
        stringBuilder.append(this.expression.gen(0)).append(");");
        stringBuilder.append("\n}");

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Body(" + this.definitions + ", " + this.expression + ")";
    }
}
