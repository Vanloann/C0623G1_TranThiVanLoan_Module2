package mvc.view;

import mvc.controller.TeacherController;
import java.util.Scanner;

public class ManagementSystemView {
    public  void showFunction() {
        System.out.println("1. Thêm mới giảng viên hoặc sinh viên");
        System.out.println("2. Xóa giảng viên hoặc sinh viên");
        System.out.println("3. Xem danh sách giảng viên hoặc sinh viên");
        System.out.println("4. Thoát");
//        System.out.println("Chọn chức năng: ");
    }

    public  void chooseFunction() {
        int choice;
        Scanner scanner = new Scanner(System.in);

        showFunction();
        do {
            System.out.println("Mời bạn chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            TeacherController msc = new TeacherController();
            msc.managingSystem(choice);
        } while (choice >= 1 && choice <= 4);

        if (choice == 4) {
            System.exit(4);
        }
        System.out.println(choice);



    }


}
