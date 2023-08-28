package mvc.controller;

import mvc.model.person.Employee;
import mvc.service.IEmployeeService;
import mvc.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> display() {
        return this.employeeService.display();
    }

    public void add(Employee employee) {
        this.employeeService.add(employee);
    }

    public void edit(String id, Employee employee) {
        this.employeeService.edit(id, employee);
    }

    public void delete(String id) {
        this.employeeService.delete(id);
    }

    public List<Employee> searchByName(String name) {
        return this.employeeService.searchByName(name);
    }
}
