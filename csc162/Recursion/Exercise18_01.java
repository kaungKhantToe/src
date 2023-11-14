package Recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise18_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer of any size: ");
        String numString = sc.nextLine();

        BigInteger bInteger = new BigInteger(numString); // converts String to BigInteger object

        System.out.print("Factorial of " + bInteger + " is " + factorial(bInteger)); // entry = 25 
        sc.close();
    }

    private static BigInteger factorial(BigInteger bInteger) {
        if (bInteger.equals(BigInteger.ZERO)) { // checking if bInteger (aka numString) is 0
            return BigInteger.ONE; 
        } else
            return bInteger.multiply(factorial(bInteger.subtract(BigInteger.ONE))); // 25(25-1)(24-1)..(1-1)
            // can't use "*" and "-" cause they're objects 
            // keep doing recursion till bInteger is 0

    }
}