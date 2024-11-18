package lv03.shared.exceptions;

import lv03.shared.exceptions.errorMessages.ExceptionMessage;

public class NotValidCommandInputException extends RuntimeException {
    public NotValidCommandInputException() {
        super(ExceptionMessage.NOT_VALID_COMMAND_INPUT_EXCEPTION.getMessage());
    }
}
