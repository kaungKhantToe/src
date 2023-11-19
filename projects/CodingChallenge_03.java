import java.io.*;
import java.util.*;

public class CodingChallenge_03 {

    public static void main(String[] args) {

        // * an array that holds the names of candidates
        String[] listOfCandidates = { "Alice", "Bob", "Charlie" };

        Scanner input = new Scanner(System.in);
        System.out.print("Number of voters: ");
        /*
         * send the number of voters and the array that contains
         * the names of the candidate to a method called "ballot"
        */
        try {
            int numberOfVoters = input.nextInt();
            ballot(numberOfVoters, listOfCandidates);
        } catch (InputMismatchException e) {
            System.out.print("Please enter a number of Integer value");
        } finally {
            input.close();
        }

    }

    private static void ballot(int numberOfVoters, String[] listOfCandidates) {
        // * creating separate arrays that will hold the names of each Candidates
        String[] rankOneCandidates = new String[numberOfVoters];
        String[] rankTwoCandidates = new String[numberOfVoters];
        String[] rankThreeCandidates = new String[numberOfVoters];
        
        // * initializing double variables to hold the points of each candidate 
        double favorForAlice = 0;
        double favorForBob = 0;
        double favorForCharlie = 0;

        Scanner input = new Scanner(System.in);

        try {
            /*
             * a for loop that accepts the ranks of each candidate and stores
             * them in their respective arrays based on the voter's preference
             */
            for (int i = 0; i < numberOfVoters; i++) {
                /*
                 * 
                 * 
                 */
                System.out.print("Rank 1: ");
                rankOneCandidates[i] = input.next().strip().toLowerCase();

                System.out.print("Rank 2: ");
                rankTwoCandidates[i] = input.next().strip().toLowerCase();

                System.out.print("Rank 3: ");
                rankThreeCandidates[i] = input.next().strip().toLowerCase();

                System.out.println(); // *to format the output as depicted in the example

            }

            favorForAlice = ranking(rankOneCandidates, "alice") + 0.5 * ranking(rankTwoCandidates, "alice")
                    + 0.5 * 0.5 * ranking(rankThreeCandidates, "Alice");

            favorForBob = ranking(rankOneCandidates, "bob") + 0.5 * ranking(rankTwoCandidates, "bob")
                    + 0.5 * 0.5 * ranking(rankThreeCandidates, "Bob");

            favorForCharlie = ranking(rankOneCandidates, "charlie") + 0.5 * ranking(rankTwoCandidates, "charlie")
                    + 0.5 * 0.5 * ranking(rankThreeCandidates, "charlie");

            if (Math.max(favorForAlice, Math.max(favorForBob, favorForCharlie)) == favorForAlice) {
                System.out.println("Alice");
            } else if (Math.max(favorForBob, Math.max(favorForAlice, favorForCharlie)) == favorForBob) {
                System.out.println("Bob");
            } else if (Math.max(favorForCharlie, Math.max(favorForAlice, favorForBob)) == favorForCharlie) {
                System.out.println("Charlie");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input.close();
        }

    }

    private static int ranking(String[] candidate, String name) {
        int ranks = 0;
        for (int i = 0; i < candidate.length; i++) {
            if (candidate[i].equalsIgnoreCase(name)) {
                ranks++;
            }
        }
        return ranks;
    }

}