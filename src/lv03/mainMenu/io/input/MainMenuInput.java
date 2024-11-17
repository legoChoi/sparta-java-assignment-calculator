package lv03.mainMenu.io.input;

import lv03.input.Input;
import java.util.Scanner;

public class MainMenuInput implements Input {
    private final Scanner scanner;

    public MainMenuInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String input() {
        System.out.print(">> ");
        return scanner.nextLine();
    }
}
