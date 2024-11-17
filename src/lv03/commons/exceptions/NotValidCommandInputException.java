package lv03.commons.exceptions;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;

public class NotValidCommandInputException extends RuntimeException {
    public NotValidCommandInputException() {
        super(ExceptionMessage.NOT_VALID_COMMAND_INPUT_EXCEPTION.getMessage());
    }
}
