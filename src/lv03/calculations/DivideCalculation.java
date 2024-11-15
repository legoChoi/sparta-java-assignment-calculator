package lv03.calculations;

public class DivideCalculation implements Calculation {
    @Override
    public double calculate(double num1, double num2) {
        if ( num2 == 0 ) throw new ArithmeticException("Divide by zero");
        return num1 / num2;
    }
}
