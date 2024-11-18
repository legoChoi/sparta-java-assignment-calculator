package lv03.memory;

import lv03.commons.exceptions.MemoryEmptyException;
import lv03.commons.exceptions.errorMessages.ExceptionMessage;

import java.util.LinkedList;
import java.util.List;

public class CalculatorMemory implements Memory<List<Double>, Double> {
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
        if (resultList.isEmpty()) throw new MemoryEmptyException();

        resultList.removeFirst();
        return getMemory();
    }

    @Override
    public List<Double> findBigger(String target) {
        try {
            double targetNum = Double.parseDouble(target);

            return resultList.stream()
                    .filter(num -> num > targetNum)  // target 보다 큰 경우
                    .toList();

        } catch (NumberFormatException e) {
            throw new NumberFormatException(ExceptionMessage.NOT_VALID_NUMBER_INPUT_EXCEPTION.getMessage());
        }
    }

    @Override
    public List<Double> clear() {
        resultList.clear();
        return getMemory();
    }
}