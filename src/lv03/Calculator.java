package lv03;

import lv03.Input.CalculatorInput;
import lv03.Input.Input;
import lv03.Memory.CalculatorMemory;
import lv03.Memory.Memory;
import lv03.enums.MainMenuCommandLine;
import lv03.enums.MemoryMenuCommandLine;
import lv03.enums.OperatorType;
import lv03.exceptions.NotValidInputException;
import lv03.menus.CalculationMenu;
import lv03.menus.MainMenu;
import lv03.menus.MemoryMenu;

public class Calculator {
    private final Input input = new CalculatorInput();
    private final Memory memory = new CalculatorMemory();
    private final MainMenu mainMenu = new MainMenu();
    private final MemoryMenu memoryMenu = new MemoryMenu();
    private final CalculationMenu calculationMenu = new CalculationMenu();
    private final ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    public void run() {
        showMainMenu();
    }

    public void showMainMenu() {
        while (mainMenu.getSatae()) {
            mainMenu.showMainMenuView();
            String command = input.input();

            try {
                if (!MainMenuCommandLine.isCommand(command)) throw new NotValidInputException();

                MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.find(command);
                controlMainMenuByCommand(mainMenuCommandLine);
            } catch (NotValidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        input.end(); // Scanner 종료
    }

    public void showMemoryMenu() {
        while (memoryMenu.getSatae()) {
            memoryMenu.showMemoryMenuView();
            String command = input.input();

            try {
                if (!MemoryMenuCommandLine.isCommand(command)) throw new NotValidInputException();

                MemoryMenuCommandLine memoryMenuCommandLine = MemoryMenuCommandLine.find(command);
                controlMemoryByCommand(memoryMenuCommandLine);
            } catch (NotValidInputException e) {
                System.out.println(e.getMessage());
            }
        }

        memoryMenu.setSatae(true);
    }

    public void calculationMenu() {
        while(calculationMenu.getSatae()) {
            try {
                calculationMenu.showFirstNumberInputRequestView();
                double inputFirstNum = Double.parseDouble(input.input());

                calculationMenu.showSecondNumberInputRequestView();
                double inputSecondNum = Double.parseDouble(input.input());;

                calculationMenu.showOperatorInputRequestView();
                String operator = input.input();

                // 연산자 enum 아닌 경우
                if (!OperatorType.isOperator(operator)) {
                    // 에러 msg
                    continue;
                }

                OperatorType inputOperatorType = OperatorType.find(operator);

                // 연산
                Double result = arithmeticCalculator.calculate(inputFirstNum, inputSecondNum, inputOperatorType);

                if (result != null) {
                    // 메모리에 저장
                    memory.save(result);
                }

                calculationMenu.setSatae(false); // 반복 해제
            } catch (NotValidInputException e) {
                System.out.println("\n다시 입력하세요.\n");
            }
        }

        calculationMenu.setSatae(true);
    }

    public void controlMainMenuByCommand(MainMenuCommandLine command) {
        switch (command) {
            case CALCULATE -> // Arithmetic Calculator 계산 진행
                calculationMenu();

            case MEMORY -> // 메모리 메뉴로 이동
                showMemoryMenu();

            case EXIT -> // 시스템 종료
                mainMenu.setSatae(false);
        }
    }

    public void controlMemoryByCommand(MemoryMenuCommandLine command) {
        switch (command) {
            case SHOW -> // 컬렉션 보여주기
                memory.show();

            case DELETE_FIRST -> // 첫번째 삭제 후 컬렉션 보여주기
                memory.deleteFirst();

            case FIND_BIGGER -> { // 입력한 숫자보다 높은 값 컬렉션 보여주기
                try {
                    double target = Double.parseDouble(input.input());
                    memory.findBigger(target);
                } catch (NumberFormatException e) {
                    e.getMessage();
                }
            }

            case CLEAR -> // 컬렉션 비우기
                memory.clear();

            case BACK -> // 메인 메뉴로 돌아가기
                memoryMenu.setSatae(false);
        }
    }
}