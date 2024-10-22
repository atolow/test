package quiz.Three;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }


    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){
        double result = 0;
        result = operation.operate(firstNumber,secondNumber);
        return result;
    }
}
