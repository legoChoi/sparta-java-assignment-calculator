package lv03.menus;

public class CalculationMenu implements Menu {
    private boolean state = true;

    @Override
    public boolean getState() {
        return state;
    }

    @Override
    public void switchState() {
        state = !state;
    }

    @Override
    public void showMenu(String menu) {

    }

    @Override
    public void execute() {

    }
}
