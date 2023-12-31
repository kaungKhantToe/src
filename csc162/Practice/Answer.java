package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Answer {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/temp/mc/src/csc162/Practice/names.txt");
        Scanner sc = new Scanner(file);
        int size = sc.nextInt() + sc.nextInt();
        String[] names = new String[size];
        //int[] numbers = new int[size];
        int i = 0;
        while (sc.hasNext()) {
            names[i] = sc.next();
            //numbers[i] = sc.nextInt();
            //System.out.printf("%9s %5s\n", names[i] , numbers[i]);
            i++;
        }      
    }
}
