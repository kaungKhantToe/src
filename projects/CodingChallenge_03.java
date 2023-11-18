import java.util.*;

public class CodingChallenge_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of voters: ");
        // * an array that holds the names of candidates
        String[] listOfCandidates = { "Alice", "Bob", "Charlie" };
        try {
            int numberOfVoters = input.nextInt();
            // *
            ballot(numberOfVoters, listOfCandidates);

        } catch (Exception e) {
            System.out.print(e);
        }
        input.close();
    }

    private static void ballot(int numberOfVoters, String[] listOfCandidates) {
        // * creating separate arrays that will hold the names of each Candidates
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

                System.out.print("Rank 2: ");
                rankTwoCandidates[i] = input.next();

                System.out.print("Rank 3: ");
                rankThreeCandidates[i] = input.next();

                System.out.println(); // *to format the output as depicted in the example
            }
            /*
             * 
             */
            rankings(rankOneCandidates, listOfCandidates, 1);
            rankings(rankTwoCandidates, listOfCandidates, 2);
            rankings(rankThreeCandidates, listOfCandidates, 3);

        } catch (Exception e) {

        }

    }

    private static double rankings(String[] candidates, String[] listOfCandidates, int rank) {
        double favorForAlice = 0;
        double favorForBob = 0;
        double favorForCharlie = 0;
        for (int i = 0; i < 3; i++) {
            if (rank == 1) {
                if (candidates[i].equalsIgnoreCase(listOfCandidates[0])) {
                    favorForAlice += 1;
                } else if (candidates[i].equalsIgnoreCase(listOfCandidates[1])) {
                    favorForBob += 1;
                } else if (candidates[i].equalsIgnoreCase(listOfCandidates[2])) {
                    favorForCharlie += 1;
                }
            } else if (rank == 2) {
                if (candidates[i].equalsIgnoreCase(listOfCandidates[0])) {
                    favorForAlice += 0.5;
                } else if (candidates[i].equalsIgnoreCase(listOfCandidates[1])) {
                    favorForBob += 0.5;
                } else if (candidates[i].equalsIgnoreCase(listOfCandidates[2])) {
                    favorForCharlie += 0.5;
                }

            }

        }
        
        return favorForAlice;
    }
    // System.out.println(favorForBob);
    // System.err.println(favorForCharlie);

    /* 
        if (favorForAlice > favorForBob && favorForAlice > favorForCharlie) {
            System.out.print("Alice");
        } else if (favorForBob > favorForAlice && favorForBob > favorForCharlie) {
            System.out.print("Bob");
        }
        */

}
