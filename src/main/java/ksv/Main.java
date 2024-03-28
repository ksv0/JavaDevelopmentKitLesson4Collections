package ksv;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(1, "1234567890", "Oleg", 5);
        directory.addEmployee(2, "0987654321", "Kiril", 3);
        directory.addEmployee(3, "111222333", "Roman", 7);

        List<Employee> experiencedEmployees = directory.findByExperience(5);
        System.out.println("Experienced Employees:");
        for (Employee employee : experiencedEmployees) {
            System.out.println(employee.name());
        }

        String phoneNumber = directory.findPhoneNumberByName("Roman");
        System.out.println("Roman Phone Number: " + phoneNumber);

        Employee employee = directory.findByEmployeeNumber(3);
        if (employee != null) {
            System.out.println("Employee with Employee Number 3: " + employee.name());
        } else {
            System.out.println("Employee with Employee Number 3 not found.");
        }
    }
}