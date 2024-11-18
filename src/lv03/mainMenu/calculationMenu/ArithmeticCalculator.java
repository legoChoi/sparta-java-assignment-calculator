package lv03.mainMenu.calculationMenu;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;
import lv03.mainMenu.calculationMenu.models.dto.CalculatorInputDto;
import lv03.mainMenu.calculationMenu.models.enums.OperatorCommand;
import lv03.commons.exceptions.NotValidOperatorInputException;
import lv03.memory.Memory;
import lv03.io.output.Output;

import java.util.List;

public class ArithmeticCalculator{
    private final Output calculatorOutput;
    private final Memory<List<Double>, Double> calculatorMemory;

    public ArithmeticCalculator(Output calculatorOutput, Memory<List<Double>, Double> calculatorMemory) {
        this.calculatorOutput = calculatorOutput;
        this.calculatorMemory = calculatorMemory;
    }

    public void calculate(CalculatorInputDto calculatorInputDto) {
        try {
            OperatorCommand operator = OperatorCommand.find(calculatorInputDto.operator());

            double result = operator.calculate(calculatorInputDto.firstOperand(), calculatorInputDto.secondOperand());

            calculatorOutput.printMemory(calculatorMemory.save(result));
        } catch (NotValidOperatorInputException e) {
            throw new NotValidOperatorInputException();
        } catch (ArithmeticException e) {
            throw new ArithmeticException(ExceptionMessage.DIVIDE_BY_ZERO_EXCEPTION.getMessage());
        }
    }
}
