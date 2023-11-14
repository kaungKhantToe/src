package Recursion;

import java.util.*;

public class Exercise18_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        char[] charsInString = s.toCharArray();
        System.out.print("Enter a character: ");
        char c = input.nextLine().trim().charAt(0);
        System.out.println(c + " appears " + charCount(charsInString, c) + " times");
        input.close();
    }

    public static int charCount(char[] chars, char ch) {
        return charCount(chars, ch, chars.length - 1);
    }

    public static int charCount(char[] charsInString, char c, int high) {
        if (high >= 0) {
            int temp = charCount(charsInString, c, high - 1);
            if (charsInString[high] == c){
                return temp + 1;
            } else
            return temp + 0;
        } else
            return 0;
    }

}