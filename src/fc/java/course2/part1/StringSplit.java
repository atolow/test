package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String str1="Hello,World,Java";
        String str2="Hello World Java";
        String[] strArray=str1.split(",");

        for(String s : strArray){
            System.out.println(s.toString());
        }
        String[] strArray2=str2.split("\\s+");

        for(String s : strArray2){
            System.out.println(s.toString());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");

        String  str=scanner.nextLine();

        String[] strArray3=str.split("\\s+");
        for(String s : strArray3){
            System.out.println(s.toString());
        }
    }
}
