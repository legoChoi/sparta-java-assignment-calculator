package lv03.shared.io.output;

public interface Output {
    void printMenu(String input);
    void printErrMessage(String msg);
    <T> void printMemory(T memory);
    void printSysMessage(String msg);
}
