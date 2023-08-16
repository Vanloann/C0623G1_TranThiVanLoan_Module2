package mvc.view;

import mvc.controller.StudentController;
import mvc.controller.TeacherController;
import mvc.model.Student;
import mvc.model.Teacher;

import java.util.Scanner;

public class ManagementSystemView {
    private final Scanner scanner = new Scanner(System.in);

    private final StudentController studentController = new StudentController();
    private final TeacherController teacherController = new TeacherController();
    public void showFunction() {
        System.out.println("1. Thêm mới giảng viên hoặc sinh viên");
        System.out.println("2. Xóa giảng viên hoặc sinh viên");
        System.out.println("3. Xem danh sách giảng viên hoặc sinh viên");
        System.out.println("4. Thoát");
    }

    public void showObject() {
        System.out.println("1. Giảng viên");
        System.out.println("2. Sinh viên");
    }


    public void chooseFunction() {
        int choice = 0;

        showFunction();
        do {
            try {
                System.out.println("Mời bạn chọn chức năng: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
                System.out.println("Dữ liệu bạn nhập bị sai");
            }
        } while (choice >= 1 && choice <= 4);

        if (choice == 4) {
            System.exit(4);
        }
        System.out.println(choice);
    }


    public void manageInformation(int choice) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        switch (choice) {
            case 1:
                int option = 0;
                do {
                    try {
                        this.showObject();
                        System.out.println("Mời bạn chọn đối tượng muốn thêm");
                        //bug
//                    option = scanner.nextInt();
//                    scanner.nextLine();
                        option = Integer.parseInt(scanner.nextLine());
                        if (option == 1) {
                            teacher.setTeacherInfor();
                        } else {
                            student.setStudentInfor();
                        }
                    } catch (Exception ex) {
                        System.out.println("Dữ liệu bạn nhập bị sai");
                    }
                } while (option <= 0 || option > 2);
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
