package lv03.mainMenu.memoryMenu;

import lv03.interfaces.Menu;
import lv03.memory.Memory;
import lv03.mainMenu.memoryMenu.models.enums.MemoryMenuCommandLine;
import lv03.commons.exceptions.MemoryEmptyException;
import lv03.commons.exceptions.NotValidCommandInputException;
import lv03.input.Input;
import lv03.output.Output;

public class MemoryMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final Memory<Double> calculatorMemory;

    public MemoryMenu(Input calculatorInput, Output calculatorOutput, Memory<Double> calculatorMemory) {
        this.calculatorInput = calculatorInput;
        this.calculatorOutput = calculatorOutput;
        this.calculatorMemory = calculatorMemory;
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
    public void execute() {
        String memoryMenuList = MemoryMenuCommandLine.getMemoryMenuList();
        String commandInput;

        while (getState()) {
            showMenu(memoryMenuList);
            commandInput = calculatorInput.input();

            try {
                MemoryMenuCommandLine mainMenuCommandLine = MemoryMenuCommandLine.findByIndexOrCommand(commandInput);
                controller(mainMenuCommandLine);
            } catch (NotValidCommandInputException | MemoryEmptyException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }

        switchState(); // memory 메뉴에 재진입 할 수 있도록 상태 복구
    }

    private void controller(MemoryMenuCommandLine commandLine) {
        switch (commandLine) {
            case SHOW -> calculatorOutput.printMemory(calculatorMemory.getMemory());
            case DELETE_FIRST -> calculatorOutput.printMemory(calculatorMemory.deleteFirst());
            case FIND_BIGGER -> calculatorOutput.printMemory(calculatorMemory.findBigger(calculatorInput.input()));
            case CLEAR -> calculatorOutput.printMemory(calculatorMemory.clear());
            case BACK -> switchState(); // BACK 명령어로 돌아가기 : 반복문 종료를 위한 상태 변경
        }
    }
}
