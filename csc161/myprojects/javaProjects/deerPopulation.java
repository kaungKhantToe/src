package javaProjects;

import java.io.*;
import java.util.*;

public class deerPopulation {
    public static String[] city1 = new String[14];
    public static String[] city2 = new String[14];
    public static double[] miles = new double[14];
    public static int[] pop = new int[14];
    public static double[] sMiles = new double[14];
    public static double[] coeff = new double[14];
    public static String[] threat = new String[14];

    public static void main(String[] args) throws IOException {
        File file = new File("C:/temp/mc/src/csc161/myprojects/files/deer.txt");
        Scanner input1 = new Scanner(file);
        int count = 0;
        while (input1.hasNext()) {
            city1[count] = input1.next();
            city2[count] = input1.nextLine();
            miles[count] = input1.nextDouble();
            pop[count] = input1.nextInt();
            sMiles[count] = pop[count] / miles[count];
            coeff[count] = sMiles[count] / miles[count];
            if (coeff[count] <= 0.35) {
                threat[count] = "White";
            } else if (coeff[count] > 0.35 && coeff[count] < 0.5) {
                threat[count] = "Green";
            } else if (coeff[count] > 0.5 && coeff[count] < 0.65) {
                threat[count] = "Yellow";
            } else if (coeff[count] > 0.65 && coeff[count] < 0.75) {
                threat[count] = "Orange";
            } else if (coeff[count] > 0.75) {
                threat[count] = "Red";
            }
            count++;
        }
        menu();
        System.out.print("Enter your choice here: ");
        Scanner input2 = new Scanner(System.in);
        int choice1 = input2.nextInt();
        if (choice1 == 1) {

        } else if (choice1 == 2) {

        } else if (choice1 == 3) {
            System.out.print("Enter town name to search by: ");
            String name = input2.next();
            headings();
            for (int i = 0; i < 14; i++) {
                if (name.equals(city1[i])) {
                    System.out.printf("%-9s %-15s %-10s %-10s %-20.2f %-20.2f %s\n", city1[i], city2[i], miles[i],
                            pop[i],
                            sMiles[i], coeff[i], threat[i]);
                }
            }
        } else if (choice1 == 4) {
            headings();
            for (int i = 0; i < 14; i++)
                System.out.printf("%-9s %-15s %-10s %-10s %-20.2f %-20.2f %s\n", city1[i], city2[i], miles[i], pop[i],
                        sMiles[i], coeff[i], threat[i]);
        } else if (choice1 == 5) {
            System.out.print("Exitting...");
            input1.close();
            input2.close();
            System.exit(0);
        }
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("----");
        System.out.println("1 - Sort By town name");
        System.out.println("2 - Sort By Square Miles");
        System.out.println("3 - Search by town name");
        System.out.println("4 - Print all");
        System.out.println("5 - Exit");
    }

    public static void headings() {
        System.out.printf("%12s %19s %9s %13s %20s %17s\n", "Township", "Square", "Deer", "Deer per", "Deer/Tick",
                "Tick");
        System.out.printf("%10s %20s %13s %13s %23s %12s\n", "Name", "Miles", "Population", "Square Mile",
                "Coefficient Indicator", "Threat");
        System.out.print(
                "====================================================================================================\n");
    }
}
// sort by town name
// sort by square miles
// search by town name
// menu