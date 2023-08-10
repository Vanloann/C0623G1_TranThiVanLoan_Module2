package ss07_abstractclass_interface.exercise;

public class Square extends Geometric implements Resizeable, Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square( String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.getSide(),2);
    }

    public double getPerimeter() {
        return this.getSide() * 4;
    }

    @Override
    public String toString() {
        return "A square with side = " + this.getSide() + ", and Area = " + this.getArea();
    }

    public static void main(String[] args) {
        Square square = new Square("grey", false, 5);
        System.out.println(square);
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.side *= (1 + (percent/100)));
    }

    //Implement interface Colorable
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
