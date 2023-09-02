package mvc.model.facility;

public abstract class Facility {
    private String id;
    private String service;
    private double area;
    private double rental;
    private int capacity;
    private String rentPeriod;

    // rentPeriod (by year, month, day, hour)

    public Facility() {}

    public Facility(String id, String service, double area, double rental,
                    int capacity, String rentPeriod) {
        this.id = id;
        this.service = service;
        this.area = area;
        this.rental = rental;
        this.capacity = capacity;
        this.rentPeriod = rentPeriod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentPeriod() {
        return rentPeriod;
    }

    public void setRentPeriod(String rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    @Override
    public String toString() {
        return " Id: " + id +
                " | Name: " + service +
                " | Area: " + area +
                " | Rental: " + rental +
                " | Capacity: " + capacity +
                " | Rent Period: " + rentPeriod;
    }
}
