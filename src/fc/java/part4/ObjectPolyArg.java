package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a=new A();
        display(a);
        B b=new B();
        display(b);
        display(a);


    }

    private static void display(Object obj) {
        if(obj instanceof A){
            ((A)obj).printGo();
        }
        else{
            ((B)obj).printGo();
        }
    }
}
