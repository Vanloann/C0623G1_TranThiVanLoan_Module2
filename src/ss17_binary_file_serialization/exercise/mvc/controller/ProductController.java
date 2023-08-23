package ss17_binary_file_serialization.exercise.mvc.controller;

import ss17_binary_file_serialization.exercise.mvc.model.Product;
import ss17_binary_file_serialization.exercise.mvc.service.IProductService;
import ss17_binary_file_serialization.exercise.mvc.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();


    public void addProduct(Product product) {
        this.productService.addProduct(product);
    }

    public List<Product> displayProduct() {
        return this.productService.displayProduct();
    }

    public List<Product> searchProduct(String name) {
        return this.productService.searchProduct(name);
    }
}
