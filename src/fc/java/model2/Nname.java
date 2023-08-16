package fc.java.model2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Nname {
    private String title;
    private String director;
    private int year;
    private String country;
    //ArrayList list =new ArrayList(1); //기본크기(10)
    ArrayList<Nname> list = new ArrayList<>(1);


    public Nname() {
    }

    public Nname(String title, String director, int year, String country) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Nname{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public void addm() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("영화제목:");
        String title = scanner.nextLine();


        System.out.printf("감독:");
        String director = scanner.nextLine();

        System.out.printf("개봉년도:");
        int year = scanner.nextInt();
        try {

            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("잘못된 선택입니다.");
        }

        System.out.printf("나라:");
        String country = scanner.nextLine();


        list.add(new Nname(title, director, year, country));
    }

    public void delm(int numbel) {
        try {

            list.remove(numbel);
            System.out.println(numbel + "번째 데이터가 삭제됩니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index값이 존재 하지 않습니다.");
        }
    }

    public void prtm() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //Object->Book(JVM에서자동으로 Book의 toString())호출
        }
    }

    public void menu() {

        while (true) {
            System.out.println("1.영화 추가");
            System.out.println("2.영화 삭제");
            System.out.println("3.영화 목록");
            System.out.println("4.종료");

            try
            {

                Scanner scanner = new Scanner(System.in);

                System.out.print("번호 입력해주세요:");
                int number = scanner.nextInt();
                if (number == 1)
                {
                    addm();
                }
                else if (number == 2)
                {
                    System.out.println("번호 입력해주세요:");
                    int numdel = scanner.nextInt();
                    scanner.nextLine();

                    delm(numdel);
                }
                else if (number == 3)
                {
                    prtm();
                }
                else if (number == 4)
                {
                    exit(0);

                }
                else
                {
                    exit(0);
                }
            }
            catch (InputMismatchException e)
            {

                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

