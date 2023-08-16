package ss12_java_collection_framework.exercise.mvc.repository;

import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.ArrayList;

public interface IProductRepo {
    void addProduct(Product product);

    ArrayList<Product> getProducts();


    void editProduct(int id,Product product);

    void removeProduct(int id);

    void searchProductByName(String name);

    void sortByAscendingOrder();

    void sortByDecreasingOrder();

}

