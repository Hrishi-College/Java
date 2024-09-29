/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP9 : Calculate area of Rectangle and Circle using abstract class
*/

abstract class Shape {
    abstract double volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Hemisphere extends Shape {
    double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    @Override
    double volume() {
        return (2.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class Exp9PostLab1 {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Hemisphere hemisphere = new Hemisphere(5);
        
        System.out.println("Volume of Sphere: " + sphere.volume());
        System.out.println("Volume of Hemisphere: " + hemisphere.volume());
    }
}

