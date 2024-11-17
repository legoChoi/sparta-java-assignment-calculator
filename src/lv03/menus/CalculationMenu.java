package lv03.menus;

public class CalculationMenu implements Menu {
    private boolean state = true;

    private boolean getState() {
        return state;
    }

    private void switchState() {
        state = !state;
    }

    private void showMenu(String menu) {

    }

    @Override
    public void execute() {

    }
}
