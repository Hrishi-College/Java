/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Vector Operations and String Buffer Functions
*/
import java.util.*;

public class Exp6PostLab2 {
    public static void main(String[] args) {
        Vector<String> shoppingList = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Item\n2. Delete Item\n3. Display Items\n4. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter item name: ");
                    String item = sc.nextLine();
                    System.out.println("Enter position to insert item: ");
                    int position = sc.nextInt();
                    sc.nextLine();
                    shoppingList.add(position, item);
                    break;
                case 2:
                    System.out.println("Enter item name to delete: ");
                    String removeItem = sc.nextLine();
                    shoppingList.remove(removeItem);
                    break;
                case 3:
                    System.out.println("Shopping List: " + shoppingList);
                    break;
            }
        } while (choice != 4);
        sc.close();
    }
}

