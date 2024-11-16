package lv03.enums;

public enum ErrorMessage {
    NOT_VALID_INPUT_EXCEPTION("잘못된 입력");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
