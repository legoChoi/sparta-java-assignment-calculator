package lv03.commons.exceptions;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;

public class NotValidOperandInputException extends NumberFormatException {
    public NotValidOperandInputException() {
        super(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
    }
}
