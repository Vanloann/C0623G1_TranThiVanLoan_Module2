package ss12_java_collection_framework.exercise.mvc.repository.impl;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import ss12_java_collection_framework.exercise.mvc.model.Product;
import ss12_java_collection_framework.exercise.mvc.repository.IProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductRepoImpl implements IProductRepo {
    private final ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
         products.add(product);
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

    public ArrayList<Product> searchProductByName(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getProductName().equals(name)) {
                result.add(product);
            }
        }
//        System.out.println("Invalid name");
        return result;
    }

    @Override
    public ArrayList<Product> sortByAscendingOrder() {
        ArrayList<Product> ascendingOrder = new ArrayList<>();

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() < o2.getPrice() ? -1 : 1;
            }
        });
        for (Product product : products) {
            ascendingOrder.add(product);
        }
        return ascendingOrder;
    }

    @Override
    public ArrayList<Product> sortByDescendingOrder() {
        ArrayList<Product> decendingOrder = new ArrayList<>();

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() > o2.getPrice() ? -1 : 1;
            }
        });
        for (Product product : products) {
            decendingOrder.add(product);
        }
        return decendingOrder;
    }





}
