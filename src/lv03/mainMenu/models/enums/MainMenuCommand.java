package lv03.mainMenu.models.enums;

import lv03.commons.exceptions.NotValidCommandInputException;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum MainMenuCommand {
    CALCULATE("calculate", "1"),
    MEMORY("memory", "2"),
    EXIT("exit", "3");

    private final String command;
    private final String index;

    private MainMenuCommand(String command, String index) {
        this.command = command;
        this.index = index;
    }

    public static String getMainMenuList() {
        return Arrays.stream(values())
                .map(e -> e.index + " | " + e.command)
                .collect(Collectors.joining("\n"));
    }

    public static MainMenuCommand findByIndexOrCommand(String commandInput) {
        return Arrays.stream(values())
                .filter(e -> e.command.equals(commandInput) || e.index.equals(commandInput))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}


