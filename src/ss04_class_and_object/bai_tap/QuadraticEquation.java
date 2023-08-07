package ss04_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.getB(), 2) - (4 * this.getA() * this.getC());
        return delta;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            double r1 = (-this.getB() + Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
            return r1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            double r2 = (-this.getB() - Math.sqrt(this.getDiscriminant())) / (2 * this.getA());
            return r2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        ss04_class_and_object.baitap.QuadraticEquation result = new ss04_class_and_object.baitap.QuadraticEquation(a, b, c);
        if (result.getDiscriminant() > 0) {
            System.out.println("The equation has two roots: r1 = " + result.getRoot1() + ", r2 = " + result.getRoot2());
        } else if (result.getDiscriminant() == 0) {
            System.out.println("The equation has one root: r1 = r2 = " + result.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}
