package ss17_binary_file_serialization.exercise.mvc.service;

import ss17_binary_file_serialization.exercise.mvc.model.Product;

import java.util.List;

public interface IProductService {

    public void addProduct(Product product);

    public List<Product> displayProduct();

    public List<Product> searchProduct(String name);
}
