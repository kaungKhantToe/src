package KaungToe_Lab1;

public class BankAccount {
    private double balance;
    private int numberOfDeposits = 0;
    private int numberOfWithdrawals = 0;
    private double annualInterestRate;
    //empty constructor
    public BankAccount() {

    }
    //constructor
    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    // says deposit but can perform both deposit and withdrawal
    public void Deposit(double deposit) {
        if (deposit > 0) { // deposit
            balance = deposit + balance;
            numberOfDeposits++;
            System.out.println("Your New Balance is " + getBalance() + "\n");
        } else { // withdrawal
            balance += deposit;
            numberOfWithdrawals++;
            int numberOfWithdrawals = getNumberOfWithdrawals();
            if (numberOfWithdrawals > 4){
                int fees = (int)(getBalance()); //cast double to int
                setBalance(fees-1);
                System.out.println("Your new balance is: " + getBalance() + "\n");
            }else
            System.out.println("Your new balance is: " + getBalance()+ "\n");
            
           
        }
    }
    //calculating interest
    public double CalcInterest() {
        double monthlyInterest = (getBalance() * getAnnualInterestRate()) / 12;
        double newBalance = getBalance();
        return newBalance += monthlyInterest;
    }

    public void MonthlyProcess() {
        CalcInterest();
    }
    //getters and setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public void setNumberOfDeposits(int numberOfDeposits) {
        this.numberOfDeposits = numberOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void setNumberOfWithdrawals(int numberOfWithdrawals) {
        this.numberOfWithdrawals = numberOfWithdrawals;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return "BankAccount [getBalance()=" + getBalance() + ", getNumberOfDeposits()=" + getNumberOfDeposits()
                + ", getNumberOfWithdrawals()=" + getNumberOfWithdrawals() + ", getAnnualInterestRate()="
                + getAnnualInterestRate() + "]";
    }

}