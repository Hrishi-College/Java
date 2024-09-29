/*  
    NAME : HRISHI SUNIL PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP2 : Write a program to print following pattern using 
           labelled break and continue statement.
*/
import java.util.*;

public class Exp2 {
    public static void main(String[] args) {
        outer:
        for (int row = 1; row <= 6; row++) {
            if (row == 6) {
                break outer;
            }

            for (int column = 1; column <= 6; column++) {
                if (column > row) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


