package Part2.Task_6;

public class OrderManager {
    private Order order;

    public OrderManager(Order order){
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    // Конструктор, геттери і сеттери, інші методи класу...
}