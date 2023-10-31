package projects;

import java.util.Scanner;

public class CodingChallenge_02 {
    public static void main(String[] args) {
        try {
            // taking user input
            Scanner input = new Scanner(System.in);
            System.out.print("Player 1: ");
            String choiceOfPlayerOne = input.next();
            System.out.print("Player 2: ");
            String choiceOfPlayerTwo = input.next();
            // sending to method
            scrabble(choiceOfPlayerOne);
            scrabble(choiceOfPlayerTwo);
            // print statements according to conditions 
            if (scrabble(choiceOfPlayerOne) > scrabble(choiceOfPlayerTwo)) {
                System.out.print("Player 1 wins!");
            } else if (scrabble(choiceOfPlayerOne) == scrabble(choiceOfPlayerTwo)) {
                System.out.print("Tie!");
            } else {
                System.out.print("Player 2 wins!");
            }
            input.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    private static int scrabble(String playerChoice) {
        int point = 0;
        playerChoice.toCharArray(); // converting String to char Array to check via for loop
        // the following loop will check every element in the array for certain
        // characters
        // If a character in a sentence is equal to these characters, will add
        // respective points to the score
        for (int i = 0; i < playerChoice.length(); i++) {
            if (playerChoice.charAt(i) == 'Q' || playerChoice.charAt(i) == 'q'
                    || playerChoice.charAt(i) == 'Z' || playerChoice.charAt(i) == 'z') {
                point += 10;
            } else if (playerChoice.charAt(i) == 'J' || playerChoice.charAt(i) == 'j'
                    || playerChoice.charAt(i) == 'X' || playerChoice.charAt(i) == 'x') {
                point += 8;
            } else if (playerChoice.charAt(i) == 'K' || playerChoice.charAt(i) == 'k') {
                point += 5;
            } else if (playerChoice.charAt(i) == 'F' || playerChoice.charAt(i) == 'f'
                    || playerChoice.charAt(i) == 'H' || playerChoice.charAt(i) == 'h'
                    || playerChoice.charAt(i) == 'V' || playerChoice.charAt(i) == 'v'
                    || playerChoice.charAt(i) == 'W' || playerChoice.charAt(i) == 'w'
                    || playerChoice.charAt(i) == 'Y' || playerChoice.charAt(i) == 'y') {
                point += 4;
            } else if (playerChoice.charAt(i) == 'B' || playerChoice.charAt(i) == 'b'
                    || playerChoice.charAt(i) == 'C' || playerChoice.charAt(i) == 'c'
                    || playerChoice.charAt(i) == 'M' || playerChoice.charAt(i) == 'm'
                    || playerChoice.charAt(i) == 'P' || playerChoice.charAt(i) == 'p') {
                point += 3;
            } else if (playerChoice.charAt(i) == 'D' || playerChoice.charAt(i) == 'd'
                    || playerChoice.charAt(i) == 'G' || playerChoice.charAt(i) == 'g') {
                point += 2;
            } else {
                point += 1;
            }
        }
        return point;
    }
}
