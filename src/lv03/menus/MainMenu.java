package lv03.menus;

import lv03.enums.MainMenuCommandLine;
import lv03.exceptions.NotValidCommandInputException;
import lv03.input.Input;
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
        calculatorOutput.printMenu(menu);
    }

    @Override
    public void execute() {
        String mainMenuList = MainMenuCommandLine.getMainMenuList();
        String commandInput;

        while (getState()) {
            showMenu(mainMenuList);
            commandInput = calculatorInput.input();

            try {
                MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.findByIndexOrCommand(commandInput);
                controller(mainMenuCommandLine);
            } catch (NotValidCommandInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }
    }

    private void controller(MainMenuCommandLine mainMenuCommandLine) {
        switch (mainMenuCommandLine) {
            case CALCULATE:
                // 계산 메뉴
                calculationMenu.execute();
                break;
            case MEMORY:
                // 메모리 메뉴
                memoryMenu.execute();
                break;
            case EXIT:
                switchState();
                break;
        }
    }
}
