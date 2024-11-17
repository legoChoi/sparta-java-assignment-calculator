package lv03.mainMenu.memoryMenu.io.input;

import lv03.input.Input;

import java.util.Scanner;

public class MemoryMenuInput implements Input {
    private final Scanner scanner;

    public MemoryMenuInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String input() {
        System.out.print(">> ");
        return scanner.nextLine();
    }
}
