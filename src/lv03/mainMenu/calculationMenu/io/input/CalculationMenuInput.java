package lv03.mainMenu.calculationMenu.io.input;

import lv03.input.Input;

import java.util.Scanner;

public class CalculationMenuInput implements Input {
    private final Scanner scanner;

    public CalculationMenuInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String input() {
        System.out.print(">> ");
        return scanner.nextLine();
    }
}
