package ss04_class_and_object.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // declare setter: public void setPropertyName(datatype propertyValue)
    void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    // declare getter: public returnType getPropertyName()
    public int getSpeed() {
        return speed;
    }

    // declare getter for boolean datatype
    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {
    }

    public String toString() {
        if (isOn()) {
            return "The " + getColor() + " fan with radius " + getRadius() + " is On at " + (getSpeed() == 1 ? "SLOW" : (getSpeed() == 2 ? "MEDIUM" : "FAST")) + " speed.";

        } else {
            return "The " + getColor() + " fan with radius " + getRadius() + " is Off.";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
