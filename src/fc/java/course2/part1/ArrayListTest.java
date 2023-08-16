package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력하세요.
        //Book[], Object[]
        ArrayList list =new ArrayList(10); //기본크기(10)

        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("c++",15000,"대림","이길동"));
        list.add(new Book("Python",16000,"한빛","나길동"));

        Book vo=(Book)list.get(0);
        System.out.println(vo.toString());

        vo=(Book)list.get(1);
        System.out.println(vo.toString());

        vo=(Book)list.get(2);
        System.out.println(vo.toString());

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println((Book)list.get(i)); //Object->Book(JVM에서자동으로 Book의 toString())호출
        }
    }
}
