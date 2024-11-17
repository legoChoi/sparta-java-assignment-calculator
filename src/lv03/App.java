package lv03;

import lv03.memory.CalculatorMemory;
import lv03.input.CalculatorInput;
import lv03.mainMenu.calculationMenu.CalculationMenu;
import lv03.mainMenu.MainMenu;
import lv03.mainMenu.memoryMenu.MemoryMenu;
import lv03.output.CalculatorOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        new Calculator(
                new MainMenu(
                        new CalculatorInput(scanner),
                        new CalculatorOutput(),
                        new MemoryMenu(
                                new CalculatorInput(scanner),
                                new CalculatorOutput(),
                                new CalculatorMemory()
                        ),
                        new CalculationMenu(
                                new CalculatorInput(scanner),
                                new CalculatorOutput(),
                                new CalculatorMemory()
                        )
                )
        );

        scanner.close();
    }
}