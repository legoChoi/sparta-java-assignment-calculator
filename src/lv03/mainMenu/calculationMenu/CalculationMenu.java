package lv03.mainMenu.calculationMenu;

import lv03.interfaces.Menu;
import lv03.memory.Memory;
import lv03.commons.exceptions.NotValidOperatorInputException;
import lv03.input.Input;
import lv03.output.Output;

public class CalculationMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final Memory<Double> calculatorMemory;

    public CalculationMenu(Input calculatorInput, Output calculatorOutput, Memory<Double> calculatorMemory) {
        this.calculatorInput = calculatorInput;
        this.calculatorOutput = calculatorOutput;
        this.calculatorMemory = calculatorMemory;
    }

    private boolean getState() {
        return state;
    }

    private void switchState() {
        state = !state;
    }

    private String firstOperandMenu() {
        calculatorOutput.printSysMessage("첫번째 피연산자 입력");
        return calculatorInput.input();
    }

    private String secondOperandMenu() {
        calculatorOutput.printSysMessage("두번째 피연산자 입력");
        return calculatorInput.input();
    }

    private String operatorMenu() {
        calculatorOutput.printSysMessage("연산자 입력");
        return calculatorInput.input();
    }

    @Override
    public void execute() {
        String firstOperand, secondOperand, operator;

        while (getState()) {
            try {
                firstOperand = calculatorInput.input();
                secondOperand = calculatorInput.input();
                operator = calculatorInput.input();

            } catch (NotValidOperatorInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }
    }
}
