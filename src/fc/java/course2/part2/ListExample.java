package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add(new String("apple"));
        list.add(new String("banana"));
        list.add(new String("cherry"));
        list.add(new String("banana"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("----------------------------");
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        list.set(1,"orange");
        for(String str: list){
            System.out.println(str);
        }

    }
}
