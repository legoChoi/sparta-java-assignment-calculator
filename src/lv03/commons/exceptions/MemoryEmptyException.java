package lv03.commons.exceptions;

import lv03.commons.exceptions.errorMessages.ExceptionMessage;

public class MemoryEmptyException extends RuntimeException {
    public MemoryEmptyException() {
        super(ExceptionMessage.MEMORY_EMPTY_EXCEPTION.getMessage());
    }
}
