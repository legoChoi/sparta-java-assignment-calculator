package lv03.exceptions;

import lv03.enums.ExceptionMessage;

public class NotValidOperatorInputException extends RuntimeException {
    public NotValidOperatorInputException() {
        super(ExceptionMessage.NOT_VALID_OPERATOR_INPUT_EXCEPTION.getMessage());
    }
}
