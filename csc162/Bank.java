public class Bank {
    private String bankName;
    private String location;
    private double totalBalance;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
        this.totalBalance = 0.0;
    }

    // Getters and setters for Bank
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String newBankName) {
        this.bankName = newBankName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    // Original deposit method
    
    public void deposit(double amount) {
        totalBalance += amount;
    }

    // Method overload: deposit with an additional description
    public void deposit(double amount, String description) {
        totalBalance += amount;
        System.out.println(description);
    }

    // Original withdraw method
    
    public void withdraw(double amount) {
        if (totalBalance >= amount) {
            totalBalance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method overload: withdraw with an additional description
    public void withdraw(double amount, String description) {
        if (totalBalance >= amount) {
            totalBalance -= amount;
            System.out.println(description);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Bank from, Bank to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public void printStatement(Bank bank) {
        System.out.println("Bank Name: " + bank.getBankName());
        System.out.println("Location: " + bank.getLocation());
        System.out.println("Total Balance: " + bank.getTotalBalance());
    }

    @Override
    public String toString() {
        return "Bank [bankName=" + bankName + ", location=" + location + ",totalBalance=" + totalBalance + "]";
    }
}