package lv03.validator;

import lv03.mainMenu.calculationMenu.models.enums.OperatorCommand;

public class OperatorValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return OperatorCommand.isOperator(input);
    }
}
