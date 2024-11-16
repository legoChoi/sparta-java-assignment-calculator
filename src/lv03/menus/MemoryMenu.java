package lv03.menus;

public class MemoryMenu implements Menu {
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
        System.out.println("1. 조회 >> show");
        System.out.println("2. 오래된 기록 삭제 >> delete first");
        System.out.println("3. 보다 높은 값 찾기 >> find bigger");
        System.out.println("4. 비우기 >> clear");
        System.out.println("5. 되돌아가기 >> back");
    }
}