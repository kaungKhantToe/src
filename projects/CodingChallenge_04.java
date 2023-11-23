import java.util.*;

public class CodingChallenge_04 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.err.print("key : ");
        int key = userInput.nextInt();
        System.out.print("plain text: ");
        String userEntry = userInput.nextLine();
        char[] lettersInUserEntry = userEntry.toCharArray();
        for (int i = 0; i < lettersInUserEntry.length; i++) {
            int ASCIIValuesOfCharacters = (int) lettersInUserEntry[i];
            calculations(ASCIIValuesOfCharacters,key);        
        }

    }
// 1111 paung pii reset
    private static void calculations(int ASCIIValuesOfCharacters, int key) {
        for (int i = 0; i < key; i++){
        ASCIIValuesOfCharacters ++;
        if(65 <= ASCIIValuesOfCharacters && ASCIIValuesOfCharacters >= 90  ){}
        }
    }
}
