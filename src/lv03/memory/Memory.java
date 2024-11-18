package lv03.memory;

import java.util.Collection;

public interface Memory<T> {
    Collection<T> getMemory();           // 메모리에서 값들을 보여줌
    Collection<T> save(T result);      // 메모리에 값을 저장
    Collection<T> deleteFirst();      // 첫 번째 값을 삭제
    Collection<T> findBigger(String target);  // target 보다 큰 값 찾기
    Collection<T> clear();            // 메모리 초기화
}
