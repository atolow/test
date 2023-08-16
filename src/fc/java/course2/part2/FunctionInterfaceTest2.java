package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation mo= new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result=mo.operation(10,30);
        System.out.println("result =" +result);
    }
}
