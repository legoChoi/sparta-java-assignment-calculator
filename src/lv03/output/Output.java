package lv03.output;

import java.util.List;

public interface Output {
    void printMenu(String input);
    void printErrMessage(String msg);
    void printMemory(List<Double> memory);
    void printSysMessage(String msg);
}
