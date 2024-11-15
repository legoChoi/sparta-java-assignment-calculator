package lv03;

public class MainMenu extends Menu {
    private boolean state = true;

    @Override
    public boolean getSatae() {
        return state;
    }

    @Override
    public void setSatae(boolean state) {
        this.state = state;
    }

    public void showMainMenuView() {
        System.out.println("\n---------------------");
        System.out.println("1. 계산 >> calculate");
        System.out.println("2. 메모리 >> memory");
        System.out.println("3. 종료 >> exit");
    }
}
