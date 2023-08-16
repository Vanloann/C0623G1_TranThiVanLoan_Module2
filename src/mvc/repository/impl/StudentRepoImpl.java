package mvc.repository.impl;

import mvc.model.Student;
import mvc.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements IStudentRepository {
    private final List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void removeStudent(int id) {

    }

    @Override
    public List<Student> getStudents() {
        return null;
    }
}
