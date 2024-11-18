package lv03.io.output;

import java.util.Collection;

public class CalculatorOutput implements Output {
    @Override
    public void printMenu(String input) {
        System.out.println("\n---------------------");
        System.out.println(input);
    }

    @Override
    public void printErrMessage(String msg) {
        System.out.println();
        System.out.println(msg);
    }

    @Override
    public <T> void printMemory(Collection<T> memory) {
        System.out.println();
        System.out.println(">> " + memory);
    }

    @Override
    public void printSysMessage(String msg) {
        System.out.println();
        System.out.println(msg);
    }
}
