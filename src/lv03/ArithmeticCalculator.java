package lv03;

import lv03.dto.CalculatorInputDto;
import lv03.mainMenu.calculationMenu.models.enums.OperatorType;
import lv03.commons.exceptions.NotValidOperatorInputException;

public class ArithmeticCalculator{
    public double calculate(CalculatorInputDto calculatorInputDto) {
        try {
            OperatorType operator = OperatorType.find(calculatorInputDto.operator());
            return operator.calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());
        } catch (NotValidOperatorInputException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        return Double.NaN;
    }
}
