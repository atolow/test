package eaxm.test2.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    private int num1;
    private int num2;
    private char operator;



    Queue<Integer> intQueue = new LinkedList<>();

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;

    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;

    }

    public char getOperator() {
        return this.operator;

    }

    public void setOperator(char operator) {
        this.operator = operator;

    }

    public int calculate(int num1,int num2,char operator) {
        int result = 0;

        if (operator==('+')) {
            result = num1 + num2;
        } else if (operator==('-')) {
            result = num1 - num2;
        } else if (operator==('*')) {
            result = num1 * num2;
        } else if (operator==('/')) {
            result = num1 / num2;
        }
        intQueue.add(result);
        return result;
    }


    public void removeResult() {
        System.out.println(intQueue.peek() + "를 삭제합니다.");
        intQueue.poll();
    }
}
