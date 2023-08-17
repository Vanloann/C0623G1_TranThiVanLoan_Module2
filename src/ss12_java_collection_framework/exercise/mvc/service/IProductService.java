package ss12_java_collection_framework.exercise.mvc.service;

import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.ArrayList;

public interface IProductService {
    void addProduct(Product product);

    void editProduct(int id,Product product);

    void removeProduct(int id);

    ArrayList<Product> getProducts();

    ArrayList<Product> searchProductByName(String name);


    ArrayList<Product> sortByAscendingOrder();

    ArrayList<Product> sortByDescendingOrder();


}
