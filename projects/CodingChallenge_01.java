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
            letterCount++;
            if(userInput.charAt(i) == ' '){
                wordCount++;
                letterCount--;
            }
            if(userInput.charAt(i) == '.' || userInput.charAt(i) == '!' || userInput.charAt(i) == '?' ){
                sentenceCount++;
                letterCount--;
            }
        }
        wordCount ++;
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

