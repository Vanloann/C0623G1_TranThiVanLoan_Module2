package ss15_exception.exercise;

import java.util.Scanner;

public class TriangleExample {
    public static void triangle(int a, int b, int c) throws Exception {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Sides of triangle must be positive integer!");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Sum of two sides must greater than the other side!");
        } else {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        try {
            TriangleExample.triangle(a, b, c);
            System.out.println("3 sides of your triangle: " + a + ", " + b + ", " + c);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
