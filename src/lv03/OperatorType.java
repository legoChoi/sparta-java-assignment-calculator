package lv03;

import java.util.Arrays;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static OperatorType find(String operator) {
        return Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findAny()
                .orElse(null);
    }
}