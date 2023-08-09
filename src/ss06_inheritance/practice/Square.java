package ss06_inheritance.practice;

import java.sql.SQLInput;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square( String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square("grey", false, 5);
        System.out.println(square);
    }
}
