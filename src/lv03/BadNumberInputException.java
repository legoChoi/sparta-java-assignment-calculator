package lv03;

public class BadNumberInputException extends NumberFormatException {
    public BadNumberInputException() {
        super("올바른 숫자를 입력하세요.");
    }
}
