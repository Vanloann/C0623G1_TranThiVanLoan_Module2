package ss12_java_collection_framework.exercise.mvc.service.impl;

import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.repository.impl.ProductRepoImpl;
import ss12_java_collection_framework.exercise.mvc.service.IProductService;

import java.util.ArrayList;

public class ProductServiceImpl implements IProductService {

    ProductRepoImpl productRepo = new ProductRepoImpl();

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
    public void findProductByName(String name) {
        productRepo.searchProductByName(name);
    }

    @Override
    public void sortByAscendingOrder() {
        productRepo.sortByAscendingOrder();
    }

    @Override
    public void sortByDecreasingOrder() {
        productRepo.sortByDecreasingOrder();
    }

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }
}
