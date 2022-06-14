package Calc;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {
        double a = 3.0;
        double b = 5.0;
        String o = "+";
        double r = 0.0;
        Calculator c1 = new ArithmeticCalculator();
        Calculator c2 = new SquareCalculator();
        List<Calculator> l = new ArrayList<Calculator>();
        l.add(c1);
        l.add(c2);
        int j = 0;
        Calculator c = null;
        while (true) {
            if (j >= l.size()) {
                break;
            }
            c = l.get(j);
            r = c.calculate(a, b, o);
            System.out.println("The result of calculator number: " + (j + 1) + " is: " + r);
            j++;
        }
    }
}