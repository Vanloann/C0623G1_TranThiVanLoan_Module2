package mvc.model;

public class Booking {
    private int id;
    private String bookingDate;
    private String dayOfBeginning;
    private String dayOfEnding;
    private int customerId;
    private int serviceId;

    public Booking() {
    }

    public Booking(int id, String bookingDate, String dayOfBeginning,
                   String dayOfEnding, int customerId, int serviceId) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.dayOfBeginning = dayOfBeginning;
        this.dayOfEnding = dayOfEnding;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getDayOfBeginning() {
        return dayOfBeginning;
    }

    public void setDayOfBeginning(String dayOfBeginning) {
        this.dayOfBeginning = dayOfBeginning;
    }

    public String getDayOfEnding() {
        return dayOfEnding;
    }

    public void setDayOfEnding(String dayOfEnding) {
        this.dayOfEnding = dayOfEnding;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", bookingDate='" + bookingDate + '\'' +
                ", dayOfBeginning='" + dayOfBeginning + '\'' +
                ", dayOfEnding='" + dayOfEnding + '\'' +
                ", customerId=" + customerId +
                ", serviceId=" + serviceId +
                '}';
    }
}
