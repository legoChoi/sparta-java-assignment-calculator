package lv03.enums;

import java.util.Arrays;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    SQUARE("**"),
    DIVIDE("/"),
    MOD("%");

    private final String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static boolean isOperator(String input) {
        return Arrays.stream(values())
                .anyMatch(op -> op.getOperator().equals(input));
    }

    public static OperatorType find(String operator) {
        return Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findAny()
                .orElse(null);
    }
}