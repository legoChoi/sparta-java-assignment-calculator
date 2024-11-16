package lv03.menus;

public class MainMenu implements Menu {
    private boolean state = true;

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void showMenu() {
        System.out.println("\n---------------------");
        System.out.println("1. 계산 >> calculate");
        System.out.println("2. 메모리 >> memory");
        System.out.println("3. 종료 >> exit");
    }
}
