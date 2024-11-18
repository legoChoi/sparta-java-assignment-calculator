package lv03.mainMenu.memoryMenu.models.enums;

import lv03.commons.exceptions.NotValidCommandInputException;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum MemoryMenuCommand {
    SHOW("show", "1"),
    DELETE_FIRST("delete first", "2"),
    FIND_BIGGER("find bigger", "3"),
    CLEAR("clear", "4"),
    BACK("back", "5");

    private final String command;
    private final String index;

    MemoryMenuCommand(String command, String index) {
        this.command = command;
        this.index = index;
    }

    public static boolean isCommand(String input) {
        return Arrays.stream(values())
                .anyMatch(e -> e.command.equals(input));
    }

    public static String getMemoryMenuList() {
        return Arrays.stream(values())
                .map(e -> e.index + " | " + e.command)
                .collect(Collectors.joining("\n"));
    }

    public static MemoryMenuCommand findByIndexOrCommand(String command) {
        return Arrays.stream(values())
                .filter(e -> e.command.equals(command) || e.index.equals(command))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}