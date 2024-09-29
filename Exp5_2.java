/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP5 : Write a program in java to perform 
        (i) Matrix Addition 
        (ii) Count frequency 
           of a given letter in a String.
*/
import java.util.Scanner;

class Exp5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        System.out.println("Enter the character to find its frequency:");
        char letter = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("The frequency of '" + letter + "' in the string is: " + count);
    }
}

