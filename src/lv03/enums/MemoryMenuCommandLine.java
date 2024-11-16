package lv03.enums;

import lv03.exceptions.NotValidCommandInputException;

import java.util.Arrays;

public enum MemoryMenuCommandLine {
    SHOW("show"),
    DELETE_FIRST("delete first"),
    FIND_BIGGER("find bigger"),
    CLEAR("clear"),
    BACK("back");

    private final String command;

    MemoryMenuCommandLine(String number) {
        this.command = number;
    }

    public static boolean isCommand(String input) {
        return Arrays.stream(values())
                .anyMatch(e -> e.command.equals(input));
    }

    public static MemoryMenuCommandLine find(String command) {
        return Arrays.stream(values())
                .filter(v -> v.command.equals(command.toLowerCase()))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}
