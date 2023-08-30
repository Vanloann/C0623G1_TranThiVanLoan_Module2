package mvc.view;

import mvc.controller.CustomerController;

import mvc.model.person.Customer;

import mvc.utilities.RegexFile;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final Scanner scanner = new Scanner(System.in);
    private static final FuramaManagement furamaManagement = new FuramaManagement();

    private final CustomerController customerController = new CustomerController();

    private final RegexFile regexFile = new RegexFile();

    public void displayCustomerManagement() {
        System.out.println("---------CUSTOMER_MENU---------");
        System.out.println("1.\tDisplay customers' list");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tDelete customer");
        System.out.println("5.\tSearch by name customer");
        System.out.println("6.\tReturn main menu");
    }

    public Customer inputCustomer() {
        Customer customer = new Customer();

        String id;
        do {
            System.out.println("Enter ID of customer (KH-YYYY): ");
            do {
                id = scanner.nextLine();
                if (isExisted(id)) {
                    System.out.println("ID is existed");
                    System.out.println("Enter ID again:");
                }
            } while (isExisted(id));
        } while (!regexFile.validateCustomerId(id));
        customer.setId(id);

        String name;
        do {
            System.out.println("Enter name of customer: ");
            name = scanner.nextLine();
        } while (!regexFile.validateName(name));
        customer.setName(name);

        String dayOfBirth;
        do {
            System.out.println("Enter birthday of customer (dd/mm/yyyy): ");
            dayOfBirth = scanner.nextLine();
        } while (!regexFile.validateDayOfBirth(dayOfBirth) || !regexFile.is18YearsOld(dayOfBirth));
        customer.setDayOfBirth(dayOfBirth);

        String gender;
        do {
            System.out.println("Enter gender of customer (Female/Male): ");
            gender = scanner.nextLine();
        } while (!regexFile.validateGender(gender));
        customer.setGender(gender);

        String citizenId;
        do {
            System.out.println("Enter citizenId of customer: ");
            citizenId = scanner.nextLine();
        } while (!regexFile.validateCitizenID(citizenId));
        customer.setCitizenID(citizenId);

        String phoneNumber;
        do {
            System.out.println("Enter phoneNumber of customer: ");
            phoneNumber = scanner.nextLine();
        } while (!regexFile.validatePhoneNumber(phoneNumber));
        customer.setPhoneNumber(phoneNumber);

        String email;
        do {
            System.out.println("Enter email of customer: ");
            email = scanner.nextLine();
        } while (!regexFile.validateEmail(email));
        customer.setEmail(email);

        String customerClass;
        do {
            System.out.println("Enter customer class (Diamond/ Platinum/ Gold/ Silver/ Member): ");
            customerClass = scanner.nextLine();
        } while (!regexFile.validateCustomerCLass(customerClass));
        customer.setCustomerClass(customerClass);

        System.out.println("Enter address of customer: ");
        String address = scanner.nextLine();
        customer.setAddress(address);
        return customer;
    }

    public Customer inputNewInfor() {
        String id;
        do {
            System.out.println("Enter new ID of customer (KH-YYYY): ");
            do {
                id = scanner.nextLine();
                if (isExisted(id)) {
                    System.out.println("ID is existed");
                    System.out.println("Enter ID again:");
                }
            } while (isExisted(id));
        } while (!regexFile.validateCustomerId(id));

        String name;
        do {
            System.out.println("Enter new name of customer: ");
            name = scanner.nextLine();
        } while (!regexFile.validateName(name));

        String dayOfBirth;
        do {
            System.out.println("Enter new birthday of customer (dd/mm/yyyy): ");
            dayOfBirth = scanner.nextLine();
        } while (!regexFile.validateDayOfBirth(dayOfBirth) || !regexFile.is18YearsOld(dayOfBirth));

        String gender;
        do {
            System.out.println("Enter new gender of customer (Female/Male): ");
            gender = scanner.nextLine();
        } while (!regexFile.validateGender(gender));

        String citizenId;
        do {
            System.out.println("Enter new citizenId of customer: ");
            citizenId = scanner.nextLine();
        } while (!regexFile.validateCitizenID(citizenId));

        String phoneNumber;
        do {
            System.out.println("Enter new phoneNumber of customer: ");
            phoneNumber = scanner.nextLine();
        } while (!regexFile.validatePhoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Enter new email of customer: ");
            email = scanner.nextLine();
        } while (!regexFile.validateEmail(email));

        String customerClass;
        do {
            System.out.println("Enter new customer class (Diamond/ Platinum/ Gold/ Silver/ Member): ");
            customerClass = scanner.nextLine();
        } while (!regexFile.validateCustomerCLass(customerClass));

        System.out.println("Enter new address of customer: ");
        String address = scanner.nextLine();

        return new Customer(id, name, dayOfBirth, gender, citizenId, phoneNumber, email, customerClass, address);
    }

    public String inputCustomerId () {
        String id;
        boolean check;
        do {
//            check = false;
            System.out.println("Please enter ID of customer: ");
            id = scanner.nextLine();
            check = isExisted(id);
            if (!check) {
                System.out.println("Invalid Id! Enter again");
            }
        } while (!check);
        return id;
    }

    private boolean isExisted(String id) {
        List<Customer> customers = customerController.display();
        for (Customer customer : customers) {
            if (customer.getId().contains(id)) {
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
            System.out.println("Please enter name of customer:");
            name = scanner.nextLine();
            List<Customer> customers = customerController.display();
            int size = customers.size();
            for (int i = 0; i < size; i++) {
                if (customers.get(i).getName().contains(name)) {
                    check = true;
                }
                if (!check) {
                    System.out.println("Invalid name! Enter again");
                }
            }
        } while (!check);
        return name;
    }

    public void renderCustomer() {
        this.displayCustomerManagement();
        int option = furamaManagement.chooseService();
        switch (option) {
            case 1:
                List<Customer> customers = this.customerController.display();
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
                break;
            case 2:
                this.customerController.add(this.inputCustomer());
                System.out.println("Successfully added Customer ^^");
                break;
            case 3:
                this.customerController.edit(this.inputCustomerId(),
                        this.inputNewInfor());
                System.out.println("Successfully edited Customer ^^");
                break;
            case 4:
                this.customerController.delete(this.inputCustomerId());
                System.out.println("Successfully deleted Customer ^^");
                break;
            case 5:
                System.out.println(this.customerController.searchByName(this.inputName()));
                break;
            case 6:
                furamaManagement.manage();
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
        this.renderCustomer();
    }
}
