package lv03.Memory;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class CalculatorMemory<T extends Number> implements Memory {
    private final LinkedList<T> resultList = new LinkedList<>();

    @Override
    public void show() {
        System.out.println(">> " + resultList);
    }

    @Override
    public void save(Number result) {
        resultList.add((T) result);
    }

    @Override
    public void deleteFirst() {
        if (resultList.isEmpty()) {
            System.out.println(">> 메모리가 비었습니다.");
            return;
        }

        resultList.removeFirst();
    }

    @Override
    public void findBigger(Number target) {
        LinkedList<Number> t = resultList.stream()
                .filter(num -> num.doubleValue() > target.doubleValue())
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(t);
    }

    @Override
    public void clear() {
        resultList.clear();
    }
}
