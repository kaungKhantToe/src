import java.io.Serializable;

public class SavingsAccount extends Bank {
    private int accountNumber;
    private double balance;

    public SavingsAccount(String bankName, String location, int accountNumber) {
        super(bankName, location);
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getters and setters for SavingsAccount
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
