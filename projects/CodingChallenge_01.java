package projects;

import java.util.Scanner;

public class CodingChallenge_01 {
    public static String arr;
    public static void main (String [] args) {
    try{
        Scanner input = new Scanner(System.in);
        int wordCount = 0;
        int sentenceCount = 0;
        int letterCount = 0;
        System.out.println("Please enter the desired text to determine grade level :");
        String userInput = input.nextLine();
        for( int i = 0; i < userInput.length(); i++){
            letterCount++; // Increment the value of the variable with each letter in the input of the user
            if(userInput.charAt(i) == ' '){
                wordCount++; // Each space will be considered as one word 
                letterCount--; // Because we don't want to count null characters as actual letters
            }
            if(userInput.charAt(i) == '.' || userInput.charAt(i) == '!' || userInput.charAt(i) == '?' ){
                sentenceCount++;// most sentences end with these characters
                letterCount--; 
            }
        }
        wordCount ++; // Since the last word cannot be counted by looking for null characters (like we did above) , we will have to add one ourselves 
        Double S = (double)(sentenceCount)/wordCount*100;
        Double L = (double)(letterCount)/wordCount*100;
        int gradeLevel = (int)((0.0588 * L) - (0.296 * S) - 15.8);
        System.out.println("The approximate grade level for the provided material is : Grade " + gradeLevel);
        input.close();
    }    
    catch(Exception e){
        System.out.print(e);
    }
    }
}

