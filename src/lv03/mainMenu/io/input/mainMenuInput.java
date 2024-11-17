package lv03.mainMenu.io.input;

import lv03.input.Input;

import java.util.Scanner;

public class mainMenuInput implements Input {
    @Override
    public String input(Scanner scanner) {
        return ">> ";
    }
}
