package mvc.model;

import java.util.Date;

public class Lecturer extends Person {
    private String speciality;

    public Lecturer() {
        super();
    }

    public Lecturer(int id, String name, Date dayOfBirth, String gender, String speciality) {
        super(id,name, dayOfBirth, gender);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Lecturer{" + super.toString() +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
