package lv03.validator;

public interface Validator {
    public boolean isMainMenuCommand(String input);
    public boolean isMemoryMenuCommand(String input);
    public boolean isNumber(String input);
    public boolean isOperator(String input);
}
