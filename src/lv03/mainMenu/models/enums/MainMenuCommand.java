package lv03.mainMenu.models.enums;

import lv03.commons.exceptions.NotValidCommandInputException;
import lv03.mainMenu.models.dto.MainMenuInputDto;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum MainMenuCommand {
    CALCULATE("calculate", "1"),
    MEMORY("memory", "2"),
    EXIT("exit", "3");

    private final String command;
    private final String index;

    MainMenuCommand(String command, String index) {
        this.command = command;
        this.index = index;
    }

    public static String getMainMenuList() {
        return Arrays.stream(values())
                .map(command -> command.getIndex() + " | " + command.getCommand())
                .collect(Collectors.joining("\n"));
    }

    public String getIndex() {
        return index;
    }

    public String getCommand() {
        return command;
    }

    public static boolean isCommand(String input) {
        return Arrays.stream(values())
                .anyMatch(e -> e.command.equals(input));
    }

    public static MainMenuCommand findByIndexOrCommand(String commandInput) {
        return Arrays.stream(values())
                .filter(v -> v.getCommand().equals(commandInput) || v.getIndex().equals(commandInput))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}


