/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Write a program in java to perform 
        (i) Vector operations 
        (ii) String Buffer functions
*/
import java.util.Vector;
import java.util.Scanner;

class Exp6_2 {
    public static void main(String[] args) {
        Vector<String> shoppingList = new Vector<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items you want to add:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        System.out.println("Enter the items:");
        for (int i = 0; i < n; i++) {
            String item = sc.nextLine();
            shoppingList.add(item);
        }

        System.out.println("Items in the vector: " + shoppingList);

        // Copy vector elements into a string
        String allItems = String.join(", ", shoppingList);

        System.out.println("All items as a single string: " + allItems);
    }
}

