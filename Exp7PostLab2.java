/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP7 : Single and Multilevel Inheritance using super keyword
*/
import java.util.Scanner;

class RadiusBase {
    double radius;

    public void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
    }

    public void display() {
        System.out.println("This is the base class display method.");
    }
}

class CircleDerived extends RadiusBase {
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle: " + findArea());
    }
}

class SphereDerived extends CircleDerived {
    public double findVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void display() {
        System.out.println("Volume of Sphere: " + findVolume());
    }
}

public class Exp7PostLab2 {

    public static void main(String[] args) {
        SphereDerived sphere = new SphereDerived();
        sphere.acceptRadius();
        sphere.display();
    }
}

