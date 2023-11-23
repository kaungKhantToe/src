import java.util.InputMismatchException;
import java.util.Scanner;

public class CodingChallenge_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // * Ask user for the key
        System.out.print("The Key: ");

        try {
            int key = scanner.nextInt();

            /*
             * 1. To consume newline character
             * 2. If we don't do this, call will not wait for the
             * next user input (aka. the String to be encrypted)
             */
            scanner.nextLine();

            // *Get the plaintext from the user
            System.out.print("plaintext: ");
            String plainText = scanner.nextLine();

            /*
             * 1. Will send the key and the user input to a method, which
             * will return a string to be printed out as the result
             */
            String cipherText = encrypt(plainText, key);
            System.out.println("ciphertext: " + cipherText);

        }

        /*
         * 1. This catch block is to catch errors when the user
         * enters either a double value or String value
         */
        catch (InputMismatchException e) {
            System.out.print("Please run the program again and enter a key (integer)");
        }

        // * Close the input regardless
        finally {
            scanner.close();
        }
    }

    // * Methods that encrypts the plaintext using Caesar's cipher
    private static String encrypt(String plaintext, int key) {

        /*
         * 1. Creating a StringBuilder class (StringBuilder is mutable, hence
         * in this situation it's better to use StringBuilder than String)
         */
        StringBuilder cipherText = new StringBuilder();

        /*
         * 1. A for loop that will scan every character in the userInput
         * (Determining if the character is an Uppercase, a lowercase or neither)
         */
        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            /*
             * 1. Check if the character is an uppercase letter
             * 2. The "Character" wrapper class here serves to check,using Caesar's cipher,
             * if the character at that point in the loop is an uppercase character
             * 3. If the character is uppercase, add the character to the end of the
             * contents of the StringBuilder Class (Function of "append" method)
             */
            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'A') % 26 + 'A');
                cipherText.append(encryptedChar);
            }

            /*
             * 1. Check if the character is a lowercase letter
             * 2. The "Character" wrapper class here serves to check,using Caesar's cipher,
             * if the character at that point in the loop is a lowercase character
             * 3. If the character is lowercase, add the character to the end of the
             * contents of the StringBuilder Class (Function of "append" method)
             */
            else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'a') % 26 + 'a');
                cipherText.append(encryptedChar);
            }

            /*
             * If the character is not a letter (space,comma,etc.), leave it unchanged
             */
            else {
                cipherText.append(currentChar);
            }
        }

        // * Convert the StringBuilder wrapper class to String and return
        return cipherText.toString();
    }
}