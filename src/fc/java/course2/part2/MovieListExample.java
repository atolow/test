package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list= new ArrayList<Movie>();

        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add(new Movie("기생충","봉준호",2019,"한국"));
        list.add(new Movie("완벽한 타인","이재규",2018,"한국"));

        for(Movie m: list){
            System.out.println(m);
        }

        for(Movie m: list){
            System.out.printf("|%-16s|%-8s|%4d|%-6s| \n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }

        String searchTitle="기생충";
        //순차검색
        for(Movie m : list){
            if(m.getTitle().equals((searchTitle))){
                System.out.println(m);
                break;
            }
        }
    }
}
