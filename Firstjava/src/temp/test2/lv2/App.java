package temp.test2.lv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {
        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();

        while(true) {
            try{
                Scanner sc = new Scanner(System.in);

                /* 반복문 시작 */
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();
                if (num1 < 0) {
                    throw new BadInputException("양의 정수");
                }
                calculator.setNum1(num1);

                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();
                if (num2 < 0) {
                    throw new BadInputException("양의 정수");
                }
                calculator.setNum2(num2);

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                calculator.setOperator(operator);

                /* 위 요구사항에 맞게 소스 코드 수정 */

                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);


                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");


                sc.nextLine();
                String more = sc.nextLine();

                System.out.println(more);

                if (more.equals("exit")) {
                    break;
                }
                else if (more.equals("remove")) {
                    calculator.removeResult();
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

