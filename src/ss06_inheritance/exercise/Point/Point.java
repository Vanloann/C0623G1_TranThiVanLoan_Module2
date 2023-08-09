package ss06_inheritance.exercise.Point;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public String getXY() {
        float[] array = new float[2];
        array[0] = x;
        array[1] = y;
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "(x = " + this.getX() + ", y = " + this.getY() + ")";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2,3);
        System.out.println(point);
    }
}
