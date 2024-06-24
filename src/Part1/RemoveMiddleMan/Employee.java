package Part1.RemoveMiddleMan;

public class Employee {
    private String name;
    private Department department;

    // Конструктор та інші методи класу...

    public Department getDepartment(){
        return department;
    }

    public String getName() {
        return name;
    }
}