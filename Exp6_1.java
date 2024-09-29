/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP6 : Write a program in java to perform 
        (i) Vector operations 
        (ii) String Buffer functions
*/
import java.util.Scanner;

class Exp6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String inputString = sc.nextLine();

        // Append the string to StringBuffer and reverse it
        StringBuffer sb = new StringBuffer(inputString);
        sb.reverse();

        // Convert reversed StringBuffer to String
        String reversedString = sb.toString();

        // Compare the original string with the reversed string
        if (inputString.equals(reversedString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}
