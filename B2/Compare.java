/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP12 : Finding Largest Between Two Numbers Using Packages
*/
package B2;

public class Compare {
    int num1, num2;

    public Compare(int n, int m) {
        num1 = n;
        num2 = m;
    }

    public void getmax() {
        if (num1 > num2) {
            System.out.println("Maximum value of two numbers is " + num1);
        } else {
            System.out.println("Maximum value of two numbers is " + num2);
        }
    }

    public static void main(String args[]) {
        Compare current[] = new Compare[3];
        current[1] = new Compare(5, 10);
        current[2] = new Compare(123, 120);
        for (int i = 1; i < 3; i++) {
            current[i].getmax();
        }
    }
}

