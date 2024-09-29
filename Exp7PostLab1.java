/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP7 : Single and Multilevel Inheritance using super keyword
*/
import java.util.Scanner;

class Radius {
    double radius;

    public void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
    }
}

class Circle extends Radius {
    public double findArea() {
        return Math.PI * radius * radius;
    }
}

class Sphere extends Circle {
    public double findVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayVolume() {
        System.out.println("Volume of Sphere: " + findVolume());
    }
}

public class Exp7PostLab1 {

    public static void main(String[] args) {
        Sphere sphere = new Sphere();
        sphere.acceptRadius();
        sphere.displayVolume();
    }
}

