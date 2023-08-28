package mvc.repository.impl;

import mvc.model.person.Employee;
import mvc.repository.IEmployeeRepository;
import mvc.utilities.UtilsFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
//    private final List<Employee> employees = new ArrayList<>();

    private final String EMPLOYEE_FILEPATH = "D:\\C0623G1_LoanTTV_Module2\\FuramaResort\\src\\mvc\\data\\employee.csv";

    private final String COMMA = ",";

    @Override
    public List<Employee> display() {
        List<String> strings = UtilsFile.readFile(EMPLOYEE_FILEPATH);
        return this.convert(strings);
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = this.display();
        employeeList.add(employee);
        UtilsFile.writeFile(EMPLOYEE_FILEPATH, this.convertToString(employeeList));
    }

    @Override
    public void edit(String id, Employee employee) {
        List<Employee> employees = this.display();
        for (Employee data : employees) {
            if (data.getId().contains(id)) {
                data.setId(employee.getId());
                data.setName(employee.getName());
                data.setDayOfBirth(employee.getDayOfBirth());
                data.setGender(employee.getGender());
                data.setCitizenID(employee.getCitizenID());
                data.setPhoneNumber(employee.getPhoneNumber());
                data.setEmail(employee.getEmail());
                data.setEducationLevel(employee.getEducationLevel());
                data.setPosition(employee.getPosition());
                data.setSalary(employee.getSalary());
                return;
            }
        }
        UtilsFile.writeFile(EMPLOYEE_FILEPATH, this.convertToString(employees));
    }

    @Override
    public void delete(String id) {
        List<Employee> employees = this.display();
        for (Employee employee : employees) {
            if (employee.getId().contains(id)) {
                employees.remove(employee);
                return;
            }
        }
        UtilsFile.writeFile(EMPLOYEE_FILEPATH, this.convertToString(employees));
    }

    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> employees = this.display();
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public List<Employee> convert(List<String> strings) {
        List<Employee> employeeList = new ArrayList<>();
        for (String employee : strings) {
            String[] data = employee.split(COMMA);
            employeeList.add(new Employee(
                    data[0],
                    data[1],
                    data[2],
                    data[3],
                    data[4],
                    data[5],
                    data[6],
                    data[7],
                    data[8],
                    data[9]));
        }
        return employeeList;
    }

    @Override
    public List<String> convertToString(List<Employee> employees) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employees) {
            strings.add(employee.getId() + COMMA +
                    employee.getName() + COMMA +
                    employee.getDayOfBirth() + COMMA +
                    employee.getGender() + COMMA +
                    employee.getCitizenID() + COMMA +
                    employee.getPhoneNumber() + COMMA +
                    employee.getEmail() + COMMA +
                    employee.getEducationLevel() + COMMA +
                    employee.getPosition() + COMMA +
                    employee.getSalary());
        }
        return strings;
    }


}
