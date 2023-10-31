public class CheckingAccount extends Bank {
    private int accountNumber;
    private double balance;

    public CheckingAccount(String bankName, String location, int accountNumber) {
        super(bankName, location);
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    
    // Getters and setters for CheckingAccount
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
