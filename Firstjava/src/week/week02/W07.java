package week.week02;

public class W07 {
    public static void main(String[] args) {
        //기타 연산자
        // (1) 형변환 연산자

        int intNumber = 93 + (int)98.8;
        System.out.println("intNumber = " + intNumber);

        double doubleNumber = (double)93 +98.8;
        System.out.println("doubleNumber = " + doubleNumber);
        // (2) 상항연산자
        //비교연산자와 항상 함께 쓰인다.
        //비교연산자의 결과: true or false-> dl rufrhkdml rkqtdp Ekfk rufwjdgksms andjsrk!
        //조건 ? 참 : 거짓
        int x=1;
        int y=9;

        boolean b = (x==y) ? true: false;
        System.out.println("b = " + b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println("s = " + s);

        int max = (x>y) ? x : y;
        System.out.println("max = " + max);

        int min = (x>y) ? y: x;
        System.out.println("min = " + min);
        // (3) instance of

    }

}
