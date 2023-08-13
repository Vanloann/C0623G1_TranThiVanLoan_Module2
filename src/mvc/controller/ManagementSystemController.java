package mvc.controller;

import mvc.service.IManagementService;
import mvc.service.ManagementImpl;

public class ManagementSystemController {

    public void managingSystem (int choice) {
        IManagementService managementService = new ManagementImpl();
        managementService.manageInformation(choice);
    }
}
