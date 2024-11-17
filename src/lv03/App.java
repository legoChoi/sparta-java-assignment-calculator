package lv03;

import lv03.input.CalculatorInput;
import lv03.menus.MainMenu;
import lv03.menus.MemoryMenu;
import lv03.output.CalculatorOutput;

public class App {
    public static void main(String[] args) {
        new Calculator(
                new MainMenu(
                        new CalculatorInput(),
                        new CalculatorOutput(),
                        new MemoryMenu(
                                new CalculatorInput(),
                                new CalculatorOutput()
                        )
                )
        );
    }
}