import java.io.*;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        // Create an array of Bank objects
        Bank[] banks = new Bank[2];
        Scanner input = new Scanner(System.in);
        System.out.print("how many");
        int bankArrayNumber = input.nextInt();
        for (int i = 0; i < bankArrayNumber; i++){
            String BankA = input.next();
            int accountNumber = input.nextInt();
            String Location = input.next();
            banks[i]= new CheckingAccount(BankA, Location, accountNumber);
        }
        
        //banks[0] = new CheckingAccount("BankA", "LocationA", 1234);
        //banks[1] = new SavingsAccount("BankB", "LocationB", 5678);
        // Deposit and withdraw from accounts
        banks[0].deposit(1000);
        banks[1].deposit(1500);
        banks[0].withdraw(500);
        banks[1].withdraw(300);
        // Transfer between accounts
    }
}
