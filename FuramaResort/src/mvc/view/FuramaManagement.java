package mvc.view;

import mvc.controller.EmployeeController;
import mvc.model.person.Employee;

import java.util.List;
import java.util.Scanner;

public class FuramaManagement {
    private final Scanner scanner = new Scanner(System.in);

// Singleton
//    private static final FuramaManagement furamaManagement =new FuramaManagement();
//
//    public static FuramaManagement getInstance() {
//        return furamaManagement;
//    }
    public void displayMainMenu() {
        System.out.println("---------MENU---------");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
    }

    public int chooseFunction() {
        int choice = 0;
        this.displayMainMenu();
        do {
            try {
                System.out.println("Please enter function: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid function!");
            }
            if (choice == 6) {
                System.exit(6);
            }
        } while (choice < 1 || choice > 6);
        return choice;
    }

    public int chooseService() {
        int option = 0;
        do {
            try {
                System.out.println("Please enter option: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!");
            }
        } while (option < 1 || option > 6);
        return option;
    }

    public int chooseService1() {
        int option = 0;
        do {
            try {
                System.out.println("Please enter option: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!");
            }
        } while (option < 1 || option > 5);
        if(option == 5) {
            this.displayMainMenu();
        }
        return option;
    }

    public int chooseService2() {
        int option = 0;
        do {
            try {
                System.out.println("Please enter option: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!");
            }
        } while (option < 1 || option > 3);
        if(option == 3) {
            this.displayMainMenu();
        }
        return option;
    }

    public void displayCustomerManagement() {
        System.out.println("---------CUSTOMER_MENU---------");
        System.out.println("1.\tDisplay List customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tDelete customer");
        System.out.println("5.\tSearch by name customer");
        System.out.println("6.\tReturn main menu");
    }

    public void displayFacilityManagement() {
        System.out.println("---------FACILITY_MENU---------");
        System.out.println("1.\tDisplay List facility");
        System.out.println("2.\tAdd new facility");
        System.out.println("3.\tDisplay list facility maintenance");
        System.out.println("4.\tDelete facility");
        System.out.println("5.\tReturn main menu");
    }

    public void displayBookingManagement() {
        System.out.println("---------BOOKING_MENU---------");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay List booking");
        System.out.println("3.\tCreate new contract");
        System.out.println("4.\tDisplay List contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
    }

    public void displayPromotionManagement() {
        System.out.println("---------PROMOTION_MENU---------");
        System.out.println("1.\tDisplay List customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
    }

    public int inputID() {
        System.out.println("Please enter ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String inputName() {
        System.out.println("Please enter name:");
        return scanner.nextLine();
    }


    public void manage() {
        int choice;
        do {
            choice = this.chooseFunction();
            switch (choice) {
                case 1:
                    EmployeeView employeeView = new EmployeeView();
                    employeeView.renderEmployee();
                    break;
                case 2:
                    CustomerView customerView = new CustomerView();


            }
        } while (choice != 4);
    }
}
