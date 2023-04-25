package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        //책3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list=new BookArray(); //책 길이 5
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("c++",15000,"대림","이길동"));
        list.add(new Book("Python",16000,"한빛","나길동"));

//        Book vo=list.get(0);
//        System.out.println(vo); //vo.toString() ->.toString() 생략가능
//
//        vo=list.get(1);
//        System.out.println(vo); //vo.toString()
//
//        vo=list.get(2);
//        System.out.println(vo); //vo.toString()



        System.out.println(list.get(0)); //vo.toString() ->.toString() 생략가능
        System.out.println(list.get(1)); //vo.toString() ->.toString() 생략가능
        System.out.println(list.get(2)); //vo.toString() ->.toString() 생략가능

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
