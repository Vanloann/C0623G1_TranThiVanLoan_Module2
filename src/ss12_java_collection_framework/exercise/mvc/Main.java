package ss12_java_collection_framework.exercise.mvc;

import ss12_java_collection_framework.exercise.mvc.controller.ProductController;
import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.view.ProductManager;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.manage();
    }
}
