/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP1 : Menu Driven Arithmetic Operations
*/
import java.util.Scanner;

public class Exp1PostLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        double num1, num2, result;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        choice = scanner.next().charAt(0);

        switch (choice) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}
