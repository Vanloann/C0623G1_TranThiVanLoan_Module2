package mvc.repository.impl;

import mvc.model.Student;
import mvc.model.Teacher;
import mvc.repository.IStudentRepo;

import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements IStudentRepo {
    List<Student> studentList = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public void removeStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                return;
            }
        }
        System.out.println("Invalid Id");
    }

    @Override
    public List<Student> showStudent() {
        return this.studentList;
    }
}
