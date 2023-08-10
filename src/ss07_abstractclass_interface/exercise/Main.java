package ss07_abstractclass_interface.exercise;

public class Main {
    public static void main(String[] args) {
        Geometric[] geometric = new Geometric[3];
        geometric[0] = new Circle(4);
        geometric[1] = new Rectangle(10,5);
        geometric[2] = new Square(5);

        System.out.println("Before resizing: ");
        for (Geometric shape : geometric) {
            System.out.println(shape);
        }

        System.out.println("After resizing: ");
        for (Geometric shape : geometric) {
            double percent = Math.random()*100;
            shape.resize(percent);
            System.out.println(shape);
        }

        for (Geometric shape : geometric) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
