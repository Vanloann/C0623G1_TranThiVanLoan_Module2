package mvc.controller;

import mvc.model.person.Customer;
import mvc.service.ICustomerService;
import mvc.service.IEmployeeService;
import mvc.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceImpl();

    public void add(Customer customer) {
        this.customerService.add(customer);
    }

    public List<Customer> display() {
        return this.customerService.display();
    }

    public void edit(String id, Customer customer) {
        this.customerService.edit(id, customer);
    }

    public void delete(String id) {
        this.customerService.delete(id);
    }

    public List<Customer> searchByName(String name) {
        return this.customerService.searchByName(name);
    }
}
