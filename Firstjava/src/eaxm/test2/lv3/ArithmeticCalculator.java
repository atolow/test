package eaxm.test2.lv3;

import java.util.LinkedList;


public class ArithmeticCalculator<T extends Number> {
    private T num1;
    private T num2;
    private char operator;
    LinkedList<Double> doubleQueue = new LinkedList<>();
    LinkedList<Double> testLink = new LinkedList<>();


    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;

    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;

    }

    public char getOperator() {
        return this.operator;

    }

    public void setOperator(char operator) {
        this.operator = operator;

    }

    public double calculate(T num1, T num2, char operator) {
        double result = 0;
        double dnum1 = (double) num1;
        double dnum2 = (double) num2;


        if (operator == OperatorType.PLUS.getOperatorType()) {
            result = dnum1 + dnum2;

        } else if (operator == OperatorType.SUBTRACTION.getOperatorType()) {
            result = dnum1 - dnum2;

        } else if (operator == OperatorType.MULTIPLY.getOperatorType()) {
            result = dnum1 * dnum2;

        } else if (operator == OperatorType.DIVIDE.getOperatorType()) {
            result = dnum1 / dnum2;

        }


        doubleQueue.add(result);
        return result;
    }

    public void removeResult() {
        System.out.println(doubleQueue.get(0) + "를 삭제합니다.");
        doubleQueue.remove(0);
    }

    public void print() {
        System.out.println(doubleQueue);
    }

    public void test(int test) {
        for (int i = 0; i < doubleQueue.size(); i++) {
            if (doubleQueue.get(i) > test) {
                testLink.add(doubleQueue.get(i));
            }
        }
        System.out.println(testLink);


    }

}
