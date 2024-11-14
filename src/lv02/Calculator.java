package lv02;

import java.util.LinkedList;

public class Calculator {
    private LinkedList<Double> resultList = new LinkedList<>();
    private double result;

    public LinkedList<Double> getResultList() {
        return resultList;
    }

    public void setResultList(LinkedList<Double> resultList) {
        this.resultList = resultList;
    }

    public double calculate(String operator, int first, int second) {
        switch (operator) {
            case "+":
                result = first + second;
                resultList.add(result);
                return result;

            case "-":
                result = first - second;
                resultList.add(result);
                return result;

            case "*":
                result = first * second;
                resultList.add(result);
                return result;

            case "/":
                try {
                    result = first / second;
                    resultList.add(result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }

                return result;

            default:
                System.out.println("잘못된 연산자 입력 됨");
                return -1;
        }
    }

    public void deleteFirstResult() {
        this.resultList.removeFirst();
    }
}
