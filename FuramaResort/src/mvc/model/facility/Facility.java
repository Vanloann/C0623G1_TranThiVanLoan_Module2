package mvc.model.facility;

public abstract class Facility {
    private int id;
    private String name;
    private double area;
    private double price;
    private int capacity;
    private String rentalTime;

    // rentalTime (by year, month, day, hour)

    public Facility() {}

    public Facility(int id, String name, double area, double price,
                    int capacity, String rentalTime) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.capacity = capacity;
        this.rentalTime = rentalTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", capacity=" + capacity +
                ", rentalTime='" + rentalTime + '\'' +
                '}';
    }
}
