package lv03.mainMenu.memoryMenu;

import lv03.shared.interfaces.Menu;
import lv03.shared.memory.Memory;
import lv03.mainMenu.memoryMenu.models.enums.MemoryMenuCommand;
import lv03.shared.exceptions.MemoryEmptyException;
import lv03.shared.exceptions.NotValidCommandInputException;
import lv03.shared.io.input.Input;
import lv03.shared.io.output.Output;

import java.util.List;

public class MemoryMenu implements Menu {
    private boolean state = true;
    private final Input calculatorInput;
    private final Output calculatorOutput;
    private final Memory<List<Double>, Double> calculatorMemory;

    public MemoryMenu(Input calculatorInput, Output calculatorOutput, Memory<List<Double>, Double> calculatorMemory) {
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
    public void executeMenu() {
        String memoryMenuList = MemoryMenuCommand.getMemoryMenuList();
        String memoryMenuCommandInput;

        while (getState()) {
            showMenu(memoryMenuList);
            memoryMenuCommandInput = calculatorInput.input();

            try {
                MemoryMenuCommand mainMenuCommand = MemoryMenuCommand.findByIndexOrCommand(memoryMenuCommandInput);
                menuBranch(mainMenuCommand);
            } catch (NotValidCommandInputException | MemoryEmptyException | NumberFormatException e) {
                calculatorOutput.printErrMessage(e.getMessage());
            }
        }

        switchState(); // memory 메뉴에 재진입 할 수 있도록 상태 복구
    }

    private void menuBranch(MemoryMenuCommand memoryMenuCommandInput) {
        switch (memoryMenuCommandInput) {
            case SHOW -> calculatorOutput.printMemory(calculatorMemory.getMemory());
            case DELETE_FIRST -> calculatorOutput.printMemory(calculatorMemory.deleteFirst());
            case FIND_BIGGER -> {
                calculatorOutput.printSysMessage("대상(혁) 입력");
                calculatorOutput.printMemory(calculatorMemory.findBigger(calculatorInput.input()));
            }
            case CLEAR -> calculatorOutput.printMemory(calculatorMemory.clear());
            case BACK -> switchState(); // BACK 명령어로 돌아가기 : 반복문 종료를 위한 상태 변경
        }
    }
}
