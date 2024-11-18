package lv03.memory;

import java.util.List;

public interface Memory<T, K> {
    T getMemory();           // 메모리에서 값들을 보여줌
    T save(K result);      // 메모리에 값을 저장
    T deleteFirst();      // 첫 번째 값을 삭제
    T findBigger(String target);  // target 보다 큰 값 찾기
    T clear();            // 메모리 초기화
}
