/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Find Area of Circle Using Method Overloading and Constructor Overloading
*/
import java.util.Scanner;

public class Exp4PostLab1 {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Exp4PostLab1 shape = new Exp4PostLab1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + shape.area(radius));

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + shape.area(length, width));

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + shape.area(base, height, true));
    }
}
