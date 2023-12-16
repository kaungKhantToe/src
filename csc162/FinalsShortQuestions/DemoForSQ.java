package FinalsShortQuestions;
import java.util.Scanner;
public class DemoForSQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter child age: ");
        int age = sc.nextInt();
        Baby b = new Baby(age);
        b.EatingMethod(age);
    }
}
