package week.week02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제외할 구구단 입력: ");
        int k=sc.nextInt();
        for(int i=k; i==k;i++){

            for(int j=1;j<10;j++){
                System.out.println(i + "*" + j + "= " + i*j);
            }
        }
    }
}
