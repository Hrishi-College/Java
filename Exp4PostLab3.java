/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Find Area of Circle Using Method and Constructor Overloading
*/
public class Exp4PostLab3 {

    public Exp4PostLab3(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public Exp4PostLab3(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public Exp4PostLab3(double base, double height, boolean isTriangle) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        new Exp4PostLab3(4); // Circle
        new Exp4PostLab3(5, 7); // Rectangle
        new Exp4PostLab3(6, 8, true); // Triangle
    }
}

