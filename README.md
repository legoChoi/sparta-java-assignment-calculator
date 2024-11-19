# 계산기 과제

---

## 요구 사항

### LV 1

- 양의 정수 입력 받기
- 사칙 연산 기호 입력 받기
- 3개의 입력으로 출력

### LV 2

- 연산 결과 값을 저장하는 컬렉션
- Lv 1의 Calculator 클래스의 활용
- 컬렉션 필드의 캡슐화
- 가장 먼저 저장된 데이터의 삭제 구현
- 스트림 활용

### LV 3

- 제네릭 활용
- Enum을 활용한 연산 타입 정의
- 저장된 데이터 중 보다 큰 결과값 들 출력
- 명령어 입력은 영어, 숫자 둘 다 가능
- 잘못된 입력, 파싱 등 예외 처리

---
### 클래스 다이어그램
![계산기 클래스 다이어그램](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcddDGp%2FbtsKMgkk8u8%2FhhMkK6a8ivDLfHfPlzaSB0%2Fimg.png)
---
출력 예시

메인 메뉴
```
---------------------
1 | calculate
2 | memory
3 | exit
>>
```

1. 계산 진행
```
---------------------
첫번째 피연산자 입력
>> 1

---------------------
두번째 피연산자 입력
>> 2

---------------------
연산자 입력
>> /

>> [2.0, 2.0, 0.5]
```
2. 메모리 메뉴
```
---------------------
1 | show
2 | delete first
3 | find bigger
4 | clear
5 | back
>>
```
---
회고: https://itak.tistory.com/2