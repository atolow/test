package fc.java.part4;

import fc.java.part4.RemoCon2;

public class wowtest {
    public static void main(String[] args) {
        RemoCon2 remo=new Radio2();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo=new TV2();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

    }
}
