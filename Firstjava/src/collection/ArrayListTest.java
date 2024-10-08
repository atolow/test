package collection;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {


        //List
        //순서가 있는 데이터의 집합 =>Array(최초 길이를 알아야함)
        //처음에 길이를 몰라도 만들수있음
        //1) Array -> 정적베열
        //2) List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        // 갓이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장한다

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(99);
        intList.add(15);
        intList.add(3);
        System.out.println(intList.get(2));

        //2번째 있는 값을 (15)를 바꾸자
        intList.set(2,10);
        System.out.println(intList.get(2));

        //삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());
    }
}
