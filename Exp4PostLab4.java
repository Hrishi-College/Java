/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Find Area of Circle Using Method and Constructor Overloading
*/
public class Exp4PostLab4 {
    private int num1;
    private int num2;

    public Exp4PostLab4() {
        this.num1 = 56;
        this.num2 = 98;
    }

    public int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }

    public void display() {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + calculateGCD(num1, num2));
    }

    public static void main(String[] args) {
        Exp4PostLab4 obj = new Exp4PostLab4();
        obj.display();
    }
}
