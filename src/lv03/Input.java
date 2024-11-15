package lv03;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);
    private OperatorType operatorType;

    public String input() {
        System.out.print(">> ");
        return sc.nextLine();
    }

    public void end() {
        sc.close();
    }
}
