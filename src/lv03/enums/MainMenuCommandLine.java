package lv03.enums;

import java.util.Arrays;

public enum MainMenuCommandLine {
    CALCULATE("calculate"),
    MEMORY("memory"),
    EXIT("exit");

    private final String command;

    MainMenuCommandLine(String command) {
        this.command = command;
    }

    public static boolean isCommand(String input) {
        return Arrays.stream(values())
                .anyMatch(e -> e.command.equals(input));
    }

    public static MainMenuCommandLine find(String command) {
        return Arrays.stream(values())
                .filter(v -> v.command.equals(command.toLowerCase()))
                .findAny()
                .orElse(null);
    }
}


