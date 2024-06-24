package Part4.Task_4;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void applyCommission(){
        double commissionRate = 0.05;
        double commission = balance * commissionRate;
        balance -= commission;
    }
}
