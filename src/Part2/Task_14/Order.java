package Part2.Task_14;

public class Order {
    private OrderStatus status;

    public Order() {
        this.status = new NewOrderStatus();
    }

    public void processOrder() {
        status.processOrder(this);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    // Інші методи класу...
}
