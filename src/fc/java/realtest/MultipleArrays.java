package fc.java.realtest;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class MultipleArrays {
    public static void main(String[] args) {
        int [][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2));

        for(int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }

        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"},
                {"6","7","8","9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString()" + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}
