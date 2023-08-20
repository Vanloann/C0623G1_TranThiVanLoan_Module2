package mvc.controller;

import mvc.model.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentController {
    private final IStudentService studentService = new StudentServiceImpl();

    public void addStudent(Student student) {
        this.studentService.addStudent(student);
    }

    public void removeStudent(int id) {
        this.studentService.removeStudent(id);
    }


    public List<Student> showStudent() {
        return this.studentService.showStudent();
    }
}
