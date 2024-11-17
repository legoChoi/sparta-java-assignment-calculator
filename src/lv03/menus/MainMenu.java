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

    public MainMenu(Input input, Output output, Menu memoryMenu) {
        this.calculatorInput = input;
        this.calculatorOutput = output;
        this.memoryMenu = memoryMenu;
    }

    private boolean getState() {
        return state;
    }

    private void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void showMenu(String menu) {
        calculatorOutput.printMenu(menu);
    }

    @Override
    public void execute() {
        String mainMenuList = MainMenuCommandLine.getMainMenuList();
        String commandInput = "";

        showMenu(mainMenuList);

        while (getState()) {
            commandInput = calculatorInput.input();
            try {
                MainMenuCommandLine mainMenuCommandLine = MainMenuCommandLine.findByIndexOrCommand(commandInput);
                controller(mainMenuCommandLine);
            } catch (NotValidCommandInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
                showMenu(mainMenuList);
            }
        }
    }

    private void controller(MainMenuCommandLine mainMenuCommandLine) {
        switch (mainMenuCommandLine) {
            case CALCULATE:
                // 계산 메뉴
                break;
            case MEMORY:
                // 메모리 메뉴
                memoryMenu.execute();
                break;
            case EXIT:
                setState(false);
                break;
        }
    }
}
