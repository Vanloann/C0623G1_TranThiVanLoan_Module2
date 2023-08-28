package mvc.service;

import mvc.model.person.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer> {
    void  edit();

    List<Customer> searchByName();

}
