package mvc.service.impl;

import mvc.model.Student;
import mvc.repository.IStudentRepo;
import mvc.repository.impl.StudentRepoImpl;
import mvc.service.IStudentService;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private final IStudentRepo studentRepo = new StudentRepoImpl();

    @Override
    public void addStudent(Student student) {
        this.studentRepo.addStudent(student);
    }

    @Override
    public void removeStudent(int id) {
        this.studentRepo.removeStudent(id);
    }

    @Override
    public List<Student> showStudent() {
        return this.studentRepo.showStudent();
    }
}
