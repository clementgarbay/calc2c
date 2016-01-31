package ast;

import error.IncompatibleOperatorException;
import error.IncompatibleTypeException;

import java.util.List;

/**
 * @author Clément Garbay
 */
public class BinaryExpression extends Expression {

    public Expression expr1;
    public Expression expr2;
    public BinaryOperator operator;

    public BinaryExpression(BinaryOperator operator, Expression expr1, Expression expr2) {
        this.operator = operator;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Type getFinalType(List<Definition> definitions) {
        if (BinaryOperator.isBooleanOperator(this.operator)) {
            return Type.BOOLEAN;
        }
        return this.expr1.getFinalType(definitions);
    }

    @Override
    public void checkExpressionErrors(List<Definition> definitions) {
        // Type checking
        if (this.expr1.getFinalType(definitions) != this.expr2.getFinalType(definitions)) throw new IncompatibleTypeException();
        // Operator acceptance
        if (!this.expr1.getFinalType(definitions).acceptsOperator(this.operator)) throw new IncompatibleOperatorException();
        // Division by 0
        if (this.operator.equals(BinaryOperator.DIVIDE) && this.expr2.equals(new IntegerType(0))) throw new ArithmeticException("Division by 0");

        this.expr1.checkExpressionErrors(definitions);
        this.expr2.checkExpressionErrors(definitions);
    }

    @Override
    public String gen(int padding) {
        return this.paddingToSpace(padding) + this.expr1.gen(0) + " " + this.operator.toString() + this.expr2.gen(1);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BinaryExpression)) return false;
        BinaryExpression binaryExpression = (BinaryExpression) obj;
        return this.expr1.equals(binaryExpression.expr1) && this.expr2.equals(binaryExpression.expr2) && this.operator.equals(binaryExpression.operator);
    }
}
