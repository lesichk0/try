package Part1.MoveMethod;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void processAccounts() {
        for (Account account : accounts) {
            calculateInterest(account);
        }
    }

    private void calculateInterest(Account account) {
        double interest = account.getBalance() * account.getInterestRate() / 100;
        System.out.println("Interest calculated: " + interest);
        // Логіка для обчислення відсотків...
    }

    public void processAccounts2() {
        accounts.forEach(account -> {
            double interest = account.getBalance() * account.getInterestRate() / 100;
            System.out.println("Interest calculated: " + interest);
            // Логіка для обчислення відсотків...
        });
    }
}
