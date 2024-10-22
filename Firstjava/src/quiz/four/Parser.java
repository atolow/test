package quiz.four;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";
    private static final String TEST_REG = "^[1-9]*$";


    private final Calculator calculator = new Calculator();


    public Parser parseFirstNum (String firstInput) throws BadInputException{
        Pattern pattern = Pattern.compile(NUMBER_REG);
        Matcher matcher = pattern.matcher(firstInput);
        if(firstInput.equals("exit")){
            exit(0);
        }
        if(!matcher.matches()) {
            throw new BadInputException("타입");
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));

        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException{
        Pattern pattern = Pattern.compile(OPERATION_REG);
        Matcher matcher = pattern.matcher(operationInput);

        if(operationInput.equals("exit")){
            exit(0);
        }
        if(!matcher.matches()) {
            throw new BadInputException("타입");
        }
        if(operationInput.equals("+")){
            calculator.setOperation(new AddOperation());
        }
        else if(operationInput.equals("-")){
            calculator.setOperation(new SubtractOperation());
        }
        else if(operationInput.equals("*")){
            calculator.setOperation(new MultiplyOperation());
        }
        else if(operationInput.equals("/")){
            calculator.setOperation(new DivideOperation());
        }
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException{
        Pattern pattern = Pattern.compile(TEST_REG);
        Matcher matcher = pattern.matcher(secondInput);

        if(secondInput.equals("exit")){
            exit(0);
        }
        if(!matcher.matches()) {
            throw new BadInputException("타입");
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }



    public double executeCalculator() {
        return calculator.calculate();
    }

}