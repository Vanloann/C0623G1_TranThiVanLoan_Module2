package mvc.model;

import java.util.Date;

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

    public void setInformation() {
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
