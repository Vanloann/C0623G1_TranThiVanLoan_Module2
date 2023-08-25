package mvc.model.person;

import mvc.model.person.Person;

public class Employee extends Person {
    private String educationLevel;
    private String position;
    private double salary;

    // educationLevel (Intermediate Degree, College Degree, Bachelor's Degree, Postgraduate Degree)
    // position (Receptionist, Waiter, Specialist, Supervisor, Manager, Director)

    public Employee(String educationLevel, String position, double salary) {
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dayOfBirth, String gender,
                    int citizenID, int phoneNumber, String email,
                    String educationLevel, String position, double salary) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" + super.toString() +
                "EducationLevel: '" + educationLevel + '\'' +
                ", Position: '" + position + '\'' +
                ", Salary: " + salary +
                '}';
    }
}
