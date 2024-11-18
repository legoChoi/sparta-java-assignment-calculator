package lv03.shared.exceptions;

import lv03.shared.exceptions.errorMessages.ExceptionMessage;

public class MemoryEmptyException extends RuntimeException {
    public MemoryEmptyException() {
        super(ExceptionMessage.MEMORY_EMPTY_EXCEPTION.getMessage());
    }
}
