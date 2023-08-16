package mvc.repository.impl;

import mvc.model.Teacher;
import mvc.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepoImpl implements ITeacherRepository {
    private final List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void removeTeacher(int id) {

    }

    @Override
    public List<Teacher> getTeachers() {
        return null;
    }
}
