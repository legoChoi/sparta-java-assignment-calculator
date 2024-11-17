package lv03.Memory;

import java.util.LinkedList;
import java.util.List;

public class CalculatorMemory implements Memory<Double> {
    private final LinkedList<Double> resultList = new LinkedList<>();

    @Override
    public List<Double> getMemory() {
        return resultList;
    }

    @Override
    public List<Double> save(Double result) {
        resultList.add(result);

        return getMemory();
    }

    @Override
    public List<Double> deleteFirst() {
//        if (resultList.isEmpty()) return false; // exception

        resultList.removeFirst();
        return getMemory();
    }

    @Override
    public List<Double> findBigger(String target) {
        return resultList.stream()
                .filter(num -> num > Double.parseDouble(target))  // target 보다 큰 경우
                .toList();
    }

    @Override
    public List<Double> clear() {
        resultList.clear();
        return getMemory();
    }
}