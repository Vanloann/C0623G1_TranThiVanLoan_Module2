package mvc.service.impl;

import mvc.model.Lecturer;
import mvc.model.Person;
import mvc.model.Student;
import mvc.service.ITeacherService;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherServiceImpl implements ITeacherService {
ArrayList<Person> personArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void manageInformation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Bạn muốn thêm giảng viên hay học sinh");
                System.out.println("1. Thêm giảng viên");
                System.out.println("2. Thêm học sinh");
                int option;
                option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    Person lecturer = new Lecturer();
                    lecturer.setInformation();
                } else {
                    Person student = new Student();
                    student.setInformation();
                }

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
