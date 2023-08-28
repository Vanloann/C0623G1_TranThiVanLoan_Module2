package mvc.model.person;

import mvc.model.person.Person;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    //typeOfCustomer (Diamond, Platinum, Gold, Silver, Member)

    public Customer() {}

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dayOfBirth, String gender, int citizenID,
                    int phoneNumber, String email, String typeOfCustomer, String address) {
        super(id, name, dayOfBirth, gender, citizenID, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer {" + super.toString() +
                "TypeOfCustomer: '" + typeOfCustomer + '\'' +
                ", Address: '" + address + '\'' +
                '}';
    }
}
