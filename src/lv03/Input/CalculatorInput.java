package lv03.Input;

import java.util.Scanner;

public class CalculatorInput implements Input {
    private final Scanner scanner = new Scanner(System.in);

    public String input() {
        System.out.print(">> ");
        return scanner.nextLine();
    }

    public void end() {
        scanner.close();
    }
}
