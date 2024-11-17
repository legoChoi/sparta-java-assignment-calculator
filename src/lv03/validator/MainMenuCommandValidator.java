package lv03.validator;

import lv03.mainMenu.models.enums.MainMenuCommand;

public class MainMenuCommandValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return MainMenuCommand.isCommand(input);
    }
}
