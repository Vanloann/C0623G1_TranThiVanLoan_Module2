package mvc.model;

public class Teacher extends Person {
    private String speciality;

    public Teacher() {
        super();
    }

    public Teacher(int id, String name, String dayOfBirth, String gender, String speciality) {
        super(id,name, dayOfBirth, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setTeacherInfor() {
        super.setInformation();
        System.out.println("Nhập chuyên ngành: ");
        speciality = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Lecturer{" + super.toString() +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
