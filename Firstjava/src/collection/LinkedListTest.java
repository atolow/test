package collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        //linked list
        //메모리에 남은 공간을 요청해서여기저기 나우어서 실제 값을 담움
        //실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        //기본적 기능은 ->ArrayList와 동일
        //LinkedList는 값 -> 여기저기 나누어서 조회하는 속도가 느리다
        //값을 추가하거나 삭제할 때는 빠르다

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(1));

        System.out.println(linkedList.toString());

        linkedList.add(200);
        System.out.println(linkedList.toString());

        linkedList.add(2, 4);
        System.out.println(linkedList.toString());


        linkedList.set(1, 30);
        System.out.println(linkedList.toString());

        linkedList.remove(1);
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());

    }

}
