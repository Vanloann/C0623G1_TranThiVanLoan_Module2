package ss12_java_collection_framework.exercise.mvc;

import ss12_java_collection_framework.exercise.mvc.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.manage();
    }
}
