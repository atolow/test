package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1: Object
        Student st2; // st2: Object
        Student st3; // st3: Object

        st1=new Student("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");  //st1 : instance
        st2=new Student("김길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");  //st2 : instance
        st3=new Student("나길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");  //st3 : instance


        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
