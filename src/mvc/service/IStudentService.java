package mvc.service;

import mvc.model.Student;

import java.util.List;

public interface IStudentService {

    public void addStudent(Student student);

    public void removeStudent(int id);

    List<Student> showStudent();

}
