package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/temp/mc/src/csc162/Practice/names.txt");
        Scanner sc = new Scanner(file);
        int size = sc.nextInt() + sc.nextInt();
        String[] names = new String[size]; // String [] 1stNames = new String [size/2];
        //String [] 2ndNames = new String [size/2];
        int[] numbers = new int[size];
        int i = 0;
        // take number first then put in respective array 
        while (sc.hasNext()) {
            names[i] = sc.next();
            numbers[i] = sc.nextInt();
            System.out.printf("%9s %5s\n", names[i] , numbers[i]);
            i++;
        }      
    }
}
