package mvc.repository;
import mvc.model.Student;

import java.util.List;

public interface IStudentRepository {

    void addStudent(Student student);

    void removeStudent(int id);

    List<Student> getStudents();

}
