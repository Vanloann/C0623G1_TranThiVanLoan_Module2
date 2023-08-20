package ss15_exception.practice;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Subtraction x - y = " + b);
            System.out.println("Multiplication x * y = " + c);
            System.out.println("Quotient x / y = " + d);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }
}
