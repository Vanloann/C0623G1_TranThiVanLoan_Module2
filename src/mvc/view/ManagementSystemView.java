package ss02_vong_lap.mvc.view;

import ss02_vong_lap.mvc.controller.TeacherController;

import java.util.Scanner;

public class ManagementSystemView {
    private final Scanner scanner = new Scanner(System.in);

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
