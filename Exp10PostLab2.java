/*  
    NAME : HARSH SANKHE
    UIN : 231P079
    ROLL NO : 29
    EXP10 : Implement User Defined Exception in Java
*/
import java.util.Scanner;

public class Exp10PostLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        String numStr1 = scanner.nextLine();
        System.out.print("Enter denominator: ");
        String numStr2 = scanner.nextLine();

        try {
            int numerator = Integer.parseInt(numStr1);
            int denominator = Integer.parseInt(numStr2);
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
