package lv03.menus;

public class CalculationMenu implements Menu {
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
        System.out.println("---------------------");
        System.out.println("첫 번째 숫자 입력");
    }

    public void showSecondNumberInputRequestView() {
        System.out.println("---------------------");
        System.out.println("두 번째 숫자 입력");
    }

    public void showOperatorInputRequestView() {
        System.out.println("---------------------");
        System.out.println("연산자 입력(+, -, *, **, /, %)");
    }
}
