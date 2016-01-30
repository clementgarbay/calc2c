package ast;

import error.IncompatibleOperatorException;
import error.IncompatibleTypeException;

import java.lang.reflect.Method;

/**
 * @author Clément Garbay
 */
public class BinExp extends Expression {

    public Expression expr1;
    public Expression expr2;
    public BinaryOperator operator;

    public BinExp(BinaryOperator operator, Expression expr1, Expression expr2) {
        this.operator = operator;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Class<? extends PrimitiveType> getFinalType() {
        // Type checking
        if (this.expr1.getFinalType() != this.expr2.getFinalType()) throw new IncompatibleTypeException();

        return this.expr1.getFinalType();
    }

    @Override
    public String gen(int padding) {
        // Type checking
        if (this.expr1.getFinalType() != this.expr2.getFinalType()) throw new IncompatibleTypeException();
        // Division by 0
        if (this.operator.equals(BinaryOperator.DIVIDE) && this.expr2.equals(new IntLit(0))) throw new ArithmeticException("Division by 0");
        // Operator acceptance
        boolean operatorAccepted = true;
        try {
            // To invoke the right "acceptsOperator" method from classname of the final type
            // TODO : review the how to proceed
            Method method = this.expr1.getFinalType().getMethod("acceptsOperator", Operator.class);
            operatorAccepted = (boolean) method.invoke(this.expr1, this.operator);
        } catch (Exception ignored) {}
        if (!operatorAccepted) throw new IncompatibleOperatorException();

        return this.paddingToSpace(padding) + this.expr1.gen(0) + " " + this.operator.toString() + this.expr2.gen(1);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BinExp)) return false;
        BinExp binExp = (BinExp) obj;
        return this.expr1.equals(binExp.expr1) && this.expr2.equals(binExp.expr2) && this.operator.equals(binExp.operator);
    }
}
