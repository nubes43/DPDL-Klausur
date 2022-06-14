package Calc;

public class ArithmeticCalculator extends Calculator {

    @Override
    public double calculate(double a, double b, String o) {

        switch (o) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;

            default:
                return 0;
        }
    }
}
