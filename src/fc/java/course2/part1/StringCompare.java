package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        if(str1.equals(str2)){
            System.out.println("두 문자열은 같습니다.");
        }
        else{
            System.out.println("두 문자열은 다릅니다.");
        }

        String str3="apple";
        String str4="banana";
        int result=str3.compareTo(str4);

        if(result==0){
            System.out.println("두 문자열은 같습니다.");
        }
        else if(result>0){
            System.out.println("str3이 더큽니다.");
        }
        else{
            System.out.println("str3이 더작습니다.");
        }
    }
}
