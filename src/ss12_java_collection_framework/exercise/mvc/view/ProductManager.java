package ss12_java_collection_framework.exercise.mvc.view;


import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    Product product = new Product();

    public void showMenu() {
        System.out.println("-------MENU-------");
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Remove product");
        System.out.println("4. Display list of products");
        System.out.println("5. Find product by name");
        System.out.println("6. Sort list of products");
        System.out.println("7. Exit");
    }

    public int chooseFunction() {
        int choice = 0;
        this.showMenu();
        do {
            System.out.println("Please enter function: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 1 || choice > 6);

        if (choice == 7) {
            System.exit(7);
        }
        return choice;
    }


    public Product inputProduct() {
        System.out.println("Enter ID of product: ");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name of product: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Enter price of product: ");
        product.setPrice(Float.parseFloat(scanner.nextLine()));
        return product;
    }

    public void displayProduct(ArrayList<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public int inputID() {
        System.out.println("Please enter ID of product: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Product inputNewInfor() {
        System.out.println("Enter new ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new price: ");
        float price = Float.parseFloat(scanner.nextLine());
        return new Product(id, name, price);
    }

    public String inputName() {
        System.out.println("Please enter name of product: ");
        return scanner.nextLine();
    }

    public int chooseOption() {
        System.out.println("1. Sort by ascending order");
        System.out.println("2. Sort by decreasing order");
        System.out.println("Please choose option: ");
        int option = Integer.parseInt(scanner.nextLine());
        return option;
    }




}
