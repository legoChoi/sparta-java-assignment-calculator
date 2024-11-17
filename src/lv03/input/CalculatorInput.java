package lv03.input;

import java.util.Scanner;

public class CalculatorInput implements Input {
    private final Scanner scanner;

    public CalculatorInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String input() {
        System.out.print(">> ");
        return scanner.nextLine();
    }
}
