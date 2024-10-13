/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP12 : Adding Two Numbers Using Packages
*/
package B2;

public class AddNumbers {
    int num1, num2;

    public AddNumbers(int n, int m) {
        num1 = n;
        num2 = m;
    }

    public void add() {
        System.out.println("Sum of two numbers: " + (num1 + num2));
    }

    public static void main(String args[]) {
        AddNumbers addition = new AddNumbers(15, 25);
        addition.add();
    }
}
