package lv03.exceptions;

import lv03.enums.ExceptionMessage;

public class NotValidOperandInputException extends NumberFormatException {
    public NotValidOperandInputException() {
        super(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
    }
}
