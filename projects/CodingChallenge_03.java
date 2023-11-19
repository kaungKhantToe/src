import java.util.*;

public class CodingChallenge_03 {

    public static void main(String[] args) {

        // * an array that holds the names of candidates
        String[] listOfCandidates = { "Alice", "Bob", "Charlie" };

        Scanner input = new Scanner(System.in);
        System.out.print("Number of voters: ");

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
                rankOneCandidates[i] = input.next().strip();

                System.out.print("Rank 2: ");
                rankTwoCandidates[i] = input.next().strip();

                System.out.print("Rank 3: ");
                rankThreeCandidates[i] = input.next().strip();

                System.out.println(); // *to format the output as depicted in the example
            }
            
        } catch (Exception e) {

        }

    }

    
}
