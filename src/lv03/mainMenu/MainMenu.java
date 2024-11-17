package lv03.mainMenu;

import lv03.mainMenu.models.enums.MainMenuCommand;
import lv03.commons.exceptions.NotValidCommandInputException;
import lv03.input.Input;
import lv03.interfaces.Menu;
import lv03.output.Output;

public class MainMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final Menu memoryMenu;
    private final Menu calculationMenu;

    public MainMenu(Input input, Output output, Menu memoryMenu, Menu calculationMenu) {
        this.calculatorInput = input;
        this.calculatorOutput = output;
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
                controller(mainMenuCommand);
            } catch (NotValidCommandInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }
    }

    private void controller(MainMenuCommand mainMenuCommandInput) {
        switch (mainMenuCommandInput) {
            case CALCULATE -> calculationMenu.executeMenu();
            case MEMORY -> memoryMenu.executeMenu();
            case EXIT -> switchState();
        }
    }
}
