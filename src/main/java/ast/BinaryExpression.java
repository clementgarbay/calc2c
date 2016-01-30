package ast;

import error.IncompatibleOperatorException;
import error.IncompatibleTypeException;

import java.lang.reflect.Method;

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
    public Type getFinalType() {
        // Type checking
        if (this.expr1.getFinalType() != this.expr2.getFinalType()) throw new IncompatibleTypeException();

        return this.expr1.getFinalType();
    }

    @Override
    public String gen(int padding) {
        // Type checking
        if (this.expr1.getFinalType() != this.expr2.getFinalType()) throw new IncompatibleTypeException();
        // Division by 0
        if (this.operator.equals(BinaryOperator.DIVIDE) && this.expr2.equals(new IntegerType(0))) throw new ArithmeticException("Division by 0");
        // Operator acceptance
        if (!this.expr1.getFinalType().acceptsOperator(this.operator)) throw new IncompatibleOperatorException();

        return this.paddingToSpace(padding) + this.expr1.gen(0) + " " + this.operator.toString() + this.expr2.gen(1);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BinaryExpression)) return false;
        BinaryExpression binaryExpression = (BinaryExpression) obj;
        return this.expr1.equals(binaryExpression.expr1) && this.expr2.equals(binaryExpression.expr2) && this.operator.equals(binaryExpression.operator);
    }
}
