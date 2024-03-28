package ksv;

import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int employeeNumber, String phoneNumber, String name, int experience) {
        employees.add(new Employee(employeeNumber, phoneNumber, name, experience));
    }

    public List<Employee> findByExperience(int experience) {
        List<Employee> matchingEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.experience() == experience) {
                matchingEmployees.add(employee);
            }
        }
        return matchingEmployees;
    }

    public String findPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.name().equals(name)) {
                return employee.phoneNumber();
            }
        }
        return null;
    }

    public Employee findByEmployeeNumber(int employeeNumber) {
        for (Employee employee : employees) {
            if (employee.employeeNumber() == employeeNumber) {
                return employee;
            }
        }
        return null;
    }
}
