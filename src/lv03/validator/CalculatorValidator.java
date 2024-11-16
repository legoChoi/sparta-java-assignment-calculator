package lv03.validator;

import lv03.enums.MainMenuCommandLine;
import lv03.enums.MemoryMenuCommandLine;
import lv03.enums.OperatorType;
import lv03.exceptions.NotValidInputException;

public class CalculatorValidator implements Validator {
    @Override
    public boolean isMainMenuCommand(String input) {
        return MainMenuCommandLine.isCommand(input);
    }

    @Override
    public boolean isMemoryMenuCommand(String input) {
        return MemoryMenuCommandLine.isCommand(input);
    }

    @Override
    public boolean isNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NotValidInputException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean isOperator(String input) {
        return OperatorType.isOperator(input);
    }
}
