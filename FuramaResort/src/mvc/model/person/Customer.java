package mvc.model.person;

public class Customer extends Person {
    private String customerClass;
    private String address;

    //customerClass (Diamond, Platinum, Gold, Silver, Member)

    public Customer() {}

    public Customer(String customerClass, String address) {
        this.customerClass = customerClass;
        this.address = address;
    }

    public Customer(String id, String name, String dayOfBirth, String gender, String citizenID,
                    String phoneNumber, String email, String customerClass, String address) {
        super(id, name, dayOfBirth, gender, citizenID, phoneNumber, email);
        this.customerClass = customerClass;
        this.address = address;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CUSTOMER's " + super.toString() +
                " | Customer class: " + customerClass +
                " | Address: " + address + "\n";
    }
}
