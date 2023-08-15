package ss02_vong_lap.mvc.model;

public class Student extends Person{
    private String className;
    private int point;

    public Student() {
        super();
    }

    public Student(int id, String name, String dayOfBirth, String gender, String className, int point) {
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


    public void setStudentInfor() {
        super.setInformation();
        System.out.println("Nhập tên lớp: ");
        className = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        point = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}
