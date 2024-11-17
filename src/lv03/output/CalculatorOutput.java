package lv03.output;

public class CalculatorOutput implements Output {
    @Override
    public void printMenu(String input) {
        System.out.println("\n---------------------");
        System.out.println(input);
    }

    @Override
    public void errMessage(String msg) {
        System.out.println(msg);
    }
}
