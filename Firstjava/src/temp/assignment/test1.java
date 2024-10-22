package temp.assignment;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("무슨 음식을 만들지 제목을 적어주세요:");
        String title = sc.nextLine();

        System.out.print("점수를 입력해주세요:");
        double score = sc.nextDouble();

        System.out.print("내용을 입력해주세요:");
        sc.nextLine();
        String[] context = new String[10];
        for(int i = 0; i < context.length; i++){
            context[i] = sc.nextLine();
        }

        int score2= (int)score;
        int score3 = (int) score;
        score2=(score2*100/5);




        System.out.println("[" + title + "]");
        System.out.println("별점: " +score3 + " " + "(" + score2 + "%" + ")");
        for(int i=0;i<context.length;i++)
        {
            System.out.println(i+1 + "." + context[i]);
        }


    }

}