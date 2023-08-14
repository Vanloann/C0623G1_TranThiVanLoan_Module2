package mvc.controller;

import mvc.service.ITeacherService;
import mvc.service.impl.TeacherServiceImpl;

public class TeacherController {
    public void managingSystem (int choice) {
        ITeacherService managementService = new TeacherServiceImpl();
        managementService.manageInformation(choice);
    }


}
