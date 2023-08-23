package ss17_binary_file_serialization.exercise.mvc.repository;

import ss17_binary_file_serialization.exercise.mvc.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepo {

    void addProduct(Product product);

    List<Product> displayProduct();

    List<Product> searchProduct(String name);
}
