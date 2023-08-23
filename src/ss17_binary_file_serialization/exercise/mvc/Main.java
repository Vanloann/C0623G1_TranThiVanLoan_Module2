package ss17_binary_file_serialization.exercise.mvc;

import ss17_binary_file_serialization.exercise.mvc.model.Product;
import ss17_binary_file_serialization.exercise.mvc.view.ProductManagement;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        productManagement.manage();
    }
}
