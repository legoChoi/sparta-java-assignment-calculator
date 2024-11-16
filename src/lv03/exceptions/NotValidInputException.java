package lv03.exceptions;

import lv03.enums.ErrorMessage;

public class NotValidInputException extends RuntimeException {
    public NotValidInputException() {
        super(ErrorMessage.NOT_VALID_INPUT_EXCEPTION.getMessage());
    }
}
