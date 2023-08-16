package fc.java.course2.part2;

import fc.java.model2.Movie;
import fc.java.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        ObjectArr<String> array=new ObjectArr<>(5);

        array.set(0,"Hello");
        array.set(1,"World");
        array.set(2,"JAVA");
        array.set(3,"Generic");

        for(int i=0;i< array.size();i++)
        {
            System.out.println(array.get(i));
        }

        ObjectArr<Movie> blist=new ObjectArr<>(5);

        blist.set(0,new Movie("괴물","봉준호",2006,"한국"));
        blist.set(1,new Movie("이터널선샤인","봉준호",2006,"미국"));
        blist.set(2,new Movie("트루먼쇼","봉준호",2006,"캐나다"));
        blist.set(3,new Movie("보이걸씽","봉준호",2006,"일본"));

        for(int i=0;i< blist.size();i++)
        {
            System.out.println(blist.get(i));
        }
    }
}
