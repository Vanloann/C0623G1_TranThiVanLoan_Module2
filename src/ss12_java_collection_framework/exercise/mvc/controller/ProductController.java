package ss12_java_collection_framework.exercise.mvc.controller;

import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.service.impl.ProductServiceImpl;

import java.util.ArrayList;

public class ProductController {
//    ProductManager productManager = new ProductManager();
    private final ProductServiceImpl productService = new ProductServiceImpl();

    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public void editProduct(int id, Product product) {
        this.productService.editProduct(id, product);
    }

    public void removeProduct(int id) {
        this.productService.removeProduct(id);
    }

    public ArrayList<Product> getProducts() {
        return this.productService.getProducts();
    }

    public ArrayList<Product> searchProductByName(String name) {
        return this.productService.searchProductByName(name);
    }

    public ArrayList<Product> sortByAscendingOrder() {
        return this.productService.sortByAscendingOrder();
    }


    public ArrayList<Product> sortByDescendingOrder() {
        return this.productService.sortByDescendingOrder();
    }

//    public void manage() {
//        int choice;
//        do {
//            choice = productManager.chooseFunction();
//            switch (choice) {
//                case 1:
//                    productService.addProduct(productManager.inputProduct());
//                    break;
//                case 2:
//                    productService.editProduct(productManager.inputID(), productManager.inputNewInfor());
//                    break;
//                case 3:
//                    productService.removeProduct(productManager.inputID());
//                    break;
//                case 4:
//                    productManager.displayProduct(productService.getProducts());
//                    break;
//                case 5:
//                    productService.searchProductByName(productManager.inputName());
//                    break;
//                case 6:
//                    if (productManager.chooseOption() == 1) {
//                        productService.sortByAscendingOrder();
//                    } else if (productManager.chooseOption() == 2) {
//                        productService.sortByDescendingOrder();
//                    }
//                    break;
//            }
//        } while (choice != 7);
//    }

}
