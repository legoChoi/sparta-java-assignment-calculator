package lv03;

import lv03.mainMenu.calculationMenu.ArithmeticCalculator;
import lv03.mainMenu.calculationMenu.io.input.CalculationMenuInput;
import lv03.mainMenu.io.input.MainMenuInput;
import lv03.mainMenu.memoryMenu.io.input.MemoryMenuInput;
import lv03.memory.CalculatorMemory;
import lv03.input.CalculatorInput;
import lv03.mainMenu.calculationMenu.CalculationMenu;
import lv03.mainMenu.MainMenu;
import lv03.mainMenu.memoryMenu.MemoryMenu;
import lv03.memory.Memory;
import lv03.output.CalculatorOutput;
import lv03.output.Output;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Output calculatorOutput = new CalculatorOutput();
        Memory<Double> calculatorMemory = new CalculatorMemory();

        new Calculator(
                new MainMenu(
                        new MainMenuInput(scanner),
                        calculatorOutput,
                        new MemoryMenu(
                                new MemoryMenuInput(scanner),
                                calculatorOutput,
                                calculatorMemory
                        ),
                        new CalculationMenu(
                                new CalculationMenuInput(scanner),
                                calculatorOutput,
                                new ArithmeticCalculator(
                                        calculatorOutput,
                                        calculatorMemory
                                )
                        )
                )
        );

        scanner.close();
    }
}