package ss17_binary_file_serialization.exercise.mvc.service.impl;

import ss17_binary_file_serialization.exercise.mvc.model.Product;
import ss17_binary_file_serialization.exercise.mvc.repository.IProductRepo;
import ss17_binary_file_serialization.exercise.mvc.repository.impl.ProductRepoImpl;
import ss17_binary_file_serialization.exercise.mvc.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    private final IProductRepo productRepo = new ProductRepoImpl();

    @Override
    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }

    @Override
    public List<Product> displayProduct() {
        return productRepo.displayProduct();
    }

    @Override
    public List<Product> searchProduct(String name) {
        return productRepo.searchProduct(name);
    }
}
