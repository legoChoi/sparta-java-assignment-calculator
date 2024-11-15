package lv03;

import java.util.Scanner;

public class App  {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
//        Scanner sc = new Scanner(System.in);
////        Calculator calculator = new Calculator();
//        String firstNum, secondNum, operator;
//        double result;
//        String command;
//
//        while (true) {
//            System.out.println();
//            System.out.println("양의 정수(0 포함)를 입력하세요.");
//            System.out.print("첫번째 정수: ");
//            firstNum = sc.nextLine();
//            System.out.print("두번째 정수: ");
//            secondNum = sc.nextLine();
//
//            System.out.print("연산자: ");
//            operator = sc.next();
//
//            // 계산 로직
//
////            System.out.println("결과: " + result);
////            System.out.println("결과 목록: " + cal.getResultList());
//
//            System.out.println("\n===============================\n");
//            System.out.print("연산 결과 목록 조회: show 입력"
//                    + "\n제일 오래된 연산 결과 삭제: delete 입력"
//                    + "\n종료: exit 입력"
//                    + "\n입력 >> ");
//
//            sc.nextLine();
//            command = sc.nextLine();
//
////            if (command.equals("show")) System.out.println(">> " + cal.getResultList());
////            if (command.equals("delete")) {
////                cal.deleteFirstResult();
////                System.out.println(">> " + cal.getResultList());
////            }
//            if (command.equals("exit")) break;
//
//            System.out.println("\n===============================");
//        }
//
//        System.out.println("종료");
//        sc.close();
//    }
}