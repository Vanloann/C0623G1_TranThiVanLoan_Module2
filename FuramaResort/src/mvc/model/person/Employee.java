package mvc.model.person;

import mvc.model.person.Person;

public class Employee extends Person {
    private String educationLevel;
    private String position;
    private String salary;

    // educationLevel (Intermediate Degree, College Degree, Bachelor's Degree, Postgraduate Degree)
    // position (Receptionist, Waiter, Specialist, Supervisor, Manager, Director)

    public Employee() {}

    public Employee(String educationLevel, String position, String salary) {
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dayOfBirth, String gender,
                    String citizenID, String phoneNumber, String email,
                    String educationLevel, String position, String salary) {
        super(id, name, dayOfBirth, gender, citizenID, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EMPLOYEE's " + super.toString() +
                " | EducationLevel: " + educationLevel +
                " | Position: " + position +
                " | Salary: " + salary + "\n";
    }
}
