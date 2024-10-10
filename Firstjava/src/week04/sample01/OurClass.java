package week04.sample01;

public class OurClass {
    private final boolean just =true;

    //throws :던지ㅏ !!(=예외를 던지다)
    public void thisMethodIsDangerous() throws OurBadException{
        //custom logic
        if(just){
            throw new OurBadException();
        }
    }
}
