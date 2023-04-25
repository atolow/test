package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장하세요.
        int a=10; //기본자료형
        Integer aa=new Integer(a); //사용자정의 자료형
        Integer aaa=10; //auto-boxing //위 아래 같은거

        System.out.println(aaa.intValue()); //Out-boxing

        Integer bb=new Integer(20);
        int b=bb.intValue(); //원래 이렇게
        int c=bb;  //이렇게 해도댐

        System.out.println(b);
        System.out.println(c);

    }


}
