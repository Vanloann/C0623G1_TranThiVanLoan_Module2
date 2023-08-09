package ss06_inheritance.exercise;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {}

    public Point2D(float x, float y) {
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

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = this.getX();
        arr[1] = this.getY();
        return arr;
    }

    @Override
    public String toString() {
        return "(x = " + this.getX() + ", y =" + this.getY() + ")";
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D.setXY(10,20);
        System.out.println(point2D);

        point2D = new Point2D(1.0f, 0.4f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
