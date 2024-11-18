package lv03.mainMenu;

import lv03.mainMenu.models.enums.MainMenuCommand;
import lv03.commons.exceptions.NotValidCommandInputException;
import lv03.io.input.Input;
import lv03.interfaces.Menu;
import lv03.io.output.Output;

public class MainMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final Menu memoryMenu;
    private final Menu calculationMenu;

    public MainMenu(Input calculatorInput, Output calculatorOutput, Menu memoryMenu, Menu calculationMenu) {
        this.calculatorInput = calculatorInput;
        this.calculatorOutput = calculatorOutput;
        this.memoryMenu = memoryMenu;
        this.calculationMenu = calculationMenu;
    }

    private boolean getState() {
        return state;
    }

    private void switchState() {
        state = !state;
    }

    private void showMenu(String menu) {
        calculatorOutput.printMenu(menu);
    }

    @Override
    public void executeMenu() {
        String mainMenuList = MainMenuCommand.getMainMenuList();
        String mainMenuCommandInput;

        while (getState()) {
            showMenu(mainMenuList);
            mainMenuCommandInput = calculatorInput.input();

            try {
                MainMenuCommand mainMenuCommand = MainMenuCommand.findByIndexOrCommand(mainMenuCommandInput);
                menuBranch(mainMenuCommand);
            } catch (NotValidCommandInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }
    }

    private void menuBranch(MainMenuCommand mainMenuCommandInput) {
        switch (mainMenuCommandInput) {
            case CALCULATE -> calculationMenu.executeMenu();
            case MEMORY -> memoryMenu.executeMenu();
            case EXIT -> switchState();
        }
    }
}
