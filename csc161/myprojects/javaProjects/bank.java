package javaProjects;

import java.util.*;
import java.io.*;

public class bank {
    public static String[] firstName = new String[7]; // this is an array 
    public static String[] lastName = new String[7]; // array
    public static int[] accNum = new int[7];
    public static double[] balance = new double[7];
    public static double[] newBalance = new double[7];
    public static int[] countNum = new int[7];

    public static void main(String[] args) throws IOException {
        File file = new File("C:/temp/mc/src/csc161/myprojects/detail.txt");
        Scanner input2 = new Scanner(file);
        int count = 0;
        while (input2.hasNext()) {
            firstName[count] = input2.next();
            lastName[count] = input2.next();
            accNum[count] = input2.nextInt();
            balance[count] = input2.nextDouble();
            countNum[count] = count;
            count++;
        }
        input2.close();
        while (true) {
            title();
            Scanner input1 = new Scanner(System.in);
            int choice = input1.nextInt();
            if (choice == 1) {
                display();
            }
            if (choice == 2) {
                searchnum();
            }
            if (choice == 3) {
                deposit();
            }
            if (choice == 4) {
                withdraw();
            }
            if (choice == 5) {
                searchname();
            }
            if (choice == 6) {
                sortName(firstName, lastName, accNum, balance, newBalance, countNum, count);
                headings();
                for (int i = 0; i < 7; i++)
                    System.out.printf("%-7s %-20s %-18s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);

            }
            if (choice == 7) {
                sortNumber(firstName, lastName, accNum, balance, newBalance, countNum, count);
                headings();
                for (int i = 0; i < 7; i++)
                    System.out.printf("%-7s %-20s %-18s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);
            }
            if (choice == 8) {
                System.out.print("Stopping ...");
                input1.close();
                System.exit(0);
            }
        }
    }

    private static void sortNumber(String[] firstName, String[] lastName, int[] accNum, double[] balance,
            double[] newBalance, int[] countNum, int count) {
        Arrays.sort(accNum);
    }

    public static void sortName(String[] firstName, String[] lastName, int[] accNum, double[] balance,
            double[] newBalance, int[] countNum, int count) {
        for (int i = 0; i < count - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < count; j++)
                if (lastName[j].compareTo(lastName[min_idx]) < 0) {
                    min_idx = j;
                }
            swap(firstName, i, min_idx);
            swap(lastName, i, min_idx);
            swap(accNum, i, min_idx);
            swap(balance, i, min_idx);
            swap(newBalance, i, min_idx);
            swap(countNum, i, min_idx);
        }
    }

    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void searchname() {
        System.out
                .println("Would you like to search by first or last name? Press 1 for first name and 2 for last name.");
        Scanner input3 = new Scanner(System.in);
        int selection = input3.nextInt();
        input3.close();
        if (selection == 1) {
            System.out.print("Enter first name to search by :");
            Scanner input4 = new Scanner(System.in);
            String fname = input4.next();
            headings();
            for (int i = 0; i < 7; i++) {
                if (fname.equalsIgnoreCase(firstName[i])) {
                    if (newBalance[i] != 0) {
                        System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i],
                                newBalance[i]);
                    } else {
                        System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);
                    }
                }
            }
            input4.close();
        }
        if (selection == 2) {
            System.out.print("Enter first name to search by :");
            Scanner input4 = new Scanner(System.in);
            String fname = input4.next();
            input4.close();
            headings();
            for (int i = 0; i < 7; i++) {
                if (fname.equalsIgnoreCase(lastName[i])) {
                    if (newBalance[i] != 0) {
                        System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i],
                                newBalance[i]);
                    } else {
                        System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);
                    }
                }
            }
        }
    }

    public static void withdraw() {
        System.out.print("Enter the last four digits of an account number to withdraw from : ");
        Scanner input3 = new Scanner(System.in);
        int number = input3.nextInt();
        input3.close();
        for (int i = 0; i < 7; i++) {
            if (number == accNum[i]) {
                System.out.print("Enter the withdrawl amount : ");
                Scanner input4 = new Scanner(System.in);
                double withdraw = input4.nextDouble();
                input4.close();
                if (newBalance[i] != 0) {
                    double newtotal = newBalance[i] - withdraw;
                    newBalance[i] = newtotal;
                } else {
                    double newtotal = balance[i] - withdraw;
                    newBalance[i] = newtotal;
                }
                headings();
                System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i], newBalance[i]);
            }
        }
    }

    public static void deposit() {
        System.out.print("Enter the last four digits of an account number to deposit to : ");
        Scanner input3 = new Scanner(System.in);
        int number = input3.nextInt();
        for (int i = 0; i < 7; i++) {
            if (number == accNum[i]) {
                System.out.print("Enter the deposit amount : ");
                Scanner input4 = new Scanner(System.in);
                double deposit = input4.nextDouble();
                input4.close();
                if (newBalance[i] == 0) {
                    double newtotal = deposit + balance[i];
                    newBalance[i] = newtotal;
                } else {
                    double newtotal = newBalance[i] + deposit;
                    newBalance[i] = newtotal;
                }
                headings();
                System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i], newBalance[i]);
            }
        }
        input3.close();
    }

    public static void searchnum() {
        System.out.print("Enter the last four digits of an account number to search by : ");
        Scanner input3 = new Scanner(System.in);
        int number = input3.nextInt();
        input3.close();
        headings();
        for (int i = 0; i < 7; i++) {
            if (number == accNum[i]) {
                System.out.printf("%s %-20s %-21s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);
            }
        }
    }

    public static void display() throws FileNotFoundException {
        headings();
        for (int i = 0; i < 7; i++)
            System.out.printf("%-7s %-20s %-18s %5.2f\n", firstName[i], lastName[i], accNum[i], balance[i]);
        System.out.print("Would you like to print to print to file (f)");
        Scanner input3 = new Scanner(System.in);
        String choice2 = input3.next();
        input3.close();
        if (choice2 == "f" || choice2 == "F") {
            java.io.File printedFile = new java.io.File("C:/temp/mc/src/csc161/results.txt");
            try (
                    java.io.PrintWriter output1 = new java.io.PrintWriter(printedFile)) {
                for (int j = 0; j < lastName.length - 1; j++) {
                    if (j == 0) {
                        headings();
                    }
                    output1.printf("%-7s %-20s %-18s %5.2f\n", firstName[j], lastName[j], accNum[j], balance[j]);
                }
            }
        }
    }

    public static void title() {
        System.out.println("Menu");
        System.out.println("----");
        System.out.println("1 - Display all account details");
        System.out.println("2 - Search by account number");
        System.out.println("3 - Deposit the amount");
        System.out.println("4 - Withdraw the amount");
        System.out.println("5 - Search by name");
        System.out.println("6 - Sort by last name");
        System.out.println("7 - Sort by Account Number");
        System.out.println("8 - Exit");
        System.out.print("Enter choice: ");
    }

    public static void headings() {
        System.out.println("Account Name\t\tAccount Number\t\tBalance");
        System.out.println("------------\t\t--------------\t\t-------");
    }
}
