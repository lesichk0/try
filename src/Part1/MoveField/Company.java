package Part1.MoveField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> employeeSalaries;

    public Company(List<Employee> employees) {
        this.employees = employees;
        this.employeeSalaries = new HashMap<>();
    }
    public void setEmployeeSalary(Employee employee, double salary){
        employeeSalaries.put(employee, salary);
    }

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employeeSalaries.get(employee));
        }
    }
}

