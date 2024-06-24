package Part1.HideDelegate;

public class Employee {
    private String name;
    private Department department;

    // Конструктор та інші методи класу...

    public Department getDepartment() {
        return department;
    }

    // Новий метод, що делегує виклик методу getManager() класу Department
    public Employee getManager() {
        return department.getManager();
    }
}
