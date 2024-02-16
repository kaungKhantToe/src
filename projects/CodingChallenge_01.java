import java.util.Scanner;

public class CodingChallenge_01 {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            /*
             * initialize 3 variables.Each variable represents the number of words,
             * sentences and letters that will be present in the text entered by the user.
             */
            int wordCount, sentenceCount, letterCount;
            wordCount = sentenceCount = letterCount = 0;

            /*
             * Asks the user for the input and store
             * the text in a variable named "userInput"
             */
            System.out.println("Please enter the desired text to determine grade level :");
            String userInput = input.nextLine();

            /*
             * This is a for loop that will read every character in the
             * entered text, one by one until it reaches the end.
             */
            for (int i = 0; i < userInput.length(); i++) {

                /*
                 * Count of the letter will increase with every
                 * letter or character found in the entered text.
                 */
                letterCount++;

                /*
                 * 1. Each space in the text is considered as one word. As such,
                 * if a space or, in other words, a "null character" is found,
                 * will increase the count of words by one.
                 * 
                 * 2. As a space cannot be considered as a letter, will decrease
                 * the count of letters by one every time it is detected in the text.
                 */
                if (userInput.charAt(i) == ' ') {
                    wordCount++;
                    letterCount--;
                }

                /*
                 * 1. Since most sentences end with the following characters,
                 * every time when these said characters are detected,
                 * will increase the count of sentence by one.
                 * 
                 * 2. Similar to how the count of letters decreases when finding spaces
                 * in the text, the count of letters will decreases by one when these
                 * characters are found since they are not actually letters.
                 */
                if (userInput.charAt(i) == '.' || userInput.charAt(i) == '!' || userInput.charAt(i) == '?') {
                    sentenceCount++;
                    letterCount--;
                }
            }

            /*
             * Since the last word in the text cannot be counted,
             * or incremented, by looking for null characters,
             * we will have to add one ourselves.
             */
            wordCount++;

            /*
             * The following variables hold the average number of letter
             * or sentences per 100 words in the text respectively
             */
            Double averageNumberOfSentences = (double) (sentenceCount) / wordCount * 100;
            Double averageNumberOfLetters = (double) (letterCount) / wordCount * 100;

            /*
             * By using the formula provided by a readability test called
             * the "Coleman-Liau index", we can get the grade level of the entered text.
             */
            int gradeLevel = (int) ((0.0588 * averageNumberOfLetters) - (0.296 * averageNumberOfSentences) - 15.8);

            System.out.println("The approximate grade level for the provided material is : Grade " + gradeLevel);
            input.close();

        } catch (Exception e) {
            System.out.print("Error occurred. Please run the program again.");
        }
    }
}