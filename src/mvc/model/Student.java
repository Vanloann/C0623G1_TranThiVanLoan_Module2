package mvc.model;

import java.util.Date;

public class Student extends Person{
    private String className;
    private int point;

    public Student() {
        super();
    }

    public Student(int id, String name, Date dayOfBirth, String gender, String className, int point) {
        super(id, name, dayOfBirth, gender);
        this.className = className;
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}
