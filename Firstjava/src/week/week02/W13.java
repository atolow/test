package week.week02;

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A 입력:" );
        String aHand = sc.nextLine();

        System.out.println("B 입력:" );
        String bHand = sc.nextLine();


        if(Objects.equals(aHand,"wow")){   //->Objects.equals(aHand,"wow")
            System.out.println("같다");
        }
    }


}
