package lv03;

import lv03.mainMenu.MainMenu;
import lv03.interfaces.Menu;

public class Calculator {
    private final Menu mainMenu;

    public Calculator(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        run();
    }

    private void run() {
        mainMenu.execute();
    }

//    public void setMainMenu() {
//        calculatorOutput.printMenu(MainMenuCommandLine.getMainMenuList());
//        String commandInput = "";
//
//        while (!commandInput.equals(MainMenuCommandLine.EXIT.getCommand())) {
//            commandInput = calculatorInput.input();
//            try {
//                MainMenuCommandLine.findByIndexOrCommand(commandInput);
//            } catch (NotValidCommandInputException e) {
//                System.out.println(e.getMessage());
//            } finally {
//                calculatorOutput.printMenu(MainMenuCommandLine.getMainMenuList());
//            }
//        }
//    }

//    public void showMainMenu() {
//        while (mainMenu.getState()) {
//            mainMenu.showMenu();
//            String command = calculatorInput.input();
//
//            try {
//                MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.findByIndexOrCommand(command);
//                controlMainMenuByCommand(mainMenuCommandLine);
//            } catch (NotValidCommandInputException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        calculatorInput.end(); // Scanner 종료
//    }
//
//    public void showMemoryMenu() {
//        while (memoryMenu.getState()) {
//            memoryMenu.showMenu();
//            String command = calculatorInput.input();
//
//            try {
//                MemoryMenuCommandLine memoryMenuCommandLine = MemoryMenuCommandLine.find(command);
//                controlMemoryByCommand(memoryMenuCommandLine);
//            } catch (NotValidCommandInputException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        memoryMenu.setState(true);
//    }
//
//    public void calculationMenu() {
//        while(calculationMenu.getState()) {
//            try {
//                calculationMenu.showMenu();
//                double inputFirstOperand = Double.parseDouble(calculatorInput.input());
//
//                calculationMenu.showSecondNumberInputRequestView();
//                double inputSecondOperand = Double.parseDouble(calculatorInput.input());;
//
//                calculationMenu.showOperatorInputRequestView();
//                String inputOperator = calculatorInput.input();
//
//                // 연산
//                double result = arithmeticCalculator.calculate(new CalculatorInputDto(inputFirstOperand, inputSecondOperand, inputOperator));
//
//                // 메모리에 저장
//                if (!Double.isNaN(result)) {
//                    memory.save(result);
//                    System.out.println(">> " + result);
//                }
//
//                calculationMenu.setState(false); // 반복 해제
//            } catch (NumberFormatException e) {
//                System.out.println(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION.getMessage());
//            }
//        }
//
//        calculationMenu.setState(true);
//    }
//
//    // 메인 메뉴
//    public void controlMainMenuByCommand(MainMenuCommandLine command) {
//        switch (command) {
//            // Arithmetic Calculator 계산 진행
//            case CALCULATE -> calculationMenu();
//            // 메모리 메뉴로 이동
//            case MEMORY -> showMemoryMenu();
//            // 시스템 종료
//            case EXIT -> mainMenu.setState(false);
//        }
//    }
//
//    // 메모리 메뉴
//    public void controlMemoryByCommand(MemoryMenuCommandLine command) {
//        switch (command) {
//            // 컬렉션 보여주기
//            case SHOW -> memory.show();
//            // 첫번째 삭제 후 컬렉션 보여주기
//            case DELETE_FIRST -> memory.deleteFirst();
//            // 입력한 숫자보다 높은 값 컬렉션 보여주기
//            case FIND_BIGGER -> {
//                try {
//                    double target = Double.parseDouble(calculatorInput.input());
//                    memory.findBigger(target);
//                } catch (NumberFormatException e) {
//                    System.out.println(ExceptionMessage.NOT_VALID_OPERAND_INPUT_EXCEPTION);
//                }
//            }
//            // 컬렉션 비우기
//            case CLEAR -> memory.clear();
//            // 메인 메뉴로 돌아가기
//            case BACK -> memoryMenu.setState(false);
//        }
//    }
}