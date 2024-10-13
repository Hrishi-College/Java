/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP12 : Compute Factorial Using Packages
*/
package B2;

public class Factorial {
    public int computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Factorial fact = new Factorial();
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + fact.computeFactorial(number));
    }
}

