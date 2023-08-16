package fc.java.tim;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=50;i++)
        {
            if(isPrime(i)){
                System.out.println(i+"는 소수입니다.");
                count++;

            }
        }
        System.out.println("소수의 개수는" + count +"개 입니다.");
    }

    public static boolean isPrime(int wholeNumber) {
        int count=0;
        if(wholeNumber<=2){
            return wholeNumber==2;
        }
        for(int divisor =2;divisor<wholeNumber;divisor++){
            if(wholeNumber % divisor==0){
                return false;
            }
        }
        return true;
    }
}