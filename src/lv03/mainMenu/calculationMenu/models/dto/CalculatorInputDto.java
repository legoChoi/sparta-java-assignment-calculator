package lv03.mainMenu.calculationMenu.models.dto;

public record CalculatorInputDto(
        double firstOperand,
        double secondOperand,
        String operator) {
}
