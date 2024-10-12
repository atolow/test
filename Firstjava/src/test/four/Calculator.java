package test.four;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbstractOperation operation;

    public Calculator() {
    }

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }



    public double calculate() {
        double answer = 0; //temp
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }
}
