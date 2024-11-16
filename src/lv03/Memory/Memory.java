package lv03.Memory;

import java.util.List;

public interface Memory<T extends Number> {
    void show();
    void save(T result);
    void deleteFirst();
    void findBigger(T target);
    void clear();
}
