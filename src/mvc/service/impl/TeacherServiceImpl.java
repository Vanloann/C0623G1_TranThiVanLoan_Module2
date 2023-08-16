package mvc.service.impl;

import mvc.model.Teacher;
import mvc.repository.ITeacherRepository;
import mvc.repository.impl.TeacherRepoImpl;
import mvc.service.ITeacherService;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService {

    private final ITeacherRepository teacherRepository = new TeacherRepoImpl();
    @Override
    public void addTeacher(Teacher teacher) {
        this.teacherRepository.addTeacher(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        this.teacherRepository.removeTeacher(id);
    }

    @Override
    public List<Teacher> getTeachers() {
        return this.teacherRepository.getTeachers();
    }
}
