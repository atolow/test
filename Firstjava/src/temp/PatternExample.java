package temp;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String userNum1 = "1234";
        String userNum2 = "U1234";
        String REGEXP_ONLY_NUM = "^[\\d]*$";

        boolean isNumber1 = Pattern.matches(REGEXP_ONLY_NUM, userNum1);
        System.out.println("isNumber1 = " + isNumber1);
        boolean isNumber2 = Pattern.matches(REGEXP_ONLY_NUM, userNum2);
        System.out.println("isNumber2 = " + isNumber2);
    }
}
