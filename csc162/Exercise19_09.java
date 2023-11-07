import java.util.ArrayList;
import java.util.Scanner;

public class Exercise19_09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            Integer userInput = input.nextInt();
            list.add(userInput);
        }
        sort(list);
        System.out.print("The sorted numbers are ");
        for (int i = 0; i < list.size(); i++){
        System.out.print( list.get(i) + " ");
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        E temp;
        for (int i = 0; i < list.size(); ++i) {
            for (int j = 0; j < list.size() - 1; ++j) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        
    }
}