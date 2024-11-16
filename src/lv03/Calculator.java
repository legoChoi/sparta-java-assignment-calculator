package lv03;

import lv03.Input.CalculatorInput;
import lv03.Input.Input;
import lv03.Memory.CalculatorMemory;
import lv03.Memory.Memory;
import lv03.enums.ExceptionMessage;
import lv03.enums.MainMenuCommandLine;
import lv03.enums.MemoryMenuCommandLine;
import lv03.enums.OperatorType;
import lv03.exceptions.NotValidCommandInputException;
import lv03.exceptions.NotValidOperatorInputException;
import lv03.menus.CalculationMenu;
import lv03.menus.MainMenu;
import lv03.menus.MemoryMenu;
import lv03.menus.Menu;
import lv03.validator.*;

public class Calculator {
    private final Menu mainMenu = new MainMenu();
    private final Menu memoryMenu = new MemoryMenu();
    private final CalculationMenu calculationMenu = new CalculationMenu();
    private final Input calculatorInput = new CalculatorInput();
    private final Memory memory = new CalculatorMemory();
    private final Validator operatorValidator = new OperatorValidator();
    private final Validator mainMenuCommandValidator = new MainMenuCommandValidator();
    private final Validator memoryMenuCommandValidator = new MemoryMenuCommandValidator();
    private final ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    public Calculator() {
        showMainMenu();
    }

    public void showMainMenu() {
        while (mainMenu.getState()) {
            mainMenu.showMenu();
            String command = calculatorInput.input();

            try {
                if (!mainMenuCommandValidator.isValid(command)) throw new NotValidCommandInputException();

                MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.find(command);
                controlMainMenuByCommand(mainMenuCommandLine);
            } catch (NotValidCommandInputException e) {
                System.out.println(e.getMessage());
            }
        }

        calculatorInput.end(); // Scanner 종료
    }

    public void showMemoryMenu() {
        while (memoryMenu.getState()) {
            memoryMenu.showMenu();
            String command = calculatorInput.input();

            try {
                if (!memoryMenuCommandValidator.isValid(command)) throw new NotValidCommandInputException();

                MemoryMenuCommandLine memoryMenuCommandLine = MemoryMenuCommandLine.find(command);
                controlMemoryByCommand(memoryMenuCommandLine);
            } catch (NotValidCommandInputException e) {
                System.out.println(e.getMessage());
            }
        }

        memoryMenu.setState(true);
    }

    public void calculationMenu() {
        while(calculationMenu.getState()) {
            try {
                calculationMenu.showMenu();
                double inputFirstNum = Double.parseDouble(calculatorInput.input());

                calculationMenu.showSecondNumberInputRequestView();
                double inputSecondNum = Double.parseDouble(calculatorInput.input());;

                calculationMenu.showOperatorInputRequestView();
                String operator = calculatorInput.input();

                // 연산자 enum 아닌 경우
                if (!operatorValidator.isValid(operator)) throw new NotValidOperatorInputException();

                OperatorType inputOperatorType = OperatorType.find(operator);

                // 연산
                double result = arithmeticCalculator.calculate(inputFirstNum, inputSecondNum, inputOperatorType);

                // 메모리에 저장
                if (!Double.isNaN(result)) {
                    memory.save(result);
                    System.out.println(">> " + result);
                }

                calculationMenu.setState(false); // 반복 해제
            } catch (NotValidOperatorInputException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
            }
        }

        calculationMenu.setState(true);
    }

    // 메인 메뉴
    public void controlMainMenuByCommand(MainMenuCommandLine command) {
        switch (command) {
            // Arithmetic Calculator 계산 진행
            case CALCULATE -> calculationMenu();
            // 메모리 메뉴로 이동
            case MEMORY -> showMemoryMenu();
            // 시스템 종료
            case EXIT -> mainMenu.setState(false);
        }
    }

    // 메모리 메뉴
    public void controlMemoryByCommand(MemoryMenuCommandLine command) {
        switch (command) {
            // 컬렉션 보여주기
            case SHOW -> memory.show();
            // 첫번째 삭제 후 컬렉션 보여주기
            case DELETE_FIRST -> memory.deleteFirst();
            // 입력한 숫자보다 높은 값 컬렉션 보여주기
            case FIND_BIGGER -> {
                try {
                    double target = Double.parseDouble(calculatorInput.input());
                    memory.findBigger(target);
                } catch (NumberFormatException e) {
                    e.getMessage();
                }
            }
            // 컬렉션 비우기
            case CLEAR -> memory.clear();
            // 메인 메뉴로 돌아가기
            case BACK -> memoryMenu.setState(false);
        }
    }
}