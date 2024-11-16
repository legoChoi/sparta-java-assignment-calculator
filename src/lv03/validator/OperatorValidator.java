package lv03.validator;

import lv03.enums.OperatorType;

public class OperatorValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return OperatorType.isOperator(input);
    }
}
