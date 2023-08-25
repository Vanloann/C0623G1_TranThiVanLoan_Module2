package mvc.model;

public class Contract {
    private int numberOfContract;
    private int bookingId;
    private double deposit;
    private double total;

    public Contract(int numberOfContract, int bookingId, double deposit, double total) {
        this.numberOfContract = numberOfContract;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.total = total;
    }

    public Contract() {}

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Contract {" +
                "numberOfContract=" + numberOfContract +
                ", bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", total=" + total +
                '}';
    }
}
