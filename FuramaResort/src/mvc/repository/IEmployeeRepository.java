package mvc.repository;

import mvc.model.person.Employee;
import mvc.service.IService;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee> {

    void edit(String id, Employee employee);

    List<Employee> searchByName(String name);
}
