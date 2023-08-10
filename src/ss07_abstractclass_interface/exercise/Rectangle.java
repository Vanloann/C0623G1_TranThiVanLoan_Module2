package ss07_abstractclass_interface.exercise.resizeable;

public class Rectangle extends Geometric implements Resizeable{
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + width + " and height = " + height + ", and Area = " + this.getArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("black" , true, 10, 5);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.width *= (1+(percent/100)));
        this.setHeight(this.height *= (1+(percent/100)));
    }
}
