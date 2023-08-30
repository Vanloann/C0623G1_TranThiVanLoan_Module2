package mvc.service;

import mvc.model.person.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    void  edit(String id, Customer customer);

    List<Customer> searchByName(String name);

}
