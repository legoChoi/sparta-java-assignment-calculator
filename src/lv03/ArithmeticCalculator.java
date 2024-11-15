package lv03;

import java.util.Arrays;

public class ArithmeticCalculator{
    private boolean state = true;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public <T extends Number> T calculate(double first, double second, OperatorType operatorType) {
        double result = 0;
        switch (operatorType) {
            case PLUS:
                result = first + second;
                System.out.println(result);
                break;

            case MINUS:
                result = first - second;
                System.out.println(result);
                break;

            case MULTIPLY:
                result = first * second;
                System.out.println(result);
                break;

            case DIVIDE:
                try {
                    result = first / second;
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
                break;

            case MOD:
                result = first % second;
                System.out.println(result);
                break;

            default:
                System.out.println("잘못된 연산자 입력 됨");
                return null;
        }

        return (T) Double.valueOf(result);
    }
}
