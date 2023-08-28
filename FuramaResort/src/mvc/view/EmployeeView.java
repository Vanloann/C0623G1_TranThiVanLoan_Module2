package mvc.view;

import mvc.controller.EmployeeController;
import mvc.model.person.Employee;

import javax.swing.text.Style;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private static final FuramaManagement furamaManagement = new FuramaManagement();
    private final EmployeeController employeeController = new EmployeeController();


    public void displayEmployeeManagement() {
        System.out.println("---------EMPLOYEE_MENU---------");
        System.out.println("1.\tDisplay List Employees");
        System.out.println("2.\tAdd new employee");
        System.out.println("3.\tEdit employee");
        System.out.println("4.\tDelete employee");
        System.out.println("5.\tSearch by name employee");
        System.out.println("6.\tReturn main menu");
    }

    public Employee inputEmployee() {
        Employee employee = new Employee();
        System.out.println("Enter ID of employee: ");
        employee.setId(scanner.nextLine());
        System.out.println("Enter name of employee: ");
        employee.setName(scanner.nextLine());
        System.out.println("Enter birthday of employee: ");
        employee.setDayOfBirth(scanner.nextLine());
        System.out.println("Enter gender of employee: ");
        employee.setGender(scanner.nextLine());
        System.out.println("Enter citizenId of employee: ");
        employee.setCitizenID(scanner.nextLine());
        System.out.println("Enter phoneNumber of employee: ");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter email of employee: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Enter educationLevel of employee: ");
        employee.setEducationLevel(scanner.nextLine());
        System.out.println("Enter position of employee: ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Enter salary of employee: ");
        employee.setSalary(scanner.nextLine());
        return employee;
    }

    public Employee inputNewInfor() {
        System.out.println("Enter new ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new birthday: ");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Enter new gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter new citizenId: ");
        String citizenId = scanner.nextLine();
        System.out.println("Enter new phoneNumber: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter new email: ");
        String email = scanner.nextLine();
        System.out.println("Enter new educationLevel: ");
        String educationLevel = scanner.nextLine();
        System.out.println("Enter new position: ");
        String position = scanner.nextLine();
        System.out.println("Enter new salary: ");
        String salary = scanner.nextLine();
        return new Employee(id, name, dayOfBirth, gender, citizenId, phoneNumber, email, educationLevel, position, salary);
    }

    public String inputEmployeeId() {
        String id;
        boolean check;
        do {
            check = true;
            System.out.println("Please enter ID of employee: ");
            id = scanner.nextLine();
            for (int i = 0; i < employeeController.display().size(); i++) {
                if (employeeController.display().get(i).getId().contains(id)) {

                } else {
                    System.out.println("Invalid Id! Enter again");
                    check = false;
                }
            }
        } while (!check);
        return id;
    }

//    public String inputName() {
//        String name;
//        boolean check;
//        do {
//            check = true;
//        System.out.println("Please enter name of employee:");
//        name = scanner.nextLine();
//            for (int i = 0; i < employeeController.display().size(); i++) {
//                if (employeeController.display().get(i).getName().contains(name)) {
//
//                }
//            }
//    }

    public void renderEmployee() {
        this.displayEmployeeManagement();
        int option = furamaManagement.chooseService();
        switch (option) {
            case 1:
                List<Employee> employees = this.employeeController.display();
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case 2:
                this.employeeController.add(this.inputEmployee());
                break;
            case 3:
                this.employeeController.edit(this.inputEmployeeId(),
                        this.inputNewInfor());
                break;
            case 4:
                this.employeeController.delete(this.inputEmployeeId());
                break;
            case 5:
                System.out.println(this.employeeController.searchByName(furamaManagement.inputName()));
                break;
            case 6:
                furamaManagement.chooseFunction();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
        this.renderEmployee();
    }
}
