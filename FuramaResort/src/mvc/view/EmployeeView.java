package mvc.view;

import mvc.controller.EmployeeController;
import mvc.model.person.Employee;
import mvc.utilities.RegexFile;

import javax.swing.text.Style;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private static final FuramaManagement furamaManagement = new FuramaManagement();
    private final EmployeeController employeeController = new EmployeeController();

    private final RegexFile regexFile = new RegexFile();

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

        String id;
        do {
            System.out.println("Enter ID of employee (NV-YYYY): ");
            do {
                id = scanner.nextLine();
                if (isExisted(id)) {
                    System.out.println("ID is existed");
                    System.out.println("Enter ID again:");
                }
            } while (isExisted(id));
        } while (!regexFile.validateEmployeeId(id));
        employee.setId(id);

        String name;
        do {
            System.out.println("Enter name of employee: ");
            name = scanner.nextLine();
        } while (!regexFile.validateName(name));
        employee.setName(name);

        String dayOfBirth;
        do {
            System.out.println("Enter birthday of employee (dd/mm/yyyy): ");
            dayOfBirth = scanner.nextLine();
        } while (!regexFile.validateDayOfBirth(dayOfBirth) || !regexFile.is18YearsOld(dayOfBirth));
        employee.setDayOfBirth(dayOfBirth);

        String gender;
        do {
            System.out.println("Enter gender of employee (Female/Male): ");
            gender = scanner.nextLine();
        } while (!regexFile.validateGender(gender));
        employee.setGender(gender);

        String citizenId;
        do {
            System.out.println("Enter citizenId of employee: ");
            citizenId = scanner.nextLine();
        } while (!regexFile.validateCitizenID(citizenId));
        employee.setCitizenID(citizenId);

        String phoneNumber;
        do {
            System.out.println("Enter phoneNumber of employee: ");
            phoneNumber = scanner.nextLine();
        } while (!regexFile.validatePhoneNumber(phoneNumber));
        employee.setPhoneNumber(phoneNumber);

        String email;
        do {
            System.out.println("Enter email of employee: ");
            email = scanner.nextLine();
        } while (!regexFile.validateEmail(email));
        employee.setEmail(email);

        String educationLevel;
        do {
            System.out.println("Enter educationLevel of employee (Intermediate Degree/ College Degree/ Bachelor's Degree/ Postgraduate Degree): ");
            educationLevel = scanner.nextLine();
        } while (!regexFile.validateEducationLevel(educationLevel));
        employee.setEducationLevel(educationLevel);

        String position;
        do {
            System.out.println("Enter position of employee (Receptionist/ Waiter/ Specialist/ Supervisor/ Manager/ Director): ");
            position = scanner.nextLine();
        } while (!regexFile.validatePosition(position));
        employee.setPosition(position);

        String salary;
        do {
            System.out.println("Enter salary of employee: ");
            salary = scanner.nextLine();
            if (Integer.parseInt(salary) <= 0) {
                System.out.println("Salary must be greater than 0");
            } else {
                break;
            }
        } while (Integer.parseInt(salary) <= 0);
        employee.setSalary(salary);
        return employee;
    }

    public Employee inputNewInfor() {
        String id;
        do {
            System.out.println("Enter new ID: ");
            do {
                id = scanner.nextLine();
                if (isExisted(id)) {
                    System.out.println("ID is existed");
                    System.out.println("Enter ID again:");
                }
            } while (isExisted(id));
        } while (!regexFile.validateEmployeeId(id));

        String name;
        do {
            System.out.println("Enter new name: ");
            name = scanner.nextLine();
        } while (!regexFile.validateName(name));

        String dayOfBirth;
        do {
            System.out.println("Enter new birthday: ");
            dayOfBirth = scanner.nextLine();
        } while (!regexFile.validateDayOfBirth(dayOfBirth) || !regexFile.is18YearsOld(dayOfBirth));

        String gender;
        do {
            System.out.println("Enter new gender: ");
            gender = scanner.nextLine();
        } while (!regexFile.validateGender(gender));

        String citizenId;
        do {
            System.out.println("Enter new citizenId: ");
            citizenId = scanner.nextLine();
        } while (!regexFile.validateCitizenID(citizenId));

        String phoneNumber;
        do {
            System.out.println("Enter new phoneNumber: ");
            phoneNumber = scanner.nextLine();
        } while (!regexFile.validatePhoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Enter new email: ");
            email = scanner.nextLine();
        } while (!regexFile.validateEmail(email));

        String educationLevel;
        do {
            System.out.println("Enter new educationLevel: ");
            educationLevel = scanner.nextLine();
        } while (!regexFile.validateEducationLevel(educationLevel));

        String position;
        do {
            System.out.println("Enter new position: ");
            position = scanner.nextLine();
        } while (!regexFile.validatePosition(position));

        String salary;
        do {
            System.out.println("Enter new salary: ");
            salary = scanner.nextLine();
            if (Integer.parseInt(salary) <= 0) {
                System.out.println("Salary must be greater than 0");
            } else {
                break;
            }
        } while (Integer.parseInt(salary) <= 0);
        return new Employee(id, name, dayOfBirth, gender, citizenId, phoneNumber, email, educationLevel, position, salary);
    }

    public String inputEmployeeId () {
        String id;
        boolean check;
        do {
//            check = false;
            System.out.println("Please enter ID of employee: ");
            id = scanner.nextLine();
            check = isExisted(id);
            if (!check) {
                System.out.println("Invalid Id! Enter again");
            }
        } while (!check);
        return id;
    }

    private boolean isExisted(String id) {
        List<Employee> employees = employeeController.display();
        for (Employee employee : employees) {
            if (employee.getId().contains(id)) {
                return true;
            }
        }
        return false;
    }

    public String inputName() {
        String name;
        boolean check;
        do {
            check = false;
            System.out.println("Please enter name of employee:");
            name = scanner.nextLine();
            List<Employee> employees = employeeController.display();
            int size = employees.size();
            for (int i = 0; i < size; i++) {
                if (employees.get(i).getName().contains(name)) {
                    check = true;
                }
                if (!check) {
                    System.out.println("Invalid name! Enter again");
                }
            }
        } while (!check);
        return name;
    }

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
                    System.out.println("Successfully added Employee ^^");
                    break;
                case 3:
                    this.employeeController.edit(this.inputEmployeeId(),
                            this.inputNewInfor());
                    System.out.println("Successfully edited Employee ^^");
                    break;
                case 4:
                    this.employeeController.delete(this.inputEmployeeId());
                    System.out.println("Successfully deleted Employee ^^");
                    break;
                case 5:
                    System.out.println(this.employeeController.searchByName(this.inputName()));
                    break;
                case 6:
                    furamaManagement.manage();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        this.renderEmployee();
    }
}

