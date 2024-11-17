package lv03.menus;

public interface Menu {
    void showMenu(String menu);
    void execute();
    boolean getState();
    void switchState();
}
