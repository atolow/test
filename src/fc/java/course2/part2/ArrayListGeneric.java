package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGeneric {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add(new Movie("이터널선샤인","봉준호",2006,"미국"));

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.printf("영화제목:");
        String title = scanner.nextLine();

        System.out.printf("감독:");
        String director = scanner.nextLine();

        System.out.printf("개봉년도:");
        int year = scanner.nextInt();

        System.out.printf("나라:");
        String country = scanner.nextLine();
        scanner.nextLine();

        list.add(new Movie(title,director,year,country));

        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

}
