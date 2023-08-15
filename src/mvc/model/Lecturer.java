package ss02_vong_lap.mvc.model;

public class Lecturer extends Person {
    private String speciality;

    public Lecturer() {
        super();
    }

    public Lecturer(int id, String name, String dayOfBirth, String gender, String speciality) {
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
