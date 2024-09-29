/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP3 : Create a Class Account to Perform Insert, Deposit, and Withdrawal Operations
*/
import java.util.Scanner;

public class Exp3PostLab2 {
    static class Circle {
        private double radius;
        
        public void acceptRadius() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");
            radius = sc.nextDouble();
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public void displayArea() {
            System.out.println("The area of the circle is: " + calculateArea());
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.acceptRadius();
        circle.displayArea();
    }
}
