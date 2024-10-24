package eaxm.test2.lv3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws BadInputException {
        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                /* 반복문 시작 */
                System.out.print("첫 번째 숫자를 입력하세요:");
                double num1 = sc.nextInt();
                if (num1 < 0) {
                    throw new BadInputException("양의 정수");
                }
                calculator.setNum1(num1);

                System.out.print("두 번째 숫자를 입력하세요:");
                double num2 = sc.nextInt();
                if (num2 < 0) {
                    throw new BadInputException("타입");
                }
                calculator.setNum2(num2);

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                if (operator != OperatorType.PLUS.getOperatorType() &&
                        operator != OperatorType.SUBTRACTION.getOperatorType() &&
                        operator != OperatorType.MULTIPLY.getOperatorType() &&
                        operator != OperatorType.DIVIDE.getOperatorType()
                ) {
                    throw new BadInputException("타입");
                }
                calculator.setOperator(operator);

                /* 위 요구사항에 맞게 소스 코드 수정 */

                double result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);


                System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");
                System.out.println("저장된 데이터를 보시겠습니까? (print 입력 시 목록 읽기)");
                System.out.println("저장된 값 중 에 지금 입력한 값보다 큰 것들 읽기 (test 입력 시) ");
                System.out.println("계속하기 (Enter) (exit 입력 시 종료)");


                sc.nextLine();
                String more = sc.nextLine().toLowerCase();

                System.out.println(more);


                if (more.equals("exit")) {
                    break;
                } else if (more.equals("remove")) {
                    calculator.removeResult();
                } else if (more.equals("print")) {
                    calculator.print();
                } else if (more.equals("quiz")) {
                    System.out.print("숫자를 입력해주세요.");
                    int test = sc.nextInt();
                    calculator.test(test);
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 선택입니다.");
            } catch (ArithmeticException a) {
                System.out.println("0으로 나눌수 없습니다.");
            } catch (BadInputException e) {
                System.out.println("잘못된 타입입니다.");
            }
            finally {
                sc.nextLine();
            }
        }
    }
}

