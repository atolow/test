package fc.java.test;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("분을 입력하세요:");
        int time = scanner.nextInt();

        int day,hour,minute;
        day = time/60/24;
        hour = time/60%24;
        minute = time%60;


        System.out.println(day + "일" +hour + "시간" + minute + "분");




    }
}
