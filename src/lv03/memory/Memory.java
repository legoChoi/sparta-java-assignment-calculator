package lv03.memory;

import java.util.List;

public interface Memory<T> {
    List<T> getMemory();           // 메모리에서 값들을 보여줌
    List<T> save(T result);      // 메모리에 값을 저장
    List<T> deleteFirst();      // 첫 번째 값을 삭제
    List<T> findBigger(String target);  // target 보다 큰 값 찾기
    List<T> clear();            // 메모리 초기화
}
