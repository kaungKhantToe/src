package projects;

import java.util.Scanner;

public class CodingChallenge_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of voters: ");
        // * an array that holds the names of candidates
        String[] listOfCandidates = { "Alice", "Bob", "Charlie" };
        try {
            int numberOfVoters = input.nextInt();
            /*
             * a two dimensional array with the 3 possible ranks as
             * the rows and numberOfVoters of voters as the columns
             * the "3" here represents the three possible ranks (1,2,3)
             */
            int[][] tableOfVotersAndTheirPreferences = new int[3][numberOfVoters];
            /*
             * sending the number of voters, the array of candidate names and the
             * two dimensional array of ranks and voters to a method named "ballot"
             */
            ballot(numberOfVoters, listOfCandidates, tableOfVotersAndTheirPreferences);

        } catch (Exception e) {
            System.out.print(e);
        }
        input.close();
    }

    private static void ballot(int numberOfVoters, String[] listOfCandidates,
            int[][] tableOfVotersAndTheirPreferences) {
        // using the numbers of ballots from
        String[] rankOneCandidates = new String[numberOfVoters];
        String[] rankTwoCandidates = new String[numberOfVoters];
        String[] rankThreeCandidates = new String[numberOfVoters];

        try {
            Scanner input = new Scanner(System.in);
            /*
             * a for loop that accepts the ranks of each candidate and stores
             * them in their respective arrays based on the voter's preference
             */
            for (int i = 0; i < numberOfVoters; i++) {
                System.out.print("Rank 1: ");
                rankOneCandidates[i] = input.next();
                rankings(rankOneCandidates, listOfCandidates, tableOfVotersAndTheirPreferences);
                System.out.print("Rank 2: ");
                rankTwoCandidates[i] = input.next();
                rankings(rankTwoCandidates, listOfCandidates, tableOfVotersAndTheirPreferences);
                System.out.print("Rank 3: ");
                rankThreeCandidates[i] = input.next();
                rankings(rankThreeCandidates, listOfCandidates, tableOfVotersAndTheirPreferences);

                // if (rank)
            }
            System.out.println(); // *to format the output as depicted in the example

            // System.out.println(Arrays.toString(rankOneCandidates));
            // System.out.println(Arrays.toString(rankTwoCandidates));
            // System.out.println(Arrays.toString(rankThreeCandidates));
        } catch (Exception e) {

        }

    }

    private static int rankings(String[] candidates, String[] listOfCandidates,
            int[][] tableOfVotersAndTheirPreferences) {
        double favorForAlice = 0;
        double favorForBob = 0;
        double favorForCharlie = 0;
        /*
         * if (rank == 1) {
         * if (candidates[0].equalsIgnoreCase(listOfCandidates[0])) {
         * favorForAlice += 1;
         * } else if (candidates[1].equalsIgnoreCase(listOfCandidates[1])) {
         * favorForBob += 1;
         * } else if (candidates[2].equalsIgnoreCase(listOfCandidates[2]))
         * favorForCharlie += 1;
         * 
         * }
         */

        return 1;
        // return numberOfVoters;
    }
}