package lv03.io.output;

import java.util.Collection;

public interface Output {
    void printMenu(String input);
    void printErrMessage(String msg);
    <T> void printMemory(Collection<T> memory);
    void printSysMessage(String msg);
}
