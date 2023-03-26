package fc.java.part2;

public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 0;

        System.out.printf("%d %d %n", a, b);
        System.out.println("안녕");

        c = a;
        a = b;
        b = c;

        System.out.printf("%d %d %n", a, b);
        System.out.println("안녕");

        int data = 123;
        String binary=Integer.toBinaryString(data);
        System.out.println("binary = " + binary);

    }
}
