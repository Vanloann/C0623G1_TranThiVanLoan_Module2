package mvc.service;

import mvc.model.Person;

import java.util.ArrayList;

public class ManagementImpl implements IManagementService {

    ArrayList<Person> arrayList = new ArrayList<>();

    @Override
    public void manageInformation(int choice) {
        switch (choice) {
            case 1:
//                arrayList.add();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("Không hợp lệ vui lòng nhập lại");
                break;
        }
    }
}
