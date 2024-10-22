package eaxm.test2.lv1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws BadInputException {


        int result = 0;


        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.printf("첫번째 양의 정수: ");
                int first = sc.nextInt();

                if(first<0){
                    throw new BadInputException("양의 정수");
                }

                System.out.printf("두번째 양의 정수: ");
                int second = sc.nextInt();
                if(second<0){
                    throw new BadInputException("양의 정수");
                }

                sc.nextLine();      //->숫자하고 문자 하면 한번붙혀줄걸 여기나 밑에나 둘중하나 선택


                System.out.printf("연산자 선택: ");
                Character operator = sc.next().charAt(0);


                if (operator.equals('+')) {
                    result = first + second;
                } else if (operator.equals('-')) {
                    result = first - second;
                } else if (operator.equals('*')) {
                    result = first * second;
                } else if (operator.equals('/')) {
                    result = first / second;
                }
                System.out.println("결과: " + result);
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                sc.nextLine();
                String more = sc.nextLine();

                System.out.println(more);

                if(more.equals("exit")){
                    break;
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("잘못된 선택입니다.");
            }
            catch (ArithmeticException a){
                System.out.println("0으로 나눌수 없습니다.");
            }
            catch (BadInputException p){
                System.out.println("양의 정수를 입력해주세요");
            }
        }
    }
}
