package lv03.mainMenu.calculationMenu;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;
import lv03.mainMenu.calculationMenu.models.dto.CalculatorInputDto;
import lv03.mainMenu.calculationMenu.models.enums.OperatorCommand;
import lv03.commons.exceptions.NotValidOperatorInputException;
import lv03.memory.Memory;
import lv03.output.Output;

public class ArithmeticCalculator{
    private final Output calculatorOutput;
    private final Memory<Double> memory;

    public ArithmeticCalculator(Output calculatorOutput, Memory<Double> memory) {
        this.calculatorOutput = calculatorOutput;
        this.memory = memory;
    }

    public void calculate(CalculatorInputDto calculatorInputDto) {
        try {
            OperatorCommand operator = OperatorCommand.find(calculatorInputDto.operator());

            double result = operator.calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());

            calculatorOutput.printMemory(memory.save(result));
        } catch (NotValidOperatorInputException e) {
            throw new NotValidOperatorInputException();
        } catch (ArithmeticException e) {
            throw new ArithmeticException(ExceptionMessage.DIVIDE_BY_ZERO_EXCEPTION.getMessage());
        }
    }
}
