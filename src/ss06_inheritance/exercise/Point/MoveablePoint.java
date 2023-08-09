package ss06_inheritance.exercise.Point;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        super();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public String getSpeed() {
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return Arrays.toString(arr);
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "), speed = (" + this.getXSpeed() + ","+ this.getYSpeed() + ")";
    }

    public MoveablePoint move() {
        this.setX(this.getX() + this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(10, 4, 20, 1);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
