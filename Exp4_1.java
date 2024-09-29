/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Write a program to find Area of Circle using 
        (i) method overloading 
        (ii) constructor overloading
*/
class AreaOfMethodOverload {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double radius, double piValue) {
        return piValue * radius * radius;
    }
}

public class Exp4_1 {
    public static void main(String[] args) {
        AreaOfMethodOverload obj = new AreaOfMethodOverload();
        double radius = 5;

        System.out.println("Area with default PI: " + obj.area(radius));
        System.out.println("Area with custom PI: " + obj.area(radius, 3.14));
    }
}

