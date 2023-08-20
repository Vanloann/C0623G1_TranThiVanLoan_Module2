package mvc.repository;

import mvc.model.Student;

import java.util.List;

public interface IStudentRepo {
    public void addStudent(Student student);

    public void removeStudent(int id);

    List<Student> showStudent();
}
