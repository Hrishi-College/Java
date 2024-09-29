/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP8 : Write a program to implement interface demonstrating the concept of 
            multiple inheritance.
*/
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Single inheritance
class Test extends Student {
    int marks1, marks2;

    Test(String name, int rollNo, int marks1, int marks2) {
        super(name, rollNo); // Calling constructor of Student class
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void displayTestMarks() {
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

// Interface 
interface Sports {
    int sportsMarks = 10; 

    void displaySportsMarks(); 
}

// Multiple inheritance
class Results extends Test implements Sports {
    int totalMarks;

    Results(String name, int rollNo, int marks1, int marks2) {
        super(name, rollNo, marks1, marks2);
        this.totalMarks = marks1 + marks2 + sportsMarks;
    }

    public void displaySportsMarks() {
        System.out.println("Sports Marks: " + sportsMarks);
    }

    void displayTotalMarks() {
        System.out.println("Total Marks (including sports): " + totalMarks);
    }
}

public class Exp8 {
    public static void main(String[] args) {
        Results result = new Results("Alice", 101, 85, 90);

        result.displayStudentInfo();
        result.displayTestMarks();
        result.displaySportsMarks();
        result.displayTotalMarks();
    }
}
