/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP12 : Finding Largest Between Two Numbers Using Packages
*/
package JAVAB2;

import B2.Compare;

public class Demo {
    public static void main(String args[]) {
        int n = 10, m = 20;
        Compare current = new Compare(n, m);
        if (n != m) {
            current.getmax();
        } else {
            System.out.println("Both the values are same");
        }
    }
}

