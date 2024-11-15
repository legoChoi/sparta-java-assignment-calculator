package lv03;

public class Menu {
    private boolean mainMenuState = true;
    private boolean memoryMenuState = true;

    public boolean getMainMenuState() {
        return mainMenuState;
    }

    public void setMainMenuState(boolean mainMenuState) {
        this.mainMenuState = mainMenuState;
    }

    public boolean getMemoryMenuState() {
        return memoryMenuState;
    }

    public void setMemoryMenuState(boolean memoryMenuSta) {
        this.memoryMenuState = memoryMenuSta;
    }

    public void showMainMenu() {
        System.out.println("---------------------");
        System.out.println("1. 계산 >> calculate");
        System.out.println("2. 메모리 >> memory");
        System.out.println("3. 종료 >> exit");
        System.out.print(">> ");
    }

    public void showMemorymenu() {
        System.out.println("---------------------");
        System.out.println("1. 오래된 기록 삭제 >> CALCULATE");
        System.out.println("2. 되돌아가기 >> EXIT");
        System.out.print(">> ");
    }

    public void showFirstNumberInputRequestMenu() {
        System.out.println("---------------------");
        System.out.println("첫 번째 숫자 입력");
        System.out.print(">> ");
    }

    public void showSecondNumberInputRequestMenu() {
        System.out.println("---------------------");
        System.out.println("첫 번째 숫자 입력");
        System.out.print(">> ");
    }

    public void showOperatorInputRequestMenu() {
        System.out.println("---------------------");
        System.out.println("연산자 입력(+, -, *, /)");
        System.out.print(">> ");
    }
}
