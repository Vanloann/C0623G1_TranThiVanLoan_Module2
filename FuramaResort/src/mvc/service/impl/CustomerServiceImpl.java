package mvc.service.impl;

import mvc.model.person.Customer;
import mvc.repository.ICustomerRepository;
import mvc.repository.IEmployeeRepository;
import mvc.repository.impl.CustomerRepositoryImpl;
import mvc.repository.impl.EmployeeRepositoryImpl;
import mvc.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public void edit(String id, Customer customer) {
        this.customerRepository.edit(id, customer);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return this.customerRepository.searchByName(name);
    }

    @Override
    public void add(Customer customer) {
        this.customerRepository.add(customer);
    }

    @Override
    public void delete(String id) {
        this.customerRepository.delete(id);
    }

    @Override
    public List<Customer> display() {
        return this.customerRepository.display();
    }
}
