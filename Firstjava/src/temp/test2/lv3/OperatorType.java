package temp.test2.lv3;

public enum OperatorType {
    PLUS('+'),
    SUBTRACTION('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char OperatorType;

    public char getOperatorType() {
        return OperatorType;
    }

    OperatorType(char OperatorType){
        this.OperatorType = OperatorType;
    }



}
