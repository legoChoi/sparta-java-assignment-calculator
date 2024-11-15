package lv03;

import java.util.LinkedList;

public class ArithmeticCalculator{
    private double result;
    private Memory mem;

    public double calculate(String operator, int first, int second) {

        switch (operator) {
            case "+":
                result = first + second;
                return result;

            case "-":
                result = first - second;
                return result;

            case "*":
                result = first * second;
                return result;

            case "/":
                try {
                    result = first / second;
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }

                return result;

            default:
                System.out.println("잘못된 연산자 입력 됨");
                return -1;
        }
    }
}
