package lv03;

public class BadCommandLineInputException extends NullPointerException {
    public BadCommandLineInputException() {
        super("명령어를 잘못 입력 하셨습니다.");
    }
}