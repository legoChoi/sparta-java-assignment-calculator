package lv03.shared.exceptions;

import lv03.shared.exceptions.errorMessages.ExceptionMessage;

public class NotValidOperandInputException extends NumberFormatException {
    public NotValidOperandInputException() {
        super(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
    }
}
