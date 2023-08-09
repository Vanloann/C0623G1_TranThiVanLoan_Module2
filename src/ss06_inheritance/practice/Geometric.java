package ss06_inheritance.practice;

public class Geometric {
    private String color = "green";
    private boolean filled = false;

    public Geometric() {
    }

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString() {
        return "A shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Geometric geometric = new Geometric();
        System.out.println(geometric);

        geometric = new Geometric("pink", true);
        System.out.println(geometric);
    }


}
