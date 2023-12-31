package mvc.model;

public class Student extends Person{
    private String className;
    private double point;

    public Student() {};

    public Student(String className, double point) {
        this.className = className;
        this.point = point;
    }

    public Student(int id, String name, String dayOfBirth, String gender, String className, double point) {
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() +
                ", ClassName: " + className +
                ", Point: " + point +
                '}';
    }
}
