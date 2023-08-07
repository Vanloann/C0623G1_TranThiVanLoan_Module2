package ss04_class_and_object.baitap;

import ss04_class_and_object.baitap.Fan;

public class Main3 {
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
