package mvc.service.impl;

import mvc.model.Teacher;
import mvc.repository.ITeacherRepo;
import mvc.repository.impl.TeaherRepoImpl;
import mvc.service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {

    private final ITeacherRepo teacherRepo = new TeaherRepoImpl();

    @Override
    public void addTeacher(Teacher teacher) {
        this.teacherRepo.addTeacher(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        this.teacherRepo.removeTeacher(id);
    }

    @Override
    public List<Teacher> showTeacher() {
        return this.teacherRepo.showTeacher();
    }
}
