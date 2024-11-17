package lv03.mainMenu.memoryMenu.models.enums;

import lv03.commons.exceptions.NotValidCommandInputException;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum MemoryMenuCommandLine {
    SHOW("show", "1"),
    DELETE_FIRST("delete first", "2"),
    FIND_BIGGER("find bigger", "3"),
    CLEAR("clear", "4"),
    BACK("back", "5");

    private final String command;
    private final String index;

    MemoryMenuCommandLine(String command, String index) {
        this.command = command;
        this.index = index;
    }

    public static String getMemoryMenuList() {
        return Arrays.stream(values())
                .map(command -> command.getIndex() + " | " + command.getCommand())
                .collect(Collectors.joining("\n"));
    }

    public String getCommand() {
        return command;
    }

    public String getIndex() {
        return index;
    }

    public static boolean isCommand(String input) {
        return Arrays.stream(values())
                .anyMatch(e -> e.command.equals(input));
    }

    public static MemoryMenuCommandLine findByIndexOrCommand(String command) {
        return Arrays.stream(values())
                .filter(v -> v.getCommand().equals(command) || v.getIndex().equals(command))
                .findAny()
                .orElseThrow(NotValidCommandInputException::new);
    }
}
