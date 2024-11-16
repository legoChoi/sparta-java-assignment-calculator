package lv03;

import lv03.Input.CalculatorInput;
import lv03.menus.CalculationMenu;
import lv03.menus.MainMenu;
import lv03.menus.MemoryMenu;
import lv03.validator.MainMenuCommandValidator;
import lv03.validator.MemoryMenuCommandValidator;
import lv03.validator.OperatorValidator;

public class App {
    public static void main(String[] args) {
        new Calculator(
                new MainMenu(),
                new MemoryMenu(),
                new CalculationMenu(),
                new CalculatorInput(),
                new OperatorValidator(),
                new MainMenuCommandValidator(),
                new MemoryMenuCommandValidator(),
                new ArithmeticCalculator()
        );
    }
}