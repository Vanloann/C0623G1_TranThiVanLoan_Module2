package ss06_inheritance.exercise.Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "A " + getColor() + " circle with radius = " + getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "beige");
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
