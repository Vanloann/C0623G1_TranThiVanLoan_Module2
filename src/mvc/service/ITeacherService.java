package mvc.service;

import mvc.model.Teacher;

import java.util.List;

public interface ITeacherService {

    public void addTeacher(Teacher teacher);

    public void removeTeacher(int id);

    List<Teacher> showTeacher();

}
