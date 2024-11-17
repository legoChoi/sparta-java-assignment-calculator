package lv03.dto;

public record CalculatorInputDto(
        double firstOperand,
        double secondOperand,
        String operator) {
}
