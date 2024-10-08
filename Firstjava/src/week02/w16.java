package week02;

import java.util.Arrays;

public class w16 {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,8};

        for (int number : numbers) {
            System.out.println(number);
        }
        //그냥 while
        int number =4;
        while(number<3){   //->3보다 크므로 아무것도 수행안함
            System.out.println("number = " + number);
            number++;
        }


        System.out.println("-".repeat(20));

        ///////////////////////
        //do~while
        int num=4;
        do {
            //이 로직을 먼저 수행하겠다.  ->이걸 수행하고 반복함
            System.out.println("num = " + num);
        }while(num<3);
        ////////////////////////////


        System.out.println("-".repeat(20));


        int kim =0;
        while(kim<5){
            kim++;

            if(kim==2){
                continue;
            }
            System.out.println("kim = " + kim);
        }

    }
}
