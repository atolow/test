package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        //A 객체를 Upcasting으로 생성하세요.
        A a=new A();
        a.dispaly();

        Object obj=new A();  //Upcasting
        //obj.display();  //부모에 display가 없음 -> 그래서 Downcasting을 해야댐
        ((A)obj).dispaly();
    }
}
