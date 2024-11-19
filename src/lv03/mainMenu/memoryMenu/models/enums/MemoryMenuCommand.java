package lv03.mainMenu.memoryMenu.models.enums;

import lv03.shared.exceptions.NotValidCommandInputException;

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

    private MemoryMenuCommand(String command, String index) {
        this.command = command;
        this.index = index;
    }

    public static String getMemoryMenuList() {
        return Arrays.stream(values())
                .map(e -> e.index + " | " + e.command)
                .collect(Collectors.joining("\n"));
    }

    public static MemoryMenuCommand findByIndexOrCommand(String commandInput) {
        return Arrays.stream(values())
                .filter(e -> e.command.equals(commandInput) || e.index.equals(commandInput))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}
