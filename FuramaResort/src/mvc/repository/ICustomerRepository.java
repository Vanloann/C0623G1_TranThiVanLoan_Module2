package mvc.repository;

import mvc.model.person.Customer;
import mvc.service.IService;

import java.util.List;

public interface ICustomerRepository extends IRepository<Customer> {
    void  edit();

    List<Customer> searchByName();
}
