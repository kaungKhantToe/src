package Recursion;

import java.util.*;

public class Exercise18_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("The sum of digits in " + number + " is " + sumDigits(number));
        input.close();
    }

    public static int sumDigits(long n) {
        int result = 0;
        if (n != 0)
            result = sumDigits(n / 10) + (int) (n % 10);
        return result;

    }
}
