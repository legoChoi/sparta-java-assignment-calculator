package lv03;

import java.util.Arrays;

public enum MemoryMenuCommandLine {
    SHOW("show"),
    DELETE_FIRST("delete first"),
    FIND_BIGGER("find bigger"),
    CLEAR("clear"),
    BACK("back");

    private String command;

    MemoryMenuCommandLine(String number) {
        this.command = number;
    }

    public static MemoryMenuCommandLine find(String command) {
        return Arrays.stream(values())
                .filter(v -> v.command.equals(command.toLowerCase()))
                .findAny()
                .orElse(null);
    }
}
