package mvc.service.impl;

import mvc.model.Student;
import mvc.repository.IStudentRepository;
import mvc.repository.impl.StudentRepoImpl;
import mvc.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository studentRepository = new StudentRepoImpl();

    @Override
    public void addStudent(Student student) {
            this.studentRepository.addStudent(student);
    }

    @Override
    public void removeStudent(int id) {
            this.studentRepository.removeStudent(id);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.getStudents();
    }
}
