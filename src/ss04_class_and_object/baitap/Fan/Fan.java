package ss04_class_and_object.baitap.Fan;

import java.util.Scanner;

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
        return  speed;
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



}
