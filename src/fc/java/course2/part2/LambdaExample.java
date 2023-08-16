package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add=(int x, int y)->{return x+y;};
        MathOperation multi=(x,y) ->x*y;
        int result=add.operation(10,20);
        System.out.println("result="+result);
        int mulresult=multi.operation(10,20);
        System.out.println("mulresult="+mulresult);

    }
}
