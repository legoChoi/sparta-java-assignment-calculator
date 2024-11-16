package lv03.menus;

public class CalculationMenu extends Menu {
    private boolean state = true;

    @Override
    public boolean getSatae() {
        return state;
    }

    @Override
    public void setSatae(boolean state) {
        this.state = state;
    }

    public void showFirstNumberInputRequestView() {
        System.out.println("---------------------");
        System.out.println("첫 번째 숫자 입력");
    }

    public void showSecondNumberInputRequestView() {
        System.out.println("---------------------");
        System.out.println("두 번째 숫자 입력");
    }

    public void test() {
        System.out.println("test");
    }

    public void showOperatorInputRequestView() {
        System.out.println("---------------------");
        System.out.println("연산자 입력(+, -, *, **, /, %)");
    }
}
