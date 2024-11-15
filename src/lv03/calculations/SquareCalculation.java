package lv03.calculations;

public class SquareCalculation implements Calculation {
    @Override
    public double calculate(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
