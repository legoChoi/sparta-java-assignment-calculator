package lv03;

import lv03.mainMenu.MainMenu;
import lv03.interfaces.Menu;

public class Calculator {
    private final Menu mainMenu;

    public Calculator(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        run();
    }

    private void run() {
        mainMenu.executeMenu();
    }
}