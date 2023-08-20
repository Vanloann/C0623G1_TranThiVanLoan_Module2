package mvc.repository;

import mvc.model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    public void addTeacher(Teacher teacher);

    public void removeTeacher(int id);

    List<Teacher> showTeacher();
}
