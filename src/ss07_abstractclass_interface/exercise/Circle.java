package ss07_abstractclass_interface.exercise.resizeable;

public class Circle extends Geometric implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + this.radius + ", and Area = " + this.getArea() ;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("white", false, 4.0);
        System.out.println(circle);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.radius *= (1+(percent/100)));
    }
}
