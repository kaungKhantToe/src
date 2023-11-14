package Recursion;
import java.util.*;

public class Exercise18_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("The GCD of 3 and 7 is " + gcd(firstNumber,secondNumber));
        input.close();
    }

    private static int gcd(int firstNumber, int secondNumber) {
        if( firstNumber%secondNumber == 0) {
            return secondNumber;
        }else
        return gcd(secondNumber, firstNumber%secondNumber);
    }
}