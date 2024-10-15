package temp.lv3;

import temp.lv2.BadInputException;

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
