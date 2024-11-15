package lv03;

public class CalculationMenu {
    private boolean state = true;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
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

    public void showOperatorInputRequestView() {
        System.out.println("---------------------");
        System.out.println("연산자 입력(+, -, *, /, %)");
    }
}
