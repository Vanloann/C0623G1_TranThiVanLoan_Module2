package ss12_java_collection_framework.exercise.mvc.model;

public class Product {
    private int id;
    private String productName;
    private float price;

    public Product() {}

    public Product(int id, String productName, float price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Product: " + this.productName + ", Price: " + this.price;
    }
}
