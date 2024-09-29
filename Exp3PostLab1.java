/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP3 : Create a Class Account to Perform Insert, Deposit, and Withdrawal Operations
*/
public class Exp3PostLab1 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }
}
