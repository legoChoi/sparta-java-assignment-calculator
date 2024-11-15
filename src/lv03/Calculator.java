package lv03;

public class Calculator {
    Input input = new Input();
    Memory memory = new Memory();
    Menu menu = new Menu();
    MemoryMenu memoryMenu = new MemoryMenu();
    CalculationMenu calculationMenu = new CalculationMenu();
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    public void run() {
        showMainMenu();
    }

    public void showMainMenu() {
        while (menu.getState()) {
            menu.showMainMenuView();
            String command = input.input();
            MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.find(command);
            controlMainMenuByCommand(mainMenuCommandLine);
        }

        input.end(); // Scanner 종료
    }

    public void showMemoryMenu() {
        while (memoryMenu.getState()) {
            memoryMenu.showMemoryMenuView();
            String command = input.input();
            MemoryMenuCommandLine memoryMenuCommandLine = MemoryMenuCommandLine.find(command);
            controlMemoryByCommand(memoryMenuCommandLine);
        }

        memoryMenu.setState(true);
    }

    public void calculationMenu() {
        calculationMenu.showFirstNumberInputRequestView();
        double inputFirstNum = Double.parseDouble(input.input());
        calculationMenu.showSecondNumberInputRequestView();
        double inputSecondNum = Double.parseDouble(input.input());;
        calculationMenu.showOperatorInputRequestView();
        OperatorType inputOperatorType = OperatorType.find(input.input());

        Double result = arithmeticCalculator.calculate(inputFirstNum, inputSecondNum, inputOperatorType);
        if (result != null) {
            // 메모리에 저장
            memory.save(result);
        }
    }

    public void controlMainMenuByCommand(MainMenuCommandLine command) {
        switch (command) {
            case CALCULATE:
                // Arithmetic Calculator 계산 진행
                calculationMenu();
                break;
            case MEMORY:
                // 메모리 메뉴로 이동
                showMemoryMenu();
                break;
            case EXIT:
                // 시스템 종료
                menu.setState(false);
                break;
            default:
                break;
        }
    }

    public void controlMemoryByCommand(MemoryMenuCommandLine command) {
        switch (command) {
            case SHOW:
                // 컬렉션 보여주기
                break;
            case DELETE_FIRST:
                // 첫번째 삭제 후 컬렉션 보여주기
                break;
            case FIND_BIGGER:
                // 입력한 숫자보다 높은 값 컬렉션 보여주기
                break;
            case CLEAR:
                // 컬렉션 비우기
                break;
            case BACK:
                // 메인 메뉴로 돌아가기
                memoryMenu.setState(false);
                break;
            default:
                break;
        }
    }
}