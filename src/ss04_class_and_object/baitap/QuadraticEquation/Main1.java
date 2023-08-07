package ss04_class_and_object.baitap.QuadraticEquation;

import ss04_class_and_object.baitap.QuadraticEquation.QuadraticEquation;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation result = new QuadraticEquation(a, b, c);
        if (result.getDiscriminant() > 0) {
            System.out.println("The equation has two roots: r1 = " + result.getRoot1() + ", r2 = " + result.getRoot2());
        } else if (result.getDiscriminant() == 0) {
            System.out.println("The equation has one root: r1 = r2 = " + result.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}

