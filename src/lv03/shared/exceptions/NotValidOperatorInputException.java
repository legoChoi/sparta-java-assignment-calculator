package lv03.shared.exceptions;

import lv03.shared.exceptions.errorMessages.ExceptionMessage;

public class NotValidOperatorInputException extends RuntimeException {
    public NotValidOperatorInputException() {
        super(ExceptionMessage.NOT_VALID_OPERATOR_INPUT_EXCEPTION.getMessage());
    }
}
