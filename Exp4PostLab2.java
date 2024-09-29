/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP4 : Find Area of Circle Using Method and Constructor Overloading
*/
public class Exp4PostLab2 {

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        Exp4PostLab2 obj = new Exp4PostLab2();
        System.out.println("Sum of integers: " + obj.add(10, 20));
        System.out.println("Concatenation of strings: " + obj.add("Hello, ", "World!"));
    }
}
