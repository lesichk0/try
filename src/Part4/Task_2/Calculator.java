package Part4.Task_2;

public class Calculator {
    public double calculateTotal(double price, int quantity, double taxRate) {
        double subtotal = price * quantity;
        double taxAmount = subtotal * taxRate / 100;
        return subtotal + taxAmount;
    }
}
