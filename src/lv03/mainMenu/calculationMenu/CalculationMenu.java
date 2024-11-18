package lv03.mainMenu.calculationMenu;

import lv03.shared.exceptions.NotValidOperatorInputException;
import lv03.shared.exceptions.errorMessages.ExceptionMessage;
import lv03.shared.interfaces.Menu;
import lv03.mainMenu.calculationMenu.models.dto.CalculatorInputDto;
import lv03.shared.io.input.Input;
import lv03.shared.io.output.Output;

public class CalculationMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final ArithmeticCalculator arithmeticCalculator;

    public CalculationMenu(Input calculatorInput, Output calculatorOutput, ArithmeticCalculator arithmeticCalculator) {
        this.calculatorInput = calculatorInput;
        this.calculatorOutput = calculatorOutput;
        this.arithmeticCalculator = arithmeticCalculator;
    }

    private boolean getState() {
        return state;
    }

    private void switchState() {
        state = !state;
    }

    private String firstOperandMenu() {
        calculatorOutput.printMenu("첫번째 피연산자 입력");
        return calculatorInput.input();
    }

    private String secondOperandMenu() {
        calculatorOutput.printMenu("두번째 피연산자 입력");
        return calculatorInput.input();
    }

    private String operatorMenu() {
        calculatorOutput.printMenu("연산자 입력");
        return calculatorInput.input();
    }

    @Override
    public void executeMenu() {
        String firstOperand, secondOperand, operator;

        while (getState()) {
            firstOperand = firstOperandMenu();
            secondOperand = secondOperandMenu();
            operator = operatorMenu();

            try {
                 arithmeticCalculator.calculate(new CalculatorInputDto(
                         Double.parseDouble(firstOperand),
                         Double.parseDouble(secondOperand),
                         operator
                 ));
            } catch (NotValidOperatorInputException | ArithmeticException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            } catch (NumberFormatException e) {
                calculatorOutput.printErrMessage(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
            }

            switchState();
        }

        switchState();
    }
}
