package lv03.mainMenu.calculationMenu.models.enums;

import lv03.shared.exceptions.errorMessages.ExceptionMessage;
import lv03.shared.exceptions.NotValidOperatorInputException;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum OperatorCommand {
    PLUS("+", (n1, n2) -> n1 + n2),
    MINUS("-", (n1, n2) -> n1 - n2),
    MULTIPLY("*", (n1, n2) -> n1 * n2),
    SQUARE("**", (n1, n2) -> Math.pow(n1, n2)),
    DIVIDE("/", (n1, n2) -> {
        if (n2 == 0) throw new ArithmeticException(ExceptionMessage.DIVIDE_BY_ZERO_EXCEPTION.getMessage());

        return n1 / n2;
    }),
    MOD("%", (n1, n2) -> n1 % n2);

    private final String operator;
    private final BiFunction<Double, Double, Double> calculation;

    private OperatorCommand(String operator, BiFunction<Double, Double, Double> calculation) {
        this.operator = operator;
        this.calculation = calculation;
    }

    public static OperatorCommand find(String commandInput) {
        return Arrays.stream(values())
                .filter(e -> e.operator.equals(commandInput))
                .findAny()
                .orElseThrow(NotValidOperatorInputException::new);
    }

    public double calculate(double firstOperand, double secondOperand) {
        return calculation.apply(firstOperand, secondOperand);
    }
}