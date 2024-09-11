package KaungToe_Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {

        double balance = 0;
        double annualInterestRate, deposit;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Interest rate :%");
            annualInterestRate = sc.nextDouble() / 100;

            SavingsAccount s = new SavingsAccount(balance, annualInterestRate);
            title();
            System.out.print("User Choice: ");
            int userInput1 = sc.nextInt();
            int count = 0;
            while (userInput1 < 5 && userInput1 > 0) {
                if (count > 0) {
                    System.out.print("User Choice: ");
                    userInput1 = sc.nextInt();
                }
                if (userInput1 == 1) { // Deposit
                    System.out.print("Enter Amount to Deposit: ");
                    deposit = sc.nextDouble();
                    if (deposit > 0) {
                        s.Deposit(deposit);
                    }
                } else if (userInput1 == 2) { // Withdraw
                    System.out.print("Enter Amount to Withdraw: ");
                    deposit = sc.nextDouble();
                    if (deposit > 0) {
                        s.Deposit(0 - deposit);
                    }
                    if (deposit < 0) {
                        System.out.println("Enter Positive number: ");
                    }
                    ;
                    // couldn't get this to work
                } else if (userInput1 == 3) {
                    //SavingsAccount.CalcInterest();

                } else if (userInput1 == 4) {
                    System.err.println("Good Bye");
                    break;
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }

    // method for choices
    private static void title() {
        System.out.println("1 to Deposit");
        System.out.println("2 to Withdraw");
        System.out.println("3 to Monthly Process");
        System.out.println("4 to exit");
    }
}
