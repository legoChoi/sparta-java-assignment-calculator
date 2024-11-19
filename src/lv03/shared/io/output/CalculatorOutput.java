package lv03.shared.io.output;

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
    public <T> void printMemory(T memory) {
        System.out.println();
        System.out.println(">> " + memory);
    }

    @Override
    public void printSysMessage(String msg) {
        System.out.println();
        System.out.println(msg);
    }
}
