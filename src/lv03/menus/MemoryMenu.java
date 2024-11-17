package lv03.menus;

import lv03.enums.MemoryMenuCommandLine;
import lv03.exceptions.NotValidCommandInputException;
import lv03.input.Input;
import lv03.output.Output;

public class MemoryMenu implements Menu {
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private boolean state = true;

    public MemoryMenu(Input calculatorInput, Output calculatorOutput) {
        this.calculatorInput = calculatorInput;
        this.calculatorOutput = calculatorOutput;
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
        String memoryMenuList = MemoryMenuCommandLine.getMemoryMenuList();
        String commandInput = "";

        showMenu(memoryMenuList);

        while (getState()) {
            commandInput = calculatorInput.input();
            try {
                MemoryMenuCommandLine mainMenuCommandLine = MemoryMenuCommandLine.findByIndexOrCommand(commandInput);
                controller(mainMenuCommandLine);
            } catch (NotValidCommandInputException e) {
                calculatorOutput.printErrMessage(e.getMessage());
                showMenu(memoryMenuList);
            }
        }

        setState(true);
    }

    private void controller(MemoryMenuCommandLine commandLine) {
        switch (commandLine) {
            case SHOW:
                break;
            case DELETE_FIRST:
                break;
            case FIND_BIGGER:
                break;
            case CLEAR:
                break;
            case BACK:
                setState(false);
                break;
        }
    }
}
