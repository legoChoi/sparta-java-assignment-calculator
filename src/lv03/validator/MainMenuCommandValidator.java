package lv03.validator;

import lv03.enums.MainMenuCommandLine;

public class MainMenuCommandValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return MainMenuCommandLine.isCommand(input);
    }
}
