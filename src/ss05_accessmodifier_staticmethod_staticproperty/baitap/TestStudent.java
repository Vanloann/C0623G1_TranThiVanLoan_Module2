package ss05_accessmodifier_staticmethod_staticproperty.baitap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Florence");
        student.setClasses("C06");
        System.out.println(student.name);
        System.out.println(student.classes);
    }
}
