package lv03.dto;

import lv03.enums.OperatorType;

public record CalculatorInputDto(
        double firstOperand,
        double secondOperand,
        String operator) {
}
