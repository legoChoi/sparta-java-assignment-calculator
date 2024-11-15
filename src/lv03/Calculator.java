package lv03;

public class Calculator {
    Input input = new Input();
    Menu menu = new Menu();
    ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

    public void run() {
        showMainMenu();
    }

    public void showMainMenu() {
        while (menu.getMainMenuState()) {
            menu.showMainMenu();
            String command = input.input();
            MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.find(command);
            controlMainMenuByCommand(mainMenuCommandLine);
        }

        input.end(); // Scanner 종료
    }

    public void showMemoryMenu() {
        while (menu.getMemoryMenuState()) {
            menu.showMemorymenu();
            String command = input.input();
            MemoryMenuCommandLine memoryMenuCommandLine = MemoryMenuCommandLine.find(command);
            controlMemoryByCommand(memoryMenuCommandLine);
        }

        menu.setMemoryMenuState(true);
    }

    public void controlMainMenuByCommand(MainMenuCommandLine command) {
        switch (command) {
            case CALCULATE:
                // AritheMetic Calculator 계산
                break;
            case MEMORY:
                // 메모리 메뉴로 이동
                showMemoryMenu();
                break;
            case EXIT:
                // 시스템 종료
                menu.setMainMenuState(false);
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
                menu.setMemoryMenuState(false);
                break;
            default:
                break;
        }
    }
}