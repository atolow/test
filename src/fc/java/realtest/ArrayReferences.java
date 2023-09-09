package fc.java.realtest;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {

        int a=7;
        int b=a;
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("a =" + a);
        System.out.println("b =" +b);


        System.out.println("myIntArray" + Arrays.toString(myIntArray));
        System.out.println("anotherArray" + Arrays.toString(anotherArray));

        b=5;

        anotherArray[0]=1;
        modifyArray(myIntArray);

        modifyint(a);




        System.out.println("a =" + a);
        System.out.println("b =" + b);

        System.out.println("after change myIntArray" + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray" + Arrays.toString(anotherArray));

    }
    private static int modifyint (int len){
        len=3;
        return len;
    }
    private static void modifyArray (int[] array){
        array[1]=2;
    }
}
