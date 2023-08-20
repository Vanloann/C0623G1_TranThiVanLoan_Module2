package mvc.controller;

import mvc.model.Teacher;
import mvc.service.ITeacherService;
import mvc.service.impl.TeacherServiceImpl;

import java.util.List;

public class TeacherController {

    private final ITeacherService teacherService = new TeacherServiceImpl();

    public void addTeacher(Teacher teacher) {
        this.teacherService.addTeacher(teacher);
    }

    public void removeTeacher(int id) {
        this.teacherService.removeTeacher(id);
    }


    public List<Teacher> showTeacher() {
        return this.teacherService.showTeacher();
    }
}
