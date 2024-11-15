package lv03;

public class MainMenu {
    private boolean state = true;

    public boolean getState() {
        return state;
    }

    public void setState(boolean mainMenuState) {
        this.state = mainMenuState;
    }

    public void showMainMenuView() {
        System.out.println("\n---------------------");
        System.out.println("1. 계산 >> calculate");
        System.out.println("2. 메모리 >> memory");
        System.out.println("3. 종료 >> exit");
    }
}
