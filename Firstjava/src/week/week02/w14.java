package week.week02;

public class w14 {
    public static void main(String[] args) {
        int month =3;
        String monthSring = "";

        switch (month){
            case 1:
                monthSring ="1월";
                break;
            case 2:
                monthSring="2월";
                break;
            case 3:
                monthSring="3월";
                break;
            default:
                monthSring="알수없음";
        }
        System.out.println("monthSring = " + monthSring);


    }
}
