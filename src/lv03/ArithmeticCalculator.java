package lv03;

import lv03.calculations.*;
import lv03.enums.ExceptionMessage;
import lv03.enums.OperatorType;

public class ArithmeticCalculator{
    public double calculate(double first, double second, OperatorType operatorType) {
        double result;
        switch (operatorType) {
            case PLUS -> result = new AdditionCalculation().calculate(first, second);
            case MINUS -> result = new MinusCalculation().calculate(first, second);
            case MULTIPLY -> result = new MultiplyCalculation().calculate(first, second);
            case SQUARE -> result = new SquareCalculation().calculate(first, second);
            case MOD -> result = new ModuloCalculation().calculate(first, second);
            case DIVIDE -> {
                try {
                    if (second == 0) throw new ArithmeticException();
                    result = new DivideCalculation().calculate(first, second);
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    System.out.println(ExceptionMessage.DIVIDE_BY_ZERO_EXCEPTION.getMessage());
                    return Double.NaN;
                }
            }
            default -> result = Double.NaN;
        }
        return result;
    }
}
