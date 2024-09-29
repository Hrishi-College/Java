/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Write a program to find Area of Circle using 
        (i) method overloading 
        (ii) constructor overloading
*/
class AreaOf {
    double radius;

    AreaOf() {
        radius = 1.0;
    }

    AreaOf(double r) {
        radius = r;
    }

    double findArea() {
        return Math.PI * radius * radius;
    }
}

public class Exp4_2 {
    public static void main(String[] args) {
        AreaOf defaultCircle = new AreaOf();
        AreaOf customCircle = new AreaOf(5);

        System.out.println("Area of default circle: " + defaultCircle.findArea());
        System.out.println("Area of custom circle: " + customCircle.findArea());
    }
}
