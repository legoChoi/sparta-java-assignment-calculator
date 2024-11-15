package lv03;

import java.util.LinkedList;
import java.util.Scanner;

public class Memory<T> {
    private LinkedList<T> resultList = new LinkedList<>();

    public boolean test() {
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        System.out.println(answer);

        return answer == 0;
    }

    public LinkedList<T> getResultList() {
        return resultList;
    }

    public void save(T result) {
            resultList.add(result);
    }

    public void deleteFirst() {
        resultList.removeFirst();
    }

    public void clear() {
        resultList.clear();
    }
}
