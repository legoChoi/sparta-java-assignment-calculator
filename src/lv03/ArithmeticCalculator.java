package lv03;

import lv03.calculations.*;
import lv03.dto.CalculatorInputDto;
import lv03.enums.ExceptionMessage;

public class ArithmeticCalculator{
    public double calculate(CalculatorInputDto calculatorInputDto) {
        double result;
        switch (calculatorInputDto.operator()) {
            case PLUS -> result = new AdditionCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
            case MINUS -> result = new MinusCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
            case MULTIPLY -> result = new MultiplyCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
            case SQUARE -> result = new SquareCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
            case MOD -> result = new ModuloCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
            case DIVIDE -> {
                try {
                    if (calculatorInputDto.secondOperand() == 0) throw new ArithmeticException();
                    result = new DivideCalculation().calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
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
