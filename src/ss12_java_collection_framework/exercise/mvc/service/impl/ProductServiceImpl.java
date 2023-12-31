package ss12_java_collection_framework.exercise.mvc.service.impl;

import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.repository.impl.ProductRepoImpl;
import ss12_java_collection_framework.exercise.mvc.service.IProductService;

import java.util.ArrayList;

public class ProductServiceImpl implements IProductService {

    private final ProductRepoImpl productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public ArrayList<Product> getProducts() {
        return productRepo.getProducts();
    }

    @Override
    public void editProduct(int id, Product product) {
        productRepo.editProduct(id, product);
    }

    @Override
    public void removeProduct(int id) {
        productRepo.removeProduct(id);
    }

    @Override
    public ArrayList<Product> searchProductByName(String name) {
        return productRepo.searchProductByName(name);
    }

    @Override
    public ArrayList<Product> sortByAscendingOrder() {
       return productRepo.sortByAscendingOrder();
    }

    @Override
    public ArrayList<Product> sortByDescendingOrder() {
        return productRepo.sortByDescendingOrder();
    }


}
