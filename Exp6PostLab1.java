/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Vector Operations and String Buffer Functions
*/
import java.util.*;

public class Exp6PostLab1 {
    public static void main(String[] args) {
        Vector<String> students = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student Name\n2. Remove Student Name\n3. Display Names\n4. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = sc.nextLine();
                    students.add(name);
                    break;
                case 2:
                    System.out.println("Enter student name to remove: ");
                    String removeName = sc.nextLine();
                    students.remove(removeName);
                    break;
                case 3:
                    Enumeration<String> names = students.elements();
                    System.out.println("Student Names:");
                    while (names.hasMoreElements()) {
                        System.out.println(names.nextElement());
                    }
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}

