/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP1 : Write a program to perform Menu Driven Arithmetic Operation.
*/

import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 % num2));
                } else {
                    System.out.println("Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}