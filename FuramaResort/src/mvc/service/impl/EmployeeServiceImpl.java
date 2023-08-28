package mvc.service.impl;

import mvc.model.person.Employee;
import mvc.repository.IEmployeeRepository;
import mvc.repository.impl.EmployeeRepositoryImpl;
import mvc.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> display() {
        return this.employeeRepository.display();
    }

    @Override
    public void add(Employee employee) {
        this.employeeRepository.add(employee);
    }
    @Override
    public void edit(String id, Employee employee) {
        this.employeeRepository.edit(id, employee);
    }

    @Override
    public void delete(String id) {
        this.employeeRepository.delete(id);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return this.employeeRepository.searchByName(name);
    }
}
