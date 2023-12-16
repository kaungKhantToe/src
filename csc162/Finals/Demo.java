import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException{
        long StudentID;
        int FacultyID;
        String AdminID;
        File file1 = new File("C:/temp/mc/src/csc162/Finals/data.txt");
        PrintWriter printWriter = new PrintWriter("output.txt"); // * write to file
        Scanner sc = new Scanner(file1);
        Person[] myArray = new Person[3];
        int i = 0;

        try {
            System.out.println("<Unsorted>");
            heading();
            printWriter.println("Name\tType\tID\n" +
                                "----\t----\t--\n");
            while (sc.hasNext()) {
                // * read from file and store
                String name = sc.next();
                char type = sc.next().charAt(0);
                if (type == 'S' || type == 's') {
                    StudentID = sc.nextLong();
                    myArray[i] = new Student(name, type, StudentID);
                } else if (type == 'F' || type == 'f') {
                    FacultyID = sc.nextInt();
                    myArray[i] = new Faculty(name, type, FacultyID);
                } else if (type == 'A' || type == 'a') {
                    AdminID = sc.next();
                    myArray[i] = new Admin(name, type, AdminID);
                }
                // * print array
                System.out.println(myArray[i].toString());
                // * write to file
                //printWriter.println("Name\tType\tID");
                //printWriter.println("----\t----\t--");
                printWriter.println(myArray[i].toString());
                i++;
            }
            System.out.println(); // *formatting
            sort(myArray);
            // * Search By Name
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter name to search : ");
            String userInput = input.next();
            System.out.println(); // *formatting
            boolean found = false;
            int foundIndex = 0;
            for (int p = 0; p < myArray.length; p++) {
                if (userInput.equalsIgnoreCase(myArray[p].getName())) {
                    found = true;
                    foundIndex = p;
                }
            }
            if (found) {
                System.out.println("<Name Found>");
                heading();
                System.out.println(myArray[foundIndex].toString());
            } else {
                throw new CustomException("Name not found");
            }
            input.close();
        } // * catch block
        catch (Exception e) {
            System.out.println("Name not found");
        } // * finally block
        finally {
            sc.close();
            printWriter.close();
        }

    }

    private static void heading() {
        System.out.printf("%s %7s %10s \n", "Name", "Type", "ID");
        System.out.printf("%s %7s %10s \n", "----", "----", "--");
    }

    // * sort method
    private static void sort(Person[] myArray) {
        System.out.println("<Sorted>");
        heading();
        Person temp;
        for (int j = 0; j < myArray.length; j++) {
            for (int k = j + 1; k < myArray.length; k++) {
                if (myArray[j].getName().compareTo(myArray[k].getName()) > 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[k];
                    myArray[k] = temp;
                }

            }
            System.out.println(myArray[j].toString());
        }
    }
}
