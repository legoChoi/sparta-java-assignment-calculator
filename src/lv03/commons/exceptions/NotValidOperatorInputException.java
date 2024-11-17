package lv03.commons.exceptions;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;

public class NotValidOperatorInputException extends RuntimeException {
    public NotValidOperatorInputException() {
        super(ExceptionMessage.NOT_VALID_OPERATOR_INPUT_EXCEPTION.getMessage());
    }
}
