package Part1.ExtractClass;

public class EmployeePrinter {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName() +
                "\nDepartment: " + employee.getDepartment() +
                "\nSalary: " + employee.getSalary());
    }
}
