package mvc.repository.impl;

import mvc.model.Teacher;
import mvc.repository.ITeacherRepo;

import java.util.ArrayList;
import java.util.List;

public class TeaherRepoImpl implements ITeacherRepo {

    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId() == id) {
                teacherList.remove(i);
                return;
            }
        }
        System.out.println("Invalid Id");
    }

    @Override
    public List<Teacher> showTeacher() {
        return this.teacherList;
    }
}
