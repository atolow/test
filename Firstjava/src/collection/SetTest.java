package collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //set(집합) : 순서 없고 중복 안됨
        //순서가 보장되지 않는 대신 중복을 허용하지 않음
        //Set-> 그냥 쓸 수도 있음 그러나 HashSet, TreeSet등으로 응용해서 사용 가능
        //set은 생성자가 없는 껍데기라서 바로 생성 가능
        //생성자가 존재하는 HashSet 을 이용해서 -> Set을 구현해 볼수있음

        Set<Integer> intSet = new HashSet<>();

        intSet.add(7);
        intSet.add(9);
        intSet.add(10);
        intSet.add(5);
        intSet.add(5);  //->중복 안됨

        System.out.println("intSet = " + intSet);
        //contains
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
