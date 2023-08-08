package ss05_accessmodifier_staticmethod_staticproperty.baitap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setName("Florence");
        student.setClasses("C06");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
