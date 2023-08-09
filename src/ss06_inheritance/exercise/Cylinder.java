package ss06_inheritance.exercise;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getVolume() {
        return Math.PI * Math.pow(this.getRadius(), 2) * this.height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "A " + this.getColor() +  " cylinder with radius = " + this.getRadius() + " and height = " + this.getHeight() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.0, "brown", 15);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
