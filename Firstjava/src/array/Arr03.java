package array;

import java.util.Arrays;

public class Arr03 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b = a;

        b[0]=3;

        System.out.println(a[0]);


        int[] aa = {1,2,3,4};
        int[] bb = new int[aa.length];

        for(int i=0;i<a.length;i++){
            bb[i]=aa[i];
        }
        bb[1]=7;
        System.out.println(aa[1]);
        System.out.println(bb[1]);

        int[] c = Arrays.copyOf(aa,aa.length);  // 배열 복사 (배열이름, 배열 길이)

        for (int i : c) {
            System.out.println("i = " + i);
        };
    }
}
