package ss12_java_collection_framework.exercise.mvc.repository.impl;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.repository.IProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductRepoImpl implements IProductRepo {
    ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void editProduct(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setProductName(product.getProductName());
                products.get(i).setId(product.getId());
                products.get(i).setPrice(product.getPrice());
                return;
            }
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return;
            }
        }
        System.out.println("Invalid ID");
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getProductName().equals(name)) {
                System.out.println(product);
            }
        }
        System.out.println("Invalid name");
    }

    @Override
    public void sortByAscendingOrder() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }
                return -1;
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void sortByDecreasingOrder() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }
                return -1;
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
    }



    @Override
    public void addProduct(Product product) {
        products.add(product);
    }






}
