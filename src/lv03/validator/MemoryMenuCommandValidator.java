package lv03.validator;

import lv03.enums.MemoryMenuCommandLine;

public class MemoryMenuCommandValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        return MemoryMenuCommandLine.isCommand(input);
    }
}
