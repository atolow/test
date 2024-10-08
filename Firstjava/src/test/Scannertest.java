package test;

public class Scannertest
{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("첫번째 정수입력: ");
        int i = scanner.nextInt();
        System.out.println(i);

        scanner.nextLine();      //->숫자하고 문자 하면 한번붙혀줄걸 여기나 밑에나 둘중하나 선택

        System.out.println("첫번째 문자열입력: ");
        String str1 = scanner.nextLine();
        System.out.println(str1);

        System.out.println("두번째 정수입력: ");
        int j = scanner.nextInt();
        System.out.println(j);


        System.out.println("두번째 문자열입력: ");
        String str2 = scanner.next();    //-->next로 하면됨
        System.out.println(str2);
    }
}