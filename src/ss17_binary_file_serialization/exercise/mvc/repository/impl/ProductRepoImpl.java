package ss17_binary_file_serialization.exercise.mvc.repository.impl;

import ss17_binary_file_serialization.exercise.mvc.UtilsFile;
import ss17_binary_file_serialization.exercise.mvc.model.Product;
import ss17_binary_file_serialization.exercise.mvc.repository.IProductRepo;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoImpl implements IProductRepo {
    private final String data = "D:\\C0623G1_LoanTTV_Module2\\untitled\\src\\ss17_binary_file_serialization\\exercise\\product.txt";

    @Override
    public void addProduct(Product product) {
        List<Product> productList = this.displayProduct();
        productList.add(product);
        UtilsFile.writeFile(data, productList);
    }

    @Override
    public List<Product> displayProduct() {
        List<Product> productList = UtilsFile.readFile(data);
        return productList;
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = this.displayProduct();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().startsWith(name)) {
                result.add(product);
            }
        }
        return result;
    }
}
