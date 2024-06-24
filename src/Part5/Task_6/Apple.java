package Part5.Task_6;

public class Apple extends Fruit{
    //сорт
    private String variety;

    public Apple(String name, String color, String variety) {
        super(name, color);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }
}
