package temp.array;

import java.util.Arrays;

public class Arr05 {
    public static void main(String[] args) {
        //문자(Char), 문자열(String)
        // String = char[]

        //기본형 변수 vs 참조형 변수
        //1.기본형 변수는 소문자로 시작 참조형 변수는 대문자로 시작
        //Wrapper class에서 기본형 변수를 감싸줄떄(boxing) int-> Integer
        //2. 기본형 변수는 값 자체를 저장 참조형 변수는 주소를 복사

        //String 기능 활용 예시
        //(1) length
        String str ="ABCD";

        int strLength = str.length();
        System.out.println("strLength = " + strLength);
        
        //(2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println("strChar = " + strChar);

        //(3) substring(int fromIdx, int toIdx)
        String strSub=str.substring(1,3);
        System.out.println("strSub = " + strSub);

        //(4) equals(String str)
        String newStr ="ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println("strEqual = " + strEqual);

        //(5) toCharArray() : String -> char[]
        char [] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + Arrays.toString(strCharArray));

        //(6) 반대로 char[] -> String
        char[] charArray={'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println("charArrayString = " + charArrayString);
    }
}
