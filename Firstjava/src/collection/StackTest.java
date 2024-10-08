package collection;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //stack
        //수직으로 값을 쌓아놓고 넣었다가 뺸다 FILO

        //push,peek,pop
        //먼저들어온 데이터가 맨 마지막에 나감
        //최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리로 막고싶을때 사용

        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println("intStack = " + intStack);

        while(!intStack.isEmpty()){
            System.out.println(intStack.pop());
            System.out.println("intStack = " + intStack);
        }


        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println(intStack.peek()); //나올꺼 확
        System.out.println(intStack.size());
    }


}
