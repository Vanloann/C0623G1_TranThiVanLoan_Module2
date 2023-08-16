package ss12_java_collection_framework.exercise.mvc.controller;

import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.service.impl.ProductServiceImpl;
import ss12_java_collection_framework.exercise.mvc.view.ProductManager;

import java.util.List;

public class ProductController {
    ProductManager productManager = new ProductManager();
    ProductServiceImpl productService = new ProductServiceImpl();

    public void manage(){
        int choice;
        do {
            choice = productManager.chooseFunction();
            switch (choice) {
                case 1:
                    productService.addProduct(productManager.inputProduct());
                    break;
                case 2:
                    productService.editProduct(productManager.inputID(), productManager.inputNewInfor());
                    break;
                case 3:
                    productService.removeProduct(productManager.inputID());
                    break;
                case 4:
                    productManager.displayProduct(productService.getProducts());
                    break;
                case 5:
                    productService.findProductByName(productManager.inputName());
                    break;
                case 6:
                    if (productManager.chooseOption() == 1) {
                        productService.sortByAscendingOrder();
                    } else if (productManager.chooseOption() == 2){
                        productService.sortByDecreasingOrder();
                    }
                    break;
            }
        } while (choice!=7);
    }

}
