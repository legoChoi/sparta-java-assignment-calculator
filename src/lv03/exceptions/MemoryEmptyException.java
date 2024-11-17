package lv03.exceptions;

import lv03.enums.ExceptionMessage;

public class MemoryEmptyException extends RuntimeException {
    public MemoryEmptyException() {
        super(ExceptionMessage.MEMORY_EMPTY_EXCEPTION.getMessage());
    }
}
