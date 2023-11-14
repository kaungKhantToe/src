package Recursion;

import java.util.Scanner;

public class Exercise18_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int dec = input.nextInt();
        System.out.print(dec + " decimal is binary "+ dec2Bin(dec));
    }

    public static String dec2Bin(int dec) {
        if (dec == 0) {
            return "";
        } else
            return dec2Bin(dec / 2) + dec % 2;
        /*
         * if entry is 6
         * 12/2 = 6 (0)
         * 6/2 = 3 (0)
         * 3/2 = 1 (1)
         * 6 = 100
         */

    }
}
