package mvc.view;

import mvc.controller.FacilityController;
import mvc.model.facility.Facility;
import mvc.model.facility.House;
import mvc.model.facility.Room;
import mvc.model.facility.Villa;
import mvc.model.person.Employee;
import mvc.repository.IFacilityRepository;
import mvc.repository.impl.FacilityRepositoryImpl;
import mvc.utilities.RegexFile;

import java.util.List;
import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);
    private static final FuramaManagement furamaManagement = new FuramaManagement();

    private final FacilityController facilityController = new FacilityController();

    private final RegexFile regexFile = new RegexFile();

    public void displayFacilityManagement() {
        System.out.println("---------FACILITY_MENU---------");
        System.out.println("1.\tDisplay List facility");
        System.out.println("2.\tAdd new facility");
        System.out.println("3.\tDisplay list facility maintenance");
        System.out.println("4.\tDelete facility");
        System.out.println("5.\tReturn main menu");
    }

    public void displayServiceMenu() {
        System.out.println("---------SERVICE_MENU---------");
        System.out.println("1.\tAdd New Villa");
        System.out.println("2.\tAdd New House");
        System.out.println("3.\tAdd New Room");
        System.out.println("4.\tBack to menu");
    }

    public int chooseService() {
        this.displayServiceMenu();
        int service = 0;
        do {
            try {
                System.out.println("Please choose service: ");
                service = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid service!");
            }
        } while (service < 1 || service > 4);
        return service;
    }

    public int chooseFacility() {
        int option = 0;
        do {
            try {
                System.out.println("Please enter option: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!");
            }
        } while (option < 1 || option > 5);
        if (option == 5) {
            furamaManagement.displayMainMenu();
        }
        return option;
    }

    public Facility inputVilla() {
        String id;
        do {
            System.out.println("Enter Villa Id (SVVL_YYYY): ");
            do {
                id = scanner.nextLine();
                if (this.facilityController.isExisted(id)) {
                    System.out.println("Villa's Id is existed!");
                    System.out.println("Please enter again: ");
                }
            } while (this.facilityController.isExisted(id));
        } while (!regexFile.validateVilla(id));

        String serviceName;
        do {
            System.out.println("Enter service name: ");
            serviceName = scanner.nextLine();
        } while (!regexFile.validateName(serviceName));

        double area;
        do {
            System.out.println("Enter area of villa (m2):");
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Area must be greater than 30m2!");
            }
        } while (area <= 30);

        double rental;
        do {
            System.out.println("Enter rental ($):");
            rental = Double.parseDouble(scanner.nextLine());
            if (rental <= 0) {
                System.out.println("Rental must be a positive number!");
            }
        } while (rental <= 0);

        int capacity;
        do {
            System.out.println("Enter capacity of villa: ");
            capacity = Integer.parseInt(scanner.nextLine());
            if (capacity <= 0 || capacity >= 20) {
                System.out.println("Capacity of villa must be at least 1 person and at most 19 people. ");
            }
        } while (capacity <= 0 || capacity >= 20);

        String rentPeriod;
        do {
            System.out.println("Enter rent period (Hour/ Day/ Month/ Year)");
            rentPeriod = scanner.nextLine();
        } while (!regexFile.validateName(rentPeriod));

        String roomStandard;
        do {
            System.out.println("Enter room standard: ");
            roomStandard = scanner.nextLine();
        } while (!regexFile.validateName(roomStandard));

        double areaOfPool;
        do {
            System.out.println("Enter area of pool: ");
            areaOfPool = Double.parseDouble(scanner.nextLine());
            if (areaOfPool <= 30) {
                System.out.println("Area of pool must be greater than 30m2! ");
            }
        } while (areaOfPool <= 30);

        int floors;
        do {
            System.out.println("Enter number of floor: ");
            floors = Integer.parseInt(scanner.nextLine());
            if (floors <= 0) {
                System.out.println("Number of floor must be a positive number!");
            }
        } while (floors <= 0);
        return new Villa(id, serviceName, area, rental, capacity, rentPeriod, roomStandard, areaOfPool, floors);
    }

    public Facility inputHouse() {
        String id;
        do {
            System.out.println("Enter House Id (SVHO_YYYY): ");
            do {
                id = scanner.nextLine();
                if (this.facilityController.isExisted(id)) {
                    System.out.println("House's Id is existed!");
                    System.out.println("Please enter again: ");
                }
            } while (this.facilityController.isExisted(id));
        } while (!regexFile.validateHouse(id));

        String serviceName;
        do {
            System.out.println("Enter service name: ");
            serviceName = scanner.nextLine();
        } while (!regexFile.validateName(serviceName));

        double area;
        do {
            System.out.println("Enter area of House (m2):");
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Area must be greater than 30m2!");
            }
        } while (area <= 30);

        double rental;
        do {
            System.out.println("Enter rental ($):");
            rental = Double.parseDouble(scanner.nextLine());
            if (rental <= 0) {
                System.out.println("Rental must be a positive number!");
            }
        } while (rental <= 0);

        int capacity;
        do {
            System.out.println("Enter capacity of house: ");
            capacity = Integer.parseInt(scanner.nextLine());
            if (capacity <= 0 || capacity >= 20) {
                System.out.println("Capacity of villa must be at least 1 person and at most 19 people. ");
            }
        } while (capacity <= 0 || capacity >= 20);

        String rentPeriod;
        do {
            System.out.println("Enter rent period (Hour/ Day/ Month/ Year)");
            rentPeriod = scanner.nextLine();
        } while (!regexFile.validateName(rentPeriod));

        String roomStandard;
        do {
            System.out.println("Enter room standard: ");
            roomStandard = scanner.nextLine();
        } while (!regexFile.validateName(roomStandard));

        int floors;
        do {
            System.out.println("Enter number of floor: ");
            floors = Integer.parseInt(scanner.nextLine());
            if (floors <= 0) {
                System.out.println("Number of floor must be a positive number!");
            }
        } while (floors <= 0);
        return new House(id, serviceName, area, rental, capacity, rentPeriod, roomStandard, floors);
    }

    public Facility inputRoom() {
        String id;
        do {
            System.out.println("Enter Room Id (SVRO_YYYY): ");
            do {
                id = scanner.nextLine();
                if (this.facilityController.isExisted(id)) {
                    System.out.println("Room's Id is existed!");
                    System.out.println("Please enter again: ");
                }
            } while (this.facilityController.isExisted(id));
        } while (!regexFile.validateRoom(id));

        String serviceName;
        do {
            System.out.println("Enter service name: ");
            serviceName = scanner.nextLine();
        } while (!regexFile.validateName(serviceName));

        double area;
        do {
            System.out.println("Enter area of Room (m2):");
            area = Double.parseDouble(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Area must be greater than 30m2!");
            }
        } while (area <= 30);

        double rental;
        do {
            System.out.println("Enter rental ($):");
            rental = Double.parseDouble(scanner.nextLine());
            if (rental <= 0) {
                System.out.println("Rental must be a positive number!");
            }
        } while (rental <= 0);

        int capacity;
        do {
            System.out.println("Enter capacity of room: ");
            capacity = Integer.parseInt(scanner.nextLine());
            if (capacity <= 0 || capacity >= 20) {
                System.out.println("Capacity of villa must be at least 1 person and at most 19 people. ");
            }
        } while (capacity <= 0 || capacity >= 20);

        String rentPeriod;
        do {
            System.out.println("Enter rent period (Hour/ Day/ Month/ Year)");
            rentPeriod = scanner.nextLine();
        } while (!regexFile.validateName(rentPeriod));

        String accompanyingFreeService;
        do {
            System.out.println("Enter room standard: ");
            accompanyingFreeService = scanner.nextLine();
        } while (!regexFile.validateName(accompanyingFreeService));

        return new Room(id, serviceName, area, rental, capacity, rentPeriod, accompanyingFreeService);
    }

    public String inputID() {
        String id;
        boolean check;
        do {
            System.out.println("Enter facility's id: ");
            id = scanner.nextLine();
            check = this.facilityController.isExisted(id);
            if (!check) {
                System.out.println("Id is not found! Enter again");
            }
        } while (!check);
        return id;
    }

//    private boolean isExisted(String id) {
//        List<Facility> facilities = facilityController.display();
//        for (Facility facility : facilities) {
//            if (facility.getId().contains(id)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public void renderFacility() {
        this.displayFacilityManagement();
        int option = this.chooseFacility();
        List<Facility> facilities;
        switch (option) {
            case 1:
                facilities = this.facilityController.display();
                for (Facility facility : facilities) {
                    System.out.println(facility);
                }
                break;
            case 2:
                int service = this.chooseService();
                switch (service) {
                    case 1:
                        this.facilityController.add(this.inputVilla());
                        break;
                    case 2:
                        this.facilityController.add(this.inputHouse());
                        break;
                    case 3:
                        this.facilityController.add(this.inputRoom());
                        break;
                    case 4:
                        this.renderFacility();
                        break;
                    default:
                        System.out.println("Invalid service!");
                        break;
                }
                System.out.println("Successfully added Facility ^^");
                break;
            case 3:
                facilities = this.facilityController.displayFacilityListMaintenance();
                for (Facility facility : facilities) {
                    System.out.println(facility);
                }
                break;
            case 4:
                String checkId = this.inputID();
                System.out.println(this.facilityController.showInfor(checkId));
                System.out.println("Please choose options below to confirm again! ");
                System.out.println("1. Yes  |  2. No");
                int confirm = Integer.parseInt(scanner.nextLine());
                if(confirm == 1) {
                    this.facilityController.delete(checkId);
                    System.out.println("Successfully deleted Facility ^^");
                } else {
                    System.out.println("Unsuccessfully deleted Facility");
                    break;
                }
                break;
            case 5:
                furamaManagement.manage();
                break;
            default:
                System.out.println("Invalid option!");
        }
        this.renderFacility();
    }

}
