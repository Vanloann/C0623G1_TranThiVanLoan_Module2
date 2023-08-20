package mvc.model;

public class Teacher extends Person{
    private String speciality;

    public Teacher() {};

    public Teacher(String speciality) {
        this.speciality = speciality;
    }

    public Teacher(int id, String name, String dayOfBirth, String gender, String speciality) {
        super(id, name, dayOfBirth, gender);
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
        return "Teacher {" + super.toString() +
                ", Speciality: '" + speciality + '\'' +
                '}';
    }
}
