package mvc.repository.impl;

import mvc.model.person.Customer;
import mvc.model.person.Employee;
import mvc.repository.ICustomerRepository;
import mvc.utilities.UtilsFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {

    private final String CUSTOMER_FILEPATH = "D:\\C0623G1_LoanTTV_Module2\\FuramaResort\\src\\mvc\\data\\customer.csv";

    private final String COMMA = ",";

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = this.display();
        customerList.add(customer);
        UtilsFile.writeFile(CUSTOMER_FILEPATH, this.convertToString(customerList));
    }

    @Override
    public void delete(String id) {
        List<Customer> customers = this.display();
        for (Customer customer : customers) {
            if (customer.getId().contains(id)) {
                customers.remove(customer);
                return;
            }
        }
        UtilsFile.writeFile(CUSTOMER_FILEPATH, this.convertToString(customers));
    }

    @Override
    public List<Customer> display() {
        List<String> strings = UtilsFile.readFile(CUSTOMER_FILEPATH);
        return this.convert(strings);
    }

    @Override
    public void edit(String id, Customer customer) {
        List<Customer> customers = this.display();
        for (Customer data : customers) {
            if (data.getId().contains(id)) {
                data.setId(customer.getId());
                data.setName(customer.getName());
                data.setDayOfBirth(customer.getDayOfBirth());
                data.setGender(customer.getGender());
                data.setCitizenID(customer.getCitizenID());
                data.setPhoneNumber(customer.getPhoneNumber());
                data.setEmail(customer.getEmail());
                data.setTypeOfCustomer(customer.getTypeOfCustomer());
                data.setAddress(customer.getAddress());
                return;
            }
        }
        UtilsFile.writeFile(CUSTOMER_FILEPATH, this.convertToString(customers));
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customers = this.display();
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                customerList.add(customer);
            }
        }
        return customerList;
    }

    @Override
    public List<Customer> convert(List<String> strings) {
        List<Customer> customerList = new ArrayList<>();
        for (String customer : strings) {
            String[] data = customer.split(COMMA);
            customerList.add(new Customer(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8]));
        }
        return customerList;
    }

    @Override
    public List<String> convertToString(List<Customer> customers) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customers) {
            strings.add(customer.getId() + COMMA +
                    customer.getName() + COMMA +
                    customer.getDayOfBirth() + COMMA +
                    customer.getGender() + COMMA +
                    customer.getCitizenID() + COMMA +
                    customer.getPhoneNumber() + COMMA +
                    customer.getEmail() + COMMA +
                    customer.getTypeOfCustomer() + COMMA +
                    customer.getAddress());
        }
        return strings;
    }
}
