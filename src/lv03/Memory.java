package lv03;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Memory<T extends Number> {
    private LinkedList<T> resultList = new LinkedList<>();

    public void show() {
        System.out.println(">> " + resultList.toString());
    }

    public void save(T result) {
        resultList.add(result);
    }

    public void deleteFirst() {
        if (resultList.isEmpty()) {
            System.out.println(">> 메모리가 비었습니다.");
            return;
        }

        resultList.removeFirst();
    }

    public void findBigger(T target) {
        LinkedList<T> t = resultList.stream()
                .filter(num -> num.doubleValue() > target.doubleValue())
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(t.toString());
    }


    public void clear() {
        resultList.clear();
    }
}
