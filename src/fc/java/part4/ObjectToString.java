package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b= new Board();
        b.setTitle("게시글입니다.");
        //System.out.println(b.getTitle()); //fc.java.poly.Board@6d03e736
        System.out.println(b.toString());  //fc.java.poly.Board@6d03e736
        System.out.println(b);
    }


}
