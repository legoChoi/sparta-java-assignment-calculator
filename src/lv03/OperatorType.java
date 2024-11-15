package lv03;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public void runByMenu() {

    }

    public String getOperator() {
        return operator;
    }
}