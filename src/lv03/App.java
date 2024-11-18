package lv03;

import lv03.io.input.CalculatorInput;
import lv03.io.input.Input;
import lv03.mainMenu.calculationMenu.ArithmeticCalculator;
import lv03.memory.CalculatorMemory;
import lv03.mainMenu.calculationMenu.CalculationMenu;
import lv03.mainMenu.MainMenu;
import lv03.mainMenu.memoryMenu.MemoryMenu;
import lv03.memory.Memory;
import lv03.io.output.CalculatorOutput;
import lv03.io.output.Output;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input calculatorInput = new CalculatorInput(scanner);
        Output calculatorOutput = new CalculatorOutput();
        Memory<Double> calculatorMemory = new CalculatorMemory();

        new Calculator(
                new MainMenu(
                        calculatorInput,
                        calculatorOutput,
                        new MemoryMenu(
                                calculatorInput,
                                calculatorOutput,
                                calculatorMemory
                        ),
                        new CalculationMenu(
                                calculatorInput,
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