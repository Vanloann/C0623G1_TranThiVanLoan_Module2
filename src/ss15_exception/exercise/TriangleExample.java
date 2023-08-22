package ss15_exception.exercise;

import java.util.Scanner;

public class TriangleExample {
    public static void triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Sum of two sides must greater than the other side!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            try {
                do {
                    try {
                        System.out.println("Enter a: ");
                        a = Integer.parseInt(sc.nextLine());
                        if (a <= 0) {
                            System.out.println("Side of triangle must be positive integer and greater than 0!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Side of triangle must be a number!");
                    }
                } while (a <= 0);
                do {
                    try {
                        System.out.println("Enter b: ");
                        b = Integer.parseInt(sc.nextLine());
                        if (b <= 0) {
                            System.out.println("Side of triangle must be positive integer and greater than 0!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Side of triangle must be a number!");
                    }
                } while (b <= 0);
                do {
                    try {
                        System.out.println("Enter c: ");
                        c = Integer.parseInt(sc.nextLine());
                        if (c <= 0) {
                            System.out.println("Side of triangle must be positive integer and greater than 0!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Side of triangle must be a number!");
                    }
                } while (c <= 0);

                TriangleExample.triangle(a, b, c);
                System.out.println("3 sides of your triangle: " + a + ", " + b + ", " + c);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (a + b <= c || a + c <= b || b + c <= a);
    }
}
