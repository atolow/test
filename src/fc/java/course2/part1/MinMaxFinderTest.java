package fc.java.course2.part1;

import fc.java.model2.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int [] arr={4,3,1,2,5};

        int min= MinMaxFinder.findMin(arr);
        int max=MinMaxFinder.findMax(arr);
        System.out.println("min = " +min);
        System.out.println("max = " +max);
    }
}
