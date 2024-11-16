package lv03.exceptions;

import lv03.enums.ExceptionMessage;

public class NotValidCommandInputException extends RuntimeException {
    public NotValidCommandInputException() {
        super(ExceptionMessage.NOT_VALID_COMMAND_INPUT_EXCEPTION.getMessage());
    }
}
