package quiz.Three;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(new AddOperation());
        Calculator calculator2 = new Calculator(new SubtractOperation());
        Calculator calculator3 = new Calculator(new MultiplyOperation());
        Calculator calculator4 = new Calculator(new DivideOperation());
        Calculator calculator5 = new Calculator(new AddOperation());


        calculator5.setOperation(new MultiplyOperation());


        System.out.println(calculator1.calculate(5,3));
        System.out.println(calculator2.calculate(11,6));
        System.out.println(calculator3.calculate(5,7));
        System.out.println(calculator4.calculate(100,10));
        System.out.println(calculator5.calculate(12,10));

    }
}
