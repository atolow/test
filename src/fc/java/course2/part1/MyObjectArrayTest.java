package fc.java.course2.part1;

import fc.java.model2.A;
import fc.java.model2.B;
import fc.java.model2.C;
import fc.java.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        //A, B, C 객체를 배열(Object[])에 저장하고 출력하세요.
        ObjectArray list=new ObjectArray();
        list.add(new A()); //Upcasting Object element=new A();
        list.add(new B()); //Upcasting Object element=new B();
        list.add(new C()); //Upcasting Object element=new C();

        A a=(A)list.get(0);  //A<=Object
        a.display();

        B b=(B)list.get(1);
        b.display();

        C c=(C)list.get(2);
        c.display();

        for(int i=0;i< list.size();i++){
            if(list.get(i) instanceof A){
                ((A)list.get(i)).display();
            }
            else if(list.get(i) instanceof B){
                ((B) list.get(i)).display();
            }
            else if(list.get(i) instanceof C){
                ((C) list.get(i)).display();
            }
        }

    }
}
