package lv03;

import lv03.calculation.*;

public class ArithmeticCalculator{
    public <T extends Number> T calculate(double first, double second, OperatorType operatorType) {
        double result = 0;
        switch (operatorType) {
            case PLUS -> {
                result = new AdditionCalculation().calculate(first, second);
                System.out.println(result);
            }
            case MINUS -> {
                result = new MinusCalculation().calculate(first, second);
                System.out.println(result);
            }
            case MULTIPLY -> {
                result = new MultiplyCalculation().calculate(first, second);
                System.out.println(result);
            }
            case SQUARE -> {
                result = new SquareCalculation().calculate(first, second);
                System.out.println(result);
            }
            case DIVIDE -> {
                if (second == 0) throw new ArithmeticException("Divide by zero");

                result = new DivideCalculation().calculate(first, second);
                System.out.println(result);
            }
            case MOD -> {
                result = new ModuloCalculation().calculate(first, second);
                System.out.println(result);
            }
            default -> {
                System.out.println("잘못된 연산자 입력 됨");
                return null;
            }
        }

        return (T) Double.valueOf(result);
    }
}
