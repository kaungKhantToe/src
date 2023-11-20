import java.util.*;

/*
 * Custom Exception class that returns a message if the number of voters is zero
 */
class CustomException extends Exception {
    public CustomException(String errorMessage) {
        super(errorMessage);
    }

}

public class CodingChallenge_03 {

    public static void main(String[] args) {

        // * an array that holds the names of candidates.
        String[] listOfCandidates = { "Alice", "Bob", "Charlie" };

        Scanner input = new Scanner(System.in);
        System.out.print("Number of voters: ");
        /*
         * send the number of voters and the array that contains
         * the names of the candidate to a method called "ballot".
         */
        try {
            int numberOfVoters = input.nextInt();
            /*
             * If number of voters was zero, there would not
             * be any votes (will throw to custom Exception)
             */
            if (numberOfVoters >= 1) {
                ballot(numberOfVoters, listOfCandidates);
            } else
                throw new CustomException("Zero Voters. Ending Program...");
        }
        /*
         * This catch block is to catch errors when the user
         * enters either a double value or a string
         */
        catch (InputMismatchException e) {
            System.out.print("Please enter a number of Integer value");
        }
        // * The catch block for the custom Exception
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        // * will close the input regardless if there's an error or not
        finally {
            input.close();
        }

    }

    private static void ballot(int numberOfVoters, String[] listOfCandidates) {
        // * creating separate arrays that will hold the names of each Candidates.
        String[] rankOneCandidates = new String[numberOfVoters];
        String[] rankTwoCandidates = new String[numberOfVoters];
        String[] rankThreeCandidates = new String[numberOfVoters];

        /*
         * initializing double variables to hold the points of each
         * candidate (usage will be elaborated later in the program).
         */
        double favorForAlice = 0;
        double favorForBob = 0;
        double favorForCharlie = 0;

        Scanner input = new Scanner(System.in);

        try {
            /*
             * a for loop that accepts the ranks of each candidate and stores
             * them in their respective arrays based on the voter's preference.
             */
            for (int i = 0; i < numberOfVoters; i++) {
                /*
                 * will strip and convert any user input to lowercase to avoid errors
                 */
                System.out.print("Rank 1: ");

                rankOneCandidates[i] = input.next().strip().toLowerCase();

                System.out.print("Rank 2: ");
                rankTwoCandidates[i] = input.next().strip().toLowerCase();

                System.out.print("Rank 3: ");
                rankThreeCandidates[i] = input.next().strip().toLowerCase();

                System.out.println(); // *to format the output as depicted in the example

            }
            verifyCandidateNames(rankOneCandidates);
            verifyCandidateNames(rankTwoCandidates);
            verifyCandidateNames(rankThreeCandidates);
            /*
             * 1- The reason why I created the double variables earlier is to store the
             * value of each candidate after being sent to the method name as "rankings".
             * 2- Will take the String array of the candidates in each
             * rank (one at a time) and the names of the candidates.
             * 3- The double values returned from each call of the "ranking" method
             * will be adjusted based on their ranks in the votes and added together.
             * Example- If "alice" is found twice in the rankOneCandidate array, will return
             * 2.
             * If "alice" is found once in the rankTwoCandidate array, will return 1 and
             * multiplied by 0.5.
             * adding them all together, the total favor for alice will be 2.5.
             */
            favorForAlice = rankings(rankOneCandidates, "alice") + 0.5 * rankings(rankTwoCandidates, "alice")
                    + 0.25 * rankings(rankThreeCandidates, "alice");

            favorForBob = rankings(rankOneCandidates, "bob") + 0.5 * rankings(rankTwoCandidates, "bob")
                    + 0.25 * rankings(rankThreeCandidates, "bob");

            favorForCharlie = rankings(rankOneCandidates, "charlie") + 0.5 * rankings(rankTwoCandidates, "charlie")
                    + 0.25 * rankings(rankThreeCandidates, "charlie");

            /*
             * 1- First compare and take the larger double value two of the three
             * candidates and then compare the result to the remaining candidate.
             * 2- Print out the name of the Candidate when the max value from all three
             * of the candidates is equal to the value of the favor for that candidate.
             * Example- If the value doing all the comparisons (max) is 2.5
             * and the favorForAlice is also 2.5, Alice will be the winner.
             */
            if (Math.max(favorForAlice, Math.max(favorForBob, favorForCharlie)) == favorForAlice) {
                System.out.println("Alice");
            } else if (Math.max(favorForBob, Math.max(favorForAlice, favorForCharlie)) == favorForBob) {
                System.out.println("Bob");
            } else if (Math.max(favorForCharlie, Math.max(favorForAlice, favorForBob)) == favorForCharlie) {
                System.out.println("Charlie");
            }

        }
        // * a catch block that catches input Mismatch errors
        catch (InputMismatchException e) {
            System.out.print("Please enter the names of the candidates in their respective rankings");
            System.exit(0);
        }
        // * Will close the input regardless
        finally {
            input.close();
        }
    }
    /*
     * A method that checks whether the candidate names that
     * the user entered are one of the three candidates or not
     */
    private static void verifyCandidateNames(String[] candidate) {
        try {
            for (int i = 0; i < candidate.length; i++) {
                if (candidate[i].equalsIgnoreCase("alice") == false ||
                        candidate[i].equalsIgnoreCase("bob") == false ||
                        candidate[i].equalsIgnoreCase("charlie") == false) {
                    throw new CustomException("Invalid Candidate name detected. Ending Program...");
                }
            }
        }
        // * A catch block for the custom Exception
        catch (CustomException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    /*
     * 1- Compare the candidate's name and each element of the array.
     * 2- If there is a match will return add "1" to "ranks" variable.
     * 3- The value of this variable holds a double value that will be
     * returned back to line (68 - 75) depending on where it was invoked.
     */
    private static int rankings(String[] candidate, String name) {
        int ranks = 0;
        for (int i = 0; i < candidate.length; i++) {
            if (candidate[i].equals(name)) {
                ranks++;
            }
        }
        return ranks;
    }

}