package lv03.enums;

public enum ExceptionMessage {
    NOT_VALID_COMMAND_INPUT_EXCEPTION("유효하지 않은 명령어 입력"),
    NOT_VALID_CALCULATOR_INPUT_EXCEPTION("유효하지 않은 수식 입력"),
    NOT_VALID_OPERAND_INPUT_EXCEPTION("유효하지 않은 피연사자 입력"),
    NOT_VALID_OPERATOR_INPUT_EXCEPTION("유효하지 않은 연산자 입력"),
    DIVIDE_BY_ZERO_EXCEPTION("0으로 나눌 수 없습니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
