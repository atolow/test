package week04.sample01;


//예외 클래스를 만ㅁ들어서 예외를 정의!!
public class OurBadException extends Exception{
    public OurBadException() {
        super("위험한 행동을 하면 예외처리를 꼭 해야함!!");

    }
}
