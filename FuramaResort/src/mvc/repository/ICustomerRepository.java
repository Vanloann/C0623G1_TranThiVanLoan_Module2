package mvc.repository;

import mvc.model.person.Customer;
import mvc.service.IService;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void  edit(String id, Customer customer);

    List<Customer> searchByName(String name);
}
