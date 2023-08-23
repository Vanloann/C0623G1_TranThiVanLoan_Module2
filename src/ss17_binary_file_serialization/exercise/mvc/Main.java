package ss17_binary_file_serialization.exercise.mvc;

import ss17_binary_file_serialization.exercise.mvc.model.Product;
import ss17_binary_file_serialization.exercise.mvc.view.ProductManagement;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        String FILE_PATH = "D:\\C0623G1_LoanTTV_Module2\\untitled\\src\\ss17_binary_file_serialization\\exercise\\product.txt";

//
//        ProductManagement productManagement = new ProductManagement();
//        productManagement.manage();
        System.out.println(UtilsFile.readFile(FILE_PATH));
    }
}
