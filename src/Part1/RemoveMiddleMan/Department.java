package Part1.RemoveMiddleMan;

public class Department {
    private String name;
    private Employee manager;

    // Конструктор та інші методи класу...
    public String getManagerName() {
        return manager.getName();
    }

    public Employee getManager(){
        return manager;
    }
}
