package lv03;

public class MemoryMenu {
    private boolean state = true;

    public boolean getState() {
        return state;
    }

    public void setState(boolean mainMenuState) {
        this.state = mainMenuState;
    }

    public void showMemoryMenuView() {
        System.out.println("\n---------------------");
        System.out.println("1. 조회 >> show");
        System.out.println("2. 오래된 기록 삭제 >> delete first");
        System.out.println("3. 보다 높은 값 찾기 >> find bigger");
        System.out.println("4. 되돌아가기 >> back");
    }
}
