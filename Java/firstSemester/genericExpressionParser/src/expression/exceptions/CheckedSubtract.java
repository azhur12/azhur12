package expression.exceptions;

import expression.Operand;
import expression.Subtract;

public class CheckedSubtract extends Subtract {
    public CheckedSubtract(Operand leftOperand, Operand rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int evaluate(int a, int b) {
        if ((b > 0 && (Integer.MIN_VALUE + b > a)) || (b < 0 && (Integer.MAX_VALUE + b < a))) {
            throw new OverflowException();
        }

        return super.evaluate(a, b);

    }
}
