package mvc.service;

import mvc.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee> {
    void edit();

    List<Employee> searchByName();
}
