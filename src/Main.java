import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;
        double result;
        String operator;

        while (true) {
            System.out.println();
            System.out.println("양의 정수(0 포함)를 입력하세요.");
            System.out.print("첫번째 정수: ");
            firstNum = sc.nextInt();

            System.out.print("두번째 정수: ");
            secondNum = sc.nextInt();

            if (firstNum < 0 || secondNum < 0) {
                System.out.println("양의 정수(0 포함)만 입력 가능합니다.");
                continue;
            }

            System.out.print("연산자: ");
            operator = sc.next();

            // 나누기 0 일 경우 예외 처리
            if (operator.equals("/") && secondNum == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            // 계산기 연산 로직
            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = (double) firstNum / secondNum;
                    break;
                default:
                    System.out.println("잘못된 연산자 입력 됨");
                    continue;
            }

            System.out.println("결과: " + result);

            System.out.println("\n종료: exit 입력");

            if (sc.next().equals("exit")) break;
        }

        System.out.println("종료");
        sc.close();
    }
}