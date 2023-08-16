package mvc.service;

import mvc.model.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);

    void removeStudent(int id);

    List<Student> getStudents();

}
