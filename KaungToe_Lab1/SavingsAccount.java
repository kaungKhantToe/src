package KaungToe_Lab1;

public class SavingsAccount extends BankAccount {
    private boolean isActive;
    //checking account status
    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        if (getBalance() <= 25) {
            isActive = false;
        } else {
            isActive = true;
        }
    }
    //withdrawal
    public void Withdraw(double withdrawal, double balance) {
       
        if (withdrawal > getBalance()) {
            System.out.println("Insufficient Funds \n");
        }
        super.Deposit(withdrawal);

        if (getNumberOfWithdrawals() > 4) {
            setBalance(getNumberOfDeposits()-1);
        }

    }
    // deposit
    public void Deposit(double deposit) {
        super.Deposit(deposit);

        if (isActive == false && getBalance() >= 25) {
            isActive = true;
        }
    }
    //monthly process
    public void MonthlyProcess() {
        super.CalcInterest();
        super.setBalance(0);
        super.setNumberOfWithdrawals(0);
        System.out.println("Monthly Process :" + getBalance());
    }
    //getters and setters
    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String toString() {
        return "BankAccount [getBalance()=" + getBalance() + ", getNumberOfDeposits()=" + getNumberOfDeposits()
                + ", getNumberOfWithdrawals()=" + getNumberOfWithdrawals() + ", getAnnualInterestRate()="
                + getAnnualInterestRate() + "]";
    }

}
