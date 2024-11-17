package lv03.output;

import java.util.List;

public class CalculatorOutput implements Output {
    @Override
    public void printMenu(String input) {
        System.out.println("\n---------------------");
        System.out.println(input);
    }

    @Override
    public void printErrMessage(String msg) {
        System.out.println(msg);
    }

    @Override
    public void printMemory(List<Double> memory) {
        System.out.println(memory);
    }
}
