package lv02;

import java.util.Scanner;

// 레벨 2: 계산기 연산 후 결과 값 반환 & 컬렉션에 연산 결과 저장
// Calculator 클래스: 연산 수행, 저장

public class App  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second;
        double result;
        String operator;
        String command;

        Calculator cal = new Calculator();

        while (true) {
            System.out.println();
            System.out.println("양의 정수(0 포함)를 입력하세요.");
            System.out.print("첫번째 정수: ");
            first = sc.nextInt();
            System.out.print("두번째 정수: ");
            second = sc.nextInt();

            if (first < 0 || second < 0) {
                System.out.println("양의 정수(0 포함)만 입력 가능합니다.");
                continue;
            }

            System.out.print("연산자: ");
            operator = sc.next();

            result = cal.calculate(operator,first, second);

            System.out.println("결과: " + result);
            System.out.println("결과 목록: " + cal.getResultList());

            System.out.println("\n===============================\n");
            System.out.print("연산 결과 목록 조회: show 입력"
                            + "\n제일 오래된 연산 결과 삭제: delete 입력"
                            + "\n종료: exit 입력"
                            + "\n입력 >> ");

            sc.nextLine();
            command = sc.nextLine();

            if (command.equals("show")) System.out.println(">> " + cal.getResultList());
            if (command.equals("delete")) {
                cal.deleteFirstResult();
                System.out.println(">> " + cal.getResultList());
            }
            if (command.equals("exit")) break;

            System.out.println("\n===============================");
        }

        System.out.println("종료");
        sc.close();
    }
}
