package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //ArrayList에 10,20,30,40,50 5개의 정수 (int)를 저장하고 출력하세요.
        //ArrayList -> object[] <----int x
        //ArrayList -> object[] <----Integer(Wrapper)
        //ArrayList -> object[] <----(Auto-boxing:Integer)--int
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(new Integer(10)); //이게 기본
        list.add(20);  //autoboxing 떄문에 이렇게 넣을수있음
        list.add(30);  //autoboxing 떄문에 이렇게 넣을수있음
        list.add(40);  //autoboxing 떄문에 이렇게 넣을수있음
        list.add(50);  //autoboxing 떄문에 이렇게 넣을수있음

        //  int<(Auto-unboxing)--Integer
        for(int data: list){
            System.out.println(data);
        }
    }
}
