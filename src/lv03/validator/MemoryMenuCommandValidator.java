package lv03.validator;

import lv03.mainMenu.memoryMenu.models.enums.MemoryMenuCommand;

public class MemoryMenuCommandValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return MemoryMenuCommand.isCommand(input);
    }
}
