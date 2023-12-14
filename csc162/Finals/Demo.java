import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {
        long StudentID;
        int FacultyID;
        String AdminID;
        File file = new File("C:/temp/mc/src/csc162/Finals/data.txt");
        Scanner sc = new Scanner(file);
        Person[] myArray = new Person[3];

        int i = 0;
        while (sc.hasNext()) {

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
            System.out.println(myArray[i].toString());
            i++;

        }

    }

}
