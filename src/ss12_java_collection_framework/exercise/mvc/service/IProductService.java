package ss12_java_collection_framework.exercise.mvc.service;

import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.ArrayList;

public interface IProductService {
    void addProduct(Product product);
    ArrayList<Product> getProducts();

    void editProduct(int id,Product product);

    void removeProduct(int id);

    void findProductByName(String name);

    void sortByAscendingOrder();

    void sortByDecreasingOrder();


}
